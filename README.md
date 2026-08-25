# Jogo da Forca

Trabalho da disciplina **Laboratório de Orientação a Objetos** — IFF, Prof. Mark Douglas Jacyntho.

Java puro, sem frameworks: apenas **JDK + Maven + JUnit 5**.

> **Estado atual:** apenas o *scaffolding*. Todas as classes, atributos e assinaturas do modelo UML existem e o projeto **compila**, mas nenhuma regra de negócio foi implementada — os métodos lançam `UnsupportedOperationException("TODO")` e trazem, em Javadoc, a regra correspondente extraída dos PDFs.
>
> O roteiro de implementação está em **[PLANO_DE_DESENVOLVIMENTO.md](PLANO_DE_DESENVOLVIMENTO.md)**.

---

## Requisitos

| Ferramenta | Versão | Status nesta máquina |
|---|---|---|
| JDK | 17+ | ✅ OpenJDK 21.0.11 |
| Maven | 3.8+ | ✅ 3.8.7 |
| Git | qualquer | ✅ 2.43.0 |

O `pom.xml` compila para **Java 17** (`source`/`target`), mesmo rodando sob o JDK 21, para garantir que o projeto rode também num JDK 17.

### ⚠️ Locale UTF-8 (obrigatório nesta máquina)

O caminho deste projeto contém acento (`Área de trabalho`) e o locale `en_US.UTF-8` **não está gerado** neste sistema. Sem isso a JVM não consegue codificar o caminho e o Maven aborta com:

```
java.nio.file.InvalidPathException: Malformed input or input contains unmappable characters
```

**Correção permanente** (rode uma vez, num terminal seu — precisa de senha):

```bash
sudo locale-gen en_US.UTF-8 && sudo update-locale LANG=en_US.UTF-8
```

Depois disso, abra um terminal novo e o `mvn` funciona normalmente.

**Alternativa sem sudo** — prefixe todos os comandos:

```bash
LC_ALL=C.UTF-8 mvn -q clean compile
```

(`C.UTF-8` já está disponível no sistema.)

---

## Comandos

```bash
# compilar
LC_ALL=C.UTF-8 mvn -q clean compile

# rodar os testes
LC_ALL=C.UTF-8 mvn -q test

# executar o jogo
LC_ALL=C.UTF-8 mvn exec:java
```

A classe principal é `br.edu.iff.jogoforca.Main`, já configurada no `exec-maven-plugin`.

---

## Estrutura de pacotes

A hierarquia segue **`docs/pacotesV5.pdf`** — organização **por entidade/contexto**, e não por camada técnica: tudo de Tema dentro do pacote de Tema, tudo de Palavra dentro do de Palavra, e assim por diante.

```
br.edu.iff
├── dominio/                      ObjetoDominio, ObjetoDominioImpl
├── repository/                   Repository, RepositoryException
├── factory/                      EntityFactory
├── bancodepalavras.dominio/
│   ├── tema/                     Tema + repositório + fábrica (+ emmemoria, embdr)
│   ├── palavra/                  Palavra + repositório + fábrica + AppService
│   └── letra/                    Letra (flyweight) + fábricas (+ texto, imagem)
└── jogoforca/
    ├── Aplicacao                 classe roxa: Singleton + parametrized factory
    ├── RepositoryFactory         abstract factory de repositórios
    ├── ElementoGraficoFactory    abstract factory de letra + boneco
    ├── Main, CsvLoader
    └── dominio/
        ├── jogador/              Jogador + repositório + fábrica
        ├── boneco/               Boneco + fábricas (+ texto, imagem)
        └── rodada/               Rodada, Item + repositório + fábricas + AppService
```

---

## Escopo de implementação

Conforme **`docs/Reiterando.pdf`**:

| Parte | O que fazer |
|---|---|
| `LetraTexto`, `BonecoTexto` | **Implementar** com `System.out.print` |
| `LetraImagem`, `BonecoImagem` e suas fábricas | Apenas as classes, **métodos permanentemente vazios** |
| Repositórios `emmemoria` | **Implementar** — os únicos; devem **começar vazios** |
| Repositórios `embdr` (`BDR*`) | Apenas as classes, **métodos vazios** |
| Todo o resto, inclusive `Aplicacao` | **Implementar por completo** |

---

## Documentação de referência

Os 5 PDFs do professor estão em [`docs/`](docs/):

| Arquivo | Conteúdo |
|---|---|
| `EnunciadoJogoDaForca.pdf` | Regras do jogo |
| `ProjetoJogoForcaV6.pdf` | Modelo de classes completo (o UML que guia tudo) |
| `pacotesV5.pdf` | Estrutura de pacotes obrigatória |
| `ParametroContextoNasOperacoesExibir.pdf` | Semântica do parâmetro `contexto:Object` |
| `Reiterando.pdf` | Escopo do que implementar |

---

## Sobre o parâmetro `contexto:Object`

Todas as operações `exibir` recebem um `contexto` do tipo `java.lang.Object`: um "saco" genérico que pode ser uma lista, uma tabela hash, coordenadas x/y, a URL de uma imagem — o que a subclasse concreta precisar. Ela faz o *typecast* para o tipo específico que espera.

**No modo texto o contexto é desnecessário: passe `null`.**

---

## Banco de palavras

O arquivo [`palavras.csv`](palavras.csv) traz um conjunto inicial de exemplo, no formato `tema;palavra` (a primeira linha é cabeçalho). O `CsvLoader` é opcional — os temas e palavras também podem ser cadastrados direto no `Main`, como sugere o `Reiterando.pdf`.

Mesmo carregando do CSV, o cadastro respeita o modelo: **temas** via `TemaFactory` + `TemaRepository`; **palavras** obrigatoriamente via `PalavraAppService.novaPalavra`.
