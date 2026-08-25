package br.edu.iff.bancodepalavras.dominio.tema.emmemoria;

import br.edu.iff.bancodepalavras.dominio.tema.Tema;
import br.edu.iff.bancodepalavras.dominio.tema.TemaRepository;
import br.edu.iff.repository.RepositoryException;

/**
 * &lt;&lt;Singleton&gt;&gt;
 *
 * <p>Repositorio de {@link Tema} em memoria.</p>
 *
 * <p><b>ESCOPO (Reiterando.pdf, item b):</b> os repositorios em memoria SAO os
 * unicos que precisam ser implementados, e devem COMECAR VAZIOS — nenhum dado
 * pre-carregado. Os temas sao criados e inseridos pelo {@code Main}.</p>
 *
 * <p>Mantem um {@code pool} interno (0..*) com os temas e um contador para
 * gerar os ids sequencialmente.</p>
 */
public class MemoriaTemaRepository implements TemaRepository {

    private static MemoriaTemaRepository soleInstance;

    /** Pool interno de temas. Comeca VAZIO. */
    private java.util.List<Tema> pool;

    /** Contador usado por {@link #getProximoId()}. */
    private long proximoId;

    /**
     * Construtor privado (Singleton). Inicializa o pool vazio.
     */
    private MemoriaTemaRepository() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna a instancia unica, criando-a se necessario.
     *
     * @return a instancia unica
     */
    public static MemoriaTemaRepository getSoleInstance() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     *
     * <p>Incrementa e devolve o contador interno.</p>
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
    public Tema getPorId(long id) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     *
     * <p>Lembre: sem correspondencia, retorne vetor VAZIO, nunca {@code null}.</p>
     */
    @Override
    public Tema[] getPorNome(String nome) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tema[] getTodos() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void inserir(Tema tema) throws RepositoryException {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void atualizar(Tema tema) throws RepositoryException {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remover(Tema tema) throws RepositoryException {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
