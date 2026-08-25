package br.edu.iff.bancodepalavras.dominio.tema;

/**
 * &lt;&lt;interface&gt;&gt; &lt;&lt;factory&gt;&gt;
 *
 * <p>Fabrica de {@link Tema}. Abstrai do cliente a obtencao do id junto ao
 * repositorio.</p>
 */
public interface TemaFactory {

    /**
     * Cria um novo tema com o nome informado, ja com um id valido obtido do
     * repositorio de temas.
     *
     * <p>Atencao: apenas CRIA o objeto — nao o insere no repositorio. A
     * insercao e responsabilidade do chamador (ver Reiterando.pdf, item d2).</p>
     *
     * @param nome nome do novo tema
     * @return o tema criado
     */
    Tema getTema(String nome);
}
