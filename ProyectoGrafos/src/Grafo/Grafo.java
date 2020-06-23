/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Stanislao
 */
public class Grafo {

    private int nVertices;//numero de vertices que hay
    private static int MaxVertices;//maximo vertices que puede haber
    protected Vertice[] Vertices;//arreglo que tiene a los vertices 
    protected int[][] MatrizAd;//matriz de ady

    public int getnVertices() {
        return nVertices;
    }

    public void setnVertices(int nVertices) {
        this.nVertices = nVertices;
    }

    public static int getMaxVertices() {
        return MaxVertices;
    }

    public static void setMaxVertices(int MaxVertices) {
        Grafo.MaxVertices = MaxVertices;
    }

    public Grafo(int MaxVertices) {
        MatrizAd = new int[MaxVertices][MaxVertices];
        Vertices = new Vertice[MaxVertices];
        nVertices = 0;
        for (int i = 0; i < MaxVertices; i++) {
            for (int j = 0; j < MaxVertices; j++) {
                if (i == j) {
                   MatrizAd[i][j] = 0; 
                } else {
                    MatrizAd[i][j] = 999999999;
                }
                
            }
        }
    }

    /*public boolean Existe(String nombre)//Busca entre todos los vertices a ver si ya uno con ese nombre
    {
        boolean existe = false;
        if (getnVertices()>0)
                {
                    for (int i = 0; i < getnVertices(); i++) 
                    {
                        if(Vertices[i].getNombre().equals(nombre))
                        {
                            existe=true;
                        }
                    }
                }
        return existe;
    }*/
 /*
    Este metodo se va al arreglo de vertices y compara para ver si ya existe uno
    con ese nombre y retorna su indice, de no existir retorna -1
     */
    public int IndiceVertice(String nombre) {
        Vertice nuevo = new Vertice(nombre);
        boolean encontrado = false;
        int i = 0;
        while ((i < getnVertices()) && (encontrado == false)) {

            encontrado = Vertices[i].getNombre().equals(nuevo.getNombre());
            if (!encontrado) {
                i++;
            }
        }
        if (i < getnVertices()) {
            return i;
        } else {
            return -1;
        }

    }

    public void NuevoV(String nombre)//para crear un nuevo vertice 
    {
        boolean existe = IndiceVertice(nombre) >= 0;
        if (!existe) {
            Vertice newVertice = new Vertice(nombre);
            newVertice.setNumVertice(getnVertices());
            System.out.println(newVertice.getNumVertice() + newVertice.getNombre());
            Vertices[(getnVertices())] = newVertice;
            setnVertices(getnVertices() + 1);
        }
    }

    public void EliminarV(String nombre) {
        int indice = IndiceVertice(nombre);
        if (indice > 0) {

        }
    }

    public void NuevoA(String v1, String v2, int recorrido) {
        int n1, n2;
        n1 = IndiceVertice(v1);
        n2 = IndiceVertice(v2);
        if (n1 < 0 || n2 < 0) {
            JOptionPane.showMessageDialog(null, "Alguno de los vertices no existe");
        } else {
            MatrizAd[n1][n2] = recorrido;
            MatrizAd[n2][n1] = recorrido;
        }
    }

    public void EliminarA(String v1, String v2, int recorrido) {
        int n1, n2;
        n1 = IndiceVertice(v1);
        n2 = IndiceVertice(v2);
        if (n1 < 0 || n2 < 0) {
            JOptionPane.showMessageDialog(null, "Alguno de los vertices no existe");
        } else {
            MatrizAd[n1][n2] = 0;
            MatrizAd[n2][n1] = 0;
        }

    }

    public boolean Adyacente(String v1, String v2) throws Exception {
        int n1, n2;
        n1 = IndiceVertice(v1);
        n2 = IndiceVertice(v2);
        if (n1 < 0 || n2 < 0) {
            JOptionPane.showMessageDialog(null, "Alguno de los vertices no existe");
            return false;
        } else {
            return MatrizAd[n1][n2] != 0 && MatrizAd[n1][n2] < 1000;
        }
    }

    public void imprimirTabla() { //PROVISIONAL
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(MatrizAd[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public String BFS(String orig) {
        int origen = IndiceVertice(orig);
        int recorrido[] = new int[getnVertices()];
        int aux;
        String cadena;
        cadena = orig;
        if (origen >= 0) {
            Lista cola = new Lista();
            for (int i = 0; i < getnVertices(); i++) {
                recorrido[i] = 0;//0 para los no recorridos 1 para los ya recorridos
            }
            recorrido[origen] = 1;//ya recorremos el origen
            cola.Encolar(origen);//se encola el origen
            while (!cola.EsVacio()) {
                aux = (int) cola.LeerCabeza();
                cola.Desencolar();

                for (int i = 0; i < getnVertices(); i++) {
                    if (MatrizAd[aux][i] != 0 && recorrido[i] == 0)//a partir de ya recorrido va por la matriz verificando aquellos con los que tiene arco y si hay arco agarra ese vertice que viene siendo i 
                    {
                        cadena = cadena + " " + Vertices[i].getNombre();
                        recorrido[i] = 1;//se marca ese ahora como visitado y se agrega para en un futuro reocorrer sus adyacentes
                        cola.Encolar(i);
                    }
                }
            }
        }
        System.out.println(cadena);

        return cadena;
    }

//    public String DFS(String orig) {
//        int origen = IndiceVertice(orig);
//        int siguiente;
//        Lista pila = new Lista();
//        int recorrido[] = new int[getnVertices()];
//        int aux;
//        int n = 0;
//        String cadena = orig;
//        if (origen >= 0) {
//            for (int i = 0; i < getnVertices(); i++) {
//                recorrido[i] = 0;
//            }
//
//            pila.Apilar(origen);
//            while (!pila.EsVacio()) {
//                aux = (int) pila.LeerTope();
//                pila.Desapilar();
//                System.out.println(recorrido[aux]);
//                if (recorrido[aux] == 0) {
//                    cadena = cadena + " " + Vertices[n].getNombre();
//                    recorrido[aux] = 1;
//                    n++;
//                    for (int j = 0; j < getnVertices(); j++) {
//                        pila.Apilar(j);
//                    }
//                }
//
//            }
//        }
//        System.out.println(cadena);
//        return cadena;
//
//    }
    public String DFS(String cadena, int aux, int recorrido[]) {
        cadena = cadena + " " + Vertices[aux].getNombre();
        recorrido[aux] = 1;

        for (int i = 0; i < getnVertices(); i++) {
            if ((aux != i) && (MatrizAd[aux][i] != 0) && (recorrido[i] == 0)) {
                cadena = DFS(cadena, i, recorrido);
            }
        }
        return cadena;
    }

    public String IniciarDFS(String orig) {
        int origen = IndiceVertice(orig);
        int recorrido[] = new int[getnVertices()];
        String cadena = "";

        if (origen >= 0) {
            for (int i = 0; i < getnVertices(); i++) {
                recorrido[i] = 0;
            }

            for (int i = 0; i < getnVertices(); i++) {
                if (recorrido[i] == 0) {
                    cadena = DFS(cadena, i, recorrido);
                }
            }
        }
        return cadena;
    }
}
