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
    public ArrayList<Regla> reglas;
    static final String EPSILON = "\u03B5";
    public Lexico lexic;
    public Simbolo s = new Simbolo();
    
    public Gramatica(){
        reglas = new ArrayList<>();
        ReglasPrueba();
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
        Regla c1 = new Regla(1);
        Regla c2 = new Regla(2);
        Regla c22 = new Regla(3);
        Regla c3 = new Regla(4);
        Regla c4 = new Regla(5);
        Regla c41 = new Regla(6);
        Regla c5 = new Regla(7);
        Regla c51 = new Regla(8);
        Simbolo E = s.crearSimbolo("E", false, 10);
        Simbolo T = s.crearSimbolo("T", false, 30);
        Simbolo Ep = s.crearSimbolo("E'", false, 40);
        c1.agregarSimbolo(E);
        c1.agregarSimbolo(T);
        c1.agregarSimbolo(Ep);
        reglas.add(c1);
        c2.agregarSimbolo(Ep);
        Simbolo mas = s.crearSimbolo("+", true, 60);
        c2.agregarSimbolo(mas);
        c2.agregarSimbolo(T);
        c2.agregarSimbolo(Ep);
        reglas.add(c2);
        c22.agregarSimbolo(Ep);
        Simbolo e = s.crearSimbolo(EPSILON, false, 50);
        c22.agregarSimbolo(e);
        reglas.add(c22);
        c3.agregarSimbolo(T);
        Simbolo F = s.crearSimbolo("F", false, 70);
        Simbolo Tp = s.crearSimbolo("T'", false, 80);
        c3.agregarSimbolo(F);
        c3.agregarSimbolo(Tp);
        reglas.add(c3);
        c4.agregarSimbolo(Tp);
        Simbolo ast = s.crearSimbolo("*", true, 90);
        c4.agregarSimbolo(ast);
        c4.agregarSimbolo(F);
        c4.agregarSimbolo(Tp);
        reglas.add(c4);
        c41.agregarSimbolo(Tp);
        c41.agregarSimbolo(e);
        reglas.add(c41);
        c5.agregarSimbolo(F);
        Simbolo parizq = s.crearSimbolo("(", true, 100);
        c5.agregarSimbolo(parizq);
        c5.agregarSimbolo(E);
        Simbolo parder = s.crearSimbolo(")", true, 110);
        c5.agregarSimbolo(parder);
        reglas.add(c5);
        c51.agregarSimbolo(F);
        Simbolo id = s.crearSimbolo("id", true, 120);
        c51.agregarSimbolo(id);
        reglas.add(c51);
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
        
         if(reglas.get(0).getRegla().get(0).getS().equals(simbNT.getS()))
             c.add(pesos);
         
         for (Regla regla : aux) {
            ArrayList<Simbolo> ladoDer = regla.getRegla();
            int tam = ladoDer.size();
            if(tam == 4){
                for (Regla reg : buscarSimbolo(ladoDer.get(3), true)) 
                    c.addAll(First(reg.getRegla()));
         
                if(c.contains(EPSILON)){
                    c.remove(EPSILON);
                    c.addAll(Follow(ladoDer.get(0)));
                }
            }else if(tam == 3)
                Follow(ladoDer.get(0));
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
