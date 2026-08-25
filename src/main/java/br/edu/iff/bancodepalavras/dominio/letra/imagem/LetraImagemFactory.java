package br.edu.iff.bancodepalavras.dominio.letra.imagem;

import br.edu.iff.bancodepalavras.dominio.letra.Letra;
import br.edu.iff.bancodepalavras.dominio.letra.LetraFactoryImpl;

/**
 * &lt;&lt;Singleton&gt;&gt;
 *
 * <p>Fabrica de {@link LetraImagem}.</p>
 *
 * <p><b>ESCOPO (Reiterando.pdf, item a):</b> apenas a classe; os metodos podem
 * permanecer vazios. Existe para provar a extensibilidade do modelo.</p>
 */
public class LetraImagemFactory extends LetraFactoryImpl {

    private static LetraImagemFactory soleInstance;

    /**
     * Construtor privado (Singleton).
     */
    private LetraImagemFactory() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna a instancia unica desta fabrica, criando-a se necessario.
     *
     * @return a instancia unica
     */
    public static LetraImagemFactory getSoleInstance() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * &lt;&lt;factory method&gt;&gt; — instanciaria uma {@link LetraImagem}.
     *
     * @param codigo caractere da letra a criar
     * @return nova {@link LetraImagem}
     */
    @Override
    protected Letra criarLetra(char codigo) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
