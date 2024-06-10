package me.dio;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente bruno = new Cliente("Bruno");

        Conta cc = new ContaCorrente(bruno);
        Conta poupanca = new ContaPoupanca(bruno);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Banco banco = new Banco("Meu Banco", List.of(cc, poupanca));
        System.out.println("Lista de Clientes:");
        for (Cliente cliente : banco.listarClientes()) {
            System.out.println(cliente.getNome());
        }

        CartaoDeCredito cartao = new CartaoDeCredito(bruno, 5000, 0);
        cartao.utilizar(1500);
        cartao.imprimirFatura();

        Investimento investimento = new Investimento(bruno, 10000, 150);
        investimento.imprimirExtrato();
    }
}