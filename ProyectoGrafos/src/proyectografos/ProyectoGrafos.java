/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectografos;

import Grafo.*;
//import static Grafo.DibujarGrafo.*;
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

        
        /*
        Grafo prueba = new Grafo(9);
        prueba.NuevoV("empresa");
        prueba.NuevoV("b");
        prueba.NuevoV("c");
        prueba.NuevoV("d");
        prueba.NuevoV("e");
        prueba.NuevoV("f");
        prueba.NuevoV("g");
        prueba.NuevoV("h");
        prueba.NuevoV("i");
        
        
        
        prueba.NuevoA(0, 1, 4);
        prueba.NuevoA(0, 6, 4);
        prueba.NuevoA(0, 8, 7);
        prueba.NuevoA(0, 2, 20);
        prueba.NuevoA(1, 5, 1);
        prueba.NuevoA(1, 3, 9);
        prueba.NuevoA(3, 8, 9);
        prueba.NuevoA(3, 4, 4);
        prueba.NuevoA(3, 6, 3);
        prueba.NuevoA(4, 1, 10);
        prueba.NuevoA(5, 7, 6);
        prueba.NuevoA(5, 2, 4);
        prueba.NuevoA(6, 2, 6);
        prueba.NuevoA(6, 8, 7);
        
        
        Dibujar(prueba);

        FloydWarshall sos = new FloydWarshall();
        System.out.println("Prueba");
        String[] camino = sos.Floyd(0, 3, prueba);
        for (int i = 0; i < camino.length; i++) {
            System.out.println(camino[i]);
        }
        
        DibujarRutaMasCorta(prueba, camino);
       */
        

    }
    
}
