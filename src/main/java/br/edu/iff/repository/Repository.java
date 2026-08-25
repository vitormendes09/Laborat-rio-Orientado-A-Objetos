package br.edu.iff.repository;

/**
 * &lt;&lt;interface&gt;&gt; &lt;&lt;layer supertype&gt;&gt;
 *
 * <p>Supertipo de camada de todos os repositorios. Um repositorio e a colecao
 * de entidades de um tipo, e e o unico responsavel por gerar os ids dessas
 * entidades.</p>
 */
public interface Repository {

    /**
     * Gera e retorna o proximo id disponivel para uma nova entidade deste
     * repositorio. Cada chamada deve devolver um valor distinto.
     *
     * <p>E este metodo que as fabricas de entidade ({@code EntityFactory})
     * consultam, via {@code getProximoId()}, antes de construir uma entidade.</p>
     *
     * @return o proximo id livre
     */
    long getProximoId();
}
