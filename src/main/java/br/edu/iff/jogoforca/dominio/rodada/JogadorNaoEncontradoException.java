package br.edu.iff.jogoforca.dominio.rodada;

/**
 * Excecao lancada por
 * {@link RodadaAppService#novaRodada(String)} quando nao existe, no repositorio
 * de jogadores, um jogador com o nome informado.
 *
 * <p>E uma excecao verificada (estende {@link java.lang.Exception}). Note que a
 * sobrecarga {@code novaRodada(long)} NAO lanca esta excecao: ela tem como
 * pre-condicao que o id ja seja de um jogador pre-existente.</p>
 */
public class JogadorNaoEncontradoException extends Exception {

    private static final long serialVersionUID = 1L;

    /** Nome do jogador que nao foi encontrado. */
    private String jogador;

    /**
     * @param jogador nome do jogador procurado e nao encontrado
     */
    public JogadorNaoEncontradoException(String jogador) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return o nome do jogador que nao foi encontrado
     */
    public String getJogador() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
