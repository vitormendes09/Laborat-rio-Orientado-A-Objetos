package br.edu.iff.jogoforca.dominio.rodada;

import br.edu.iff.bancodepalavras.dominio.palavra.PalavraRepository;
import br.edu.iff.bancodepalavras.dominio.tema.TemaRepository;
import br.edu.iff.factory.EntityFactory;

/**
 * &lt;&lt;abstract&gt;&gt;
 *
 * <p>Base das fabricas de {@link Rodada}. Diferente das demais fabricas de
 * entidade, precisa de TRES repositorios: o de rodadas (para gerar o id, via
 * {@code EntityFactory}) e os de tema e palavra (para montar o conteudo da
 * rodada).</p>
 *
 * <p>Subclasse: {@code RodadaSorteioFactory}.</p>
 */
public abstract class RodadaFactoryImpl extends EntityFactory
        implements RodadaFactory {

    private TemaRepository temaRepository;

    private PalavraRepository palavraRepository;

    /**
     * @param repository        repositorio de rodadas (gera os ids)
     * @param temaRepository    repositorio de temas
     * @param palavraRepository repositorio de palavras
     */
    protected RodadaFactoryImpl(RodadaRepository repository,
                                TemaRepository temaRepository,
                                PalavraRepository palavraRepository) {
        super(repository);
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Typecast conveniente do repositorio herdado de {@code EntityFactory}.
     *
     * @return o repositorio de rodadas
     */
    protected RodadaRepository getRodadaRepository() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return o repositorio de temas
     */
    protected TemaRepository getTemaRepository() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return o repositorio de palavras
     */
    protected PalavraRepository getPalavraRepository() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
