package br.edu.iff.jogoforca.dominio.jogador;

import br.edu.iff.repository.Repository;
import br.edu.iff.repository.RepositoryException;

/**
 * &lt;&lt;interface&gt;&gt; &lt;&lt;repository&gt;&gt;
 *
 * <p>Colecao de {@link Jogador}. Mantem internamente um pool de 0..*
 * jogadores.</p>
 */
public interface JogadorRepository extends Repository {

    /**
     * Busca um jogador pela sua identidade.
     *
     * <p>Usado por {@code RodadaAppService.novaRodada(long)}.</p>
     *
     * @param id id procurado
     * @return o jogador encontrado, ou {@code null} se nao existir
     */
    Jogador getPorId(long id);

    /**
     * Busca um jogador pelo nome.
     *
     * <p>Diferente de {@code TemaRepository.getPorNome}, aqui o retorno e um
     * UNICO jogador (conforme o UML), nao um vetor. Usado por
     * {@code RodadaAppService.novaRodada(String)}, que lanca
     * {@code JogadorNaoEncontradoException} se o retorno for {@code null}.</p>
     *
     * @param nome nome procurado
     * @return o jogador encontrado, ou {@code null} se nao existir
     */
    Jogador getPorNome(String nome);

    /**
     * Insere um novo jogador.
     *
     * @param jogador jogador a inserir
     * @throws RepositoryException se o jogador ja existir ou houver falha
     */
    void inserir(Jogador jogador) throws RepositoryException;

    /**
     * Atualiza um jogador existente (tipicamente apos mudanca de pontuacao).
     *
     * @param jogador jogador a atualizar
     * @throws RepositoryException se o jogador nao existir ou houver falha
     */
    void atualizar(Jogador jogador) throws RepositoryException;

    /**
     * Remove um jogador existente.
     *
     * @param jogador jogador a remover
     * @throws RepositoryException se o jogador nao existir ou houver falha
     */
    void remover(Jogador jogador) throws RepositoryException;
}
