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
    //En esta clase se tiene el grafo cargado actualmente y el txt con el que se esta trabajando
    public static Grafo graph = new Grafo(100);
    public static String Actual = "Enunciado.txt";
    public static boolean Iniciado = false;

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

    public static boolean getIniciado() {
        return Iniciado;
    }

    public static void setInciado(boolean Inciado) {
        Central.Iniciado = Inciado;
    }

//Caraga el grafo a partir de un txt
    public static void CargarGrafo1() {
        Grafo mygraph = new Grafo(1000);
        File miArchivo;
        File ruta;
        FileReader leer;
        BufferedReader almacenamiento;
        String id, nombre, calle, urb, linea, cadena[];
        int v1, v2, distancia;
        miArchivo = new File("ArchivoPorDefecto.txt");
        String line;

        boolean lineaClientes = false;
        boolean lineaCaminos = false;

        try {
            FileReader fileReader
                    = new FileReader(miArchivo);
            BufferedReader bufferedReader
                    = new BufferedReader(fileReader);

            //Usa las separaciones del archivo(clientes, caminos)
            //para poder saber que lineas del archivo se usaran para crear las listas
            while ((line = bufferedReader.readLine()) != null) {
                if (line.toLowerCase().equals("clientes")) {
                    lineaClientes = true;
                    line = bufferedReader.readLine();
                }
                if (line.toLowerCase().equals("caminos")) {
                    lineaClientes = false;
                    line = bufferedReader.readLine();
                    lineaCaminos = true;
                }

                // Parte que inserta clientes en la lista clientes
                if (lineaClientes == true) {
                    line = line.replace(", ", ",");
                    cadena = line.split(",");
                    nombre = cadena[1];
                    urb = cadena[2];
                    if (cadena.length > 3) {
                        calle = cadena[3];
                    } else {
                        calle = "";
                    }

                    mygraph.NuevoV(nombre, calle, urb);

                    // Parte que inserta caminos en la lista caminos
                } else if (lineaCaminos == true) {
                    line = line.replace(", ", ",");
                    cadena = line.split(",");
                    String vertice1=cadena[0];
                    String vertice2=cadena[0];
                    if(!vertice1.equals("") && !vertice2.equals(""))
                    {
                        
                        v1 = Integer.parseInt(cadena[0]) - 1;
                        v2 = Integer.parseInt(cadena[1]) - 1;
                        distancia = Integer.parseInt(cadena[2]);
                        mygraph.NuevoA(v1, v2, distancia);
                        
                    }
                }
            }

            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "No se puede abrir este archivo'"
                    + miArchivo + "'");
        } catch (IOException ex) {
            System.out.println(
                    "No se puede leer este archivo '"
                    + miArchivo + "'");

        } catch (IndexOutOfBoundsException ex) {

        }
        Central.setGraph(mygraph);
    }

}
