/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.calculadora.modelo;

/**
 *
 * @author Josarta
 */
public class Operaciones {

    private int valorA = 0;
    private int valorB = 0;
    private String operaciones = "";
    private int resultado = 0;

    public Operaciones() {
    }

    public Operaciones(int valorA, int valorB, String operaciones, int resultado) {
        this.valorA = valorA;
        this.valorB = valorB;
        this.operaciones = operaciones;
        this.resultado = resultado;
    }

    public void opSuma() {
        this.resultado = this.valorA + this.valorB;
    }

    public void opResta() {
        this.resultado = this.valorA - this.valorB;
    }

    public void opMultiplicacion() {
        this.resultado = this.valorA * this.valorB;
    }

    public void opDivision() {
        this.resultado = this.valorA / this.valorB;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getValorA() {
        return valorA;
    }

    public void setValorA(int valorA) {
        this.valorA = valorA;
    }

    public int getValorB() {
        return valorB;
    }

    public void setValorB(int valorB) {
        this.valorB = valorB;
    }

    public String getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(String operaciones) {
        this.operaciones = operaciones;
    }

}
