package br.edu.iff.jogoforca.dominio.rodada;

import br.edu.iff.jogoforca.dominio.jogador.Jogador;
import br.edu.iff.repository.Repository;
import br.edu.iff.repository.RepositoryException;

/**
 * &lt;&lt;interface&gt;&gt; &lt;&lt;repository&gt;&gt;
 *
 * <p>Colecao de {@link Rodada}. Mantem internamente um pool de 0..* rodadas.</p>
 */
public interface RodadaRepository extends Repository {

    /**
     * Busca uma rodada pela sua identidade.
     *
     * @param id id procurado
     * @return a rodada encontrada, ou {@code null} se nao existir
     */
    Rodada getPorId(long id);

    /**
     * Retorna todas as rodadas ja jogadas por um jogador.
     *
     * <p>E a base do quadro de maiores escores.</p>
     *
     * @param jogador jogador procurado
     * @return vetor de rodadas do jogador (possivelmente vazio)
     */
    Rodada[] getPorJogador(Jogador jogador);

    /**
     * Insere uma nova rodada.
     *
     * @param rodada rodada a inserir
     * @throws RepositoryException se a rodada ja existir ou houver falha
     */
    void inserir(Rodada rodada) throws RepositoryException;

    /**
     * Atualiza uma rodada existente.
     *
     * @param rodada rodada a atualizar
     * @throws RepositoryException se a rodada nao existir ou houver falha
     */
    void atualizar(Rodada rodada) throws RepositoryException;

    /**
     * Remove uma rodada existente.
     *
     * @param rodada rodada a remover
     * @throws RepositoryException se a rodada nao existir ou houver falha
     */
    void remover(Rodada rodada) throws RepositoryException;
}
