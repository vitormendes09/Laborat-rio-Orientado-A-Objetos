package br.edu.iff.jogoforca;

/**
 * Utilitario OPCIONAL de carga inicial do banco de palavras a partir do arquivo
 * {@code palavras.csv} na raiz do projeto.
 *
 * <p><b>NAO faz parte do modelo UML do professor.</b> E uma conveniencia para
 * evitar cadastrar dezenas de palavras na mao dentro do {@code Main}. Se
 * preferir seguir o Reiterando.pdf ao pe da letra, cadastre os temas e palavras
 * diretamente no {@code Main} e ignore esta classe.</p>
 *
 * <p><b>IMPORTANTE:</b> mesmo carregando de CSV, o cadastro deve respeitar o
 * Reiterando.pdf item c: os TEMAS sao criados via {@code TemaFactory} e
 * inseridos via {@code TemaRepository}; as PALAVRAS sao cadastradas
 * OBRIGATORIAMENTE via {@code PalavraAppService.novaPalavra(palavra, idTema)},
 * nunca direto no repositorio.</p>
 *
 * <p>Formato esperado do arquivo (a primeira linha e cabecalho e deve ser
 * ignorada):</p>
 * <pre>
 * tema;palavra
 * Frutas;banana
 * Frutas;abacaxi
 * Animais;cavalo
 * </pre>
 */
public class CsvLoader {

    /**
     * Construtor privado: classe puramente utilitaria, nao deve ser
     * instanciada.
     */
    private CsvLoader() {
    }

    /**
     * Carrega temas e palavras do arquivo CSV informado.
     *
     * <p><b>ALGORITMO SUGERIDO:</b></p>
     * <ol>
     *   <li>Le o arquivo linha a linha (UTF-8), pulando o cabecalho e as linhas
     *       em branco;</li>
     *   <li>Para cada linha, separa em {@code tema} e {@code palavra} pelo
     *       {@code ;};</li>
     *   <li>Se o tema ainda nao foi visto nesta carga, cria-o via
     *       {@code Aplicacao.getSoleInstance().getTemaFactory().getTema(nome)}
     *       e insere-o no repositorio obtido de
     *       {@code getRepositoryFactory().getTemaRepository()}, guardando o id;</li>
     *   <li>Cadastra a palavra com
     *       {@code PalavraAppService.getSoleInstance().novaPalavra(palavra, idTema)}.</li>
     * </ol>
     *
     * <p>Pre-condicao: {@code Aplicacao.getSoleInstance().configurar()} ja deve
     * ter sido chamado.</p>
     *
     * @param caminhoCsv caminho do arquivo CSV (ex.: {@code "palavras.csv"})
     * @return a quantidade de palavras efetivamente cadastradas
     */
    public static int carregar(String caminhoCsv) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
