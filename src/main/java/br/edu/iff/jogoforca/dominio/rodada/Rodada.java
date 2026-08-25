package br.edu.iff.jogoforca.dominio.rodada;

import br.edu.iff.bancodepalavras.dominio.letra.Letra;
import br.edu.iff.bancodepalavras.dominio.palavra.Palavra;
import br.edu.iff.bancodepalavras.dominio.tema.Tema;
import br.edu.iff.dominio.ObjetoDominioImpl;
import br.edu.iff.jogoforca.dominio.boneco.Boneco;
import br.edu.iff.jogoforca.dominio.boneco.BonecoFactory;
import br.edu.iff.jogoforca.dominio.jogador.Jogador;

/**
 * &lt;&lt;entity&gt;&gt;
 *
 * <p>Uma rodada do jogo da forca: um {@link Jogador} tentando descobrir de 1 a
 * {@link #getMaxPalavras()} palavras, todas do MESMO tema, podendo errar no
 * maximo {@link #getMaxErros()} letras.</p>
 *
 * <h3>INVARIANTES (UML)</h3>
 * <ul>
 *   <li>So e possivel chamar o construtor se o {@code bonecoFactory} estatico
 *       ja tiver sido setado (via {@link #setBonecoFactory(BonecoFactory)}, feito
 *       por {@code Aplicacao.configurar()}). No construtor, cria os itens e
 *       chama {@link #getBonecoFactory()} para criar o boneco;</li>
 *   <li>O id de cada item corresponde ao INDICE do vetor de palavras passado;</li>
 *   <li>TODAS as palavras tem que ser do MESMO tema;</li>
 *   <li>So se pode arriscar UMA UNICA VEZ;</li>
 *   <li>O jogador so pode tentar ou arriscar se a rodada NAO encerrou;</li>
 *   <li>Ao final de {@code tentar} ou {@code arriscar}, SE encerrou, atualizar
 *       os pontos do Jogador.</li>
 * </ul>
 *
 * <h3>CONDICOES DERIVADAS (UML)</h3>
 * <ul>
 *   <li>{@code tentativas = certas + erradas}</li>
 *   <li>{@code atingiuMaxErros = getQtdeTentativasRestantes() == 0}</li>
 *   <li>{@code arriscou = arriscou pelo menos 1 item}</li>
 *   <li>{@code descobriu = descobriu TODOS os itens}</li>
 *   <li>{@code encerrou = arriscou OU descobriu OU atingiuMaxErros}</li>
 * </ul>
 *
 * <h3>PONTUACAO (UML)</h3>
 * <p>Se descobriu: {@code pontosQuandoDescobreTodasAsPalavras (100)} +
 * {@code pontosPorLetraEncoberta (15)} para CADA letra que ficou encoberta.
 * Se nao descobriu: {@code 0}.</p>
 */
public class Rodada extends ObjetoDominioImpl {

    /** Quantidade maxima de palavras por rodada. */
    private static int maxPalavras = 3;

    /** Quantidade maxima de erros permitidos (no decimo, o boneco vai pra forca). */
    private static int maxErros = 10;

    /** Pontos ganhos por descobrir todas as palavras. */
    private static int pontosQuandoDescobreTodasAsPalavras = 100;

    /** Pontos ganhos por cada letra que ficou encoberta. */
    private static int pontosPorLetraEncoberta = 15;

    /**
     * Fabrica de bonecos compartilhada por TODAS as rodadas (campo estatico).
     * Deve ser setada por {@code Aplicacao.configurar()} antes de construir
     * qualquer rodada.
     */
    private static BonecoFactory bonecoFactory;

    private Item[] itens;

    /** Letras erradas ja tentadas: de 0 a {@code maxErros}. */
    private Letra[] erradas;

    private Jogador jogador;

    private Boneco boneco;

