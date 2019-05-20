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
    Lexico lexic;
    
    public void generadorGramaticas(AFD a, String sigma){
        lexic = new Lexico(a, sigma);
        if(G())
            System.out.println("Cadena Válida!");
        else
            System.out.println("Cadena Inválida!");
        
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
    
}
