package br.edu.iff.bancodepalavras.dominio.palavra;

import br.edu.iff.bancodepalavras.dominio.tema.TemaRepository;

/**
 * &lt;&lt;app service&gt;&gt; &lt;&lt;facade&gt;&gt;
 * &lt;&lt;Parametrized Singleton&gt;&gt;
 *
 * <p>Servico de aplicacao que apoia o passo de caso de uso "cadastrar
 * palavra". Atua como fachada: o cliente ({@code Main}, um controlador Web,
 * etc.) chama uma unica operacao e o servico orquestra repositorios e
 * fabrica.</p>
 *
 * <p>Conforme Reiterando.pdf item c, o cadastro de Palavras deve ser feito
 * OBRIGATORIAMENTE por este servico, e nao direto pelo repositorio.</p>
 */
public class PalavraAppService {

    private static PalavraAppService soleInstance;

    private TemaRepository temaRepository;

    private PalavraRepository palavraRepository;

    private PalavraFactory factory;

    /**
     * Construtor privado (Singleton).
     *
     * @param temaRepository    repositorio de temas
     * @param palavraRepository repositorio de palavras
     * @param factory           fabrica de palavras
     */
    private PalavraAppService(TemaRepository temaRepository,
                              PalavraRepository palavraRepository,
                              PalavraFactory factory) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Cria a instancia unica parametrizada.
     *
     * <p>Chamado por {@code Aplicacao.configurar()}.</p>
     *
     * @param temaRepository    repositorio de temas
     * @param palavraRepository repositorio de palavras
     * @param palavraFactory    fabrica de palavras
     */
    public static void createSoleInstance(TemaRepository temaRepository,
                                          PalavraRepository palavraRepository,
                                          PalavraFactory palavraFactory) {
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
    public static PalavraAppService getSoleInstance() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Cadastra uma nova palavra para o tema informado.
     *
     * <p><b>PRE-CONDICAO:</b> {@code idTema} tem que ser de um Tema
     * PRE-EXISTENTE no repositorio de Tema.</p>
     *
     * <p><b>COMPORTAMENTO (nota do UML):</b></p>
     * <ol>
     *   <li>Verifica se a palavra (String) ja existe no repositorio de palavras
     *       ({@code getPalavra}). Se JA EXISTIR, nao faz nada e retorna
     *       {@code true};</li>
     *   <li>Se nao existir, acessa o repositorio de Tema para obter o Tema a
     *       partir de {@code idTema};</li>
     *   <li>Cria a palavra via {@link PalavraFactory#getPalavra(String,
     *       br.edu.iff.bancodepalavras.dominio.tema.Tema)};</li>
     *   <li>Insere a palavra no repositorio.</li>
     * </ol>
     *
     * <p>Retorna {@code true} se a palavra foi inserida com sucesso (ou ja
     * existia), e {@code false} se ocorreu alguma
     * {@link br.edu.iff.repository.RepositoryException} — ou seja, a excecao
     * verificada e capturada aqui e convertida em {@code boolean}.</p>
     *
     * @param palavra texto da palavra a cadastrar
     * @param idTema  id de um tema pre-existente
     * @return {@code true} em caso de sucesso; {@code false} se houve
     *         RepositoryException
     */
    public boolean novaPalavra(String palavra, long idTema) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
