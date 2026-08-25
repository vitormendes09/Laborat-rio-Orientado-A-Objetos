package br.edu.iff.jogoforca.imagem;

import br.edu.iff.bancodepalavras.dominio.letra.Letra;
import br.edu.iff.bancodepalavras.dominio.letra.LetraFactory;
import br.edu.iff.bancodepalavras.dominio.letra.imagem.LetraImagemFactory;
import br.edu.iff.jogoforca.ElementoGraficoFactory;
import br.edu.iff.jogoforca.dominio.boneco.Boneco;
import br.edu.iff.jogoforca.dominio.boneco.BonecoFactory;
import br.edu.iff.jogoforca.dominio.boneco.imagem.BonecoImagemFactory;

/**
 * &lt;&lt;Singleton&gt;&gt;
 *
 * <p>Familia de elementos graficos em IMAGEM.</p>
 *
 * <p><b>ESCOPO (Reiterando.pdf, item a):</b> apenas a classe; metodos podem
 * permanecer vazios. Existe para demonstrar a extensibilidade do modelo.</p>
 */
public class ElementoGraficoImagemFactory implements ElementoGraficoFactory {

    private static ElementoGraficoImagemFactory soleInstance;

    /** Fabrica de letras em imagem (agregacao de multiplicidade 1). */
    private LetraFactory letraFactory;

    /** Fabrica do boneco em imagem (agregacao de multiplicidade 1). */
    private BonecoFactory bonecoFactory;

    /**
     * Construtor privado (Singleton).
     */
    private ElementoGraficoImagemFactory() {
        // Permanentemente vazio (fora do escopo do trabalho).
    }

    /**
     * Retorna a instancia unica, criando-a se necessario.
     *
     * @return a instancia unica
     */
    public static ElementoGraficoImagemFactory getSoleInstance() {
        if (soleInstance == null) {
            soleInstance = new ElementoGraficoImagemFactory();
        }
        return soleInstance;
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public Letra getLetra(char codigo) {
        return null;
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public Letra getLetraEncoberta() {
        return null;
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public Boneco getBoneco() {
        return null;
    }
}
