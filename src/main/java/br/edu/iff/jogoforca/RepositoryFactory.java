package br.edu.iff.jogoforca;

import br.edu.iff.bancodepalavras.dominio.palavra.PalavraRepository;
import br.edu.iff.bancodepalavras.dominio.tema.TemaRepository;
import br.edu.iff.jogoforca.dominio.jogador.JogadorRepository;
import br.edu.iff.jogoforca.dominio.rodada.RodadaRepository;

/**
 * &lt;&lt;interface&gt;&gt; &lt;&lt;factory&gt;&gt;
 *
 * <p>&lt;&lt;Abstract Factory&gt;&gt; dos repositorios: agrupa a criacao de
 * uma FAMILIA coerente de repositorios (todos em memoria, ou todos em BDR).</p>
 *
 * <p>Isso garante que a aplicacao nunca misture mecanismos de persistencia, e
 * permite trocar a familia inteira em um unico ponto
 * ({@code Aplicacao.setTipoRepositoryFactory}).</p>
 */
public interface RepositoryFactory {

    /**
     * @return o repositorio de palavras desta familia
     */
    PalavraRepository getPalavraRepository();

    /**
     * @return o repositorio de temas desta familia
     */
    TemaRepository getTemaRepository();

    /**
     * @return o repositorio de rodadas desta familia
     */
    RodadaRepository getRodadaRepository();

    /**
     * @return o repositorio de jogadores desta familia
     */
    JogadorRepository getJogadorRepository();
}
