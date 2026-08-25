package br.edu.iff.jogoforca;

import br.edu.iff.bancodepalavras.dominio.letra.LetraFactory;
import br.edu.iff.bancodepalavras.dominio.palavra.PalavraFactory;
import br.edu.iff.bancodepalavras.dominio.tema.TemaFactory;
import br.edu.iff.jogoforca.dominio.boneco.BonecoFactory;
import br.edu.iff.jogoforca.dominio.jogador.JogadorFactory;
import br.edu.iff.jogoforca.dominio.rodada.RodadaFactory;

/**
 * &lt;&lt;Singleton&gt;&gt; &lt;&lt;parametrized factory&gt;&gt;
 *
 * <p>A "classe roxa": ponto unico de configuracao da aplicacao.</p>
 *
 * <p><b>ESCOPO (Reiterando.pdf, item c):</b> esta classe DEVE ser implementada
 * por completo.</p>
 *
 * <h3>Papel de Parametrized Factory</h3>
 * <p>Dentro de {@link #getRepositoryFactory()},
 * {@link #getElementoGraficoFactory()} e {@link #getRodadaFactory()}, define
 * QUAIS Singletons concretos retornar, de acordo com os tipos setados nos
 * respectivos campos.</p>
 *
 * <p>E o UNICO lugar da aplicacao que conhece os Singletons concretos. O
 * retorno das operacoes sao sempre INTERFACES (abstracoes): desta classe para
 * fora, todo o resto da aplicacao so conhece abstracoes, respeitando o
 * Open-Closed Principle (OCP).</p>
 *
 * <h3>ATENCAO</h3>
 * <p>Toda vez que alterar os parametros desta classe (qualquer
 * {@code setTipo*}), e preciso chamar {@link #configurar()} novamente para
 * reconfigurar as classes da aplicacao.</p>
 */
public class Aplicacao {

    /** Tipos de familia de repositorio disponiveis. O padrao e o indice 0. */
    private static final String[] TIPOS_REPOSITORY_FACTORY = {"memoria", "relacional"};

    /** Tipos de familia de elemento grafico disponiveis. O padrao e o indice 0. */
    private static final String[] TIPOS_ELEMENTO_GRAFICO_FACTORY = {"texto", "imagem"};

    /** Tipos de fabrica de rodada disponiveis. O padrao e o indice 0. */
    private static final String[] TIPOS_RODADA_FACTORY = {"sorteio"};

    private static Aplicacao soleInstance;

    private String tipoRepositoryFactory = TIPOS_REPOSITORY_FACTORY[0];

    private String tipoElementoGraficoFactory = TIPOS_ELEMENTO_GRAFICO_FACTORY[0];

    private String tipoRodadaFactory = TIPOS_RODADA_FACTORY[0];

