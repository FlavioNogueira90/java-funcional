package br.com.digital.innovation.one.aulaDois;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo soma = (a,b) -> a + b;
        Calculo subtrair = (a,b) -> a - b;
        Calculo dividir = (a,b) -> a / b;
        Calculo multiplicar= (a,b) -> a * b;

        System.out.println(executarOperacao(soma, 1,3));
        System.out.println(executarOperacao(subtrair, 1,3));
        System.out.println(executarOperacao(dividir, 24,2));
        System.out.println(executarOperacao(multiplicar, 7,3));
    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calculo(a,b);
    }
}

interface Calculo{
    public  int calculo(int a, int b);
}
