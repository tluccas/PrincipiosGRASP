package org.example.exercicio1;

import java.time.LocalDate;

public class Compra {

    private double valorTotal;
    private LocalDate data;

    public Compra(double valorTotal, LocalDate data){
        this.valorTotal = valorTotal;
        this.data = data;
    }

    public double getValorTotal(){
        return valorTotal;
    }




}