    /**
     * Construtor privado (Singleton).
     */
    private Aplicacao() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna a instancia unica, criando-a se necessario.
     *
     * <p>E um Singleton SIMPLES (nao parametrizado): pode ser criado na
     * primeira chamada.</p>
     *
     * @return a instancia unica
     */
    public static Aplicacao getSoleInstance() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Configura a aplicacao inteira. Deve ser a PRIMEIRA coisa chamada no
     * {@code main} (Reiterando.pdf, item d1).
     *
     * <p><b>O QUE FAZ (nota do UML):</b></p>
     * <ol>
     *   <li><b>Cria os singletons parametrizados da aplicacao</b>, ou seja,
     *       chama os {@code createSoleInstance(...)} de:
     *       {@code TemaFactoryImpl}, {@code PalavraFactoryImpl},
     *       {@code JogadorFactoryImpl}, {@code RodadaSorteioFactory},
     *       {@code PalavraAppService} e {@code RodadaAppService},
     *       passando os repositorios obtidos de
     *       {@link #getRepositoryFactory()};</li>
     *   <li><b>Seta os factories estaticos das classes de dominio</b>:
     *       {@code Palavra.setLetraFactory(getLetraFactory())} e
     *       {@code Rodada.setBonecoFactory(getBonecoFactory())}.</li>
     * </ol>
     *
     * <p><b>ORDEM IMPORTA:</b> os repositorios tem que existir antes das
     * fabricas de entidade (que os recebem como parametro), e as fabricas de
     * entidade antes dos app services (que as recebem). E os factories
     * estaticos de {@code Palavra} e {@code Rodada} tem que estar setados antes
     * de qualquer palavra ou rodada ser construida.</p>
     */
    public void configurar() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return os tipos de familia de repositorio disponiveis
     */
    public String[] getTiposRepositoryFactory() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Define a familia de repositorios a usar.
     *
     * <p>Lembre de chamar {@link #configurar()} depois.</p>
     *
     * @param tipo um dos valores de {@link #getTiposRepositoryFactory()}
     */
    public void setTipoRepositoryFactory(String tipo) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * &lt;&lt;parametrized factory&gt;&gt; — resolve o Singleton concreto da
     * familia de repositorios de acordo com {@code tipoRepositoryFactory}:
     * "memoria" &rarr; {@code MemoriaRepositoryFactory}; "relacional" &rarr;
     * {@code BDRRepositoryFactory}.
     *
     * <p>E publico porque o {@code Main} precisa dele para obter os
     * repositorios de Tema e Jogador (Reiterando.pdf, item c).</p>
     *
     * @return a fabrica de repositorios corrente (a abstracao, nunca a classe
     *         concreta)
     */
    public RepositoryFactory getRepositoryFactory() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return os tipos de familia de elemento grafico disponiveis
     */
    public String[] getTiposElementoGraficoFactory() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Define a familia de elementos graficos a usar.
     *
     * <p>Lembre de chamar {@link #configurar()} depois.</p>
     *
     * @param stipo um dos valores de {@link #getTiposElementoGraficoFactory()}
     */
    public void setTipoElementoGraficoFactory(String stipo) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * &lt;&lt;parametrized factory&gt;&gt; — resolve o Singleton concreto da
     * familia de elementos graficos de acordo com
     * {@code tipoElementoGraficoFactory}: "texto" &rarr;
     * {@code ElementoGraficoTextoFactory}; "imagem" &rarr;
     * {@code ElementoGraficoImagemFactory}.
     *
     * <p>E PRIVADO: de fora, a aplicacao so ve {@link #getLetraFactory()} e
     * {@link #getBonecoFactory()}.</p>
     *
     * @return a fabrica de elementos graficos corrente
     */
    private ElementoGraficoFactory getElementoGraficoFactory() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna a fabrica de bonecos.
     *
     * <p>Conforme a nota do UML, e implementado simplesmente como:</p>
     * <pre>return this.getElementoGraficoFactory();</pre>
     *
     * @return a fabrica de bonecos corrente
     */
    public BonecoFactory getBonecoFactory() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna a fabrica de letras.
     *
     * <p>Conforme a nota do UML, e implementado simplesmente como:</p>
     * <pre>return this.getElementoGraficoFactory();</pre>
     *
     * @return a fabrica de letras corrente
     */
    public LetraFactory getLetraFactory() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return os tipos de fabrica de rodada disponiveis
     */
    public String[] getTiposRodadaFactory() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Define a fabrica de rodada a usar.
     *
     * <p>Lembre de chamar {@link #configurar()} depois.</p>
     *
     * @param tipo um dos valores de {@link #getTiposRodadaFactory()}
     */
    public void setTipoRodadaFactory(String tipo) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * &lt;&lt;parametrized factory&gt;&gt; — resolve o Singleton concreto da
     * fabrica de rodada de acordo com {@code tipoRodadaFactory}: "sorteio"
     * &rarr; {@code RodadaSorteioFactory}.
     *
     * @return a fabrica de rodadas corrente
     */
    public RodadaFactory getRodadaFactory() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna a fabrica de temas.
     *
     * <p>Conforme a nota do UML, simplesmente retorna o respectivo Singleton
     * concreto ({@code TemaFactoryImpl.getSoleInstance()}) — nao ha parametro
     * de tipo aqui.</p>
     *
     * @return a fabrica de temas
     */
    public TemaFactory getTemaFactory() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna a fabrica de palavras.
     *
     * <p>Simplesmente retorna {@code PalavraFactoryImpl.getSoleInstance()}.</p>
     *
     * @return a fabrica de palavras
     */
    public PalavraFactory getPalavraFactory() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna a fabrica de jogadores.
     *
     * <p>Simplesmente retorna {@code JogadorFactoryImpl.getSoleInstance()}.</p>
     *
     * @return a fabrica de jogadores
     */
    public JogadorFactory getJogadorFactory() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
