package br.edu.iff.jogoforca.dominio.boneco.texto;

import br.edu.iff.jogoforca.dominio.boneco.Boneco;

/**
 * &lt;&lt;Singleton&gt;&gt;
 *
 * <p>Boneco no meio grafico TEXTO.</p>
 *
 * <p><b>ESCOPO (Reiterando.pdf, item a):</b> esta classe DEVE ser implementada.
 * O metodo {@link #exibir(Object, int)} imprime na tela, com
 * {@code System.out.print}, o NOME das partes do boneco correspondentes a
 * quantidade de erros.</p>
 */
public class BonecoTexto implements Boneco {

    private static BonecoTexto soleInstance;

    /**
     * Construtor privado (Singleton).
     */
    private BonecoTexto() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna a instancia unica, criando-a se necessario.
     *
     * @return a instancia unica
     */
    public static BonecoTexto getSoleInstance() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     *
     * <p>Imprime o nome de cada parte ja "desenhada", de forma cumulativa, de
     * acordo com a quantidade de erros: 1 = cabeca; 2 = cabeca, olho esquerdo;
     * ... ; 10 = todas as dez partes.</p>
     *
     * <p>O contexto e desnecessario aqui: passe {@code null}.</p>
     *
     * @param contexto ignorado nesta implementacao (passe {@code null})
     * @param partes   quantidade de erros (0 a 10)
     */
    @Override
    public void exibir(Object contexto, int partes) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
