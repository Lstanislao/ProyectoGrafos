/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.SingleGraph;

/**
 *
 * @author orian
 */
public class DibujarGrafo {

    /*
    En esta clase se utiliza la libreria GraphStream (http://graphstream-project.org/) 
    para representar el grafo de forma grafica
     */

 /* Aqui se especifica todo lo referente al estilo de los vertices y aristas 
    al graficar*/
    protected static String estilo = ""
            + " node {"
            + "     fill-mode: gradient-diagonal1;"
            + "     fill-color: rgb(0,118,137), rgb(144,212,222);"
            + "     text-size: 40;"
            + "     text-alignment: center;"
            + "     size: 30;"
            + "     text-style: bold;"
            + "     text-color: rgb(255,255,255);"
            + "     stroke-color: black;"
            + "     stroke-mode: plain;"
            + "     stroke-width: 2;"
            + " }"
            + " node.marked {"
            + "     fill-mode: gradient-diagonal1;"
            + "     text-alignment: center;"
            + "     fill-color: rgb(182,229,88), rgb(116, 151, 47);"
            + "     text-size: 40;"
            + "     text-style: bold;"
            + "     size: 30;"
            + "     stroke-color: black;"
            + "     stroke-mode: plain;"
            + " }"
            + " edge {"
            + "     text-size: 30;"
            + "     size: 2;"
            + "     text-alignment: along;"
            + "     text-padding: 10, 0;"
            + "     text-background-mode: rounded-box;"
            + "      text-background-color: rgb(255,255,255);"
            + " }"
            + " edge.marked {"
            + "     fill-color: rgb(197,242,93);"
            + "     size: 3;"
            + "     text-size: 30;"
            + "     text-alignment: under;"
            + "     text-padding: 10, 0;"
            + "     text-background-mode: rounded-box;"
            + "     text-background-color: rgb(255,255,255);"
            + " }";


    /* 
    Esta funcion se encarga de representar graficamente el grafo recibido 
    como argumento
     */
    public static void Dibujar(Grafo g) {

        Graph graph = new SingleGraph("Clientes");

        graph.addAttribute("ui.stylesheet", estilo);

        /* A partir del grafo recibido agrego los vertices y aristas en un nuevo
        grafo que pertenece a la clase grafo de la libreria*/
        for (int i = 0; i < g.getnVertices(); i++) {
            Node n = graph.addNode(g.Vertices[i].getNombre());
            n.addAttribute("ui.label", i + 1);
        }

        for (int i = 0; i < g.getnVertices(); i++) {
            for (int j = 0; j < i; j++) {
                if (g.MatrizAd[i][j] != 0 && g.MatrizAd[i][j] != 999999999) {
                    String a = Integer.toString(i);
                    String b = Integer.toString(j);
                    Edge e = graph.addEdge(a + "-" + b, g.Vertices[i].getNombre(), g.Vertices[j].getNombre());
                    e.addAttribute("ui.label", g.MatrizAd[i][j]);
                }
            }
        }
        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");

        //Una vez que el grafo esta construido, lo muestro al usuario
        graph.display();
    }

    /* 
    Esta funcion se encarga de representar graficamente el grafo recibido como 
    argumento, señalando el camino mas corto entre dos vertices
     */
    public static void DibujarRutaMasCorta(Grafo g, String[] camino) {
        Graph graph = new SingleGraph("Ruta corta");

        graph.addAttribute("ui.stylesheet", estilo);

        /* 
        A partir del grafo recibido agrego los vertices y aristas en un nuevo
        grafo que pertenece a la clase grafo de la libreria. Me aseguro de marcar
        los vertices y aristas qeu formen parte del recorrido, para poder 
        mostrarlo
         */
        for (int i = 0; i < g.getnVertices(); i++) {
            Node n = graph.addNode(g.Vertices[i].getNombre());

            if (Pertenece(i, camino)) {
                n.setAttribute("ui.class", "marked");
            }

            n.addAttribute("ui.label", i + 1);
        }

        for (int i = 0; i < g.getnVertices(); i++) {
            for (int j = 0; j < i; j++) {
                if (g.MatrizAd[i][j] != 0 && g.MatrizAd[i][j] != 999999999) {
                    String a = Integer.toString(i);
                    String b = Integer.toString(j);
                    Edge e = graph.addEdge(a + "-" + b, g.Vertices[i].getNombre(), g.Vertices[j].getNombre());
                    if (PerteneceArista(ArregloAristas(camino), b, a)) {
                        e.setAttribute("ui.class", "marked");
                    }
                    e.addAttribute("ui.label", g.MatrizAd[i][j]);
                    System.out.println("Agregue edge " + b + a);
                }
            }
        }

        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");

        //Muestro el grafo
        graph.display();
    }

    //Funcion que verifica si un vertice es parte del camino mas corto
    public static boolean Pertenece(int i, String[] camino) {
        boolean existe = false;
        for (int j = 0; j < camino.length; j++) {
            System.out.println("vertice" + camino[j]);
            if (i == Integer.parseInt(camino[j])) {
                existe = true;
            }
        }
        return existe;
    }

    /*
    Crea un arreglo que tiene en cada posicion un String con los dos vertices
    de la arista
     */
    public static String[] ArregloAristas(String[] camino) {
        String[] aristas = new String[camino.length - 1];

        for (int k = 1; k < camino.length; k++) {
            int a = Integer.parseInt(camino[k]);
            int b = Integer.parseInt(camino[k - 1]);
            if (a > b) {
                aristas[k - 1] = camino[k - 1] + camino[k];
            } else {
                aristas[k - 1] = camino[k] + camino[k - 1];
            }
        }
        return aristas;
    }

    //Funcion que verifica si una arista es parte del camino mas corto
    public static boolean PerteneceArista(String[] aristas, String a, String b) {
        boolean existe = false;
        for (int j = 0; j < aristas.length; j++) {
            if ((a + b).equals(aristas[j])) {
                existe = true;
            }
        }
        return existe;
    }
}
