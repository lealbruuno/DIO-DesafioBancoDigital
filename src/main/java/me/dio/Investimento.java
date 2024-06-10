package me.dio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Investimento {
    private Cliente cliente;
    private double valorInvestido;
    private double rendimento;

    public void investir(double valor) {
        valorInvestido += valor;
    }

    public void resgatar(double valor) {
        if (valor <= valorInvestido) {
            valorInvestido -= valor;
        } else {
            System.out.println("Valor de resgate excede o valor investido!");
        }
    }

    public void imprimirExtrato() {
        System.out.printf("Extrato de Investimento - Titular: %s%n", cliente.getNome());
        System.out.printf("Valor Investido: %.2f%n", valorInvestido);
        System.out.printf("Rendimento: %.2f%n", rendimento);
    }
}
