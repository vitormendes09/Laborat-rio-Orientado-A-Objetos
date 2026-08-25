package br.edu.iff.jogoforca.dominio.jogador;

import br.edu.iff.factory.EntityFactory;

/**
 * &lt;&lt;Parametrized Singleton&gt;&gt;
 *
 * <p>Implementacao de {@link JogadorFactory}.</p>
 *
 * <p><b>Parametrized Singleton:</b> e obrigatorio chamar
 * {@link #createSoleInstance(JogadorRepository)} — feito por
 * {@code Aplicacao.configurar()} — antes de {@link #getSoleInstance()}.</p>
 */
public class JogadorFactoryImpl extends EntityFactory implements JogadorFactory {

    private static JogadorFactoryImpl soleInstance;

    /**
     * Construtor privado (Singleton).
     *
     * @param repository repositorio de jogadores, usado para gerar ids
     */
    private JogadorFactoryImpl(JogadorRepository repository) {
        super(repository);
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Cria a instancia unica parametrizada pelo repositorio informado.
     *
     * @param repository repositorio de jogadores
     */
    public static void createSoleInstance(JogadorRepository repository) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna a instancia unica.
     *
     * <p>Pre-condicao: {@link #createSoleInstance(JogadorRepository)} ja deve
     * ter sido chamado.</p>
     *
     * @return a instancia unica, ou {@code null} se ainda nao criada
     */
    public static JogadorFactoryImpl getSoleInstance() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Typecast conveniente do repositorio herdado de {@code EntityFactory}.
     *
     * @return o repositorio de jogadores
     */
    private JogadorRepository getJogadorRepository() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     *
     * <p>Obtem o proximo id no repositorio e delega a
     * {@code Jogador.criar(id, nome)}.</p>
     */
    @Override
    public Jogador getJogador(String nome) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
