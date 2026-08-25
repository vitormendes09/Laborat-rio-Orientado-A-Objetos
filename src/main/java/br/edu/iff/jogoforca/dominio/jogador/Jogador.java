package br.edu.iff.jogoforca.dominio.jogador;

import br.edu.iff.dominio.ObjetoDominioImpl;

/**
 * &lt;&lt;entity&gt;&gt;
 *
 * <p>Jogador da forca. Guarda o nome e a pontuacao acumulada, que compoe o
 * quadro de maiores escores.</p>
 *
 * <p><b>REGRA (UML):</b> {@code pontuacao} = soma dos pontos de TODAS as
 * rodadas deste jogador. E atualizada por
 * {@link #atualizarPontuacao(int)}, chamado pela {@code Rodada} no momento em
 * que ela encerra.</p>
 */
public class Jogador extends ObjetoDominioImpl {

    private String nome;

    /** Pontuacao acumulada. Um jogador novo comeca com 0. */
    private int pontuacao = 0;

    /**
     * Construtor privado de jogador NOVO (pontuacao zerada).
     *
     * @param id   identidade da entidade
     * @param nome nome do jogador
     */
    private Jogador(long id, String nome) {
        super(id);
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Construtor privado de jogador reconstituido (com pontuacao ja acumulada).
     *
     * @param id        identidade da entidade
     * @param nome      nome do jogador
     * @param pontuacao pontuacao ja acumulada
     */
    private Jogador(long id, String nome, int pontuacao) {
        super(id);
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Cria um jogador NOVO, com pontuacao 0.
     *
     * @param id   id gerado pelo repositorio
     * @param nome nome do jogador
     * @return o novo jogador
     */
    public static Jogador criar(long id, String nome) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Reconstitui um jogador JA EXISTENTE, preservando sua pontuacao.
     *
     * @param id        id ja existente
     * @param nome      nome do jogador
     * @param pontuacao pontuacao acumulada
     * @return o jogador reconstituido
     */
    public static Jogador reconstituir(long id, String nome, int pontuacao) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return o nome do jogador
     */
    public String getNome() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Altera o nome do jogador.
     *
     * @param nome novo nome
     */
    public void setNome(String nome) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return a pontuacao acumulada
     */
    public int getPontuacao() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * SOMA os pontos informados a pontuacao acumulada.
     *
     * <p>Atencao: acumula, NAO substitui — a pontuacao e a soma dos pontos de
     * todas as rodadas do jogador. Chamado pela {@code Rodada} quando ela
     * encerra (ao final de {@code tentar} ou {@code arriscar}).</p>
     *
     * @param pontos pontos obtidos na rodada que acabou de encerrar
     */
    public void atualizarPontuacao(int pontos) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
