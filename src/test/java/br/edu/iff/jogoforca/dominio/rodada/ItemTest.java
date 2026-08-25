package br.edu.iff.jogoforca.dominio.rodada;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Testes de {@link Item}.
 *
 * <p>ESQUELETO: implemente cada teste conforme for implementando a classe.</p>
 *
 * <p>Como {@code Item.criar} tem visibilidade de PACOTE, esta classe de teste
 * esta no mesmo pacote ({@code br.edu.iff.jogoforca.dominio.rodada}) e portanto
 * consegue cria-lo diretamente.</p>
 */
@DisplayName("Item")
class ItemTest {

    /**
     * Configura {@code Palavra.setLetraFactory(...)}, necessario para construir
     * as palavras usadas nos itens.
     */
    @BeforeEach
    void setUp() {
        // TODO: Palavra.setLetraFactory(LetraTextoFactory.getSoleInstance());
    }

    @Test
    @DisplayName("item novo nao arriscou e tem todas as letras encobertas")
    void itemNovoNaoArriscouETemTudoEncoberto() {
        fail("TODO");
    }

    @Test
    @DisplayName("tentar letra presente deve descobrir as posicoes e retornar true")
    void tentarLetraPresenteDeveDescobrirPosicoes() {
        fail("TODO");
    }

    @Test
    @DisplayName("tentar letra ausente deve retornar false e nao descobrir nada")
    void tentarLetraAusenteDeveRetornarFalse() {
        fail("TODO");
    }

    @Test
    @DisplayName("arriscou deve ser true exatamente quando palavraArriscada != null")
    void arriscouDeveRefletirPalavraArriscadaNaoNula() {
        fail("TODO");
    }

    @Test
    @DisplayName("acertou deve comparar a palavra arriscada com a palavra do item")
    void acertouDeveCompararPalavraArriscada() {
        fail("TODO");
    }

    @Test
    @DisplayName("descobriu deve ser true quando acertou ao arriscar")
    void descobriuDeveSerTrueQuandoAcertouAoArriscar() {
        fail("TODO");
    }

    @Test
    @DisplayName("descobriu deve ser true quando todas as letras foram tentadas")
    void descobriuDeveSerTrueQuandoNaoRestamLetrasEncobertas() {
        fail("TODO");
    }

    @Test
    @DisplayName("calcularPontosLetrasEncobertas = qtde encobertas x valor por letra")
    void calcularPontosLetrasEncobertasDeveMultiplicar() {
        fail("TODO");
    }
}
