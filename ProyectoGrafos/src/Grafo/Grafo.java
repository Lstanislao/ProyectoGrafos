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

    // Verifica que el argumento sea un vertice valido
    public int IndiceVerticeInt(int id) {
        if (id < nVertices) {
            return id;
        } else {
            return -1;
        }

    }

    // Funcion para agregar un nuevo vertice al grafo
    public void NuevoV(String nombre, String calle, String urb) {
        boolean existe = IndiceVertice(nombre, calle, urb) >= 0;
        if (!existe) {
            Vertice newVertice = new Vertice(nombre, calle, urb);
            newVertice.setNumVertice(getnVertices());
            Vertices[nVertices] = newVertice;
            nVertices++;
        }
    }

    // Funcion para agregar una nueva arista al grafo
    public boolean NuevoA(int v1, int v2, int recorrido) {
        int n1, n2;
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

    // Se encarga de recorrer todo el grafo por anchura
    public String BFS(int orig) {
        int recorrido[] = new int[nVertices];
        int aux;
        String cadena, cadena1, cadenafinal;
        cadena = "ID" + Integer.toString(Vertices[orig].getNumVertice() + 1);
        cadena1 = "ID: " + Integer.toString(Vertices[orig].getNumVertice() + 1)
                + " " + Vertices[orig].getNombre() + ", " + Vertices[orig].getUrb();

        if (!"".equals(Vertices[orig].getCalle())) {
            cadena1 += ", " + Vertices[orig].getCalle() + "\n";
        } else {
            cadena1 += "\n";
        }

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
                                + " " + Vertices[i].getNombre() + ", " + Vertices[i].getUrb();
                        if (!"".equals(Vertices[i].getCalle())) {
                            cadena1 += ", " + Vertices[i].getCalle() + "\n";
                        } else {
                            cadena1 += "\n";
                        }
                        recorrido[i] = 1;//se marca ese ahora como visitado y se agrega para en un futuro reocorrer sus adyacentes
                        cola.Encolar(i);
                    }
                }
            }
        }
        cadenafinal = "Recorrido BSF: \n" + cadena + "\n\n" + cadena1;

        return cadenafinal;
    }

    /* 
    Funcion recursica que cerifica si los vertices adyacentes ya han sido recorridos, 
    cuando encuentre uno que no haya sido recorrido, verifica si sus adyacentes 
    ya han sido recorridos. Sigue asi hasta que todos los vertices adyacentes 
    hayan sido recorridos
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
        array = cadena.split(",");

        out1 += "ID" + Integer.toString(Vertices[orig].getNumVertice() + 1);
        out2 += "ID: " + Integer.toString(Vertices[orig].getNumVertice() + 1)
                + " " + Vertices[orig].getNombre() + ", " + Vertices[orig].getUrb();
        if (!"".equals(Vertices[orig].getCalle())) {
            out2 += ", " + Vertices[orig].getCalle() + "\n";
        } else {
            out2 += "\n";
        }

        for (int i = 1; i < array.length; i++) {
            int indice = Integer.parseInt(array[i]);
            out1 += "->" + "ID" + Integer.toString(Vertices[indice].getNumVertice() + 1);
            out2 += "ID: " + Integer.toString(Vertices[indice].getNumVertice() + 1)
                    + " " + Vertices[indice].getNombre() + ", " + Vertices[indice].getUrb();
            if (!"".equals(Vertices[indice].getCalle())) {
                out2 += ", " + Vertices[indice].getCalle() + "\n";
            } else {
                out2 += "\n";
            }
        }

        cadena = "Recorrido DSF: \n" + out1 + "\n\n" + out2;

        return cadena;
    }

}
