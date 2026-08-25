package br.edu.iff.jogoforca.dominio.rodada;

import br.edu.iff.bancodepalavras.dominio.letra.Letra;
import br.edu.iff.bancodepalavras.dominio.palavra.Palavra;
import br.edu.iff.dominio.ObjetoDominioImpl;

/**
 * &lt;&lt;entity&gt;&gt;
 *
 * <p>Um item da rodada: associa UMA {@link Palavra} ao estado de descoberta
 * dela naquela rodada. Uma rodada tem de 1 a {@code Rodada.maxPalavras} itens.</p>
 *
 * <p>O {@code id} do item corresponde ao INDICE da palavra no vetor de palavras
 * passado ao construtor da Rodada (por isso e {@code int}, e nao {@code long}).</p>
 *
 * <p>Note que {@code tentar} e {@code arriscar} tem visibilidade de PACOTE
 * (~ no UML): so a {@code Rodada}, que esta no mesmo pacote, pode invoca-los.
 * O jogador nunca fala com o Item diretamente.</p>
 */
public class Item extends ObjetoDominioImpl {

    private Palavra palavra;

    /**
     * Vetor paralelo as letras da palavra: {@code posicoesDescobertas[i]} indica
     * se a letra da posicao {@code i} ja foi descoberta.
     */
    private boolean[] posicoesDescobertas;

    /**
     * Palavra que o jogador arriscou para este item. {@code null} enquanto nao
     * arriscou — e exatamente esse {@code null} que define
     * {@link #arriscou()}.
     */
    private String palavraArriscada = null;

    /**
     * Construtor privado de item NOVO: nenhuma posicao descoberta, nada
     * arriscado.
     *
     * @param id      indice da palavra no vetor da rodada
     * @param palavra palavra deste item
     */
    private Item(int id, Palavra palavra) {
        super(id);
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Construtor privado de item reconstituido, com o estado ja conhecido.
     *
     * @param id                  indice da palavra no vetor da rodada
     * @param palavra             palavra deste item
     * @param posicoesDescobertas posicoes ja descobertas
     * @param palavraArriscada    palavra arriscada, ou {@code null}
     */
    private Item(int id, Palavra palavra, int[] posicoesDescobertas,
                 String palavraArriscada) {
        super(id);
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Cria um item NOVO. Visibilidade de PACOTE: apenas a {@code Rodada} cria
     * itens, dentro do seu proprio construtor.
     *
     * @param id      indice da palavra no vetor da rodada
     * @param palavra palavra deste item
     * @return o novo item
     */
    static Item criar(int id, Palavra palavra) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Reconstitui um item JA EXISTENTE, vindo da persistencia.
     *
     * @param id                  indice da palavra no vetor da rodada
     * @param palavra             palavra deste item
     * @param posicoesDescobertas posicoes ja descobertas
     * @param palavraArriscada    palavra arriscada, ou {@code null}
     * @return o item reconstituido
     */
    public static Item reconstituir(int id, Palavra palavra,
                                    int[] posicoesDescobertas,
                                    String palavraArriscada) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return a palavra deste item
     */
    public Palavra getPalavra() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Tenta a letra neste item.
     *
     * <p>Delega a {@code palavra.tentar(codigo)}; para cada posicao retornada,
     * marca {@code posicoesDescobertas} como {@code true}.</p>
     *
     * <p>Lembre que {@code Palavra.tentar} retorna VETOR VAZIO (nunca
     * {@code null}) quando a letra nao ocorre — nesse caso nada e marcado e o
     * retorno e {@code false}.</p>
     *
     * <p>Visibilidade de pacote: so a {@code Rodada} chama.</p>
     *
     * @param codigo caractere tentado
     * @return {@code true} se a letra ocorre nesta palavra (acerto),
     *         {@code false} caso contrario (erro)
     */
    boolean tentar(char codigo) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Registra a palavra arriscada para este item.
     *
     * <p>Apenas armazena em {@code palavraArriscada}. A verificacao de acerto e
     * feita separadamente por {@link #acertou()}.</p>
     *
     * <p>Visibilidade de pacote: so a {@code Rodada} chama.</p>
     *
     * @param palavra texto arriscado pelo jogador
     */
    void arriscar(String palavra) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return a palavra arriscada, ou {@code null} se ainda nao arriscou
     */
    public String getPalavraArriscada() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * <b>REGRA (UML):</b> {@code arriscou = palavraArriscada != null}.
     *
     * @return {@code true} se o jogador ja arriscou este item
     */
    public boolean arriscou() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * <b>REGRA (UML):</b> {@code acertou = palavra.comparar(palavraArriscada)}.
     *
     * @return {@code true} se a palavra arriscada corresponde a palavra do item
     */
    public boolean acertou() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * <b>REGRA (UML):</b>
     * {@code descobriu = acertou() || qtdeLetrasEncobertas() == 0}.
     *
     * <p>Ou seja: ou o jogador arriscou e acertou a palavra inteira, ou ele
     * descobriu todas as letras uma a uma.</p>
     *
     * @return {@code true} se este item foi descoberto
     */
    public boolean descobriu() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return as letras ja descobertas deste item
     */
    public Letra[] getLetrasDescobertas() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return as letras ainda encobertas deste item
     */
    public Letra[] getLetrasEncobertas() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return quantas letras deste item continuam encobertas
     */
    public int qtdeLetrasEncobertas() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Calcula os pontos devidos as letras que ficaram encobertas neste item.
     *
     * <p>E simplesmente {@code qtdeLetrasEncobertas() * valorPorLetraEncoberta}.
     * A {@code Rodada} soma isso de todos os itens quando descobriu.</p>
     *
     * @param valorPorLetraEncoberta pontos por letra encoberta (padrao: 15)
     * @return pontos das letras encobertas deste item
     */
    public int calcularPontosLetrasEncobertas(int valorPorLetraEncoberta) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Exibe este item, ou seja, a palavra com as posicoes ja descobertas
     * reveladas e as demais encobertas.
     *
     * <p>Delega a {@code palavra.exibir(contexto, posicoesDescobertas)}.</p>
     *
     * @param contexto contexto de exibicao; {@code null} no modo texto
     */
    public void exibir(Object contexto) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
