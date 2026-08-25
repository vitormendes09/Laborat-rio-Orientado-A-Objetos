package br.edu.iff.jogoforca.dominio.boneco.imagem;

import br.edu.iff.jogoforca.dominio.boneco.Boneco;
import br.edu.iff.jogoforca.dominio.boneco.BonecoFactory;

/**
 * &lt;&lt;Singleton&gt;&gt; &lt;&lt;factory&gt;&gt;
 *
 * <p>Fabrica de {@link BonecoImagem}.</p>
 *
 * <p><b>ESCOPO (Reiterando.pdf, item a):</b> apenas a classe; metodos podem
 * permanecer vazios.</p>
 */
public class BonecoImagemFactory implements BonecoFactory {

    private static BonecoImagemFactory soleInstance;

    /** Boneco produzido por esta fabrica (agregacao de multiplicidade 1). */
    private Boneco boneco;

    /**
     * Construtor privado (Singleton).
     */
    private BonecoImagemFactory() {
        // Permanentemente vazio (fora do escopo do trabalho).
    }

    /**
     * Retorna a instancia unica, criando-a se necessario.
     *
     * @return a instancia unica
     */
    public static BonecoImagemFactory getSoleInstance() {
        if (soleInstance == null) {
            soleInstance = new BonecoImagemFactory();
        }
        return soleInstance;
    }

    /**
     * {@inheritDoc}
     *
     * <p>Fora do escopo: retorna o Singleton {@code BonecoImagem}, cujos
     * metodos sao vazios.</p>
     */
    @Override
    public Boneco getBoneco() {
        return BonecoImagem.getSoleInstance();
    }
}
