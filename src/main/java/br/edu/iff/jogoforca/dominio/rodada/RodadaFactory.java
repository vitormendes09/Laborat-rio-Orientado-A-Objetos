package br.edu.iff.jogoforca.dominio.rodada;

import br.edu.iff.jogoforca.dominio.jogador.Jogador;

/**
 * &lt;&lt;interface&gt;&gt; &lt;&lt;factory&gt;&gt;
 *
 * <p>Fabrica de {@link Rodada}. A estrategia de montagem da rodada (quais
 * palavras, de que tema) fica a cargo da implementacao — hoje apenas
 * {@code RodadaSorteioFactory}, que sorteia.</p>
 */
public interface RodadaFactory {

    /**
     * Cria uma nova rodada para o jogador informado.
     *
     * <p>Apenas CRIA — nao insere no repositorio. A insercao e feita por
     * {@code RodadaAppService.salvarRodada}, ao final da rodada.</p>
     *
     * @param jogador jogador da nova rodada
     * @return a rodada criada
     */
    Rodada getRodada(Jogador jogador);
}
