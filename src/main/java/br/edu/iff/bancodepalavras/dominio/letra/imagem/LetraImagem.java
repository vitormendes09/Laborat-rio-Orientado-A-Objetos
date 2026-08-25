package br.edu.iff.bancodepalavras.dominio.letra.imagem;

import br.edu.iff.bancodepalavras.dominio.letra.Letra;

/**
 * Letra no meio grafico IMAGEM.
 *
 * <p><b>ESCOPO (Reiterando.pdf, item a):</b> NAO precisa implementar
 * {@code exibir()}. Basta criar a classe e deixar os metodos PERMANENTEMENTE
 * VAZIOS. Existe apenas para demonstrar que o modelo suporta outro meio
 * grafico sem alterar o dominio (Open-Closed Principle).</p>
 *
 * <p>Numa aplicacao Web real, {@code exibir} faria o typecast do contexto para,
 * por exemplo, uma lista, e adicionaria nela a URL da imagem da letra.</p>
 */
public class LetraImagem extends Letra {

    /**
     * @param codigo caractere representado por esta letra
     */
    public LetraImagem(char codigo) {
        super(codigo);
        // Permanentemente vazio (fora do escopo do trabalho).
    }

    /**
     * Exibiria a letra como imagem.
     *
     * <p>Permanece vazio por decisao de escopo do professor.</p>
     *
     * @param contexto objeto de contexto (ex.: lista onde se adicionaria a URL)
     */
    @Override
    public void exibir(Object contexto) {
        // Permanentemente vazio (fora do escopo do trabalho).
    }
}
