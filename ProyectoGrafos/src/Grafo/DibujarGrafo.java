/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

//import org.graphstream.graph.*;
//import org.graphstream.graph.implementations.SingleGraph;

/**
 *
 * @author orian
 */
//public class DibujarGrafo {
    /*
    En esta clase se utiliza la libreria GraphStream (http://graphstream-project.org/) 
    para representar el grafo de forma grafica
    */
    
    /* Aqui se especifica todo lo referente al estilo de los vertices y aristas 
    al graficar*/
/*    protected static String estilo = ""
        + " node {"
        + "     fill-color: rgb(35,154,198);"
        + "     text-size: 40;"
        + "     text-alignment: center;"
        + "     text-padding: 2;"
        + "     text-background-mode: rounded-box;"
        + "     size: 30;"
        + "     text-background-color: rgb(229,187,88);"
        + "     text-style: bold;"
        + "     stroke-color: black;"
        + "     stroke-mode: plain;"
        + "     stroke-width: 2;"
        + " }"
        + " node.marked {"
        + "     text-alignment: center;"
        + "     fill-color: rgb(182,229,88);"
        + "     text-size: 40;"
        + "     text-style: bold;"
        + "     text-background-mode: rounded-box;"
        + "     text-padding: 2;"
        + "     size: 30;"
        + "     text-background-color: rgb(229,187,88);"
        + "     stroke-color: black;"
        + "     stroke-mode: plain;"
        + " }"
        + " edge {"
        + "     text-size: 30;"
        + "     size: 4;"
        + "     text-alignment: right;"
        + " }"
        + " edge.marked {"
        + "     fill-color: rgb(88,229,182);"
        + "     size: 4;"
        + "     text-size: 30;"
        + "     text-alignment: right;"
        + " }";
*/
    /* 
    Esta funcion se encarga de representar graficamente el grafo recibido 
    como argumento
    */
/*    public static void Dibujar(Grafo g) {

        Graph graph = new SingleGraph("Clientes");

        graph.addAttribute("ui.stylesheet", estilo);
*/
        /* A partir del grafo recibido agrego los vertices y aristas en un nuevo
        grafo que pertenece a la clase grafo de la libreria*/
/*        for (int i = 0; i < g.getnVertices(); i++) {
            Node n = graph.addNode(g.Vertices[i].getNombre());
            n.addAttribute("ui.label", i);
            System.out.println("agregue vertice " + i);
        }

        for (int i = 0; i < g.getnVertices(); i++) {
            for (int j = 0; j < i; j++) {
                if (g.MatrizAd[i][j] != 0 && g.MatrizAd[i][j] != 999999999) {
                    String a = Integer.toString(i);
                    String b = Integer.toString(j);
                    Edge e = graph.addEdge(a + "-" + b, g.Vertices[i].getNombre(), g.Vertices[j].getNombre());
                    e.addAttribute("ui.label", g.MatrizAd[i][j]);
                    System.out.println("Agregue edge " + a + b);
                }
            }
        }
        // Una vez que el grafo esta construido, lo muestro al usuario
        graph.display();
    }
*/
    /* 
    Esta funcion se encarga de representar graficamente el grafo recibido como 
    argumento, señalando el camino mas corto entre dos vertices
    */
    
/*    public static void DibujarRutaMasCorta(Grafo g, String[] camino) {
        Graph graph = new SingleGraph("Ruta corta");

        graph.addAttribute("ui.stylesheet", estilo);
/*        /* A partir del grafo recibido agrego los vertices y aristas en un nuevo
        grafo que pertenece a la clase grafo de la libreria. Me aseguro de marcar
        los vertices y aristas qeu formen parte del recorrido, para poder 
        mostrarlo*/
/*        for (int i = 0; i < g.getnVertices(); i++) {
            Node n = graph.addNode(g.Vertices[i].getNombre());

            if (Pertenece(i, camino)) {
                n.setAttribute("ui.class", "marked");
            }

            n.addAttribute("ui.label", i);
            System.out.println("agregue vertice " + i);
        }
        
        for (int i = 0; i < g.getnVertices(); i++) {
            for (int j = 0; j < i; j++) {
                if (g.MatrizAd[i][j] != 0 && g.MatrizAd[i][j] != 999999999) {
                    String a = Integer.toString(i);
                    String b = Integer.toString(j);
                    Edge e = graph.addEdge(a + "-" + b, g.Vertices[i].getNombre(), g.Vertices[j].getNombre());
                    if (Pertenece(i, camino) && Pertenece(j, camino)) { // ARREGLAR ESTA CONDICION
                        e.setAttribute("ui.class", "marked");
                    }
                    e.addAttribute("ui.label", g.MatrizAd[i][j]);
                    System.out.println("Agregue edge " + a + b);
                }
            }
        }
        // Muestro el grafo
        graph.display();
    }

    // Funcion que verifica si un vertice es parte del camino mas corto
    public static boolean Pertenece(int i, String[] camino) {
        boolean existe = false;
        for (int j = 0; j < camino.length; j++) {
            if (i == Integer.parseInt(camino[j])) {
                existe = true;
            }
        }
        return existe;
    }
}
*/
