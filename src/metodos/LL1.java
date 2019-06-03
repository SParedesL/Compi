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
 * @author jafet
 */
public class LL1 {
    public Gramatica G;
    static final String EPSILON = "\u03B5";
    
    public LL1(Gramatica g) {
        this.G = g;
    }
     
    public static void main(String[] args) {
        HashSet<Simbolo> terminales = new HashSet<>(); 
        HashSet<Simbolo> noTerminales = new HashSet<>(); 
        HashSet<Celda> celdas = new HashSet<>();
        Gramatica gra = new Gramatica();
        LL1 l = new LL1(gra);
        l.generarConjuntos(terminales,noTerminales);
        celdas = l.analizarRegla(l.G.getReglas());
        l.imprimirCeldas(celdas);
                
    }   
    
    public void generarConjuntos(HashSet<Simbolo> t, HashSet<Simbolo> nt){
        Simbolo pesos = new Simbolo("$", false, 200);
        System.out.println("\n No. reglas:"+ G.reglas.size());
        for (Regla reg : G.reglas) {
            for (int i = 0; i < reg.getRegla().size(); i++) {
                if(reg.getRegla().get(i).isTerminal() && !reg.getRegla().get(i).getS().equals(EPSILON) )
                    t.add(reg.getRegla().get(i));
            }
            nt.add(reg.getRegla().get(0));
        }
        t.add(pesos);

    }
    
    
    public void imprimirSimbolos(HashSet<Simbolo> regla){
        for (Simbolo simbolo : regla)
            System.out.println(simbolo.getS());
    }
    
    public HashSet<Celda> analizarRegla(ArrayList<Regla> reglas){
        HashSet<Simbolo> firsts = new HashSet<>();
        HashSet<Simbolo> follows = new HashSet<>();
        HashSet<Celda> celdas = new HashSet<>();
        Celda cel = null;
        String cont = null;
        for (Regla reg : reglas) {
            cont = "";
            firsts = G.First(reg.getRegla());
            for (int i = 1; i < reg.getRegla().size(); i++) 
                 cont = cont+reg.getRegla().get(i).getS();
            
            for (Simbolo simb : firsts) {
                if(!simb.getS().equals(EPSILON)){
                    cel = new Celda(simb.getS(), reg.getRegla().get(0).getS(), cont , reg.getNoReg());
                    celdas.add(cel);
                }else{
                    follows = G.Follow(reg.getRegla().get(0));
                    for (Simbolo sim : follows) {
                        cel = new Celda(simb.getS(),reg.getRegla().get(0).getS(), EPSILON , reg.getNoReg());
                        celdas.add(cel);
                    }
                }
            }
        }
        return celdas;
    }
    
    public void imprimirCeldas(HashSet<Celda> celdas){
        for (Celda celda : celdas) 
            System.out.println("\n De "+celda.getFila()+" con "+celda.getColumna()+" es: ("+celda.getValor()+","+celda.getNoReg()+")");
    }
    
    
    
    public String[][] generarTabla(HashSet<Simbolo> t, HashSet<Simbolo> nt){
      int indice1                 =   0;
      int numeroFilas             =   t.size();
      int numeroColumnas          =   nt.size()+1;
      String [][]datos            =   new String[numeroFilas][numeroColumnas]; 
      
      
      return datos;
    }
    
}
