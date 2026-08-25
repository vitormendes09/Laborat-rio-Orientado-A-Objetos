package br.edu.iff.repository;

/**
 * Excecao de persistencia, lancada pelas operacoes de escrita dos repositorios
 * ({@code inserir}, {@code atualizar}, {@code remover}).
 *
 * <p>E uma excecao verificada (estende {@link java.lang.Exception}), portanto o
 * chamador e obrigado a trata-la. Os app services ({@code PalavraAppService},
 * {@code RodadaAppService}) capturam esta excecao e a convertem em um retorno
 * {@code boolean} para simplificar os controladores de aplicacao.</p>
 */
public class RepositoryException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * Cria a excecao com uma mensagem descritiva do problema de persistencia.
     *
     * @param mensagem descricao do erro
     */
    public RepositoryException(String mensagem) {
        super(mensagem);
    }

    /**
     * Cria a excecao encadeando a causa original.
     *
     * @param mensagem descricao do erro
     * @param causa    excecao que originou o problema
     */
    public RepositoryException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
