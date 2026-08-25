package br.edu.iff.jogoforca;

/**
 * Ponto de entrada da aplicacao (modo texto, via console).
 *
 * <p><b>NAO faz parte do modelo UML do professor</b> — e a classe que amarra
 * tudo, seguindo o roteiro do Reiterando.pdf, item d.</p>
 *
 * <h3>ROTEIRO OBRIGATORIO (Reiterando.pdf, item d)</h3>
 * <ol>
 *   <li>Chamar o metodo {@code configurar()} da classe Roxa
 *       ({@code Aplicacao.getSoleInstance().configurar()});</li>
 *   <li>Criar (via {@code TemaFactory}) e inserir (via {@code TemaRepository},
 *       obtido de {@code Aplicacao.getRepositoryFactory()}) alguns temas;</li>
 *   <li>Criar/Inserir (via {@code PalavraAppService.novaPalavra}) algumas
 *       palavras para cada tema — nunca direto no repositorio;</li>
 *   <li>Criar (via {@code JogadorFactory}) e inserir (via
 *       {@code JogadorRepository}) pelo menos um Jogador;</li>
 *   <li>Criar, jogar ate encerrar e, ao final, salvar (inserir) a rodada (via
 *       {@code RodadaAppService}). Colocar isso dentro de um LOOP, perguntando
 *       ao usuario, ao final de cada rodada, se deseja jogar novamente.</li>
 * </ol>
 *
 * <p>Os passos 2 e 3 podem, opcionalmente, ser feitos por
 * {@link CsvLoader#carregar(String)} a partir de {@code palavras.csv}.</p>
 *
 * <p>Como estamos no meio grafico TEXTO, todas as chamadas a {@code exibir}
 * recebem {@code null} como contexto.</p>
 */
public class Main {

    /**
     * Executa o jogo.
     *
     * <p><b>ESQUELETO DO LACO DE UMA RODADA:</b></p>
     * <ol>
     *   <li>{@code rodada = RodadaAppService.getSoleInstance().novaRodada(idJogador)};</li>
     *   <li>Enquanto {@code !rodada.encerrou()}:
     *     <ul>
     *       <li>{@code rodada.exibirBoneco(null)},
     *           {@code rodada.exibirPalavras(null)},
     *           {@code rodada.exibirLetrasErradas(null)};</li>
     *       <li>le do teclado: uma letra ({@code rodada.tentar(c)}) ou a opcao
     *           de arriscar ({@code rodada.arriscar(vetorDeStrings)});</li>
     *     </ul>
     *   </li>
     *   <li>Ao encerrar, exibe o resultado ({@code rodada.descobriu()},
     *       {@code rodada.calcularPontos()}, pontuacao acumulada do jogador);</li>
     *   <li>{@code RodadaAppService.getSoleInstance().salvarRodada(rodada)};</li>
     *   <li>Pergunta se deseja jogar novamente.</li>
     * </ol>
     *
     * @param args nao utilizados
     */
    public static void main(String[] args) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
