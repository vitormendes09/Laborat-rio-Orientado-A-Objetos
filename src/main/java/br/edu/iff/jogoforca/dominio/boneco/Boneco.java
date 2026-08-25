package br.edu.iff.jogoforca.dominio.boneco;

/**
 * &lt;&lt;interface&gt;&gt;
 *
 * <p>O boneco da forca. Abstrai o meio grafico (texto ou imagem): a
 * {@code Rodada} so conhece esta interface.</p>
 */
public interface Boneco {

    /**
     * Exibe o boneco com a quantidade de partes informada.
     *
     * <p><b>REGRA (UML):</b> {@code partes} corresponde a QUANTIDADE DE ERROS
     * cometidos na rodada. A cada erro surge mais um pedaco do boneco:</p>
     * <ol>
     *   <li>cabeca</li>
     *   <li>+ olho esquerdo</li>
     *   <li>+ olho direito</li>
     *   <li>+ nariz</li>
     *   <li>+ boca</li>
     *   <li>+ tronco</li>
     *   <li>+ braco esquerdo</li>
     *   <li>+ braco direito</li>
     *   <li>+ perna esquerda</li>
     *   <li>+ perna direita</li>
     * </ol>
     *
     * <p>Ou seja, e CUMULATIVO: {@code partes = 3} desenha cabeca, olho
     * esquerdo E olho direito. No decimo erro ({@code partes = 10}) o boneco
     * esta completo e vai pra forca — que e exatamente
     * {@code Rodada.maxErros}.</p>
     *
     * @param contexto contexto de exibicao; {@code null} no modo texto
     * @param partes   quantidade de erros (0 a 10)
     */
    void exibir(Object contexto, int partes);
}
