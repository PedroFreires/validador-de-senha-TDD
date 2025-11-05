package com.example.validasenhatdd;

public class ValidadorDeSenha {
    public boolean validar(String senha) {

        if (senha == null || senha.length() < 8) {
            return false;
        }

        boolean apenasNumeros = true;
        for (char c : senha.toCharArray()) {
            if (!Character.isDigit(c)) {
                apenasNumeros = false;
                break;
            }
        }
        if (apenasNumeros) {
            return false;
        }
        return true;
    }
}
