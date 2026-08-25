package br.edu.iff.bancodepalavras.dominio.palavra;

import br.edu.iff.bancodepalavras.dominio.tema.Tema;

/**
 * &lt;&lt;interface&gt;&gt; &lt;&lt;factory&gt;&gt;
 *
 * <p>Fabrica de {@link Palavra}.</p>
 */
public interface PalavraFactory {

    /**
     * Cria uma nova palavra do tema informado, ja com id valido obtido do
     * repositorio de palavras.
     *
     * <p>Apenas CRIA — nao insere no repositorio. A insercao e feita pelo
     * {@code PalavraAppService.novaPalavra}.</p>
     *
     * @param palavra texto da palavra
     * @param tema    tema ao qual pertence
     * @return a palavra criada
     */
    Palavra getPalavra(String palavra, Tema tema);
}
