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
    public ArrayList<Simbolo> regla;
    static final String EPSILON = "\u03B5";

    public Regla() {
        regla = new ArrayList<>();
    }
    
    public Regla(ArrayList<Simbolo> regla) {
        this.regla = regla;
    }
    
    public void agregarSimbolo(String s, boolean terminal, int token){
        Simbolo nuevo = new Simbolo(s, terminal, token);
        this.regla.add(nuevo);
    }
    
    public void agregarRegla(ArrayList<Simbolo> r, ArrayList<Regla> reglas ){
        Regla nueva = new Regla(r);
        reglas.add(nueva);
    }

    public ArrayList<Simbolo> getRegla() {
        return regla;
    }
    
    /*public void ReglasPrueba(){
        ArrayList<Regla> reglas = new ArrayList<>();
        ArrayList<Simbolo> c1 = new ArrayList<>();
        ArrayList<Simbolo> c2 = new ArrayList<>();
        ArrayList<Simbolo> c22 = new ArrayList<>();
        ArrayList<Simbolo> c3 = new ArrayList<>();
        ArrayList<Simbolo> c4 = new ArrayList<>();
        ArrayList<Simbolo> c41 = new ArrayList<>();
        ArrayList<Simbolo> c5 = new ArrayList<>();
        ArrayList<Simbolo> c51 = new ArrayList<>();
        agregarSimbolo("E", false, 10, c1);
        agregarSimbolo("T", false, 30, c1);
        agregarSimbolo("E'", false, 40, c1);
        agregarRegla(c1, reglas);
        agregarSimbolo("E'", false, 40, c2);
        agregarSimbolo("+", true, 60, c2);
        agregarSimbolo("T", false, 30, c2);
        agregarSimbolo("E'", false, 40, c2);
        agregarRegla(c2, reglas);
        agregarSimbolo("E'", false, 40, c22);
        agregarSimbolo(EPSILON, false, 50, c22);
        agregarRegla(c22, reglas);
        agregarSimbolo("T", false, 30, c3);
        agregarSimbolo("F", false, 70, c3);
        agregarSimbolo("T'", false, 80, c3);
        agregarRegla(c3, reglas);
        agregarSimbolo("T'", false, 80, c4);
        agregarSimbolo("*", true, 90, c4);
        agregarSimbolo("F", false, 70, c4);
        agregarSimbolo("T'", false, 80, c4);
        agregarRegla(c4, reglas);
        agregarSimbolo("T'", false, 80, c41);
        agregarSimbolo(EPSILON, false, 50, c41);
        agregarRegla(c41, reglas);
        agregarSimbolo("F", false, 70, c5);
        agregarSimbolo("(", true, 100, c5);
        agregarSimbolo("E", false, 10, c5);
        agregarSimbolo(")", true, 110, c5);
        agregarRegla(c5, reglas);
        agregarSimbolo("F", false, 70, c51);
        agregarSimbolo("id", true, 120, c51);
        agregarRegla(c51, reglas);
        this.reglas = reglas;
        imprimirReglas();
    }*/
    
    /*public void imprimirReglas(){
        for (Regla reg : reglas) {
            System.out.println("\n --Regla--");
            for (int i = 0; i < reg.getRegla().size(); i++) {
                System.out.print(reg.getRegla().get(i).getS()+" ");
            }
        }
        
    }
    
    public void imprimirSimbolos(ArrayList<Simbolo> regla){
        for (Simbolo simbolo : regla)
            System.out.println(simbolo.getS());
    }*/
    
}
