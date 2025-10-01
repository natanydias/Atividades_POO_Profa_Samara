package br.exercicio02;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.setNome("João");
        p1.setEndereco("Rua A, 123");
        p1.setTelefone("9999-9999");

        System.out.println("Pessoa 1: " + p1.getNome() + "," + p1.getEndereco() + "," + p1.getTelefone() + ".");
        
        Pessoa p2 = new Pessoa ("Maria");
        p2.setEndereco("Av Doutor Freitas 123");
        p2.setTelefone("9999-9999");

        System.out.println("Pessoa 2: " + p2.getNome() + "," + p2.getEndereco() + "," + p2.getTelefone() + ".");    
        
        Pessoa p3 = new Pessoa ("Elisa", "Rua C" , "9999-9999");

        System.out.println("Pessoa 3: " + p3.getNome() + "," + p3.getEndereco() + "," + p3.getTelefone() + ".");
    }
}
