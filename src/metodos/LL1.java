/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

/**
 *
 * @author jafet
 */
public class LL1 {
    public Gramatica G;
    HashSet<Item> hi = new HashSet<>();
    
    public LL1(Gramatica g) {
        this.G = g;
        hi = Item.generarItems(g);
    }
     
    public static void main(String[] args) {
        Gramatica gra = new Gramatica();
        LL1 l = new LL1(gra);
        
    }    
    public void generarTabla(){
      
    }
    
    public HashSet<Item> Cerradura(Item i){
        Stack<Item> Pila = new Stack<>();
        HashSet<Item> Cerr = new HashSet<>();
        Cerr.clear();
        Pila.push(i);
        char s;
        while(!Pila.empty()){
            i = Pila.pop();
            if(!Cerr.contains(i)){
                Cerr.add(i);
                for(Item it : hi){
                    if(it.r.getRegla().get(0).getS().equals(i.r.getRegla().get(0).getS()))
                        Pila.add(it);
                }
            }
        }
        return Cerr;
    }
    
    public HashSet<Item> Mover(Item i){
        HashSet<Item> item = new HashSet<>();
        
        
        return item;
    }
    
}
