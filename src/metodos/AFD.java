/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author sebas
 */
public class AFD implements Serializable{
    Estado EdoIni;
    HashSet<Character> Alfabeto;
    HashSet<Estado> Estados;
    ArrayList<String>ESTADOS;
    HashSet<Estado> EdosAcept;
    char idAFD;
    
    public AFD() {
        EdoIni = null;
        Alfabeto = new HashSet<>();
        Alfabeto.clear();
        Estados = new HashSet<>();
        Estados.clear();
        EdosAcept = new HashSet<>();
        EdosAcept.clear();
        ESTADOS =   new ArrayList<>();
    }
    
    Estado BuscarEstado(int id){
        for(Estado e : this.Estados){
            if(id == e.IdEdo){
                return e;
            }
        }
        System.out.println("El estado " + id + " no se encontró");
        return null;
    }
    
    public Estado Mover(int id, char s){
        Estado edo = BuscarEstado(id);
        for(Transicion t : edo.Transiciones){
            if(t.Minsimb <= s && s <= t.Maxsimb)
                return t.estado;
        }
        return null;
    }
    
    public Estado Mover(Estado edo, char s){
        for(Transicion t : edo.Transiciones){
            if(t.Minsimb <= s && s <= t.Maxsimb)
                return t.estado;
        }
        return null;
    }
    
    public HashSet<Character> getAlfabeto(){
         return this.Alfabeto;
    }
    
    public void setStringId(String name){
        idAFD=name.charAt(0);
    }
    
    public String getStringId(){
        return Character.toString(idAFD);
    }
    
    
    public String[][]  generarTablaAcomodada(){
    
        int numeroFilas             =   this.Estados.size();
        int numeroColumnas          =   this.Alfabeto.size()+1;
        String [][]datos            =   this.generarTabla();
        String [][]datosAcomodados  =   new String[numeroFilas][numeroColumnas+1];
        
        for(int i = 0; i< numeroFilas; i++)
            System.arraycopy(datos[i], 0, datosAcomodados[i], 1, numeroColumnas);
        /*for(int j = 0; j < numeroColumnas; j ++)
                datosAcomodados[i][j+1]   =   datos[i][j];*/
        
        for(int i = 0; i< numeroFilas; i++)
                datosAcomodados[i][0]     =   this.ESTADOS.get(i);
        
        return datosAcomodados;
    }

    public String[][] generarTabla(){

        int indice1                 =   0;
        int numeroFilas             =   this.Estados.size();
        int numeroColumnas          =   this.Alfabeto.size()+1;
        String [][]datos            =   new String[numeroFilas][numeroColumnas]; 

        for(int i=0; i< numeroFilas; i++)
            for(int j =0; j<numeroColumnas; j++)
                datos[i][j]         =   "-1";
        
        for (Estado e : this.Estados){
            
            ESTADOS.add(e.IdEdo+"");
            
            int indice2            =   0;
            for (char letra: this.Alfabeto){
                
                for(Transicion t : e.Transiciones){                   
                    if(t.Maxsimb == letra || t.Minsimb == letra){           
                            if((datos[indice1][indice2]).equals("-1")){
                                datos[indice1][indice2]     = t.estado.IdEdo+"";
                            }else{
                                datos[indice1][indice2]    +=  "," + t.estado.IdEdo ;
                            }
                    }
                }
                indice2++;
            }
            if(e.EdoAcep>-1)
                   datos[indice1][numeroColumnas-1]   =   1+"";
            indice1 ++;     
        }
        
        return  datos;      
    }
    
    public void guardarAFD(String rutaArchivo) throws FileNotFoundException, IOException{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo));
        oos.writeObject(this);
        oos.flush();
        oos.close();
    }
    
    static public AFD cargarAFD(String rutaArchivo) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaArchivo));
        AFD afd = (AFD)ois.readObject();
        ois.close();
        return afd;
    }
}
