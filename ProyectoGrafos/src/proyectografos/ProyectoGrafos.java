/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectografos;


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
         Grafo prueba = new Grafo(20);
        prueba.NuevoV("Empresa");
        prueba.NuevoV("b");
        prueba.NuevoV("c");
        prueba.NuevoV("d");
        prueba.NuevoV("e");
        prueba.NuevoV("f");
        prueba.NuevoV("g");
        prueba.NuevoV("h");
        prueba.NuevoV("i");
        prueba.NuevoV("j");
        prueba.NuevoV("k");
        prueba.NuevoV("l");
        
        
        
        prueba.NuevoA(0, 5, 4);
        prueba.NuevoA(0, 2, 11);
        prueba.NuevoA(0, 6, 13);
        prueba.NuevoA(1, 6, 5);
        prueba.NuevoA(2, 1, 3);
        prueba.NuevoA(3, 6, 10);
        prueba.NuevoA(3, 0, 1);
        prueba.NuevoA(4, 5, 3);
        prueba.NuevoA(5, 1, 7);
        prueba.NuevoA(5, 3, 8);
        prueba.NuevoA(6, 4, 7);
        prueba.NuevoA(6, 11, 6);
        prueba.NuevoA(3, 8, 8);
        prueba.NuevoA(11, 9, 7);
        prueba.NuevoA(8, 7, 4);
        prueba.NuevoA(8, 9, 12);
        prueba.NuevoA(7, 10, 10);
        prueba.NuevoA(9, 10, 2);
        
        
        Dibujar(prueba);

        FloydW sos = new FloydW();
        System.out.println("Prueba");
        String[] camino = sos.Floyd(0, 9, prueba);
        for (int i = 0; i < camino.length; i++) {
            System.out.println(camino[i]);
        }
        
        DibujarRutaMasCorta(prueba, camino);
        
        Dijkstra sos2 = new Dijkstra(prueba, 0, 9);
        sos2.CaminoDijkstra();
        String[] camino2 = sos2.caminoformato(sos2.recuperaCamino(9, ""));
        DibujarRutaMasCorta(prueba, camino2);

       */
        

    }
    
}
