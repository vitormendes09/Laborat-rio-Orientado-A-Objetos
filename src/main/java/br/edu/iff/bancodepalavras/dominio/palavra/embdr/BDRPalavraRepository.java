package br.edu.iff.bancodepalavras.dominio.palavra.embdr;

import br.edu.iff.bancodepalavras.dominio.palavra.Palavra;
import br.edu.iff.bancodepalavras.dominio.palavra.PalavraRepository;
import br.edu.iff.bancodepalavras.dominio.tema.Tema;
import br.edu.iff.repository.RepositoryException;

/**
 * &lt;&lt;Singleton&gt;&gt;
 *
 * <p>Repositorio de {@link Palavra} em Banco de Dados Relacional.</p>
 *
 * <p><b>ESCOPO (Reiterando.pdf, item b):</b> NAO precisa implementar. Apenas a
 * classe, com os metodos VAZIOS.</p>
 */
public class BDRPalavraRepository implements PalavraRepository {

    private static BDRPalavraRepository soleInstance;

    /**
     * Construtor privado (Singleton).
     */
    private BDRPalavraRepository() {
        // Permanentemente vazio (fora do escopo do trabalho).
    }

    /**
     * Retorna a instancia unica, criando-a se necessario.
     *
     * @return a instancia unica
     */
    public static BDRPalavraRepository getSoleInstance() {
        if (soleInstance == null) {
            soleInstance = new BDRPalavraRepository();
        }
        return soleInstance;
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public long getProximoId() {
        return 0;
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public Palavra getPorId(long id) {
        return null;
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public Palavra[] getPorTema(Tema tema) {
        return null;
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public Palavra[] getTodas() {
        return null;
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public Palavra getPalavra(String palavra) {
        return null;
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public void inserir(Palavra palavra) throws RepositoryException {
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public void atualizar(Palavra palavra) throws RepositoryException {
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public void remover(Palavra palavra) throws RepositoryException {
    }
}
