package br.edu.iff.dominio;

/**
 * &lt;&lt;interface&gt;&gt; &lt;&lt;entity&gt;&gt; &lt;&lt;layer supertype&gt;&gt;
 *
 * <p>Supertipo de camada de todas as entidades do dominio. Toda entidade possui
 * identidade propria, representada pelo campo {@code id}, e e comparada por essa
 * identidade (e nao por valor). Contraste com {@code Letra}, que e
 * &lt;&lt;value&gt;&gt; e portanto compara por valor.</p>
 */
public interface ObjetoDominio {

    /**
     * Retorna o identificador unico desta entidade dentro do seu repositorio.
     *
     * @return o id da entidade
     */
    long getId();
}
