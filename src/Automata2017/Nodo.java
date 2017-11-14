/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automata2017;

import java.util.ArrayList;

/**
 *
 * @author sala de software
 */
public class Nodo {

    private int id;
    private boolean estadoAceptacion;

    private ArrayList<Transicion> transiciones;

    public Nodo(int id) {
        transiciones = new ArrayList<>();
        estadoAceptacion = false;
        this.id = id;

    }

    public Nodo evaluar(ArrayList<String> cinta, Apuntador ref) {

        mostrarId();
        for (Transicion transicione : transiciones) {
            if (transicione.getEvaluar().equals(cinta.get(ref.getReferencia()))) {

                return transicione.Operar(cinta, ref);

            }
        }

        if (aceptacion()) {
            return this;
        } else {
            return null;
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Nodo(int id, boolean estadoAceptacion) {
        transiciones = new ArrayList<>();

        this.id = id;
        this.estadoAceptacion = estadoAceptacion;
    }

    public ArrayList<Transicion> getTransiciones() {
        return transiciones;
    }

    public void setTransiciones(ArrayList<Transicion> transiciones) {
        this.transiciones = transiciones;
    }

    public boolean aceptacion() {
        if (estadoAceptacion) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isEstadoAceptacion() {
        return estadoAceptacion;
    }

    public void setEstadoAceptacion(boolean estadoAceptacion) {
        this.estadoAceptacion = estadoAceptacion;
    }

    public void mostrarId() {
        System.out.println("ESTADO ID : " + id);
    }

}
