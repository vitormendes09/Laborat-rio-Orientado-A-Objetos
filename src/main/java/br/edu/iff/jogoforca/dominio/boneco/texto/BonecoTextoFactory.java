package br.edu.iff.jogoforca.dominio.boneco.texto;

import br.edu.iff.jogoforca.dominio.boneco.Boneco;
import br.edu.iff.jogoforca.dominio.boneco.BonecoFactory;

/**
 * &lt;&lt;Singleton&gt;&gt;
 *
 * <p>Fabrica de {@link BonecoTexto}.</p>
 *
 * <p>Conforme a nota do UML, dentro do construtor esta fabrica acessa o
 * Singleton {@code BonecoTexto.getSoleInstance()} e seta o campo da
 * agregacao.</p>
 */
public class BonecoTextoFactory implements BonecoFactory {

    private static BonecoTextoFactory soleInstance;

    /** Boneco produzido por esta fabrica (agregacao de multiplicidade 1). */
    private Boneco boneco;

    /**
     * Construtor privado (Singleton). Obtem o {@code BonecoTexto} Singleton e
     * o guarda no campo da agregacao.
     */
    private BonecoTextoFactory() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna a instancia unica, criando-a se necessario.
     *
     * @return a instancia unica
     */
    public static BonecoTextoFactory getSoleInstance() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boneco getBoneco() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
