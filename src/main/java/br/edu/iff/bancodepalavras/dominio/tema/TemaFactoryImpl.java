package br.edu.iff.bancodepalavras.dominio.tema;

import br.edu.iff.factory.EntityFactory;

/**
 * &lt;&lt;Parametrized Singleton&gt;&gt;
 *
 * <p>Implementacao de {@link TemaFactory}.</p>
 *
 * <p><b>Parametrized Singleton:</b> a instancia unica depende de um parametro
 * (o repositorio), portanto NAO pode ser criada sozinha na primeira chamada de
 * {@link #getSoleInstance()}. E obrigatorio chamar
 * {@link #createSoleInstance(TemaRepository)} ANTES — quem faz isso e o metodo
 * {@code configurar()} da classe {@code Aplicacao}.</p>
 */
public class TemaFactoryImpl extends EntityFactory implements TemaFactory {

    private static TemaFactoryImpl soleInstance;

    /**
     * Construtor privado (Singleton).
     *
     * @param repository repositorio de temas, usado para gerar ids
     */
    private TemaFactoryImpl(TemaRepository repository) {
        super(repository);
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Cria a instancia unica parametrizada pelo repositorio informado.
     *
     * <p>Deve ser chamado uma unica vez, por {@code Aplicacao.configurar()},
     * antes de qualquer {@link #getSoleInstance()}.</p>
     *
     * @param repository repositorio de temas
     */
    public static void createSoleInstance(TemaRepository repository) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna a instancia unica.
     *
     * <p>Pre-condicao: {@link #createSoleInstance(TemaRepository)} ja deve ter
     * sido chamado; caso contrario o retorno e {@code null}.</p>
     *
     * @return a instancia unica, ou {@code null} se ainda nao criada
     */
    public static TemaFactoryImpl getSoleInstance() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Typecast conveniente do repositorio herdado de {@code EntityFactory}.
     *
     * @return o repositorio de temas
     */
    private TemaRepository getTemaRepository() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     *
     * <p>Obtem o proximo id no repositorio e delega a
     * {@code Tema.criar(id, nome)}.</p>
     */
    @Override
    public Tema getTema(String nome) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
