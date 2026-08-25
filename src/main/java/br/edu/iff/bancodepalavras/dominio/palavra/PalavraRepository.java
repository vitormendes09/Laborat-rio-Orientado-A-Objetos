package br.edu.iff.bancodepalavras.dominio.palavra;

import br.edu.iff.bancodepalavras.dominio.tema.Tema;
import br.edu.iff.repository.Repository;
import br.edu.iff.repository.RepositoryException;

/**
 * &lt;&lt;interface&gt;&gt; &lt;&lt;repository&gt;&gt;
 *
 * <p>Colecao de {@link Palavra}. Mantem internamente um pool de 0..* palavras.</p>
 */
public interface PalavraRepository extends Repository {

    /**
     * Busca uma palavra pela sua identidade.
     *
     * @param id id procurado
     * @return a palavra encontrada, ou {@code null} se nao existir
     */
    Palavra getPorId(long id);

    /**
     * Retorna todas as palavras de um determinado tema.
     *
     * <p>Usado pela {@code RodadaSorteioFactory} para sortear as palavras do
     * tema escolhido.</p>
     *
     * @param tema tema procurado
     * @return vetor de palavras do tema (possivelmente vazio)
     */
    Palavra[] getPorTema(Tema tema);

    /**
     * Retorna todas as palavras do repositorio.
     *
     * @return vetor com todas as palavras (possivelmente vazio)
     */
    Palavra[] getTodas();

    /**
     * Busca uma palavra pelo seu texto.
     *
     * <p>Usado por {@code PalavraAppService.novaPalavra} para detectar
     * duplicatas antes de inserir.</p>
     *
     * @param palavra texto procurado
     * @return a palavra encontrada, ou {@code null} se nao existir
     */
    Palavra getPalavra(String palavra);

    /**
     * Insere uma nova palavra.
     *
     * @param palavra palavra a inserir
     * @throws RepositoryException se a palavra ja existir ou houver falha
     */
    void inserir(Palavra palavra) throws RepositoryException;

    /**
     * Atualiza uma palavra existente.
     *
     * @param palavra palavra a atualizar
     * @throws RepositoryException se a palavra nao existir ou houver falha
     */
    void atualizar(Palavra palavra) throws RepositoryException;

    /**
     * Remove uma palavra existente.
     *
     * @param palavra palavra a remover
     * @throws RepositoryException se a palavra nao existir ou houver falha
     */
    void remover(Palavra palavra) throws RepositoryException;
}
