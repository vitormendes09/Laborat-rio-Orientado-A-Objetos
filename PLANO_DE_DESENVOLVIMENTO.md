# Plano de Desenvolvimento — Jogo da Forca

Roteiro de implementação do trabalho de **Laboratório de OO** (IFF — Prof. Mark Douglas Jacyntho).

O projeto está inteiramente **esqueletado e compilando**. Nenhuma regra de negócio foi implementada: todo método tem `// TODO: implementar` e lança `UnsupportedOperationException("TODO")`, exceto os que o `Reiterando.pdf` manda deixar permanentemente vazios.

A ordem abaixo respeita o **grafo de dependências**: cada etapa só usa o que já ficou pronto nas anteriores. Siga na ordem — pular etapa gera retrabalho.

---

## Convenções

- **Validar** significa: `mvn -q test` verde para os testes daquela etapa, ou um trecho temporário de `Main` que exercite as classes.
- Nesta máquina o caminho tem acento e o Maven precisa de locale UTF-8. Use sempre:
  ```bash
  LC_ALL=C.UTF-8 mvn -q clean compile
  LC_ALL=C.UTF-8 mvn -q test
  ```
  (ou aplique o fix permanente descrito no `README.md`).
- Ao implementar um método, **remova** o `throw new UnsupportedOperationException("TODO")` e o comentário `// TODO`.

---

## Etapa 0 — Supertipos de camada

**Classes:** `ObjetoDominio`, `ObjetoDominioImpl`, `Repository`, `RepositoryException`, `EntityFactory`

São a fundação: toda entidade e toda fábrica dependem delas.

- `ObjetoDominioImpl`: guardar o `id` no construtor e devolvê-lo em `getId()`. O `id` é imutável.
- `RepositoryException`: já está pronta (só construtores).
- `EntityFactory`: guardar o `Repository`, expor `getRepository()` e `getProximoId()` delegando ao repositório.

**Concluído quando:** compila e `new` de uma subclasse qualquer devolve o `id` correto.

---

## Etapa 1 — Letra (value + flyweight)

**Classes:** `Letra`, `LetraFactory`, `LetraFactoryImpl`, `LetraTexto`, `LetraTextoFactory`

O coração do padrão Flyweight. Faça nesta ordem: `Letra` → `LetraTexto` → `LetraFactoryImpl` → `LetraTextoFactory`.

- `Letra.equals`: `codigo` **e** `getClass()` (uma `LetraTexto('a')` ≠ `LetraImagem('a')`).
- `Letra.hashCode`: `this.codigo + getClass().hashCode()`.
- `Letra.toString`: é `final`.
- `LetraFactoryImpl.getLetra(char)`: **template method `final`** — consulta o pool (máx. 26); se faltar, chama `criarLetra(char)`, guarda e devolve. `getLetraEncoberta()` idem, para a instância única encoberta.
- `LetraTexto.exibir(contexto)`: `System.out.print` do caractere; ignora o contexto.

**Validar:** `LetraTextoFactory.getSoleInstance().getLetra('a') == getLetra('a')` (mesma instância, comparação por `==`).

**Concluído quando:** o pool compartilha de fato e `equals`/`hashCode` respeitam a classe.

---

## Etapa 2 — Tema

**Classes:** `Tema`

Entidade mais simples do modelo; serve de modelo para as demais.

- `criar` vs `reconstituir`: mesma construção, semânticas diferentes (nova vs. vinda da persistência). Ambas privadas por dentro.

**Validar:** `TemaTest`.

---

## Etapa 3 — Palavra

**Classes:** `Palavra`

Depende de **Letra** (etapa 1) e **Tema** (etapa 2).

- **Invariante:** só constrói se `letraFactory` estático estiver setado. O construtor converte a `String` em `Letra[]` via `getLetraFactory().getLetra(c)`.
- `tentar(char)`: devolve o vetor de **posições** onde a letra ocorre. Sem ocorrência → **vetor vazio, nunca `null`**.
- `exibir(contexto, boolean[] posicoes)`: posição descoberta → letra real; encoberta → `getLetraFactory().getLetraEncoberta()`.

**Validar:** `PalavraTest` (com `Palavra.setLetraFactory(...)` no `@BeforeEach`).

---

## Etapa 4 — Item

**Classes:** `Item`

Depende de **Palavra** (etapa 3).

