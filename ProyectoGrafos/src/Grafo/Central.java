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
public class Central {
    public static Grafo graph = new Grafo(10);

    public static Grafo getGraph() {return graph;}

    public static void setGraph(Grafo graph) {Central.graph = graph;}
    
    
}
