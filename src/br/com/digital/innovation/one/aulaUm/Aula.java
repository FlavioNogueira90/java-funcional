package br.com.digital.innovation.one.aulaUm;

import java.util.function.UnaryOperator;

public class Aula {
    public static void main(String[] args) {
        // PARADIGMA IMPERATIVO
        int valor = 10;
        int resultado = valor * 3;
        System.out.println(resultado);

        // mesmo processo com lambda
        //PARADIGMA FUNCIONAL
        UnaryOperator<Integer> calcularValorVezestres = valor2 -> valor2*3;
        int valor2 = 10;
        System.out.println(calcularValorVezestres.apply(valor2));

    }
}
