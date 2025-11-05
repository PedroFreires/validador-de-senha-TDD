package com.example.validasenhatdd;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidadorSenhaTeste {

    // Caminho feliz
    @Test
    public void deveRetornarTrueParaSenhaComOitoDigitos() {
        ValidadorDeSenha validador = new ValidadorDeSenha();
        String senha = "12345678l";

        boolean resultado = validador.validar(senha);

        assertTrue("A senha de 8 digitos e com letra deve ser válida.", resultado);
    }

    // Caminho triste
    @Test
    public void deveRetornarFalseParaSenhaComMenosDeOitoDigitos() {
        ValidadorDeSenha validador = new ValidadorDeSenha();
        String senha = "123456";

        boolean resultado = validador.validar(senha);

        assertFalse("A senha com menos de 8 digitos deve ser inválida", resultado);
    }

    // Senhas nulas
    @Test
    public void deveRetornarFalseParaSenhasNulas() {
        ValidadorDeSenha validador = new ValidadorDeSenha();
        String senha = null;

        boolean resultado = validador.validar(senha);

        assertFalse("A senha que for nula, deve ser inválida", resultado);
    }

    // REFACTOR
    // Falha os casos de somente numéricos
    @Test
    public void deveRetornarFalseParaSenhaComApenasNumeros() {
        ValidadorDeSenha validador = new ValidadorDeSenha();
        String senha = "1234567";

        boolean resultado = validador.validar(senha);

        assertFalse("A senha somente com numéricos deve ser inválida", resultado);
    }
}