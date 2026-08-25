package br.edu.iff.jogoforca.embdr;

import br.edu.iff.bancodepalavras.dominio.palavra.PalavraRepository;
import br.edu.iff.bancodepalavras.dominio.palavra.embdr.BDRPalavraRepository;
import br.edu.iff.bancodepalavras.dominio.tema.TemaRepository;
import br.edu.iff.bancodepalavras.dominio.tema.embdr.BDRTemaRepository;
import br.edu.iff.jogoforca.RepositoryFactory;
import br.edu.iff.jogoforca.dominio.jogador.JogadorRepository;
import br.edu.iff.jogoforca.dominio.jogador.embdr.BDRJogadorRepository;
import br.edu.iff.jogoforca.dominio.rodada.RodadaRepository;
import br.edu.iff.jogoforca.dominio.rodada.embdr.BDRRodadaRepository;

/**
 * &lt;&lt;Singleton&gt;&gt;
 *
 * <p>Familia de repositorios em BANCO DE DADOS RELACIONAL.</p>
 *
 * <p><b>ESCOPO (Reiterando.pdf, item b):</b> os repositorios BDR nao sao
 * implementados. Esta fabrica existe para demonstrar que a troca da familia
 * inteira acontece em um unico ponto — basta
 * {@code Aplicacao.setTipoRepositoryFactory("relacional")} — sem qualquer
 * alteracao no dominio (Open-Closed Principle).</p>
 */
public class BDRRepositoryFactory implements RepositoryFactory {

    private static BDRRepositoryFactory soleInstance;

    /**
     * Construtor privado (Singleton).
     */
    private BDRRepositoryFactory() {
        // Permanentemente vazio (fora do escopo do trabalho).
    }

    /**
     * Retorna a instancia unica, criando-a se necessario.
     *
     * @return a instancia unica
     */
    public static BDRRepositoryFactory getSoleInstance() {
        if (soleInstance == null) {
            soleInstance = new BDRRepositoryFactory();
        }
        return soleInstance;
    }

    /** {@inheritDoc} */
    @Override
    public PalavraRepository getPalavraRepository() {
        return BDRPalavraRepository.getSoleInstance();
    }

    /** {@inheritDoc} */
    @Override
    public TemaRepository getTemaRepository() {
        return BDRTemaRepository.getSoleInstance();
    }

    /** {@inheritDoc} */
    @Override
    public RodadaRepository getRodadaRepository() {
        return BDRRodadaRepository.getSoleInstance();
    }

    /** {@inheritDoc} */
    @Override
    public JogadorRepository getJogadorRepository() {
        return BDRJogadorRepository.getSoleInstance();
    }
}
