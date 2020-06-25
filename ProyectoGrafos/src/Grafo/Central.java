/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import Ventanas.interfazDelivery;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Stanislao
 */
public class Central {

    public static Grafo graph = new Grafo(100);
    public static String Actual;

    public static String getActual() {
        return Actual;
    }

    public static void setActual(String Actual) {
        Central.Actual = Actual;
    }

    public static Grafo getGraph() {
        return graph;
    }

    public static void setGraph(Grafo graph) {
        Central.graph = graph;
    }

    public static void CargarGrafo() {
        //Grafo mygraph = Central.getGraph();
        Grafo mygraph = new Grafo(100);
        File miArchivo;
        File ruta;
        FileReader leer;
        BufferedReader almacenamiento;
        String nombre, calle, urb, linea, cadena[];
        int v1, v2, distancia;

        System.out.println(Actual);
        miArchivo = new File(Actual);

        try {
            leer = new FileReader(miArchivo);
            almacenamiento = new BufferedReader(leer);

            try {
                while ((linea = almacenamiento.readLine()) != null) {
                    cadena = linea.split(",");
                    nombre = cadena[1];
                    urb = cadena[2];
                    calle = cadena[3];
                    System.out.println(nombre);
                    
                    nombre=nombre.substring(1);
                    urb =urb.substring(1);
                    calle=calle.substring(1);
         
                    
                    System.out.println(nombre+urb+calle);
                    mygraph.NuevoV(nombre, calle, urb);
                }

            } catch (IOException ex) {
                Logger.getLogger(interfazDelivery.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(interfazDelivery.class.getName()).log(Level.SEVERE, null, ex);
        }

        ruta = new File(Actual.replace("CLIENTES", "CAMINOS"));

        try {
            leer = new FileReader(ruta);
            almacenamiento = new BufferedReader(leer);

            try {
                while ((linea = almacenamiento.readLine()) != null) {

                    cadena = linea.split(",");
                    v1 = (Integer.parseInt(cadena[0].replaceAll(" ", ""))) - 1;
                    v2 = (Integer.parseInt(cadena[1].replaceAll(" ", ""))) - 1;
                    distancia = Integer.parseInt(cadena[2].replaceAll(" ", ""));
                    mygraph.NuevoA(v1, v2, distancia);
                }

            } catch (IOException ex) {
                Logger.getLogger(interfazDelivery.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(interfazDelivery.class.getName()).log(Level.SEVERE, null, ex);
        }
        graph = mygraph;
    }

}
