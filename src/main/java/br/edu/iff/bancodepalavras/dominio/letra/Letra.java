package br.edu.iff.bancodepalavras.dominio.letra;

/**
 * &lt;&lt;abstract&gt;&gt; &lt;&lt;value&gt;&gt; &lt;&lt;flyweight&gt;&gt;
 *
 * <p>Uma letra do jogo. E um &lt;&lt;value object&gt;&gt;: nao possui identidade
 * propria, so importa o seu valor ({@code codigo}). E um
 * &lt;&lt;flyweight&gt;&gt;: instancias sao compartilhadas e reaproveitadas pelo
 * pool de {@code LetraFactoryImpl}, jamais construidas diretamente pelo cliente
 * — sempre obtidas via {@code LetraFactory.getLetra(char)}.</p>
 *
 * <p>Por ser compartilhada, uma Letra e imutavel: {@code codigo} e definido no
 * construtor e nunca muda.</p>
 *
 * <p>Alem das letras 'a'..'z', existe a &lt;&lt;letra encoberta&gt;&gt;, obtida
 * por {@code LetraFactory.getLetraEncoberta()}, usada para representar uma
 * posicao ainda nao descoberta da palavra.</p>
 */
public abstract class Letra {

    private char codigo;

    /**
     * Construtor protegido: apenas as fabricas de letra podem instanciar.
     *
     * @param codigo o caractere representado por esta letra
     */
    protected Letra(char codigo) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna o caractere representado por esta letra.
     *
     * @return o codigo da letra
     */
    public char getCodigo() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Exibe esta letra no contexto informado.
     *
     * <p>O parametro {@code contexto} e um "saco" generico
     * ({@link java.lang.Object}) que carrega tudo de que a subclasse concreta
     * precisa para se exibir: uma lista, uma tabela hash, coordenadas x/y, a URL
     * da imagem numa pagina HTML, etc. A subclasse concreta faz o typecast de
     * {@code Object} para o tipo especifico que ela espera.</p>
     *
     * <p>Quando o contexto e desnecessario — como em {@code LetraTexto}, que
     * apenas imprime com {@code System.out.print} — basta passar {@code null}.</p>
     *
     * @param contexto objeto de contexto especifico do meio de exibicao, ou
     *                 {@code null} no modo texto
     */
    public abstract void exibir(Object contexto);

    /**
     * Duas letras sao iguais se possuem o mesmo {@code codigo} E sao da mesma
     * classe concreta.
     *
     * <p>A comparacao por {@code getClass()} e essencial: uma {@code LetraTexto}
     * de codigo 'a' NAO e igual a uma {@code LetraImagem} de codigo 'a', pois
     * pertencem a pools distintos e se exibem de formas distintas.</p>
     *
     * <p>Conforme o UML:</p>
     * <pre>
     * if (!(o instanceof Letra)) return false;
     * Letra outra = (Letra) o;
     * return this.codigo == outra.codigo
     *        &amp;&amp; this.getClass().equals(outra.getClass());
     * </pre>
     *
     * @param o objeto a comparar
     * @return {@code true} se mesmo codigo e mesma classe concreta
     */
    @Override
    public boolean equals(Object o) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Deve ser consistente com {@link #equals(Object)}: usa o codigo e a classe.
     *
     * <p>Conforme o UML: {@code return this.codigo + this.getClass().hashCode();}</p>
     *
     * @return o hash code desta letra
     */
    @Override
    public int hashCode() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Representacao textual da letra: o proprio caractere.
     *
     * <p>E {@code final} no UML: nenhuma subclasse pode redefinir a forma como
     * uma letra e convertida em String.</p>
     *
     * @return o codigo da letra como String
     */
    @Override
    public final String toString() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
