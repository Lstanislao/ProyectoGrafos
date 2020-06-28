/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

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
                if (g.MatrizAd[i][j] != g.VALOR_MAX) {
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

    public static boolean VerificarFormatoArchivo(File archivo) {
        boolean archivoValido;
        boolean tieneCaminos = false;
        boolean tieneClientes = false;
        boolean clientesValido = true;
        boolean caminosValido = true;

        String linea;
        String[] cliente;
        String[] ruta;
        FileReader leer;
        BufferedReader almacenamiento;
        System.out.println("verificando");
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);

            while ((linea = almacenamiento.readLine()) != null) {

                if (!"".equals(linea)) {
                    System.out.println("viendo ifs");
                    if (linea.toLowerCase().equals("clientes")) {
                        System.out.println("tiene clientes");
                        tieneClientes = true;
                    } else if (linea.toLowerCase().equals("caminos")) {
                        System.out.println("tiene caminos");
                        tieneCaminos = true;
                    } else if (tieneClientes && !tieneCaminos) {
                        cliente = linea.split(",");
                        System.out.println("entre cliente");
                        System.out.println(linea);
                        if (cliente.length != 3 && cliente.length != 4) {
                            clientesValido = false;
                            break;
                        }
                        System.out.println("cliente bien");
                    } else if (tieneClientes && tieneCaminos) {
                        System.out.println("entre caminos");
                        System.out.println(linea);
                        ruta = linea.split(",");
                        if (ruta.length != 3) {
                            caminosValido = false;
                            break;
                        }
                        System.out.println("camino bien");
                    }
                }

            }

            almacenamiento.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "No se puede abrir este archivo'"
                    + archivo + "'");
        } catch (IOException ex) {
            System.out.println(
                    "No se puede leer este archivo '"
                    + archivo + "'");

        }

        archivoValido = tieneClientes && tieneCaminos && clientesValido && caminosValido;
        System.out.println("devolviendo " + archivoValido);
        return archivoValido;
    }
}
