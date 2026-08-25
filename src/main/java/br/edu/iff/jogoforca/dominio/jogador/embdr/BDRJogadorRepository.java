package br.edu.iff.jogoforca.dominio.jogador.embdr;

import br.edu.iff.jogoforca.dominio.jogador.Jogador;
import br.edu.iff.jogoforca.dominio.jogador.JogadorRepository;
import br.edu.iff.repository.RepositoryException;

/**
 * &lt;&lt;Singleton&gt;&gt;
 *
 * <p>Repositorio de {@link Jogador} em Banco de Dados Relacional.</p>
 *
 * <p><b>ESCOPO (Reiterando.pdf, item b):</b> NAO precisa implementar. Apenas a
 * classe, com os metodos VAZIOS.</p>
 */
public class BDRJogadorRepository implements JogadorRepository {

    private static BDRJogadorRepository soleInstance;

    /**
     * Construtor privado (Singleton).
     */
    private BDRJogadorRepository() {
        // Permanentemente vazio (fora do escopo do trabalho).
    }

    /**
     * Retorna a instancia unica, criando-a se necessario.
     *
     * @return a instancia unica
     */
    public static BDRJogadorRepository getSoleInstance() {
        if (soleInstance == null) {
            soleInstance = new BDRJogadorRepository();
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
    public Jogador getPorId(long id) {
        return null;
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public Jogador getPorNome(String nome) {
        return null;
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public void inserir(Jogador jogador) throws RepositoryException {
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public void atualizar(Jogador jogador) throws RepositoryException {
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public void remover(Jogador jogador) throws RepositoryException {
    }
}
