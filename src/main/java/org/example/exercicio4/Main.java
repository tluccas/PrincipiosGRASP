package org.example.exercicio4;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Maria");
        cliente.setEmail("maria@email.com");

        cliente.cadastraCliente(cliente);
    }
}