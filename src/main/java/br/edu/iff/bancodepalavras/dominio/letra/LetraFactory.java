package br.edu.iff.bancodepalavras.dominio.letra;

/**
 * &lt;&lt;interface&gt;&gt; &lt;&lt;factory&gt;&gt;
 *
 * <p>Fabrica de {@link Letra}. Abstrai de que meio grafico a letra e
 * (texto ou imagem): o dominio inteiro so conhece esta interface.</p>
 */
public interface LetraFactory {

    /**
     * Retorna a letra correspondente ao codigo informado.
     *
     * <p>Por se tratar de um &lt;&lt;flyweight&gt;&gt;, chamadas repetidas com o
     * mesmo codigo devem devolver SEMPRE a mesma instancia (compartilhada pelo
     * pool), e nao uma nova.</p>
     *
     * @param codigo caractere desejado
     * @return a letra compartilhada correspondente
     */
    Letra getLetra(char codigo);

    /**
     * Retorna a letra especial que representa uma posicao ainda nao descoberta
     * da palavra.
     *
     * <p>Tambem e compartilhada: existe uma unica instancia de letra encoberta
     * por fabrica.</p>
     *
     * @return a letra encoberta
     */
    Letra getLetraEncoberta();
}