- `arriscou = palavraArriscada != null`
- `acertou = palavra.comparar(palavraArriscada)`
- `descobriu = acertou() || qtdeLetrasEncobertas() == 0`
- `tentar` e `arriscar` têm **visibilidade de pacote** — só a `Rodada` chama.
- `calcularPontosLetrasEncobertas(v) = qtdeLetrasEncobertas() * v`

**Validar:** `ItemTest` (está no mesmo pacote, então enxerga os métodos package-private).

---

## Etapa 5 — Jogador

**Classes:** `Jogador`

Independente das anteriores, mas a `Rodada` precisa dele.

- `atualizarPontuacao(pontos)`: **soma**, não substitui — a pontuação é o total de todas as rodadas.

**Validar:** `JogadorTest`.

---

## Etapa 6 — Boneco

**Classes:** `Boneco`, `BonecoFactory`, `BonecoTexto`, `BonecoTextoFactory`

- `BonecoTexto.exibir(contexto, partes)`: imprime, **cumulativamente**, os nomes das partes conforme a quantidade de erros — 1 cabeça, 2 + olho esquerdo, … 10 + perna direita.
- `BonecoTextoFactory`: no construtor, pega `BonecoTexto.getSoleInstance()` e guarda no campo da agregação.

**Validar:** chamar `exibir(null, 1..10)` e conferir a saída acumulando.

---

## Etapa 7 — Rodada

**Classes:** `Rodada`

A etapa mais densa. Depende de **Item**, **Jogador**, **Boneco**, **Palavra**.

- **Invariante:** só constrói se `bonecoFactory` estiver setado; no construtor cria os itens (id = índice do vetor) e obtém o boneco.
- Todas as palavras do **mesmo tema**.
- `tentar(char)`: se `encerrou()`, não faz nada. Propaga a todos os itens; se **nenhum** acertou, é erro → adiciona a `erradas` a letra obtida de `Palavra.getLetraFactory().getLetra(codigo)`. Ao final, se `encerrou()`, `getJogador().atualizarPontuacao(calcularPontos())`.
- `arriscar(String[])`: só **uma vez**; distribui por índice; ao final, mesma atualização de pontuação.
- `encerrou = arriscou() || descobriu() || getQtdeTentativasRestantes() == 0`
- `calcularPontos()`: descobriu → `100 + soma(15 × letras encobertas de cada item)`; senão → `0`.

**Validar:** `RodadaTest` — é o arquivo de teste mais completo, cobre erros, encerramento, arriscar uma única vez e pontuação.

---

## Etapa 8 — Repositórios em memória

**Classes:** `MemoriaTemaRepository`, `MemoriaPalavraRepository`, `MemoriaJogadorRepository`, `MemoriaRodadaRepository`

- **Começam VAZIOS** (Reiterando.pdf, item b). Nada de dados pré-carregados.
- `pool` interno + contador para `getProximoId()`.
- Buscas sem resultado: vetor **vazio** para retornos `[]`; `null` para retornos de objeto único.
- Comparações por **identidade** (`getId()`), não por referência.

Os `BDR*` já estão prontos e permanecem vazios — não mexa neles.

**Validar:** inserir e recuperar; conferir que `getProximoId()` nunca repete.

---

## Etapa 9 — Fábricas de entidade

**Classes:** `TemaFactoryImpl`, `PalavraFactoryImpl`, `JogadorFactoryImpl`

Todas são **Parametrized Singleton**: `createSoleInstance(repo)` antes de `getSoleInstance()`.

Cada `get*(...)`: pega `getProximoId()` e delega ao `Entidade.criar(...)`. **Não** insere no repositório.

**Validar:** criar uma entidade de cada e conferir os ids sequenciais.

---

## Etapa 10 — RodadaFactoryImpl e RodadaSorteioFactory

**Classes:** `RodadaFactoryImpl`, `RodadaSorteioFactory`

Depende das etapas 7, 8 e 9.

Algoritmo do sorteio:
1. Sorteia quantas palavras: 1 a `Rodada.getMaxPalavras()` (3);
2. Sorteia um tema de `getTemaRepository().getTodos()`;
3. Sorteia, **sem repetir**, as palavras daquele tema (`getPorTema`); se houver menos palavras que o sorteado, ajusta para o que existe;
4. `Rodada.criar(getProximoId(), palavras, jogador)`.

**Validar:** gerar várias rodadas e conferir que todas as palavras são sempre do mesmo tema.

---

