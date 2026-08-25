package br.edu.iff.bancodepalavras.dominio.tema;

import br.edu.iff.dominio.ObjetoDominioImpl;

/**
 * &lt;&lt;entity&gt;&gt;
 *
 * <p>Tema ao qual as palavras pertencem (ex.: "Frutas", "Animais"). Toda
 * palavra pertence a exatamente 1 tema, e um tema possui 0..* palavras.</p>
 *
 * <p>Invariante da Rodada: todas as palavras de uma mesma rodada tem que ser do
 * mesmo tema.</p>
 */
public class Tema extends ObjetoDominioImpl {

    private String nome;

    /**
     * Construtor privado: use os metodos estaticos {@link #criar(long, String)}
     * ou {@link #reconstituir(long, String)}.
     *
     * @param id   identidade da entidade
     * @param nome nome do tema
     */
    private Tema(long id, String nome) {
        super(id);
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Cria um tema NOVO (ainda nao persistido).
     *
     * <p>Usado pela {@code TemaFactoryImpl}, que fornece o id obtido do
     * repositorio.</p>
     *
     * @param id   id gerado pelo repositorio
     * @param nome nome do tema
     * @return o novo tema
     */
    public static Tema criar(long id, String nome) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Reconstitui um tema JA EXISTENTE, vindo da persistencia.
     *
     * <p>Semanticamente diferente de {@link #criar(long, String)}: aqui a
     * entidade ja existia, apenas esta sendo remontada em memoria a partir dos
     * dados armazenados. Usado pelos repositorios.</p>
     *
     * @param id   id ja existente
     * @param nome nome do tema
     * @return o tema reconstituido
     */
    public static Tema reconstituir(long id, String nome) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * @return o nome do tema
     */
    public String getNome() {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Altera o nome do tema.
     *
     * @param nome novo nome
     */
    public void setNome(String nome) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
