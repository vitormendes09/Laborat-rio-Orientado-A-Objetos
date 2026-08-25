package br.edu.iff.bancodepalavras.dominio.palavra;

import br.edu.iff.bancodepalavras.dominio.tema.Tema;
import br.edu.iff.factory.EntityFactory;

/**
 * &lt;&lt;Parametrized Singleton&gt;&gt;
 *
 * <p>Implementacao de {@link PalavraFactory}.</p>
 *
 * <p><b>Parametrized Singleton:</b> e obrigatorio chamar
 * {@link #createSoleInstance(PalavraRepository)} — feito por
 * {@code Aplicacao.configurar()} — antes de {@link #getSoleInstance()}.</p>
 */
public class PalavraFactoryImpl extends EntityFactory implements PalavraFactory {

    private static PalavraFactoryImpl soleInstance;

    /**
     * Construtor privado (Singleton).
     *
     * @param repository repositorio de palavras, usado para gerar ids
     */
    private PalavraFactoryImpl(PalavraRepository repository) {
        super(repository);
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Cria a instancia unica parametrizada pelo repositorio informado.
     *
     * @param repository repositorio de palavras
     */
    public static void createSoleInstance(PalavraRepository repository) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna a instancia unica.
     *
     * <p>Pre-condicao: {@link #createSoleInstance(PalavraRepository)} ja deve
     * ter sido chamado.</p>
     *
     * @return a instancia unica, ou {@code null} se ainda nao criada
     */
    public static PalavraFactoryImpl getSoleInstance() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Typecast conveniente do repositorio herdado de {@code EntityFactory}.
     *
     * @return o repositorio de palavras
     */
    private PalavraRepository getPalavraRepository() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     *
     * <p>Obtem o proximo id no repositorio e delega a
     * {@code Palavra.criar(id, palavra, tema)}.</p>
     *
     * <p>Lembre: {@code Palavra.setLetraFactory} ja deve ter sido chamado, senao
     * a construcao falha.</p>
     */
    @Override
    public Palavra getPalavra(String palavra, Tema tema) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
