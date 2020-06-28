/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import static Grafo.Grafo.VALOR_MAX;

/**
 *
 * @author orian
 */
public class FloydWarshall {

    int num;
    int[][] dist;
    int[][] camino;

    // Funcion que ejecuta el algoritmo Floyd-Warshall
    public String Floyd(int inicio, int end, Grafo grafo) {
        num = grafo.getnVertices(); // Es el numero de vertices
        dist = new int[num][num]; // Guardara la distancia mas corta entre pares
        camino = new int[num][num]; // Guardara indices para reconstruir el camino mas corto

        // Asignamos a las matrices sus valores iniciales
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                dist[i][j] = grafo.MatrizAd[i][j];
                if (grafo.MatrizAd[i][j] != VALOR_MAX && i != j) {
                    camino[i][j] = j + 1;
                }
            }
        }

        // Encuentra el camino mas corto entre todo par de nodos
        for (int k = 0; k < num; k++) {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                        camino[i][j] = camino[i][k];
                    }
                }
            }
        }

        return CaminoMasCorto(inicio, end);
    }

    // Se reconstruye la ruta del camino mas corto obtenido del metodo de Floyd-Warshall
    public String CaminoMasCorto(int inicio, int end) {
        String ruta = Integer.toString(inicio + 1);

        if (dist[inicio][end] != VALOR_MAX && inicio != end) {
            int u = inicio + 1;
            int v = end + 1;
            do {
                u = camino[u - 1][v - 1];
                ruta += " -> " + u;
            } while (u != v);
        }
        return ruta + "  ~  Distancia total entre los puntos: " + dist[inicio][end] + " Km";
    }

}
