package br.edu.iff.jogoforca.dominio.jogador;

/**
 * &lt;&lt;interface&gt;&gt; &lt;&lt;factory&gt;&gt;
 *
 * <p>Fabrica de {@link Jogador}.</p>
 */
public interface JogadorFactory {

    /**
     * Cria um novo jogador com o nome informado, ja com id valido obtido do
     * repositorio de jogadores e pontuacao 0.
     *
     * <p>Apenas CRIA — nao insere no repositorio.</p>
     *
     * @param nome nome do novo jogador
     * @return o jogador criado
     */
    Jogador getJogador(String nome);
}
