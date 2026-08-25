package br.edu.iff.jogoforca.dominio.rodada.embdr;

import br.edu.iff.jogoforca.dominio.jogador.Jogador;
import br.edu.iff.jogoforca.dominio.rodada.Rodada;
import br.edu.iff.jogoforca.dominio.rodada.RodadaRepository;
import br.edu.iff.repository.RepositoryException;

/**
 * &lt;&lt;Singleton&gt;&gt;
 *
 * <p>Repositorio de {@link Rodada} em Banco de Dados Relacional.</p>
 *
 * <p><b>ESCOPO (Reiterando.pdf, item b):</b> NAO precisa implementar. Apenas a
 * classe, com os metodos VAZIOS.</p>
 */
public class BDRRodadaRepository implements RodadaRepository {

    private static BDRRodadaRepository soleInstance;

    /**
     * Construtor privado (Singleton).
     */
    private BDRRodadaRepository() {
        // Permanentemente vazio (fora do escopo do trabalho).
    }

    /**
     * Retorna a instancia unica, criando-a se necessario.
     *
     * @return a instancia unica
     */
    public static BDRRodadaRepository getSoleInstance() {
        if (soleInstance == null) {
            soleInstance = new BDRRodadaRepository();
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
    public Rodada getPorId(long id) {
        return null;
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public Rodada[] getPorJogador(Jogador jogador) {
        return null;
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public void inserir(Rodada rodada) throws RepositoryException {
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public void atualizar(Rodada rodada) throws RepositoryException {
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public void remover(Rodada rodada) throws RepositoryException {
    }
}
