/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Objects;

/**
 *
 * @author sebas
 */
public class Simbolo {
    private String s;
    private boolean terminal;
    static final String EPSILON = "\u03B5";
    private int token;

    public Simbolo(String s, boolean terminal, int token) {
        this.s = s;
        this.terminal = terminal;
        this.token = token;
    }

    public Simbolo() {
    }
    
    
    
    public String getS() {
        return s;
    }

    public boolean isTerminal() {
        return terminal;
    }
    

    public int getToken() {
        return token;
    }
    
    public Simbolo crearSimbolo(String s, boolean terminal, int token){
        Simbolo nvo = new Simbolo(s, terminal, token);
        return nvo;
    }

    
}
