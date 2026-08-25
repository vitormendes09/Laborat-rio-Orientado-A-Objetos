package br.edu.iff.jogoforca.dominio.rodada.sorteio;

import br.edu.iff.bancodepalavras.dominio.palavra.PalavraRepository;
import br.edu.iff.bancodepalavras.dominio.tema.TemaRepository;
import br.edu.iff.jogoforca.dominio.jogador.Jogador;
import br.edu.iff.jogoforca.dominio.rodada.Rodada;
import br.edu.iff.jogoforca.dominio.rodada.RodadaFactoryImpl;
import br.edu.iff.jogoforca.dominio.rodada.RodadaRepository;

/**
 * &lt;&lt;Parametrized Singleton&gt;&gt;
 *
 * <p>Fabrica que cria uma nova rodada SORTEANDO o tema e as palavras deste
 * tema, conforme o enunciado: "A cada rodada, a aplicacao sorteia se mostrara
 * uma, duas ou tres palavras e escolhe aleatoriamente o tema e as palavras.
 * Todas as palavras sao do mesmo tema."</p>
 *
 * <p><b>Parametrized Singleton:</b> e obrigatorio chamar
 * {@link #createSoleInstance(RodadaRepository, TemaRepository,
 * PalavraRepository)} — feito por {@code Aplicacao.configurar()} — antes de
 * {@link #getSoleInstance()}.</p>
 */
public class RodadaSorteioFactory extends RodadaFactoryImpl {

    private static RodadaSorteioFactory soleInstance;

    /**
     * Construtor privado (Singleton).
     *
     * @param repository        repositorio de rodadas
     * @param temaRepository    repositorio de temas
     * @param palavraRepository repositorio de palavras
     */
    private RodadaSorteioFactory(RodadaRepository repository,
                                 TemaRepository temaRepository,
                                 PalavraRepository palavraRepository) {
        super(repository, temaRepository, palavraRepository);
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Cria a instancia unica parametrizada pelos tres repositorios.
     *
     * @param repository        repositorio de rodadas
     * @param temaRepository    repositorio de temas
     * @param palavraRepository repositorio de palavras
     */
    public static void createSoleInstance(RodadaRepository repository,
                                          TemaRepository temaRepository,
                                          PalavraRepository palavraRepository) {
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
    public static RodadaSorteioFactory getSoleInstance() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     *
     * <p><b>ALGORITMO DO SORTEIO:</b></p>
     * <ol>
     *   <li>Sorteia quantas palavras a rodada tera: de 1 a
     *       {@code Rodada.getMaxPalavras()} (padrao 3);</li>
     *   <li>Sorteia um tema entre os de {@code getTemaRepository().getTodos()};</li>
     *   <li>Obtem as palavras daquele tema com
     *       {@code getPalavraRepository().getPorTema(tema)} e sorteia, SEM
     *       repetir, a quantidade definida no passo 1 (se o tema tiver menos
     *       palavras do que o sorteado, ajuste para o que houver);</li>
     *   <li>Obtem o proximo id com {@code getProximoId()} e devolve
     *       {@code Rodada.criar(id, palavras, jogador)}.</li>
     * </ol>
     *
     * <p>Como todas as palavras vem do mesmo tema sorteado, a invariante "todas
     * as palavras do mesmo tema" da {@code Rodada} e satisfeita por
     * construcao.</p>
     */
    @Override
    public Rodada getRodada(Jogador jogador) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
