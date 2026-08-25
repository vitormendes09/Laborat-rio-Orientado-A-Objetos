package br.edu.iff.bancodepalavras.dominio.letra.texto;

import br.edu.iff.bancodepalavras.dominio.letra.Letra;
import br.edu.iff.bancodepalavras.dominio.letra.LetraFactoryImpl;

/**
 * &lt;&lt;Singleton&gt;&gt;
 *
 * <p>Fabrica de {@link LetraTexto}. Herda de {@link LetraFactoryImpl} todo o
 * gerenciamento do pool de flyweights e fornece apenas o factory method.</p>
 *
 * <p>E um Singleton simples (sem parametros): a instancia pode ser criada
 * na primeira chamada de {@link #getSoleInstance()}.</p>
 */
public class LetraTextoFactory extends LetraFactoryImpl {

    private static LetraTextoFactory soleInstance;

    /**
     * Construtor privado: impede instanciacao externa (Singleton).
     */
    private LetraTextoFactory() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna a instancia unica desta fabrica, criando-a se necessario.
     *
     * @return a instancia unica
     */
    public static LetraTextoFactory getSoleInstance() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * &lt;&lt;factory method&gt;&gt; — instancia uma {@link LetraTexto}.
     *
     * <p>Chamado apenas pelo template method {@code getLetra(char)} da
     * superclasse, quando a letra ainda nao esta no pool.</p>
     *
     * @param codigo caractere da letra a criar
     * @return nova {@link LetraTexto}
     */
    @Override
    protected Letra criarLetra(char codigo) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
