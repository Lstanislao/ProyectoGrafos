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

    public Vertice[] getVertices() {
        return Vertices;
    }

    public void setVertices(Vertice[] Vertices) {
        this.Vertices = Vertices;
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

    public void NuevoV(String nombre, String calle, String urb)//para crear un nuevo vertice 
    {
        boolean existe = IndiceVertice(nombre, calle, urb) >= 0;
        if (!existe) {
            Vertice newVertice = new Vertice(nombre, calle, urb);
            newVertice.setNumVertice(getnVertices());
            System.out.println(newVertice.getNumVertice() + newVertice.getNombre());
            Vertices[nVertices] = newVertice;
            nVertices++;
        }
    }

    public boolean NuevoA(int v1, int v2, int recorrido) {
        int n1, n2;
        System.out.println(v1+" "+v2+" "+recorrido+"HOLA");
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
            return MatrizAd[n1][n2] != 0 && MatrizAd[n1][n2] < 1000;
        }
    }

    public void ImprimirTabla() { //PROVISIONAL
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(MatrizAd[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public String BFS(int orig) {
        int recorrido[] = new int[nVertices];
        int aux;
        String cadena, cadena1, cadenafinal;
        System.out.println(Vertices[orig].getNumVertice() + 1+" "+Vertices[orig].getNombre());
        cadena1 = "ID: " + Integer.toString(Vertices[orig].getNumVertice() + 1)
                + " " + Vertices[orig].getNombre() + ", " + Vertices[orig].getUrb()
                + ", " + Vertices[orig].getCalle() + "\n";
        cadena = "ID" + Integer.toString(Vertices[orig].getNumVertice() + 1) + "->";
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
                    if (MatrizAd[aux][i] != 0 && recorrido[i] == 0 && MatrizAd[aux][i] != 999999999 )//a partir de ya recorrido va por la matriz verificando aquellos con los que tiene arco y si hay arco agarra ese vertice que viene siendo i 
                    {
                        if (i < nVertices - 1) {
                            cadena = cadena + "ID" + Integer.toString(Vertices[i].getNumVertice() + 1) + "->";
                        } else {
                            cadena = cadena + " ID" + Integer.toString(Vertices[i].getNumVertice() + 1);
                        }
                        cadena1 = cadena1 + "ID: " + Integer.toString(Vertices[i].getNumVertice() + 1)
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

    public String DFS(String cadena, int aux, int recorrido[]) {
        if (aux == 0) {
            cadena += aux;
        } else {
            cadena += "," + aux;
        }

        recorrido[aux] = 1;

        for (int i = 0; i < nVertices; i++) {
            if ((aux != i) && (MatrizAd[aux][i] != 999999999) && (recorrido[i] == 0)) {
                cadena = DFS(cadena, i, recorrido);
            }
        }
        return cadena;
    }

    public String IniciarDFS(int orig) {
        int origen = IndiceVerticeInt(orig);
        int recorrido[] = new int[getnVertices()];
        String cadena = "";

        if (origen >= 0) {
            for (int i = 0; i < nVertices; i++) {
                recorrido[i] = 0;
            }

            for (int i = 0; i < nVertices; i++) {
                if (recorrido[i] == 0) {
                    cadena = DFS(cadena, i, recorrido);
                }
            }
        }
        return cadena;
    }

    public String OutputDFS() {
        String cadena = "";
        String out1 = "";
        String out2 = "";
        int num;
        String array[];
        cadena = IniciarDFS(0);
        System.out.println("dfs"+cadena);
        array = cadena.split(",");
        for (String a : array) {
            num = Integer.parseInt(a);
            if (num < nVertices - 1) {
                out1 = out1 + "ID" + Integer.toString(Vertices[num].getNumVertice() + 1)
                        + "->";
            } else {
                out1 = out1 + "ID" + Integer.toString(Vertices[num].getNumVertice() + 1);
            }
            out2 = out2 + "ID: " + Integer.toString(Vertices[num].getNumVertice() + 1)
                    + " " + Vertices[num].getNombre() + ", " + Vertices[num].getUrb()
                    + ", " + Vertices[num].getCalle() + "\n";
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
