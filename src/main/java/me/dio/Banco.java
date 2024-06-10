package me.dio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    // Método para listar todos os clientes
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        for (Conta conta : contas) {
            if (!clientes.contains(conta.getCliente())) {
                clientes.add(conta.getCliente());
            }
        }
        return clientes;
    }
}
