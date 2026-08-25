package br.edu.iff.bancodepalavras.dominio.palavra.emmemoria;

import br.edu.iff.bancodepalavras.dominio.palavra.Palavra;
import br.edu.iff.bancodepalavras.dominio.palavra.PalavraRepository;
import br.edu.iff.bancodepalavras.dominio.tema.Tema;
import br.edu.iff.repository.RepositoryException;

/**
 * &lt;&lt;Singleton&gt;&gt;
 *
 * <p>Repositorio de {@link Palavra} em memoria.</p>
 *
 * <p><b>ESCOPO (Reiterando.pdf, item b):</b> DEVE ser implementado e deve
 * COMECAR VAZIO. As palavras sao cadastradas via {@code PalavraAppService}.</p>
 */
public class MemoriaPalavraRepository implements PalavraRepository {

    private static MemoriaPalavraRepository soleInstance;

    /** Pool interno de palavras. Comeca VAZIO. */
    private java.util.List<Palavra> pool;

    /** Contador usado por {@link #getProximoId()}. */
    private long proximoId;

    /**
     * Construtor privado (Singleton). Inicializa o pool vazio.
     */
    private MemoriaPalavraRepository() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna a instancia unica, criando-a se necessario.
     *
     * @return a instancia unica
     */
    public static MemoriaPalavraRepository getSoleInstance() {
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
    public Palavra getPorId(long id) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     *
     * <p>Compare os temas pela identidade ({@code getId()}), nao por
     * referencia.</p>
     */
    @Override
    public Palavra[] getPorTema(Tema tema) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Palavra[] getTodas() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Palavra getPalavra(String palavra) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void inserir(Palavra palavra) throws RepositoryException {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void atualizar(Palavra palavra) throws RepositoryException {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remover(Palavra palavra) throws RepositoryException {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
