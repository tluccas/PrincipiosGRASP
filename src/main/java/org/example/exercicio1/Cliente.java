package org.example.exercicio1;

import java.util.List;

/* TODO: 1 - Aplique o princípio Especialista na Informação (Information Expert).
    Explique os problemas encontrados e o que foi feito para adequar
    o código existente ao princípio.

    RESPOSTA:

*/
public class Cliente { /*A classe cliente estava responsável pelo valor das compras, o que vai contra o princípio Especialista da Informação, agora refatorado
    Cliente apenas recebe as compras e quem fica responsável pelo valor de cada compra é a classe Compra*/

    private String nome;
    private String cpf;
    private String dataCompra;
    private List<Compra> compras;

    public void adicionarCompra(Compra compra){
        compras.add(compra);
    }

    public double CalcularCompras(){
        double total = 0;
        for (Compra compra : compras ){
            total = compra.getValorTotal();
        }

        return total;
    }
}
