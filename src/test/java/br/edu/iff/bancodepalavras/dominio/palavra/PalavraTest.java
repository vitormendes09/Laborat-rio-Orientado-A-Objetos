package br.edu.iff.bancodepalavras.dominio.palavra;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Testes de {@link Palavra}.
 *
 * <p>ESQUELETO: implemente cada teste conforme for implementando a classe.</p>
 *
 * <p>LEMBRE: antes de construir qualquer Palavra e obrigatorio chamar
 * {@code Palavra.setLetraFactory(...)} — faca isso no {@link #setUp()}.</p>
 */
@DisplayName("Palavra")
class PalavraTest {

    /**
     * Configura a fabrica de letras estatica exigida pela invariante de
     * {@code Palavra}. Sem isso, o construtor falha.
     */
    @BeforeEach
    void setUp() {
        // TODO: Palavra.setLetraFactory(LetraTextoFactory.getSoleInstance());
    }

    @Test
    @DisplayName("criar deve montar a palavra com o tamanho e o tema corretos")
    void criarDeveMontarPalavraComTamanhoETema() {
        fail("TODO");
    }

    @Test
    @DisplayName("construir sem letraFactory setado deve ser rejeitado")
    void construirSemLetraFactoryDeveSerRejeitado() {
        fail("TODO");
    }

    @Test
    @DisplayName("tentar deve retornar todas as posicoes em que a letra ocorre")
    void tentarDeveRetornarPosicoesDaLetra() {
        fail("TODO");
    }

    @Test
    @DisplayName("tentar com letra ausente deve retornar vetor VAZIO, nunca null")
    void tentarComLetraAusenteDeveRetornarVetorVazioNaoNull() {
        fail("TODO");
    }

    @Test
    @DisplayName("comparar deve reconhecer o texto exato da palavra")
    void compararDeveReconhecerTextoExato() {
        fail("TODO");
    }

    @Test
    @DisplayName("getLetra deve devolver a letra da posicao pedida")
    void getLetraDeveDevolverLetraDaPosicao() {
        fail("TODO");
    }
}
