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
    final static int VALOR_MAX = 999999999; // indicara que no existe una arista entre los vertices

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

    public Vertice[] getVertices() {
        return Vertices;
    }

    public void setVertices(Vertice[] Vertices) {
        this.Vertices = Vertices;
    }

    public Grafo(int max) {
        MaxVertices = max;
        MatrizAd = new int[MaxVertices][MaxVertices];
        Vertices = new Vertice[MaxVertices];
        nVertices = 0;
        for (int i = 0; i < MaxVertices; i++) {
            for (int j = 0; j < MaxVertices; j++) {
                if (i == j) {
                    MatrizAd[i][j] = 0;
                } else {
                    MatrizAd[i][j] = VALOR_MAX;
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
    public int IndiceVertice(String nombre, String calle, String urb) {
        Vertice nuevo = new Vertice(nombre, calle, urb);
        boolean encontrado = false;
        int i = 0;
        while ((i < nVertices) && (encontrado == false)) {

            encontrado = Vertices[i].getNombre().equals(nuevo.getNombre());
            if (!encontrado) {
                i++;
            }
        }
        if (i < nVertices) {
            return i;
        } else {
            return -1;
        }

    }

    public int IndiceVerticeInt(int id) {
        if (id < nVertices) {
            return id;
        } else {
            return -1;
        }

    }
// Para agregar un nuevo vertice al grafo

    public void NuevoV(String nombre, String calle, String urb) {
        boolean existe = IndiceVertice(nombre, calle, urb) >= 0;
        if (!existe) {
            Vertice newVertice = new Vertice(nombre, calle, urb);
            newVertice.setNumVertice(getnVertices());
            System.out.println(newVertice.getNumVertice() + newVertice.getNombre());
            Vertices[nVertices] = newVertice;
            nVertices++;
        }
    }

    // Para agregar una nueva arista al grafo
    public boolean NuevoA(int v1, int v2, int recorrido) {
        int n1, n2;
        System.out.println(v1 + " " + v2 + " " + recorrido + "HOLA");
        n1 = IndiceVerticeInt(v1);
        n2 = IndiceVerticeInt(v2);
        if (n1 < 0 || n2 < 0) {
            JOptionPane.showMessageDialog(null, "Alguno de los vertices no existe");
            return false;
        } else {
            MatrizAd[n1][n2] = recorrido;
            MatrizAd[n2][n1] = recorrido;
            return true;
        }
    }

    public boolean Adyacente(int n1, int n2) throws Exception {
        if (n1 < 0 || n2 < 0) {
            JOptionPane.showMessageDialog(null, "Alguno de los vertices no existe");
            return false;
        } else {
            return MatrizAd[n1][n2] != 0 && MatrizAd[n1][n2] != VALOR_MAX;
        }
    }

    public void ImprimirTabla() { //PROVISIONAL
        for (int i = 0; i < nVertices; i++) {
            for (int j = 0; j < nVertices; j++) {
                System.out.print(MatrizAd[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // Se encarga de recorrer todo el grafo por anchura
    public String BFS(int orig) {
        int recorrido[] = new int[nVertices];
        int aux;
        String cadena, cadena1, cadenafinal;
        System.out.println(Vertices[orig].getNumVertice() + 1 + " " + Vertices[orig].getNombre());
        cadena1 = "ID: " + Integer.toString(Vertices[orig].getNumVertice() + 1)
                + " " + Vertices[orig].getNombre() + ", " + Vertices[orig].getUrb()
                + ", " + Vertices[orig].getCalle() + "\n";
        cadena = "ID" + Integer.toString(Vertices[orig].getNumVertice() + 1);
        if (orig >= 0) {
            Lista cola = new Lista();
            for (int i = 0; i < nVertices; i++) {
                recorrido[i] = 0;//0 para los no recorridos 1 para los ya recorridos
            }
            recorrido[orig] = 1;//ya recorremos el origen
            cola.Encolar(orig);//se encola el origen
            while (!cola.EsVacio()) {
                aux = (int) cola.LeerCabeza();
                cola.Desencolar();

                for (int i = 0; i < nVertices; i++) {
                    /*
                    A partir de ya recorrido va por la matriz verificando aquellos 
                    con los que tiene arco y si hay arco agarra ese vertice que 
                    viene siendo i 
                     */
                    if (MatrizAd[aux][i] != 0 && recorrido[i] == 0 && MatrizAd[aux][i] != VALOR_MAX) {
                        cadena += "->" + "ID" + Integer.toString(Vertices[i].getNumVertice() + 1);
                        cadena1 += "ID: " + Integer.toString(Vertices[i].getNumVertice() + 1)
                                + " " + Vertices[i].getNombre() + ", " + Vertices[i].getUrb()
                                + ", " + Vertices[i].getCalle() + "\n";
                        recorrido[i] = 1;//se marca ese ahora como visitado y se agrega para en un futuro reocorrer sus adyacentes
                        cola.Encolar(i);
                    }
                }
            }
        }
        cadenafinal = "Recorrido BSF: \n" + cadena + "\n\n" + cadena1;
        //System.out.println(cadenafinal);

        return cadenafinal;
    }

    /* 
    Verifica si los vertices adyacentes ya han sido recorridos, cuando encuentre
    uno que no haya sido recorrido, verifica si sus adyacentes ya han sido 
    recorridos. Sigue asi hasta que todos los vertices adyacentes hayan sido 
    recorridos
     */
    public String DFS(String cadena, int aux, int recorrido[]) {
        if (aux == 0) {
            cadena += aux;
        } else {
            cadena += "," + aux;
        }

        recorrido[aux] = 1;

        for (int i = 0; i < nVertices; i++) {
            if ((aux != i) && (MatrizAd[aux][i] != VALOR_MAX) && (recorrido[i] == 0)) {
                cadena = DFS(cadena, i, recorrido);
            }
        }
        return cadena;
    }

// Se encarga de recorrer el grafo por profundidad
    public String IniciarDFS(int orig) {
        int origen = IndiceVerticeInt(orig);
        int recorrido[] = new int[getnVertices()];
        String cadena = "";

        if (origen >= 0) {
            /* Incializa los valores de todas las posiciones a 0, que significa 
            que el vertice no ha sido visitado*/
            for (int i = 0; i < nVertices; i++) {
                recorrido[i] = 0;
            }

            // Si el vertice no ha sido recorrido, lo recorre 
            for (int i = 0; i < nVertices; i++) {
                if (recorrido[i] == 0) {
                    cadena = DFS(cadena, i, recorrido);
                }
            }
        }
        return cadena;
    }

    // Construye un String con el formato deseado para mostrar el recorrido por DFS
    public String OutputDFS(int orig) {
        String cadena = "";
        String out1 = "";
        String out2 = "";
        String array[];
        cadena = IniciarDFS(0);
        System.out.println("dfs" + cadena);
        array = cadena.split(",");

        out1 += "ID" + Integer.toString(Vertices[orig].getNumVertice() + 1);
        out2 += "ID: " + Integer.toString(Vertices[orig].getNumVertice() + 1)
                + " " + Vertices[orig].getNombre() + ", " + Vertices[orig].getUrb()
                + ", " + Vertices[orig].getCalle() + "\n";

        for (int i = 1; i < array.length; i++) {
            int indice = Integer.parseInt(array[i]);
            out1 += "->" + "ID" + Integer.toString(Vertices[indice].getNumVertice() + 1);
            out2 += "ID: " + Integer.toString(Vertices[indice].getNumVertice() + 1)
                    + " " + Vertices[indice].getNombre() + ", " + Vertices[i].getUrb()
                    + ", " + Vertices[indice].getCalle() + "\n";
        }

        cadena = "Recorrido DSF: \n" + out1 + "\n\n" + out2;

        return cadena;
    }

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
/*public void EliminarA(String v1, String v2, int recorrido) {
        int n1, n2;
        n1 = IndiceVertice(v1);
        n2 = IndiceVertice(v2);
        if (n1 < 0 || n2 < 0) {
            JOptionPane.showMessageDialog(null, "Alguno de los vertices no existe");
        } else {
            MatrizAd[n1][n2] = 0;
            MatrizAd[n2][n1] = 0;
        }

    }*/
 /*public void NewA(String v1, String v2, int recorrido) {
        int n1, n2;
        n1 = IndiceVertice(v1);
        n2 = IndiceVertice(v2);
        if (n1 < 0 || n2 < 0) {
            JOptionPane.showMessageDialog(null, "Alguno de los vertices no existe");
        } else {
            MatrizAd[n1][n2] = recorrido;
            MatrizAd[n2][n1] = recorrido;
        }
    }*/
