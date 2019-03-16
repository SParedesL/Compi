/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.io.Serializable;

/**
 *
 * @author sebas
 */
public class Transicion implements Serializable{
    char Minsimb, Maxsimb;
    Estado estado;

    public Transicion(char s, Estado e) {
        Minsimb = s;
        Maxsimb = s;
        estado = e;
    }

    public Transicion(char s, char s2, Estado e) {
        Minsimb = s;
        Maxsimb = s2;
        estado = e;
    }
    
    
    
    
}
