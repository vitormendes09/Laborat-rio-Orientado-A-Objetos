package br.edu.iff.jogoforca.emmemoria;

import br.edu.iff.bancodepalavras.dominio.palavra.PalavraRepository;
import br.edu.iff.bancodepalavras.dominio.tema.TemaRepository;
import br.edu.iff.jogoforca.RepositoryFactory;
import br.edu.iff.jogoforca.dominio.jogador.JogadorRepository;
import br.edu.iff.jogoforca.dominio.rodada.RodadaRepository;

/**
 * &lt;&lt;Singleton&gt;&gt;
 *
 * <p>Familia de repositorios EM MEMORIA. Cada metodo devolve o Singleton
 * {@code Memoria*Repository} correspondente.</p>
 *
 * <p>E a familia usada por padrao, ja que
 * {@code Aplicacao.TIPOS_REPOSITORY_FACTORY[0] == "memoria"}.</p>
 */
public class MemoriaRepositoryFactory implements RepositoryFactory {

    private static MemoriaRepositoryFactory soleInstance;

    /**
     * Construtor privado (Singleton).
     */
    private MemoriaRepositoryFactory() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna a instancia unica, criando-a se necessario.
     *
     * @return a instancia unica
     */
    public static MemoriaRepositoryFactory getSoleInstance() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     *
     * <p>Devolve {@code MemoriaPalavraRepository.getSoleInstance()}.</p>
     */
    @Override
    public PalavraRepository getPalavraRepository() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     *
     * <p>Devolve {@code MemoriaTemaRepository.getSoleInstance()}.</p>
     */
    @Override
    public TemaRepository getTemaRepository() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     *
     * <p>Devolve {@code MemoriaRodadaRepository.getSoleInstance()}.</p>
     */
    @Override
    public RodadaRepository getRodadaRepository() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     *
     * <p>Devolve {@code MemoriaJogadorRepository.getSoleInstance()}.</p>
     */
    @Override
    public JogadorRepository getJogadorRepository() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
