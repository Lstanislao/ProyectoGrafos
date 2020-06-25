/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Luis Stanislao
 */
public class RecorrerGrafoPaTxt 
{
    public static String Clientes()
    {
       Grafo mygraph = Central.getGraph();
       Vertice clientes [] = mygraph.getVertices();
       int num = mygraph.getnVertices();
       String cadenaClientes= "";
       
       
       for (int i = 0; i < num; i++) 
       {
           cadenaClientes=cadenaClientes+Integer.toString(clientes[i].getNumVertice()+1)+","+clientes[i].getNombre()+","+clientes[i].getUrb()+","+clientes[i].getCalle()+"\n";
           System.out.println(cadenaClientes);
        }
       return cadenaClientes;   
    }
    
}
