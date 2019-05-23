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
        Regla r = new Regla();
        LL1 l = new LL1();
    }
<<<<<<< HEAD
     
     public HashSet<Simbolo> First(ArrayList<Simbolo> simbolos){
        HashSet<Simbolo> c = new HashSet<>();
        
        if(simbolos.get(1).isTerminal() || simbolos.get(1).getS().equals(EPSILON)){ 
            c.add(simbolos.get(1));
            return c;
        }

        for (Regla r : buscarSimbolo(simbolos.get(1), true)){ 
            //System.out.println("\n --Regla del Simbolo--");
            c.addAll(First(r.getRegla()));
        }
        
        if(c.contains(EPSILON) && simbolos.size() != 1){
            c.remove(EPSILON); //eliminamos el epsilon
            c.addAll(First(simbolos)); //unimos los simbolos que ya teniamos en c, con el first del nuevo.        
        }
        return c;
     }
     
     public HashSet<Simbolo> Follow(Simbolo simbNT){
         HashSet<Simbolo> c = new HashSet<>();
         Simbolo pesos = new Simbolo("$", false, 200);
         Simbolo espacio = new Simbolo(" ", false, 300);
         ArrayList<Regla> aux = buscarSimbolo(simbNT, false);
  
         if(reglas.get(0).getRegla().get(0).getS().equals(simbNT.getS()))
             c.add(pesos);
         
         for (Regla regla : aux) {
            ArrayList<Simbolo> ladoDer = regla.getRegla();
            //System.out.println(ladoDer.size());
            int tam = ladoDer.size();
            if(tam == 4){
                
                if(ladoDer.get(2).getS().equals(simbNT.getS())){
                    //System.out.println(ladoDer.get(3).getS());
                    ArrayList<Simbolo> as = new ArrayList<>();
                    as.add(espacio);
                    as.add(ladoDer.get(3));
                    // System.out.println(as.size());
                    c.addAll(First(as));
                    Simbolo aux1 = null;
                    for(Simbolo bep : c){
                        System.out.println(bep.getS());
                        if(bep.getS().equals(EPSILON)){
                            aux1 = bep;
                        }
                    }
                    c.remove(aux1);
                }
                
            }else if(tam == 3){
                c.addAll(Follow(ladoDer.get(0)));
            }
         }
         
         return c;
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
}
