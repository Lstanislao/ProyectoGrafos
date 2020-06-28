/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import static Grafo.Grafo.VALOR_MAX;

/**
 *
 * @author Luis Stanislao
 */
public class Dijkstra {

    int Matriz[][];//aqui tengo los pesos
    int Ultimo[];//ultimo que se visita antes de llegar al destino
    int Cost[];//costos minimo de cada vertices desde el origen
    boolean Visitados[];//los que ya he recorrido
    int Orig, Num, Destino;//origen y numero de vertices

    public Dijkstra(Grafo graf, int Orig, int Destino) {
        Num = graf.getnVertices();
        Matriz = graf.MatrizAd;
        Ultimo = new int[Num];
        Cost = new int[Num];
        Visitados = new boolean[Num];
        this.Orig = Orig;
        this.Destino = Destino;

    }

    public void CaminoDijkstra() {
        /* se inicializan los arreglos Visiatados con falso, el de costo con el 
        costo de todos los arcos que tien el origen y el ultimo recorrido es 
        origen*/

        for (int i = 0; i < Num; i++) {
            Visitados[i] = false;
            Cost[i] = Matriz[Orig][i];
            Ultimo[i] = Orig;
        }
        Visitados[Orig] = true;//se marca origen como ya visitado
        //LowCost[Orig]=0;
        for (int k = 1; k < Num; k++) {
            int min = MenorDistancia();
            Visitados[min] = true;
            for (int j = 1; j < Num; j++) {

                if (!Visitados[j]) {//si ese nodo no ha sido visitado 
                    if (Cost[min] + Matriz[min][j] < Cost[j]) {
                        Cost[j] = Cost[min] + Matriz[min][j];
                        Ultimo[j] = min;
                    }
                }
            }
        }

    }

    /*
    Recupera un String con el camino inverso mas corto obtenido del algoritmo
    de Dijkstra
     */
    public String RecuperarCamino(int v, String cadena) {

        int anterior = Ultimo[v];
        if (v != Orig) {
            cadena = cadena + "," + v;
            cadena = RecuperarCamino(anterior, cadena);

        } else {
            cadena = cadena + ",0";
        }
        return cadena;
    }

    // Invierte el camino para obtener asi el camino mas corto en el formato deseado
    public String CaminoFormato() {
        CaminoDijkstra();
        String cadena = RecuperarCamino(Destino, "");
        String s[] = cadena.split(",");

        int j = s.length - 1;
        String inverse = "1";
        j--;
        for (int i = 1; i < s.length - 1; i++) {
            inverse = inverse + " -> " + Integer.toString(Integer.parseInt(s[j]) + 1);
            j--;
        }
        return inverse + "  ~  Distancia total entre los puntos: " + Cost[Destino] + " Km";
    }

    // Encuentra el indice del vertice adyacente que esta mas cerca del origen
    private int MenorDistancia() {
        int minimo = VALOR_MAX;
        int aux = 1;
        for (int i = 0; i < Num; i++) {
            if (!Visitados[i] && (Cost[i] < minimo)) {
                minimo = Cost[i];
                aux = i;
            }
        }
        return aux;
    }

}
