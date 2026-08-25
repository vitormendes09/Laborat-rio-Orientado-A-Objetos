package br.edu.iff.jogoforca.texto;

import br.edu.iff.bancodepalavras.dominio.letra.Letra;
import br.edu.iff.bancodepalavras.dominio.letra.LetraFactory;
import br.edu.iff.jogoforca.ElementoGraficoFactory;
import br.edu.iff.jogoforca.dominio.boneco.Boneco;
import br.edu.iff.jogoforca.dominio.boneco.BonecoFactory;

/**
 * &lt;&lt;Singleton&gt;&gt;
 *
 * <p>Familia de elementos graficos em TEXTO. Delega para
 * {@code LetraTextoFactory} e {@code BonecoTextoFactory}.</p>
 *
 * <p>Conforme a nota do UML, dentro do construtor esta fabrica acessa os
 * Singletons das duas fabricas especificas e seta os campos das agregacoes.</p>
 *
 * <p>E a familia usada por padrao, ja que
 * {@code Aplicacao.TIPOS_ELEMENTO_GRAFICO_FACTORY[0] == "texto"}.</p>
 */
public class ElementoGraficoTextoFactory implements ElementoGraficoFactory {

    private static ElementoGraficoTextoFactory soleInstance;

    /** Fabrica de letras em texto (agregacao de multiplicidade 1). */
    private LetraFactory letraFactory;

    /** Fabrica do boneco em texto (agregacao de multiplicidade 1). */
    private BonecoFactory bonecoFactory;

    /**
     * Construtor privado (Singleton). Obtem os Singletons
     * {@code LetraTextoFactory} e {@code BonecoTextoFactory} e os guarda nos
     * campos das agregacoes.
     */
    private ElementoGraficoTextoFactory() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna a instancia unica, criando-a se necessario.
     *
     * @return a instancia unica
     */
    public static ElementoGraficoTextoFactory getSoleInstance() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     *
     * <p>Delega a fabrica de letras em texto.</p>
     */
    @Override
    public Letra getLetra(char codigo) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     *
     * <p>Delega a fabrica de letras em texto.</p>
     */
    @Override
    public Letra getLetraEncoberta() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     *
     * <p>Delega a fabrica de boneco em texto.</p>
     */
    @Override
    public Boneco getBoneco() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