    /**
     * Construtor privado de rodada NOVA.
     *
     * <p>Cria um {@link Item} para cada palavra (id = indice no vetor) e obtem
     * o boneco via {@link #getBonecoFactory()}.</p>
     *
     * @param id       identidade da entidade
     * @param palavras palavras da rodada (todas do mesmo tema)
     * @param jogador  jogador da rodada
     */
    private Rodada(long id, Palavra[] palavras, Jogador jogador) {
        super(id);
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Construtor privado de rodada reconstituida, com o estado ja conhecido.
     *
     * @param id      identidade da entidade
     * @param itens   itens ja montados
     * @param erradas letras erradas ja tentadas
     * @param jogador jogador da rodada
     */
    private Rodada(long id, Item[] itens, Letra[] erradas, Jogador jogador) {
        super(id);
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Cria uma rodada NOVA.
     *
     * <p>Pre-condicoes: {@code bonecoFactory} setado; {@code palavras} com 1 a
     * {@code maxPalavras} elementos; todas do MESMO tema.</p>
     *
     * @param id       id gerado pelo repositorio
     * @param palavras palavras da rodada
     * @param jogador  jogador da rodada
     * @return a nova rodada
     */
    public static Rodada criar(long id, Palavra[] palavras, Jogador jogador) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Reconstitui uma rodada JA EXISTENTE, vinda da persistencia.
     *
     * @param id      id ja existente
     * @param itens   itens ja montados
     * @param erradas letras erradas ja tentadas
     * @param jogador jogador da rodada
     * @return a rodada reconstituida
     */
    public static Rodada reconstituir(long id, Item[] itens, Letra[] erradas,
                                      Jogador jogador) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Define a fabrica de bonecos usada por todas as rodadas.
     *
     * <p>Chamado por {@code Aplicacao.configurar()}. Sem isso, construir uma
     * Rodada e erro.</p>
     *
     * @param bonecoFactory a fabrica de bonecos
     */
    public static void setBonecoFactory(BonecoFactory bonecoFactory) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return a fabrica de bonecos corrente (pode ser {@code null} se ainda nao
     *         configurada)
     */
    public static BonecoFactory getBonecoFactory() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return a quantidade maxima de palavras por rodada (padrao 3)
     */
    public static int getMaxPalavras() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @param max nova quantidade maxima de palavras
     */
    public static void setMaxPalavras(int max) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return a quantidade maxima de erros permitidos (padrao 10)
     */
    public static int getMaxErros() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @param max nova quantidade maxima de erros
     */
    public static void setMaxErros(int max) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return os pontos por descobrir todas as palavras (padrao 100)
     */
    public static int getPontosQuandoDescobreTodasAsPalavras() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @param pontos novos pontos por descobrir todas as palavras
     */
    public static void setPontosQuandoDescobreTodasAsPalavras(int pontos) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return os pontos por letra encoberta (padrao 15)
     */
    public static int getPontosPorLetraEncoberta() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @param pontos novos pontos por letra encoberta
     */
    public static void setPontosPorLetraEncoberta(int pontos) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return o jogador desta rodada
     */
    public Jogador getJogador() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna o tema da rodada.
     *
     * <p>Como todas as palavras sao do mesmo tema (invariante), basta devolver
     * o tema da primeira palavra.</p>
     *
     * @return o tema comum a todas as palavras
     */
    public Tema getTema() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return as palavras desta rodada
     */
    public Palavra[] getPalavras() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return quantas palavras esta rodada possui (1 a {@code maxPalavras})
     */
    public int getNumPalavras() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Tenta uma letra em TODOS os itens da rodada.
     *
     * <p><b>ALGORITMO:</b></p>
     * <ol>
     *   <li>Pre-condicao: se {@link #encerrou()}, nao faz nada;</li>
     *   <li>Chama {@code item.tentar(codigo)} em cada item, acumulando se
     *       houve acerto em ALGUM deles;</li>
     *   <li>Se NENHUM item acertou, e um ERRO: adiciona a letra ao vetor
     *       {@code erradas}. Conforme a nota do UML, instancie a letra errada
     *       usando {@code Palavra.getLetraFactory().getLetra(codigo)};</li>
     *   <li>Ao final, SE {@link #encerrou()}, chama
     *       {@code getJogador().atualizarPontuacao(calcularPontos())}.</li>
     * </ol>
     *
     * @param codigo caractere tentado pelo jogador
     */
    public void tentar(char codigo) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Arrisca as palavras da rodada — UMA UNICA VEZ.
     *
     * <p><b>ALGORITMO:</b></p>
     * <ol>
     *   <li>Pre-condicao: se {@link #encerrou()} (o que inclui ja ter
     *       arriscado), nao faz nada;</li>
     *   <li>Distribui cada String do vetor para o item de mesmo indice, via
     *       {@code item.arriscar(palavras[i])};</li>
     *   <li>Ao final, SE {@link #encerrou()} — e depois de arriscar ela sempre
     *       encerra —, chama
     *       {@code getJogador().atualizarPontuacao(calcularPontos())}.</li>
     * </ol>
     *
     * @param palavras palavras arriscadas, na mesma ordem dos itens
     */
    public void arriscar(String[] palavras) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return as letras erradas ja tentadas nesta rodada
     */
    public Letra[] getErradas() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna as letras CERTAS ja tentadas, ou seja, as letras ja descobertas
     * em todos os itens.
     *
     * @return as letras certas
     */
    public Letra[] getCertas() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * <b>REGRA (UML):</b> {@code tentativas = certas + erradas}.
     *
     * @return todas as letras tentadas nesta rodada
     */
    public Letra[] getTentativas() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return a quantidade de tentativas ({@code getTentativas().length})
     */
    public int getQtdeTentativas() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return a quantidade de acertos ({@code getCertas().length})
     */
    public int getQtdeAcertos() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Quantidade de erros cometidos. E este valor que se passa como
     * {@code partes} para {@link Boneco#exibir(Object, int)}.
     *
     * @return a quantidade de erros ({@code getErradas().length})
     */
    public int getQtdeErros() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return quantos erros ainda restam ({@code getMaxErros() - getQtdeErros()})
     */
    public int getQtdeTentativasRestantes() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * <b>REGRA (UML):</b> arriscou pelo menos 1 item.
     *
     * @return {@code true} se o jogador ja arriscou
     */
    public boolean arriscou() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * <b>REGRA (UML):</b> descobriu TODOS os itens.
     *
     * @return {@code true} se todas as palavras foram descobertas
     */
    public boolean descobriu() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * <b>REGRA (UML):</b>
     * {@code encerrou = arriscou() || descobriu() || atingiuMaxErros}, onde
     * {@code atingiuMaxErros = getQtdeTentativasRestantes() == 0}.
     *
     * @return {@code true} se a rodada terminou
     */
    public boolean encerrou() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Calcula os pontos desta rodada.
     *
     * <p><b>REGRA (UML):</b></p>
     * <ul>
     *   <li>Se {@link #descobriu()}:
     *       {@code pontosQuandoDescobreTodasAsPalavras (100)} +
     *       a soma, para cada item, de
     *       {@code item.calcularPontosLetrasEncobertas(pontosPorLetraEncoberta)}
     *       — ou seja, 15 por cada letra que ficou encoberta;</li>
     *   <li>Se NAO descobriu: {@code 0}.</li>
     * </ul>
     *
     * @return os pontos obtidos nesta rodada
     */
    public int calcularPontos() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Exibe as palavras da rodada com as letras ja descobertas reveladas.
     *
     * @param contexto contexto de exibicao; {@code null} no modo texto
     */
    public void exibirPalavras(Object contexto) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Exibe o quadro de letras erradas.
     *
     * @param contexto contexto de exibicao; {@code null} no modo texto
     */
    public void exibirLetrasErradas(Object contexto) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Exibe o boneco com tantas partes quantos forem os erros.
     *
     * <p>Delega a {@code boneco.exibir(contexto, getQtdeErros())}.</p>
     *
     * @param contexto contexto de exibicao; {@code null} no modo texto
     */
    public void exibirBoneco(Object contexto) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Exibe todos os itens da rodada.
     *
     * @param contexto contexto de exibicao; {@code null} no modo texto
     */
    public void exibirItens(Object contexto) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
