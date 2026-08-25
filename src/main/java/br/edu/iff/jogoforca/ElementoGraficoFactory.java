package br.edu.iff.jogoforca;

import br.edu.iff.bancodepalavras.dominio.letra.LetraFactory;
import br.edu.iff.jogoforca.dominio.boneco.BonecoFactory;

/**
 * &lt;&lt;interface&gt;&gt;
 *
 * <p>&lt;&lt;Abstract Factory&gt;&gt; dos elementos graficos: agrupa a criacao
 * de uma FAMILIA coerente de elementos de exibicao (tudo texto, ou tudo
 * imagem).</p>
 *
 * <p>Estende {@link LetraFactory} e {@link BonecoFactory}: uma implementacao
 * concreta sabe produzir tanto as letras quanto o boneco do mesmo meio grafico.
 * Assim e impossivel combinar, por engano, letras de texto com boneco de
 * imagem.</p>
 */
public interface ElementoGraficoFactory extends LetraFactory, BonecoFactory {
    // Nao acrescenta operacoes: apenas unifica as duas fabricas em uma familia.
}
