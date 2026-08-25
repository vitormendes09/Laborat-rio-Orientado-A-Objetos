package br.edu.iff.jogoforca.dominio.rodada;

import br.edu.iff.jogoforca.dominio.jogador.JogadorRepository;

/**
 * &lt;&lt;app service&gt;&gt; &lt;&lt;facade&gt;&gt;
 * &lt;&lt;Parametrized Singleton&gt;&gt;
 *
 * <p>Servico de aplicacao que apoia os passos de caso de uso "iniciar rodada"
 * e "salvar rodada". Atua como fachada sobre a fabrica de rodadas e os
 * repositorios de rodada e jogador.</p>
 *
 * <p>Conforme Reiterando.pdf item c, o cadastro de Rodadas deve ser feito
 * OBRIGATORIAMENTE por este servico.</p>
 */
public class RodadaAppService {

    private static RodadaAppService soleInstance;

    private RodadaFactory rodadaFactory;

    private RodadaRepository rodadaRepository;

    private JogadorRepository jogadorRepository;

    /**
     * Construtor privado (Singleton).
     *
     * @param rodadaFactory     fabrica de rodadas
     * @param rodadaRepository  repositorio de rodadas
     * @param jogadorRepository repositorio de jogadores
     */
    private RodadaAppService(RodadaFactory rodadaFactory,
                             RodadaRepository rodadaRepository,
                             JogadorRepository jogadorRepository) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Cria a instancia unica parametrizada.
     *
     * <p>Chamado por {@code Aplicacao.configurar()}.</p>
     *
     * @param rodadaFactory     fabrica de rodadas
     * @param rodadaRepository  repositorio de rodadas
     * @param jogadorRepository repositorio de jogadores
     */
    public static void createSoleInstance(RodadaFactory rodadaFactory,
                                          RodadaRepository rodadaRepository,
                                          JogadorRepository jogadorRepository) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna a instancia unica.
     *
     * <p>Pre-condicao: {@code createSoleInstance} ja deve ter sido chamado.</p>
     *
     * @return a instancia unica, ou {@code null} se ainda nao criada
     */
    public static RodadaAppService getSoleInstance() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Cria uma nova rodada para o jogador de id informado.
     *
     * <p><b>PRE-CONDICAO (nota do UML):</b> {@code idJogador} tem que ser de um
     * Jogador PRE-EXISTENTE no repositorio de Jogador.</p>
     *
     * <p><b>COMPORTAMENTO:</b> acessa o repositorio de jogador para obter o
     * objeto {@code Jogador} a partir do id, e entao invoca o rodada factory
     * ({@code rodadaFactory.getRodada(jogador)}).</p>
     *
     * <p>Esta sobrecarga existe para simplificar controladores de aplicacoes
     * que venham a fazer uso deste servico.</p>
     *
     * @param idJogador id de um jogador pre-existente
     * @return a nova rodada
     */
    public Rodada novaRodada(long idJogador) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Cria uma nova rodada para o jogador de nome informado.
     *
     * <p><b>COMPORTAMENTO (nota do UML):</b> acessa o repositorio de jogador
     * para obter o objeto {@code Jogador} a partir do nome. Se NAO achar o
     * jogador, deve gerar a excecao
     * {@link JogadorNaoEncontradoException}. Achando, invoca o rodada
     * factory.</p>
     *
     * @param nomeJogador nome do jogador
     * @return a nova rodada
     * @throws JogadorNaoEncontradoException se nao existir jogador com esse nome
     */
    public Rodada novaRodada(String nomeJogador)
            throws JogadorNaoEncontradoException {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Salva a rodada no repositorio de rodadas.
     *
     * <p><b>COMPORTAMENTO (nota do UML):</b> insere a rodada no repositorio de
     * rodada, retornando {@code true} se foi inserida com sucesso, ou
     * {@code false} caso ocorra uma
     * {@link br.edu.iff.repository.RepositoryException}.</p>
     *
     * <p>Deve ser chamado ao final da rodada, quando ela ja encerrou (ver
     * Reiterando.pdf, item d5).</p>
     *
     * @param rodada rodada a salvar
     * @return {@code true} em caso de sucesso; {@code false} se houve
     *         RepositoryException
     */
    public boolean salvarRodada(Rodada rodada) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
