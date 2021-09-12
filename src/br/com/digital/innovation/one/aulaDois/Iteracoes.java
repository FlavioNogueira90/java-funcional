package br.com.digital.innovation.one.aulaDois;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {

        String[] nomes = {"Joao", "Paulo", "Oliveira", "Santos", "Instrutor", "Java"};
        Integer[] numeros = {1,2,3,4,5};
//        imprimirNomesFiltrados(nomes);
        imprimirTodosOsNomes(nomes);
        imprimirODobroDeCadaItem(numeros);
    }

    public static void imprimirNomesFiltrados(String... nomes){
        String nomesParaImprimir = "";
        for (int i = 0; i < nomes.length; i++){
            if (nomes[i].equals("Joao")){
                nomesParaImprimir += " " + nomes[i];
            }
        }
        System.out.println("Nomes do For: " + nomesParaImprimir);

        String nomesParaImprimirDaStream = Stream.of(nomes)
                .filter(nome -> nome.equals("Joao"))
                .collect(Collectors.joining());

        System.out.println("Nomes do Stream: " + nomesParaImprimirDaStream);
    }

    public static void imprimirTodosOsNomes(String... nomes){
        Stream.of(nomes)
                .forEach(System.out::println);
    }

    public static void imprimirODobroDeCadaItem(Integer... numeros){
        for (Integer numero : numeros){
            System.out.println("For: " + numero * 2);
        }

        Stream.of(numeros)
                .map(numero -> numero * 2)
                .forEach(System.out::println);
    }
}
