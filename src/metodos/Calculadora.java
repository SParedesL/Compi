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
        if(T())
            if(Ep())
                return true;
        return false;
    }
    
    public boolean Ep(){
        int token;
        token = lexic.getToken();
        if(token == 10 || token == 20){
            if(T())
                if(Ep()){
                    if(token == 10)
                        resultado = sumar(lexic.sigma);
                    else
                        resultado = restar(lexic.sigma);
                    return true;
                }return false;
        }
        lexic.getToken();
        return true;
    }
    
    public boolean T(){
        if(F())
            if(Tp()){
                return true;
            }
        return false;
    }
    
    public boolean Tp(){
        int token;
        token = lexic.getToken();
        if(token == 30 || token == 40){
            if(F())
                if(Tp()){
                    if(token == 30)
                        resultado = multiplicar(lexic.sigma);
                    else
                        resultado = dividir(lexic.sigma);
                    return true;
                }
            return false;
        }
        lexic.getToken();
        return true;
    }
    
    public boolean F(){
        int token;
        token = lexic.getToken();
        switch(token){
            case 50:
                if(E()){
                   token = lexic.getToken();
                   if(token == 60)
                       return true;
                }
                return false;
            case 70:
                return true;
        }
        return true;
    }
    
    public int sumar(String cadena){
        String partes[];
        int izq, der;
        partes = cadena.split("/+");
        izq = Integer.parseInt(partes[0]);
        der = Integer.parseInt(partes[1]);
        return izq+der;
    }
    
    public int restar(String cadena){
        String partes[];
        int izq, der;
        partes = cadena.split("/-");
        izq = Integer.parseInt(partes[0]);
        der = Integer.parseInt(partes[1]);
        return izq-der;
    }
    
    public int multiplicar(String cadena){
        String partes[];
        int izq, der;
        partes = cadena.split("/*");
        izq = Integer.parseInt(partes[0]);
        der = Integer.parseInt(partes[1]);
        return izq*der;
    }
    
    public int dividir(String cadena){
        String partes[];
        int izq, der;
        partes = cadena.split("/");
        izq = Integer.parseInt(partes[0]);
        der = Integer.parseInt(partes[1]);
        return izq/der;
    }
    
}
