/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

/**
 *
 * @author Luis Stanislao
 */
public class Nodo {

    private Object dato;
    private Nodo pNext;

    public Nodo(Object dato) {
        this.dato = dato;
        pNext = null;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getPnext() {
        return pNext;
    }

    public void setPnext(Nodo pnext) {
        this.pNext = pnext;
    }
}
