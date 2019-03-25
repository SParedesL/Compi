/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;


/**
 *
 * @author jafet
 */
public class Calculadora {
    Lexico lexic;
    int resultado;
    
    public Calculadora(AFD a, String sigma) {
         resultado = 0; 
         lexic = new Lexico(a, sigma);
         E();
    }
    
    
    public boolean E(){
        System.out.println("Estoy entrando a E");
        if(T())
            if(Ep())
                return true;
        return false;
    }
    
    public boolean Ep(){
        System.out.println("Estoy entrando a Ep");
        int token;
        token = lexic.getToken();
        System.out.println("Token EP: " + token);
        if(token == 10 || token == 20){
            if(T()){
                if(token == 10){
                    System.out.println(lexic.getLexema());
                    resultado = resultado + Integer.parseInt(lexic.getLexema() + "");
                    System.out.println("RESULTADO MÁS: "+resultado);
                }
                else{
                    System.out.println(lexic.getLexema());
                    resultado = resultado - Integer.parseInt(lexic.getLexema() + "");
                    System.out.println("RESULTADO MENOS: "+resultado);
                }
                if(Ep()){
                    return true;
                }
                return false;
            }
                
        }
        lexic.regresarToken();
        return true;
    }
    
    public boolean T(){
        System.out.println("Estoy entrando a T");
        if(F())
            if(Tp())
                return true;
        return false;
    }
    
    public boolean Tp(){
        System.out.println("Estoy entrando a Tp");
        int token;
        token = lexic.getToken();
        System.out.println("Token TP: " + token);
        if(token == 30 || token == 40){
            System.out.println(lexic.getLexema());
            if(F()){
                if(token == 30){
                    resultado = resultado * Integer.parseInt(lexic.getLexema() + "");
                    System.out.println("RESULTADO MULTI: "+resultado);
                }
                else{

                    resultado = resultado / Integer.parseInt(lexic.getLexema() + "");
                    System.out.println("RESULTADO DIV: "+resultado);
                }
                if(Tp()){
                    return true;
                }
            }
            return false;
        }
        lexic.regresarToken();
        return true;
    }
    
    public boolean F(){
        System.out.println("Estoy entrando a F");
        int token;
        token = lexic.getToken();
        System.out.println("Token F: " + token);
        switch(token){
            case 50:
                System.out.println(lexic.getLexema());
                if(E()){
                   token = lexic.getToken();
                   System.out.println(lexic.getLexema());
                   if(token == 60)
                       return true;
                }
                return false;
            case 70:
                System.out.println(lexic.getLexema());
                return true;
        }
        return true;
    }
    
}
