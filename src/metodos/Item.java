/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.HashSet;

/**
 *
 * @author sebas
 */
public class Item {
    Regla r;
    int punto;
    
    public Item(Regla r){
        this.r = r;
        punto = 1;
    }
    
    public static HashSet<Item> generarItems(Gramatica g){
        Item i = null;
        HashSet<Item> hi = new HashSet<>();
        for(Regla r : g.getReglas()){
            i = new Item(r);
            hi.add(i);
        }
        return hi;
    }
    
    public void moverpunto(Item i){
        i.punto++;
    }
}
