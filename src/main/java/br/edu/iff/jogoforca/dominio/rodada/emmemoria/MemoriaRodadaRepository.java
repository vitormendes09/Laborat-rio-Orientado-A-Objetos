package br.edu.iff.jogoforca.dominio.rodada.emmemoria;

import br.edu.iff.jogoforca.dominio.jogador.Jogador;
import br.edu.iff.jogoforca.dominio.rodada.Rodada;
import br.edu.iff.jogoforca.dominio.rodada.RodadaRepository;
import br.edu.iff.repository.RepositoryException;

/**
 * &lt;&lt;Singleton&gt;&gt;
 *
 * <p>Repositorio de {@link Rodada} em memoria.</p>
 *
 * <p><b>ESCOPO (Reiterando.pdf, item b):</b> DEVE ser implementado e deve
 * COMECAR VAZIO. As rodadas sao salvas via
 * {@code RodadaAppService.salvarRodada}.</p>
 */
public class MemoriaRodadaRepository implements RodadaRepository {

    private static MemoriaRodadaRepository soleInstance;

    /** Pool interno de rodadas. Comeca VAZIO. */
    private java.util.List<Rodada> pool;

    /** Contador usado por {@link #getProximoId()}. */
    private long proximoId;

    /**
     * Construtor privado (Singleton). Inicializa o pool vazio.
     */
    private MemoriaRodadaRepository() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna a instancia unica, criando-a se necessario.
     *
     * @return a instancia unica
     */
    public static MemoriaRodadaRepository getSoleInstance() {
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
    public Rodada getPorId(long id) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     *
     * <p>Compare os jogadores pela identidade ({@code getId()}).</p>
     */
    @Override
    public Rodada[] getPorJogador(Jogador jogador) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void inserir(Rodada rodada) throws RepositoryException {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void atualizar(Rodada rodada) throws RepositoryException {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remover(Rodada rodada) throws RepositoryException {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
