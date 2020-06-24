/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectografos;

import Grafo.*;
import Grafo.FloydWarshall;
import Grafo.Dijkstra;
import Ventanas.interfazMenu;

/**
 *
 * @author Luis Stanislao
 */
public class ProyectoGrafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        interfazMenu a = new interfazMenu();
        a.setVisible(true);
        
       /* Grafo nuevo = Central.getGraph();
        
        //nuevo.imprimirTabla();
        nuevo.NuevoV("A");
        nuevo.NuevoV("B");
        nuevo.NuevoV("C");
        nuevo.NuevoV("D");
        nuevo.NuevoV("F");
        nuevo.NuevoA(0, 1, 20);
        nuevo.NuevoA(0, 2, 5);
        nuevo.NuevoA(0, 3, 10);
        nuevo.NuevoA(4, 3, 50);
        nuevo.NuevoA(1, 4, 30);
        Dijkstra busqueda = new Dijkstra(nuevo,0,4); 
        busqueda.CaminoDijkstra();
        String cadena =busqueda.recuperaCamino(4,"");
        busqueda.caminoformato(cadena);
        System.out.println(cadena);*/

        
        
        

    }
    
}
