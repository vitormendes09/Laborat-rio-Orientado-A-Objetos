package br.edu.iff.dominio;

/**
 * &lt;&lt;abstract&gt;&gt; &lt;&lt;entity&gt;&gt; &lt;&lt;layer supertype&gt;&gt;
 *
 * <p>Implementacao base de {@link ObjetoDominio}. Concentra o campo {@code id},
 * que e imutavel apos a construcao: uma entidade nunca troca de identidade.</p>
 *
 * <p>Todas as entidades do projeto (Tema, Palavra, Jogador, Rodada, Item)
 * herdam desta classe.</p>
 */
public abstract class ObjetoDominioImpl implements ObjetoDominio {

    private long id;

    /**
     * Constroi a entidade com sua identidade definitiva.
     *
     * @param id identificador unico, tipicamente obtido de
     *           {@code Repository.getProximoId()}
     */
    public ObjetoDominioImpl(long id) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getId() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
