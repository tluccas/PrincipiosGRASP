package org.example.exercicio1;

import java.util.List;

/* TODO: 1 - Aplique o princípio Especialista na Informação (Information Expert).
    Explique os problemas encontrados e o que foi feito para adequar
    o código existente ao princípio.

    RESPOSTA:

*/
public class Cliente {

    private String nome;
    private String cpf;
    private String dataCompra;
    private List<Double> valoresCompras;

    public double calculaTotalCompras() {
        double total = 0;
        for (double valor : valoresCompras) {
            total += valor;
        }
        return total;
    }
}
