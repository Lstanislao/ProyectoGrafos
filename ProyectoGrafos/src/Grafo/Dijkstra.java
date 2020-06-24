/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

/**
 *
 * @author Luis Stanislao
 */
public class Dijkstra {
     int Matriz[][];//aqui tengo los pesos
     int Ultimo [];//ultimo que se visita antes de llegar al destino
     int Cost [];//costos minimo de cada vertices desde el origen
    boolean Visitados[];//los que ya he recorrido
    int Orig,Num,Destino;//origen y numero de vertices

    public Dijkstra(Grafo graf, int Orig, int Destino) 
    {
        Num = graf.getnVertices();
        Matriz = graf.MatrizAd;
        Ultimo = new int[Num];
        Cost = new int[Num];
        Visitados = new boolean [Num];
        this.Orig = Orig;
        this.Destino= Destino; 
        
    }
    
    public void CaminoDijkstra()
    {
        for (int i = 0; i < Num; i++) // se inicializan los arreglos Visiatados con falso, el de costo con el costo de todos los arcos que tien el origen y el ultimo recorrido es origen 
        {
            Visitados[i]=false;
            Cost[i]=Matriz[Orig][i];
            Ultimo[i]=Orig;
        }
        Visitados[Orig]=true;//se marca origen como ya visitado
        //LowCost[Orig]=0;
        for (int k = 1; k < Num; k++) 
        {
            int min=MenorDistacia();
            Visitados[min]=true;
            for (int j = 1; j < Num; j++) 
            {


            if(!Visitados[j]){//si ese nodo no ha sido visitado 
                if(Cost[min]+Matriz[min][j]< Cost[j])
                    {
                    Cost[j]=Cost[min]+Matriz[min][j];
                    Ultimo[j]=min;
                    }    
                }   
            }
        }
        
        
    }
    
    public String recuperaCamino(int v, String cadena){
            /*for(int i = 0; i<Cost.length; i++){
            System.out.println("Cost[" + i + "]: " + Cost[i]);
        }
        System.out.println("");
        
        for (int i = 0; i<Visitados.length; i++){
            System.out.println("Ultimo[" + i + "]: " + Visitados[i]);
        }
        System.out.println("");*/
         
    int anterior = Ultimo[v]; 
        if (v != Orig) {  
            cadena=cadena+","+v;
            cadena=recuperaCamino(anterior,cadena);
            //System.out.print(" -> V" + v); 
            
        }else
        {
            //System.out.print("V" + Orig);
            cadena=cadena+",0";
        } 
        return cadena;
    }
    
    public String[] caminoformato(String cadena)
    {

        String s [] = cadena.split(",");

        
        
        int j = s.length-1;
        String inverse=s[j];
        j--;
        for (int i = 1; i < s.length-1; i++) 
        {
            
            inverse=inverse+","+ s[j];

            j--;
           
        }
;

        return inverse.split(",");
    }
    
    private int MenorDistacia()
    {
        int minimo=999999999;
        int aux=1;
        for (int i = 0; i < Num; i++) 
        {if(!Visitados[i] && (Cost[i]<minimo))//Va revisar los vertices adyacentes al origen y va a ver cual de ellos esta mas cerca que es lo que se almacena en min
        {
            minimo=Cost[i];
            aux=i;
        }
        }
        return aux;  
    }


    
    
    
}
