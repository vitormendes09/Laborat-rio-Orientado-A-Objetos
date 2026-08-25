package br.edu.iff.jogoforca.dominio.boneco.imagem;

import br.edu.iff.jogoforca.dominio.boneco.Boneco;

/**
 * &lt;&lt;Singleton&gt;&gt;
 *
 * <p>Boneco no meio grafico IMAGEM.</p>
 *
 * <p><b>ESCOPO (Reiterando.pdf, item a):</b> NAO precisa implementar
 * {@code exibir()}. Basta criar a classe e deixar os metodos PERMANENTEMENTE
 * VAZIOS.</p>
 */
public class BonecoImagem implements Boneco {

    private static BonecoImagem soleInstance;

    /**
     * Construtor privado (Singleton).
     */
    private BonecoImagem() {
        // Permanentemente vazio (fora do escopo do trabalho).
    }

    /**
     * Retorna a instancia unica, criando-a se necessario.
     *
     * @return a instancia unica
     */
    public static BonecoImagem getSoleInstance() {
        if (soleInstance == null) {
            soleInstance = new BonecoImagem();
        }
        return soleInstance;
    }

    /**
     * Exibiria o boneco como imagem.
     *
     * <p>Permanece vazio por decisao de escopo do professor.</p>
     *
     * @param contexto objeto de contexto (ex.: lista onde se adicionariam URLs)
     * @param partes   quantidade de erros (0 a 10)
     */
    @Override
    public void exibir(Object contexto, int partes) {
        // Permanentemente vazio (fora do escopo do trabalho).
    }
}
