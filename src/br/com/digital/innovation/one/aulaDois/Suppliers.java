package br.com.digital.innovation.one.aulaDois;

import java.util.function.Supplier;

public class Suppliers {
    public static void main(String[] args) {
        Supplier<Pessoa> suppliers = () -> new Pessoa();

        System.out.println(suppliers.get());
    }
}

class Pessoa{
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "Flavio";
        idade = 31;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