## Etapa 11 — App Services

**Classes:** `PalavraAppService`, `JogadorNaoEncontradoException`, `RodadaAppService`

- `novaPalavra(String, long idTema)`: se a palavra já existe → não faz nada, retorna `true`. Senão busca o tema pelo id, cria via factory, insere. `RepositoryException` → `false`.
- `novaRodada(long)`: busca o jogador pelo id e chama a factory.
- `novaRodada(String)`: busca pelo nome; não achou → `JogadorNaoEncontradoException`.
- `salvarRodada(Rodada)`: insere; `RepositoryException` → `false`.

**Validar:** cadastrar palavra duplicada duas vezes (a segunda deve retornar `true` sem duplicar) e pedir rodada para nome inexistente (deve lançar a exceção).

---

## Etapa 12 — Fábricas de família (Abstract Factory)

**Classes:** `MemoriaRepositoryFactory`, `ElementoGraficoTextoFactory`

Cada método devolve o Singleton concreto correspondente. `ElementoGraficoTextoFactory` obtém, no construtor, `LetraTextoFactory` e `BonecoTextoFactory` e delega a eles.

As versões `BDR*` e `*Imagem*` já estão prontas e vazias.

---

## Etapa 13 — Aplicacao (a classe roxa)

**Classes:** `Aplicacao`

O ponto único de configuração. **A ordem dentro de `configurar()` é crítica:**

1. Resolver a `RepositoryFactory` conforme `tipoRepositoryFactory` e obter os 4 repositórios;
2. `createSoleInstance(...)` das fábricas de entidade: `TemaFactoryImpl`, `PalavraFactoryImpl`, `JogadorFactoryImpl`;
3. `RodadaSorteioFactory.createSoleInstance(rodadaRepo, temaRepo, palavraRepo)`;
4. `createSoleInstance(...)` dos app services: `PalavraAppService`, `RodadaAppService`;
5. **Setar os factories estáticos do domínio:** `Palavra.setLetraFactory(getLetraFactory())` e `Rodada.setBonecoFactory(getBonecoFactory())`.

`getBonecoFactory()` e `getLetraFactory()` são ambos, literalmente, `return this.getElementoGraficoFactory();`.

`getTemaFactory()`, `getPalavraFactory()` e `getJogadorFactory()` apenas devolvem o Singleton concreto.

**Validar:** `configurar()` seguido de `getRepositoryFactory().getTemaRepository()` não pode lançar nada.

---

## Etapa 14 — Main (e CsvLoader, opcional)

**Classes:** `Main`, `CsvLoader`

Roteiro do `Reiterando.pdf`, item d:

1. `Aplicacao.getSoleInstance().configurar()`;
2. Criar (factory) e inserir (repositório) alguns **temas**;
3. Cadastrar **palavras** via `PalavraAppService.novaPalavra` — nunca direto no repositório;
4. Criar (factory) e inserir (repositório) ao menos um **jogador**;
5. **Loop de rodadas:** `novaRodada` → jogar até `encerrou()` → `salvarRodada` → perguntar se joga de novo.

Os passos 2 e 3 podem ser feitos por `CsvLoader.carregar("palavras.csv")`.

No modo texto, todo `exibir` recebe `null` como contexto.

**Validar:** `LC_ALL=C.UTF-8 mvn exec:java` e jogar uma partida inteira.

---

## Checklist por classe

### Supertipos
- [ ] `ObjetoDominio`
- [ ] `ObjetoDominioImpl`
- [ ] `Repository`
- [x] `RepositoryException` *(pronta)*
- [ ] `EntityFactory`

### Letra
- [ ] `Letra`
- [ ] `LetraFactory`
- [ ] `LetraFactoryImpl`
- [ ] `LetraTexto`
- [ ] `LetraTextoFactory`
- [x] `LetraImagem` *(permanece vazia)*
- [ ] `LetraImagemFactory` *(pode permanecer vazia)*

### Tema
- [ ] `Tema`
- [ ] `TemaRepository`
- [ ] `TemaFactory`
- [ ] `TemaFactoryImpl`
- [ ] `MemoriaTemaRepository`
- [x] `BDRTemaRepository` *(permanece vazia)*

### Palavra
- [ ] `Palavra`
- [ ] `PalavraRepository`
- [ ] `PalavraFactory`
- [ ] `PalavraFactoryImpl`
- [ ] `PalavraAppService`
- [ ] `MemoriaPalavraRepository`
- [x] `BDRPalavraRepository` *(permanece vazia)*

