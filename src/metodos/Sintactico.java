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
public class Sintactico {
    Lexico lexic;
    
    public Sintactico(AFD a, String sigma) {
        lexic = new Lexico(a,sigma);
    }
    
    public boolean T(AFN f){
        System.out.println("Estoy en T");
        if(C(f))
            if(Tp(f))
                return true;
        return false;
    }
    
    public boolean C(AFN f){
        System.out.println("Estoy en C");
        if(F(f))
            if(Cp(f))
                return true;
        return false;
    }
    
    public boolean Cp(AFN f){
        System.out.println("Estoy en C prima");
        int token; 
        token = lexic.getToken();
        switch(token){
            case 40:
                f.CerraduraEstrella();
                if(Cp(f))
                    return true;
                return false;
            case 30: 
                f.CerraduraPositiva();
                if(Cp(f))
                    return true;
                return false;
            case 50: 
                f.Opcional();
                if(Cp(f))
                    return true;
                return false;
        }
        lexic.regresarToken();
        return true;
    }
    
    public boolean Tp(AFN f){
        System.out.println("Estoy en T prima");
        int token;
        AFN f1 = new AFN();
        token = lexic.getToken();
        if(token == 20){
            if(C(f1)){
                f = f.ConcatenarAFN(f1);
                if(Tp(f))
                    return true;
            }
            return false;
        }
        lexic.regresarToken();
        return true;
    }
    
    public boolean F(AFN f){
        System.out.println("Estoy en F");
        int token;
        token = lexic.getToken();
        switch(token){
            case 60:
                if(E(f)){
                    token = lexic.getToken();
                    if(token == 70)
                        return true;
                }
                return false;
            case 80:
                System.out.println("Basico de... " + lexic.getLexema());
                f.AfnBasico(lexic.getLexema(), 80);
                return true;
        }       
        return false;
    }
    
    public boolean E(AFN f){
        System.out.println("Estoy en E");
        if(T(f))
            if(Ep(f))
                return true;
        return false;
    }
   
    public boolean Ep(AFN f){
        System.out.println("Estoy en E prima");
        int token;
        AFN f1 = new AFN();
        token = lexic.getToken();
        if(token == 10){
            if(T(f1)){
                f = f.UnirAFN(f1);
                if(Ep(f))
                    return true;
            }
            return false;
        }
        lexic.regresarToken();
        return true;
    }
    
}
