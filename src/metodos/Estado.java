/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.io.Serializable;
import java.util.HashSet;

/**
 *
 * @author sebas
 */
public class Estado implements Serializable {
    static int IdEdoAct = 0;
    int IdEdo;
    int EdoAcep;
    public HashSet<Transicion> Transiciones;

    public Estado() {
        IdEdo = IdEdoAct++;
        EdoAcep = -1;
        Transiciones = new HashSet<>();
        Transiciones.clear();
    }
    
    public Estado(int id) {
        IdEdo = id;
        EdoAcep = -1;
        Transiciones = new HashSet<>();
        Transiciones.clear();
    }
    
    public void AddTransicion(char s, Estado e){
        Transiciones.add(new Transicion(s, e));
    }
    
    public void AddTransicion(char s, char s2, Estado e){
        Transiciones.add(new Transicion(s, s2, e));
    }
    
    public static void restartState(){
        IdEdoAct = 0;
    }
    
}