### Jogador
- [ ] `Jogador`
- [ ] `JogadorRepository`
- [ ] `JogadorFactory`
- [ ] `JogadorFactoryImpl`
- [ ] `MemoriaJogadorRepository`
- [x] `BDRJogadorRepository` *(permanece vazia)*

### Boneco
- [ ] `Boneco`
- [ ] `BonecoFactory`
- [ ] `BonecoTexto`
- [ ] `BonecoTextoFactory`
- [x] `BonecoImagem` *(permanece vazia)*
- [x] `BonecoImagemFactory` *(permanece vazia)*

### Rodada
- [ ] `Rodada`
- [ ] `Item`
- [ ] `RodadaRepository`
- [ ] `RodadaFactory`
- [ ] `RodadaFactoryImpl`
- [ ] `RodadaSorteioFactory`
- [ ] `RodadaAppService`
- [ ] `JogadorNaoEncontradoException`
- [ ] `MemoriaRodadaRepository`
- [x] `BDRRodadaRepository` *(permanece vazia)*

### Aplicação
- [ ] `RepositoryFactory`
- [ ] `MemoriaRepositoryFactory`
- [x] `BDRRepositoryFactory` *(pronta, delega às vazias)*
- [ ] `ElementoGraficoFactory`
- [ ] `ElementoGraficoTextoFactory`
- [x] `ElementoGraficoImagemFactory` *(permanece vazia)*
- [ ] `Aplicacao`
- [ ] `Main`
- [ ] `CsvLoader` *(opcional)*

### Testes
- [ ] `TemaTest`
- [ ] `PalavraTest`
- [ ] `JogadorTest`
- [ ] `ItemTest`
- [ ] `RodadaTest`

---

## Armadilhas comuns

**1. Ordem dentro de `configurar()`**
Repositórios → fábricas de entidade → app services → factories estáticos do domínio. Inverter gera `null` silencioso ou `NullPointerException` só na hora de jogar.

**2. Parametrized Singleton exige `createSoleInstance` antes de `getSoleInstance`**
Vale para `TemaFactoryImpl`, `PalavraFactoryImpl`, `JogadorFactoryImpl`, `RodadaSorteioFactory`, `PalavraAppService` e `RodadaAppService`. Sem isso, `getSoleInstance()` devolve `null` — e o erro só aparece bem longe da causa. Os Singletons **simples** (`Memoria*Repository`, `LetraTextoFactory`, `BonecoTexto*`, `ElementoGrafico*`, `Aplicacao`) podem se criar sozinhos.

**3. `Palavra.setLetraFactory` e `Rodada.setBonecoFactory` antes de qualquer construção**
São invariantes do UML. Nos **testes**, isso precisa estar no `@BeforeEach` — é o esquecimento nº 1 quando os testes falham sem motivo aparente.

**4. Vetor vazio ≠ `null`**
`Palavra.tentar` retorna `int[0]` quando a letra não ocorre. Retornar `null` quebra `Item.tentar`. Vale também para `getPorNome`, `getTodos`, `getPorTema`, `getTodas`, `getPorJogador`.

**5. `equals`/`hashCode` de `Letra`**
Comparar só o `codigo` faz `LetraTexto('a')` ser igual a `LetraImagem('a')`. Tem que entrar `getClass()` nos dois métodos, e eles precisam ser consistentes entre si.

**6. `Jogador.atualizarPontuacao` soma, não substitui**
`this.pontuacao += pontos`. Substituir zera o histórico e quebra o quadro de escores.

**7. Só se arrisca uma vez**
A guarda é a própria `encerrou()`: depois de arriscar, `arriscou()` é `true`, logo `encerrou()` é `true`, logo `tentar`/`arriscar` não fazem mais nada.

**8. O `id` do `Item` é o índice do vetor**
Não use `getProximoId()` para itens — o UML diz explicitamente que o id do item é o índice da palavra no vetor passado à `Rodada`.

**9. Erro é quando NENHUM item acerta**
Numa rodada de 3 palavras, se a letra aparece em uma delas, não é erro. Só conta erro se não apareceu em nenhuma.

**10. Cadastro de palavras e rodadas só via AppService**
Temas e jogadores vão direto ao repositório; palavras e rodadas, **obrigatoriamente**, pelos respectivos app services (Reiterando.pdf, item c).
