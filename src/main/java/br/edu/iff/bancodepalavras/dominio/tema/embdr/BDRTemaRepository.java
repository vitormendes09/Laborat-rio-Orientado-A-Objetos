package br.edu.iff.bancodepalavras.dominio.tema.embdr;

import br.edu.iff.bancodepalavras.dominio.tema.Tema;
import br.edu.iff.bancodepalavras.dominio.tema.TemaRepository;
import br.edu.iff.repository.RepositoryException;

/**
 * &lt;&lt;Singleton&gt;&gt;
 *
 * <p>Repositorio de {@link Tema} em Banco de Dados Relacional.</p>
 *
 * <p><b>ESCOPO (Reiterando.pdf, item b):</b> NAO precisa implementar. Basta
 * criar a classe e deixar os metodos VAZIOS. Existe para demonstrar que trocar
 * o mecanismo de persistencia nao afeta o dominio — a troca e feita apenas em
 * {@code Aplicacao.setTipoRepositoryFactory("relacional")}.</p>
 */
public class BDRTemaRepository implements TemaRepository {

    private static BDRTemaRepository soleInstance;

    /**
     * Construtor privado (Singleton).
     */
    private BDRTemaRepository() {
        // Permanentemente vazio (fora do escopo do trabalho).
    }

    /**
     * Retorna a instancia unica, criando-a se necessario.
     *
     * @return a instancia unica
     */
    public static BDRTemaRepository getSoleInstance() {
        if (soleInstance == null) {
            soleInstance = new BDRTemaRepository();
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
    public Tema getPorId(long id) {
        return null;
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public Tema[] getPorNome(String nome) {
        return null;
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public Tema[] getTodos() {
        return null;
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public void inserir(Tema tema) throws RepositoryException {
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public void atualizar(Tema tema) throws RepositoryException {
    }

    /** Fora do escopo: metodo vazio. */
    @Override
    public void remover(Tema tema) throws RepositoryException {
    }
}
