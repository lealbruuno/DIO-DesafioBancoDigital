package me.dio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartaoDeCredito {
    private Cliente cliente;
    private double limite;
    private double saldoUtilizado;

    public void utilizar(double valor) {
        if (valor + saldoUtilizado <= limite) {
            saldoUtilizado += valor;
        } else {
            System.out.println("Limite excedido!");
        }
    }

    public void pagarFatura(double valor) {
        saldoUtilizado -= valor;
    }

    public void imprimirFatura() {
        System.out.printf("Fatura do Cartão de Crédito - Titular: %s%n", cliente.getNome());
        System.out.printf("Limite: %.2f%n", limite);
        System.out.printf("Saldo Utilizado: %.2f%n", saldoUtilizado);
    }
}