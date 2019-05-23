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
 * @author sebas
 */
public class Gramatica {
    ArrayList<Regla> reglas;
    HashSet<Simbolo> terminales, noTerminales;
    static final String EPSILON = "\u03B5";
    Lexico lexic;
    
    public Gramatica(){
        reglas = new ArrayList<>();
    }
    
    public void generadorGramaticas(AFD a, String sigma){
        lexic = new Lexico(a, sigma);
        if(G())
            System.out.println("Cadena Válida!");
        else
            System.out.println("Cadena Inválida!");
        
    }

    public ArrayList<Regla> getReglas() {
        return reglas;
    }
    
    boolean G(){
        if(ListaReglas())
            return true;
        return false;
    }
    
    boolean ListaReglas(){
        Lexico E = new Lexico();
        int tok;
        if(Regla()){
            tok = lexic.getToken();
            if(tok == 200){
                lexic.GetEdo(E);
                if(ListaReglas())
                    return true;
                lexic.SetEdo(E);
                return true;
            }
        }
        return false;
    }
    
    boolean ListaLadosDerecho(){
        int tok;
        if(LadoDerecho()){
            tok = lexic.getToken();
            if(tok == 300){
                if(ListaLadosDerecho())
                    return true;
                return false;
            }
            lexic.regresarToken();
            return true;
        }
        return false;
    }
    
    boolean Regla(){
        int tok;
        if(LadoIzq()){
            tok = lexic.getToken();
            if(tok == 400){
                if(ListaLadosDerecho())
                    return true;
            }
        }
        return false;
    }
    
    boolean LadoIzq(){
        int tok;
        tok = lexic.getToken();
        if(tok == 100)
            return true;
        return false;
    }
    
    boolean LadoDerecho(){
        if(ListaSimbolos())
            return true;
        return false;
    }
    
    boolean ListaSimbolos(){
        Lexico E = new Lexico();
        int tok;
        tok = lexic.getToken();
        if(tok == 100){
            lexic.GetEdo(E);
            if(ListaSimbolos())
                return true;
            lexic.SetEdo(E);
            return true;
        }
        return false;
    }
    
    
    public void agregarregla(Regla r){
        reglas.add(r);
    }
    
    public void ReglasPrueba(){
        Regla r = new Regla();
        Regla c1 = new Regla();
        Regla c2 = new Regla();
        Regla c22 = new Regla();
        Regla c3 = new Regla();
        Regla c4 = new Regla();
        Regla c41 = new Regla();
        Regla c5 = new Regla();
        Regla c51 = new Regla();
        c1.agregarSimbolo("E", false, 10);
        c1.agregarSimbolo("T", false, 30);
        c1.agregarSimbolo("E'", false, 40);
        reglas.add(c1);
        c2.agregarSimbolo("E'", false, 40);
        c2.agregarSimbolo("+", true, 60);
        c2.agregarSimbolo("T", false, 30);
        c2.agregarSimbolo("E'", false, 40);
        reglas.add(c2);
        r.agregarSimbolo("E'", false, 40);
        r.agregarSimbolo(EPSILON, false, 50, c22);
        r.agregarRegla(c22, reglas);
        r.agregarSimbolo("T", false, 30, c3);
        r.agregarSimbolo("F", false, 70, c3);
        r.agregarSimbolo("T'", false, 80, c3);
        r.agregarRegla(c3, reglas);
        r.agregarSimbolo("T'", false, 80, c4);
        r.agregarSimbolo("*", true, 90, c4);
        r.agregarSimbolo("F", false, 70, c4);
        r.agregarSimbolo("T'", false, 80, c4);
        r.agregarRegla(c4, reglas);
        r.agregarSimbolo("T'", false, 80, c41);
        r.agregarSimbolo(EPSILON, false, 50, c41);
        r.agregarRegla(c41, reglas);
        r.agregarSimbolo("F", false, 70, c5);
        r.agregarSimbolo("(", true, 100, c5);
        r.agregarSimbolo("E", false, 10, c5);
        r.agregarSimbolo(")", true, 110, c5);
        r.agregarRegla(c5, reglas);
        r.agregarSimbolo("F", false, 70, c51);
        r.agregarSimbolo("id", true, 120, c51);
        r.agregarRegla(c51, reglas);
        imprimirReglas();
    }
    
    public void imprimirReglas(){
        for (Regla reg : reglas) {
            System.out.println("\n --Regla--");
            for (int i = 0; i < reg.getRegla().size(); i++) {
                System.out.print(reg.getRegla().get(i).getS()+" ");
            }
        }   
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
         HashSet<Simbolo> c = new HashSet<>();
         Simbolo pesos = new Simbolo("$", false, 200);
         ArrayList<Regla> aux = buscarSimbolo(simbNT, false);
         System.out.println(aux.size());
         
         System.out.println(reglas.get(0).getRegla().get(0).getS()+" Es igual a "+ simbNT.getS());
         if(reglas.get(0).getRegla().get(0).getS().equals(simbNT.getS()))
             c.add(pesos);
         
         System.out.print("\n Conjunto c: " );
         for (Simbolo simbolo : c) 
             System.out.print(simbolo.getS()+" ");
         
         for (Regla regla : aux) {
            ArrayList<Simbolo> ladoDer = regla.getRegla();
            int tam = ladoDer.size();
            if(tam == 4){
                for (Regla reg : buscarSimbolo(ladoDer.get(3), true)) 
                    c.addAll(First(reg.getRegla()));
                
                System.out.print("\n Conjunto c: " );
                for (Simbolo simbolo : c) 
                    System.out.print(simbolo.getS()+" ");
         
                if(c.contains(EPSILON)){
                    c.remove(EPSILON);
                    c.addAll(Follow(ladoDer.get(0)));
                }
            }else if(tam == 3)
                Follow(ladoDer.get(0));
                System.out.print("Conjunto c: " );
                for (Simbolo simbolo : c) 
                    System.out.print(simbolo.getS()+" ");
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
