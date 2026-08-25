package br.edu.iff.factory;

import br.edu.iff.repository.Repository;

/**
 * &lt;&lt;abstract&gt;&gt;
 *
 * <p>Supertipo de todas as fabricas de entidade. Uma fabrica de entidade
 * conhece o repositorio correspondente exclusivamente para obter o proximo id
 * ({@link Repository#getProximoId()}) antes de construir a entidade.</p>
 *
 * <p>Subclasses: {@code TemaFactoryImpl}, {@code PalavraFactoryImpl},
 * {@code JogadorFactoryImpl} e {@code RodadaFactoryImpl}.</p>
 */
public abstract class EntityFactory {

    private Repository repository;

    /**
     * Guarda o repositorio que sera consultado para gerar ids.
     *
     * @param repository repositorio das entidades produzidas por esta fabrica
     */
    protected EntityFactory(Repository repository) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retorna o repositorio associado a esta fabrica.
     *
     * <p>As subclasses fazem o typecast deste retorno para o tipo concreto de
     * repositorio de que precisam (ex.: {@code TemaFactoryImpl} sobrescreve com
     * um {@code getTemaRepository()} privado).</p>
     *
     * @return o repositorio associado
     */
    protected Repository getRepository() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Obtem o proximo id livre delegando ao repositorio associado.
     *
     * @return proximo id para uma nova entidade
     */
    protected long getProximoId() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
