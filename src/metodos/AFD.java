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
import java.util.HashSet;

/**
 *
 * @author sebas
 */
public class AFD implements Serializable{
    Estado EdoIni;
    HashSet<Character> Alfabeto;
    HashSet<Estado> Estados;
    HashSet<Estado> EdosAcept;
    
    public AFD() {
        EdoIni = null;
        Alfabeto = new HashSet<>();
        Alfabeto.clear();
        Estados = new HashSet<>();
        Estados.clear();
        EdosAcept = new HashSet<>();
        EdosAcept.clear();
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
    
    public void Prueba(){
        
    }
}
