package br.edu.iff.bancodepalavras.dominio.palavra;

import br.edu.iff.bancodepalavras.dominio.letra.Letra;
import br.edu.iff.bancodepalavras.dominio.letra.LetraFactory;
import br.edu.iff.bancodepalavras.dominio.tema.Tema;
import br.edu.iff.dominio.ObjetoDominioImpl;

/**
 * &lt;&lt;entity&gt;&gt;
 *
 * <p>Uma palavra do banco de palavras. Internamente e um vetor ORDENADO de
 * 1..TamanhoDaPalavra {@link Letra} (flyweights compartilhados). Pertence a
 * exatamente 1 {@link Tema}.</p>
 *
 * <p><b>INVARIANTE:</b> so e possivel chamar o construtor se o
 * {@code letraFactory} estatico ja tiver sido setado via
 * {@link #setLetraFactory(LetraFactory)} — o construtor usa
 * {@link #getLetraFactory()} para instanciar as letras. Quem faz esse
 * {@code set} e o {@code Aplicacao.configurar()}.</p>
 */
public class Palavra extends ObjetoDominioImpl {

    /**
     * Fabrica de letras compartilhada por TODAS as palavras (campo estatico).
     * Deve ser setada por {@code Aplicacao.configurar()} antes de construir
     * qualquer palavra.
     */
    private static LetraFactory letraFactory;

    private Letra[] letras;

    private Tema tema;

    /**
     * Construtor privado: use {@link #criar(long, String, Tema)} ou
     * {@link #reconstituir(long, String, Tema)}.
     *
     * <p>Converte a String recebida em um vetor de Letra, obtendo cada letra
     * via {@code getLetraFactory().getLetra(c)}.</p>
     *
     * @param id      identidade da entidade
     * @param palavra texto da palavra
     * @param tema    tema ao qual pertence
     */
    private Palavra(long id, String palavra, Tema tema) {
        super(id);
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Define a fabrica de letras usada por todas as palavras.
     *
     * <p>Chamado por {@code Aplicacao.configurar()}. Sem isso, construir uma
     * Palavra e erro.</p>
     *
     * @param factory a fabrica de letras
     */
    public static void setLetraFactory(LetraFactory factory) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return a fabrica de letras corrente (pode ser {@code null} se ainda nao
     *         configurada)
     */
    public static LetraFactory getLetraFactory() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Cria uma palavra NOVA (ainda nao persistida).
     *
     * @param id      id gerado pelo repositorio
     * @param palavra texto da palavra
     * @param tema    tema ao qual pertence
     * @return a nova palavra
     */
    public static Palavra criar(long id, String palavra, Tema tema) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Reconstitui uma palavra JA EXISTENTE, vinda da persistencia.
     *
     * @param id      id ja existente
     * @param palavra texto da palavra
     * @param tema    tema ao qual pertence
     * @return a palavra reconstituida
     */
    public static Palavra reconstituir(long id, String palavra, Tema tema) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna a letra que ocupa a posicao informada.
     *
     * @param posicao indice de 0 a {@code getTamanho() - 1}
     * @return a letra naquela posicao
     */
    public Letra getLetra(int posicao) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna todas as letras da palavra, na ordem.
     *
     * @return vetor ordenado de letras
     */
    public Letra[] getLetras() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return o tema ao qual esta palavra pertence
     */
    public Tema getTema() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return a quantidade de letras da palavra
     */
    public int getTamanho() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Tenta a letra informada nesta palavra.
     *
     * <p><b>REGRA (UML):</b> retorna um vetor contendo as POSICOES nas quais a
     * letra se encontra na palavra. Se a letra nao ocorrer em nenhuma posicao,
     * retorne um vetor VAZIO.</p>
     *
     * <p><b>IMPORTANTE: vetor vazio NAO e {@code null}.</b> Nunca retorne
     * {@code null} aqui — o chamador ({@code Item.tentar}) itera sobre o
     * resultado.</p>
     *
     * @param codigo caractere tentado
     * @return vetor com as posicoes onde a letra ocorre (vazio se nenhuma)
     */
    public int[] tentar(char codigo) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Compara o texto desta palavra com a String informada.
     *
     * <p>Usado por {@code Item.acertou()} para avaliar a palavra arriscada.</p>
     *
     * @param palavra texto a comparar
     * @return {@code true} se corresponder a esta palavra
     */
    public boolean comparar(String palavra) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Exibe a palavra INTEIRA (todas as letras descobertas).
     *
     * @param contexto contexto de exibicao; {@code null} no modo texto
     */
    public void exibir(Object contexto) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Exibe a palavra PARCIALMENTE, conforme as posicoes ja descobertas.
     *
     * <p>Para cada posicao {@code i}: se {@code posicoes[i]} for {@code true},
     * exibe a letra real; caso contrario exibe a letra encoberta obtida de
     * {@code getLetraFactory().getLetraEncoberta()}.</p>
     *
     * @param contexto contexto de exibicao; {@code null} no modo texto
     * @param posicoes vetor paralelo as letras, indicando quais ja foram
     *                 descobertas
     */
    public void exibir(Object contexto, boolean[] posicoes) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return o texto da palavra
     */
    @Override
    public String toString() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
