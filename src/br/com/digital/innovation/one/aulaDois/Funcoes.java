package br.com.digital.innovation.one.aulaDois;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converterStringParaInteiroEDuplicarValor = string -> Integer.valueOf(string) * 2;

        System.out.println(retornarNomeAoContrario.apply("Pitico"));
        System.out.println(converterStringParaInteiroEDuplicarValor.apply("5"));
    }
}
