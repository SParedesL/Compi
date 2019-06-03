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
public class Celda {
    
    public String columna;
    public String fila;
    public String valor;
    public int noReg;

    public Celda(String columna, String fila, String valor, int noReg) {
        this.columna = columna;
        this.fila = fila;
        this.valor = valor;
        this.noReg = noReg;
    }

    public String getColumna() {
        return columna;
    }

    public String getFila() {
        return fila;
    }

    public String getValor() {
        return valor;
    }
    
    public int getNoReg() {
        return noReg;
    }
    
}
