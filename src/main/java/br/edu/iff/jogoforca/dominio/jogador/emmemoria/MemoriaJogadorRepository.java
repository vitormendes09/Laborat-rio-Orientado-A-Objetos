package br.edu.iff.jogoforca.dominio.jogador.emmemoria;

import br.edu.iff.jogoforca.dominio.jogador.Jogador;
import br.edu.iff.jogoforca.dominio.jogador.JogadorRepository;
import br.edu.iff.repository.RepositoryException;

/**
 * &lt;&lt;Singleton&gt;&gt;
 *
 * <p>Repositorio de {@link Jogador} em memoria.</p>
 *
 * <p><b>ESCOPO (Reiterando.pdf, item b):</b> DEVE ser implementado e deve
 * COMECAR VAZIO. Os jogadores sao criados e inseridos pelo {@code Main}.</p>
 */
public class MemoriaJogadorRepository implements JogadorRepository {

    private static MemoriaJogadorRepository soleInstance;

    /** Pool interno de jogadores. Comeca VAZIO. */
    private java.util.List<Jogador> pool;

    /** Contador usado por {@link #getProximoId()}. */
    private long proximoId;

    /**
     * Construtor privado (Singleton). Inicializa o pool vazio.
     */
    private MemoriaJogadorRepository() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna a instancia unica, criando-a se necessario.
     *
     * @return a instancia unica
     */
    public static MemoriaJogadorRepository getSoleInstance() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getProximoId() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Jogador getPorId(long id) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Jogador getPorNome(String nome) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void inserir(Jogador jogador) throws RepositoryException {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void atualizar(Jogador jogador) throws RepositoryException {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remover(Jogador jogador) throws RepositoryException {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
