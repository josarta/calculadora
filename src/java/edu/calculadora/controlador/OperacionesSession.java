/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.calculadora.controlador;

import edu.calculadora.modelo.Operaciones;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Josarta
 */
@Named(value = "operacionesSession")
@SessionScoped
public class OperacionesSession implements Serializable {

    private Operaciones objOp = new Operaciones();
    private ArrayList<Operaciones> listaOperaciones = new ArrayList<>();

    /**
     * Creates a new instance of OperacionesSession
     */
    public OperacionesSession() {
    }

    public void sumar() {
        objOp.setOperaciones("Suma");
        listaOperaciones.add(new Operaciones(objOp.getValorA(), objOp.getValorB(), objOp.getOperaciones(), objOp.getResultado()));
        objOp.opSuma();
    }

    public void restar() {
        objOp.setOperaciones("Resta");
        listaOperaciones.add(new Operaciones(objOp.getValorA(), objOp.getValorB(), objOp.getOperaciones(), objOp.getResultado()));
        objOp.opResta();
    }

    public void division() {
        objOp.setOperaciones("Division");
        listaOperaciones.add(new Operaciones(objOp.getValorA(), objOp.getValorB(), objOp.getOperaciones(), objOp.getResultado()));
        objOp.opDivision();
    }

    public void multiplicar() {
        objOp.setOperaciones("Multiplicacion");
        listaOperaciones.add(new Operaciones(objOp.getValorA(), objOp.getValorB(), objOp.getOperaciones(), objOp.getResultado()));
        objOp.opMultiplicacion();
    }

    public Operaciones getObjOp() {
        return objOp;
    }

    public void setObjOp(Operaciones objOp) {
        this.objOp = objOp;
    }

    public ArrayList<Operaciones> getListaOperaciones() {
        return listaOperaciones;
    }

    public void setListaOperaciones(ArrayList<Operaciones> listaOperaciones) {
        this.listaOperaciones = listaOperaciones;
    }

}
