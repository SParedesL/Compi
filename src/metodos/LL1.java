/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author jafet
 */
public class LL1 {
     public static ArrayList<Regla> reglas;
     static final String EPSILON = "\u03B5";
     public Gramatica G;

    public LL1() {
    }
     
     public static void main(String[] args) {
        Regla r = new Regla();
        LL1 l = new LL1();
        ArrayList<Simbolo> aux = new ArrayList<>();
        HashSet<Simbolo> aux2 = new HashSet<>();
        r.ReglasPrueba();
        reglas = r.reglas;
        aux = reglas.get(6).getRegla();
         System.out.println("\n Regla que vamos a analizar: ");
         for (Simbolo simbolo : aux) 
             System.out.print(simbolo.getS()+" ");
         
         System.out.println("First de "+aux.get(0).getS()+": \n");
         aux2 = l.First(aux);
         System.out.print("{ ");
         for (Simbolo simbolo : aux2) 
            System.out.print(simbolo.getS()+" ");
         System.out.print("}"+"\n");
         
         System.out.println("Follow de "+aux.get(0).getS()+": \n");
         HashSet<Simbolo> aux3 = new HashSet<>();
         aux3 = l.Follow(aux.get(0));
         System.out.print("{");
         for (Simbolo simbolo : aux3) 
           System.out.print(simbolo.getS()+" ");
         System.out.print("}"+"\n");
        
    }
     
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
         //System.out.println("Entre a follow con simbolo " + simbNT.getS());
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
                //System.out.println("Estoy en follow (4) con este simbolo: " + simbNT.getS() + ladoDer.get(3).getS());
                
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
                
                /*System.out.print("\n 2° Conjunto c: " );
                for (Simbolo simbolo : c) 
                    System.out.print(simbolo.getS()+" ");*/
         
                
            }else if(tam == 3){
                //System.out.println("Estoy en follow (3) con este simbolo: " + simbNT.getS() + ladoDer.get(0).getS());
                c.addAll(Follow(ladoDer.get(0)));
            }
         }
         
         return c;
     }
    
    public ArrayList<Regla> buscarSimbolo(Simbolo sim, boolean izq){
        ArrayList<Regla> aux = new ArrayList<>();
        for (Regla reg : reglas) {
            if(reg.getRegla().get(0).getS().equals(sim.getS()) && izq)
                aux.add(reg);
            else if(!izq){
                for (int i = 1; i < reg.getRegla().size(); i++) {
                    if(reg.getRegla().get(i).getS().equals(sim.getS()))
                        aux.add(reg);
                }
            }
                
        }
        return aux;
    }
     
     
     
     
     
     
     
     
}
