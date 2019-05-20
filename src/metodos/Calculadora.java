/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.concurrent.atomic.AtomicInteger;


/**
 *
 * @author jafet
 */
public class Calculadora {
    Lexico lexic;
    public AtomicInteger resultado = new AtomicInteger();
    public StringBuffer postfijo = new StringBuffer();
    
    public Calculadora(AFD a, String sigma) {
        lexic = new Lexico(a, sigma);
        E(resultado, postfijo);
    }
    
    
    public boolean E(AtomicInteger r, StringBuffer p){
        if(T(r, p))
            if(Ep(r, p))
                return true;
        return false;
    }
    
    public boolean Ep(AtomicInteger r, StringBuffer p){
        int token;
        AtomicInteger r1 = new AtomicInteger();
        StringBuffer p1=new StringBuffer();
        token = lexic.getToken();
        if(token == 10 || token == 20){
            if(T(r1, p1)){
                if(token == 10){
                    r.set(r.get() + r1.get());
                    p.append(p1.append("+"));
                }
                else{
                    r.set(r.get() - r1.get());
                    p.append(p1.append("-"));
                }
                if(Ep(r, p1)){
                    return true;
                }
                return false;
            }
                
        }
        lexic.regresarToken();
        return true;
    }
    
    public boolean T(AtomicInteger r, StringBuffer p){
        if(F(r, p))
            if(Tp(r, p))
                return true;
        return false;
    }
    
    public boolean Tp(AtomicInteger r, StringBuffer p){
        int token;
        AtomicInteger r1 = new AtomicInteger();
        StringBuffer p1 = new StringBuffer();
        token = lexic.getToken();
        if(token == 30 || token == 40){
            if(F(r1, p1)){
                if(token == 30){
                    r.set(r.get() * r1.get());
                    p.append(p1.append("*"));
                }
                else{
                    r.set(r.get() / r1.get());
                    p.append(p1.append("/"));
                }
                if(Tp(r, p1)){
                    return true;
                }
            }
            return false;
        }
        lexic.regresarToken();
        return true;
    }
    
    public boolean F(AtomicInteger r, StringBuffer p){
        int token;
        token = lexic.getToken();
        switch(token){
            case 50:
                if(E(r, p)){
                   token = lexic.getToken();
                   if(token == 60)
                       return true;
                }
                return false;
            case 70:
                r.set(Integer.parseInt(lexic.getLexema()+""));
                p.append(lexic.getLexema());
                return true;
        }
        return true;
    }
    
}
