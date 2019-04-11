/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Stack;

/**
 *
 * @author sebas
 */
public class Lexico {
    AFD a;
    Estado edo;
    String sigma;
    int iniLexema, finLexema;
    Stack<Integer> pila = new Stack<>();

    public Lexico() {
    }

    public Lexico(AFD a, String sigma) {
        this.a = a;
        this.edo = a.EdoIni;
        this.sigma = sigma;
        this.iniLexema = 0;
        this.finLexema = 0;
        this.pila.clear();
    }
    
    public int getToken(){
        int token=-1;
        //System.out.println("Inicio Lexema antes de buscar transicion = " + iniLexema);
        pila.push(iniLexema);
        if(finLexema==sigma.length())
            return 0;
        
        while(sigma.length() > finLexema){
            if(a.Mover(edo, sigma.charAt(finLexema))!=null){
                edo = a.Mover(edo, sigma.charAt(finLexema));
                finLexema++;
                /*System.out.println("Inicio Lexema = " + iniLexema);
                System.out.println("Fin lexema = " + finLexema);
                System.out.println("Lexema = " + sigma.substring(iniLexema, finLexema));
                System.out.println(edo.EdoAcep);*/
                if(edo.EdoAcep>-1){
                    token = edo.EdoAcep;
                }
            }else{
                iniLexema = finLexema;
                edo = a.EdoIni;
                /*System.out.println("Sin transicion\nInicio Lexema = " + iniLexema);
                System.out.println("Fin lexema = " + finLexema);*/
                break;
            }
        }
        return token;
    }
    
    public void regresarToken(){
        this.iniLexema = pila.pop();
        System.out.println("Regresar token! = " + iniLexema);
        this.finLexema = this.iniLexema;
    }
    
    public char getLexema(){
        return sigma.charAt(pila.peek());
    }
    
    public void GetEdo(Lexico l){
        l.iniLexema = this.iniLexema;
        l.finLexema = this.finLexema;
        l.edo = this.edo;
        l.a = this.a;
    }
    
    public void SetEdo(Lexico l){
        iniLexema = l.iniLexema;
        finLexema = l.finLexema;
        edo = l.edo;
        a = l.a;
    }
}
