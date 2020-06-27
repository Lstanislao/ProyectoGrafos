/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import Ventanas.interfazRegistro;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Stanislao
 */
public class Archivo {

    public static void EscribirGrafoEnTxt() {
        Grafo mygraph = Central.getGraph();
        int num = mygraph.getnVertices();
        String cadenaClientes = Clientes();
        String caminos = Caminos(mygraph);

        File archivo;
        PrintWriter escribir;
        archivo = new File("ArchivoPorDefecto.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                escribir = new PrintWriter(archivo, "utf-8");
                escribir.println();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                escribir = new PrintWriter(archivo, "utf-8");
                escribir.println("clientes");
                escribir.println(cadenaClientes);
                escribir.println("caminos");
                escribir.println(caminos);
                escribir.close();
            } catch (FileNotFoundException | UnsupportedEncodingException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public static String Clientes() {
        Grafo mygraph = Central.getGraph();
        Vertice clientes[] = mygraph.getVertices();
        int num = mygraph.getnVertices();
        String cadenaClientes = "";

        for (int i = 0; i < num; i++) {
            if (i == num - 1) {
                cadenaClientes = cadenaClientes + Integer.toString(clientes[i].getNumVertice() + 1) + "," + clientes[i].getNombre() + "," + clientes[i].getUrb() + "," + clientes[i].getCalle();
            } else {
                cadenaClientes = cadenaClientes + Integer.toString(clientes[i].getNumVertice() + 1) + "," + clientes[i].getNombre() + "," + clientes[i].getUrb() + "," + clientes[i].getCalle() + "\n";
            }
        }
        System.out.println(cadenaClientes);
        return cadenaClientes;
    }

    public static String ClientesPantalla() {
        Grafo mygraph = Central.getGraph();
        Vertice clientes[] = mygraph.getVertices();
        int num = mygraph.getnVertices();
        String cadenaClientes = "Lista de Clientes:\n";

        for (int i = 0; i < num; i++) {
            if (i == num) {
                cadenaClientes = cadenaClientes + "ID: " + Integer.toString(clientes[i].getNumVertice() + 1) + " , " + clientes[i].getNombre() + " , " + clientes[i].getUrb() + " , " + clientes[i].getCalle();
            } else {
                cadenaClientes = cadenaClientes + "ID: " + Integer.toString(clientes[i].getNumVertice() + 1) + " , " + clientes[i].getNombre() + " , " + clientes[i].getUrb() + " , " + clientes[i].getCalle() + "\n";
            }
        }
        System.out.println(cadenaClientes);
        return cadenaClientes;
    }

    public static String Caminos(Grafo g) {
        String caminos = "";
        for (int i = 1; i < g.getnVertices(); i++) {
            for (int j = 0; j < i; j++) {
                if (g.MatrizAd[i][j] != 999999999) {
                    caminos += (j + 1) + "," + (i + 1) + "," + g.MatrizAd[i][j] + "\n";
                }
            }
        }
        System.out.println(caminos);
        return caminos;
    }

    public static void copiarTxt(File archivoExterno, File archivoFijo) {//el que voy a copiar , donde lo quiero copiar
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
