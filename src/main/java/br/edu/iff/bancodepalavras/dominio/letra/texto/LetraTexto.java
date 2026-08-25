package br.edu.iff.bancodepalavras.dominio.letra.texto;

import br.edu.iff.bancodepalavras.dominio.letra.Letra;

/**
 * Letra no meio grafico TEXTO.
 *
 * <p><b>ESCOPO (Reiterando.pdf, item a):</b> esta classe DEVE ser implementada.
 * O metodo {@link #exibir(Object)} imprime o caractere na tela usando
 * {@code System.out.print}.</p>
 *
 * <p>Nunca instancie diretamente: obtenha via
 * {@code LetraTextoFactory.getSoleInstance().getLetra(c)}, para respeitar o
 * flyweight.</p>
 */
public class LetraTexto extends Letra {

    /**
     * @param codigo caractere representado por esta letra
     */
    public LetraTexto(char codigo) {
        super(codigo);
        // TODO: implementar
    }

    /**
     * Imprime o caractere na tela com {@code System.out.print}.
     *
     * <p>No modo texto o contexto e desnecessario: o chamador passa
     * {@code null} e este metodo simplesmente o ignora.</p>
     *
     * @param contexto ignorado nesta implementacao (passe {@code null})
     */
    @Override
    public void exibir(Object contexto) {
        // TODO: implementar
        throw new UnsupportedOperationException("TODO");
    }
}
