/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

/**
 *
 * @author orian
 */
public class Ori {

    public static String EncontrarCaminos(Grafo g) {
        String caminos = "caminos\n";
        for (int i = 1; i < g.getnVertices(); i++) {
            for (int j = 0; j < i; j++) {
                if (g.MatrizAd[i][j] != 999999999) {
                    caminos += (j + 1) + " , " + (i + 1) + " , " + g.MatrizAd[i][j]
                            + "\n";
                }

            }
        }
        return caminos;
    }

}