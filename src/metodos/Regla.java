/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class Regla {
    ArrayList<Simbolo> simbolos;  
    
    public void agregarSimbolo(String s, boolean terminal, int token){
        Simbolo nuevo = new Simbolo(s, terminal, token);
        simbolos.add(nuevo);
    }
    
}
