package br.edu.iff.jogoforca.dominio.rodada;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Testes de {@link Rodada} — a classe com mais regras de negocio do projeto.
 *
 * <p>ESQUELETO: implemente cada teste conforme for implementando a classe.</p>
 *
 * <p>LEMBRE das duas configuracoes estaticas obrigatorias no {@link #setUp()}:
 * {@code Palavra.setLetraFactory(...)} e {@code Rodada.setBonecoFactory(...)}.</p>
 */
@DisplayName("Rodada")
class RodadaTest {

    /**
     * Configura os factories estaticos exigidos pelas invariantes de
     * {@code Palavra} e {@code Rodada}.
     */
    @BeforeEach
    void setUp() {
        // TODO: Palavra.setLetraFactory(LetraTextoFactory.getSoleInstance());
        // TODO: Rodada.setBonecoFactory(BonecoTextoFactory.getSoleInstance());
    }

    @Test
    @DisplayName("construir sem bonecoFactory setado deve ser rejeitado")
    void construirSemBonecoFactoryDeveSerRejeitado() {
        fail("TODO");
    }

    @Test
    @DisplayName("rodada nova nao encerrou e tem zero erros")
    void rodadaNovaNaoEncerrouETemZeroErros() {
        fail("TODO");
    }

    @Test
    @DisplayName("os ids dos itens devem seguir o indice do vetor de palavras")
    void idsDosItensDevemSeguirIndiceDoVetor() {
        fail("TODO");
    }

    @Test
    @DisplayName("todas as palavras da rodada devem ser do mesmo tema")
    void todasAsPalavrasDevemSerDoMesmoTema() {
        fail("TODO");
    }

    @Test
    @DisplayName("tentar letra inexistente deve contar um erro")
    void tentarLetraInexistenteDeveContarErro() {
        fail("TODO");
    }

    @Test
    @DisplayName("tentar letra existente nao deve contar erro")
    void tentarLetraExistenteNaoDeveContarErro() {
        fail("TODO");
    }

    @Test
    @DisplayName("getQtdeTentativasRestantes deve ser maxErros menos os erros")
    void qtdeTentativasRestantesDeveDescontarErros() {
        fail("TODO");
    }

    @Test
    @DisplayName("ao atingir 10 erros a rodada deve encerrar")
    void aoAtingirMaxErrosDeveEncerrar() {
        fail("TODO");
    }

    @Test
    @DisplayName("descobrir todas as letras deve encerrar a rodada")
    void descobrirTodasAsLetrasDeveEncerrar() {
        fail("TODO");
    }

    @Test
    @DisplayName("arriscar deve encerrar a rodada, mesmo errando")
    void arriscarDeveEncerrarRodada() {
        fail("TODO");
    }

    @Test
    @DisplayName("so deve ser possivel arriscar uma unica vez")
    void soDeveSerPossivelArriscarUmaVez() {
        fail("TODO");
    }

    @Test
    @DisplayName("nao deve aceitar tentar depois de encerrada")
    void naoDeveAceitarTentarDepoisDeEncerrada() {
        fail("TODO");
    }

    @Test
    @DisplayName("pontos = 100 + 15 por letra encoberta quando descobriu")
    void pontosQuandoDescobriuDeveSomarBonusPorLetraEncoberta() {
        fail("TODO");
    }

    @Test
    @DisplayName("pontos devem ser 0 quando nao descobriu")
    void pontosQuandoNaoDescobriuDeveSerZero() {
        fail("TODO");
    }

    @Test
    @DisplayName("ao encerrar deve atualizar a pontuacao do jogador")
    void aoEncerrarDeveAtualizarPontuacaoDoJogador() {
        fail("TODO");
    }
}
