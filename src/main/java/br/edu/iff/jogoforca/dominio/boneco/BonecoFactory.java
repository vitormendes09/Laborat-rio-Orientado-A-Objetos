package br.edu.iff.jogoforca.dominio.boneco;

/**
 * &lt;&lt;interface&gt;&gt; &lt;&lt;factory&gt;&gt;
 *
 * <p>Fabrica de {@link Boneco}.</p>
 */
public interface BonecoFactory {

    /**
     * Retorna o boneco a ser usado pela rodada.
     *
     * <p>As implementacoes concretas produzem Singletons ({@code BonecoTexto} /
     * {@code BonecoImagem}): o boneco nao guarda estado proprio — a quantidade
     * de partes e sempre passada como parametro em
     * {@link Boneco#exibir(Object, int)} —, portanto uma unica instancia pode
     * ser compartilhada por todas as rodadas.</p>
     *
     * @return o boneco
     */
    Boneco getBoneco();
}
