package br.edu.iff.bancodepalavras.dominio.tema;

import br.edu.iff.repository.Repository;
import br.edu.iff.repository.RepositoryException;

/**
 * &lt;&lt;interface&gt;&gt; &lt;&lt;repository&gt;&gt;
 *
 * <p>Colecao de {@link Tema}. Mantem internamente um pool de 0..* temas.</p>
 */
public interface TemaRepository extends Repository {

    /**
     * Busca um tema pela sua identidade.
     *
     * @param id id procurado
     * @return o tema encontrado, ou {@code null} se nao existir
     */
    Tema getPorId(long id);

    /**
     * Busca temas cujo nome corresponda ao informado.
     *
     * <p>Retorna vetor (0..*) pois a busca por nome pode casar com mais de um
     * tema. Se nao houver nenhum, retorne vetor VAZIO, nunca {@code null}.</p>
     *
     * @param nome nome procurado
     * @return vetor de temas encontrados (possivelmente vazio)
     */
    Tema[] getPorNome(String nome);

    /**
     * Retorna todos os temas do repositorio.
     *
     * <p>Usado pela {@code RodadaSorteioFactory} para sortear um tema.</p>
     *
     * @return vetor com todos os temas (possivelmente vazio)
     */
    Tema[] getTodos();

    /**
     * Insere um novo tema.
     *
     * @param tema tema a inserir
     * @throws RepositoryException se o tema ja existir ou houver falha
     */
    void inserir(Tema tema) throws RepositoryException;

    /**
     * Atualiza um tema existente.
     *
     * @param tema tema a atualizar
     * @throws RepositoryException se o tema nao existir ou houver falha
     */
    void atualizar(Tema tema) throws RepositoryException;

    /**
     * Remove um tema existente.
     *
     * @param tema tema a remover
     * @throws RepositoryException se o tema nao existir ou houver falha
     */
    void remover(Tema tema) throws RepositoryException;
}
