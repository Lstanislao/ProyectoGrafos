/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import Ventanas.interfazRegistro;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

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

    public static String EncontrarCamino(Grafo g) {
        String caminos = "caminos\n";
        for (int i = 1; i < g.getnVertices(); i++) {
            for (int j = 0; j < i; j++) {
                if (g.MatrizAd[i][j] != 999999999) {
                    caminos += (j + 1) + " , " + (i + 1) + " , " + g.MatrizAd[i][j];
                }

            }
        }
        return caminos;
    }

    public static void copiarTxt(File archivoExterno, File archivoFijo) {
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena, texto = "";

        try {
            leer = new FileReader(archivoExterno);
            almacenamiento = new BufferedReader(leer);

            try {
                while ((cadena = almacenamiento.readLine()) != null) {
                    texto += cadena + "\n";
                }
                PrintWriter escribir;
                archivoFijo.createNewFile();
                escribir = new PrintWriter(archivoFijo, "utf-8");

                escribir.println(texto);
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(Ori.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
