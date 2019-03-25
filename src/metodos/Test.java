/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;

/**
 *
 * @author sebas
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        AFN mas = new AFN('+', 10);
        AFN menos = new AFN('-', 20);
        AFN producto = new AFN('*', 30);
        AFN division = new AFN('/', 40);
        AFN par_izq = new AFN('(', 50);
        AFN par_der = new AFN(')', 60);
        AFN simb9 = new AFN();
        simb9.AfnBasico('0', '9', 70);
        /*AFN or = new AFN('|', 10);
        AFN conc = new AFN('&', 20);
        AFN pos = new AFN('+', 30);
        AFN kleen = new AFN('*', 40);
        AFN opc = new AFN('?', 50);
        AFN par_izq = new AFN('(', 60);
        AFN par_der = new AFN(')', 70);
        
        //Empezar con los simbolos
        
        AFN simb1 = new AFN('\\', 80);
        AFN simb2 = new AFN('\\', 80);
        AFN simb3 = new AFN('\\', 80);
        AFN simb4 = new AFN('\\', 80);
        AFN simb5 = new AFN('\\', 80);
        AFN simb6 = new AFN('\\', 80);
        AFN simb7 = new AFN();
        simb7.AfnBasico('a', 'z', 80);
        AFN simb8 = new AFN();
        simb8.AfnBasico('A', 'Z', 80);
        AFN simb9 = new AFN();
        simb9.AfnBasico('0', '9', 80);
        
        AFN ors = new AFN('|', 80);
        AFN concs = new AFN('&', 80);
        AFN poss = new AFN('+', 80);
        AFN kleens = new AFN('*', 80);
        AFN opcs = new AFN('?', 80);
        AFN par_izqs = new AFN('(', 80);
        AFN par_ders = new AFN(')', 80);
        
        simb1.ConcatenarAFN(poss);
        simb2.ConcatenarAFN(kleens);
        simb3.ConcatenarAFN(opcs);
        simb4.ConcatenarAFN(par_izqs);
        simb5.ConcatenarAFN(par_ders);
        simb6.ConcatenarAFN(ors);
        
        simb1.UnirAFN(simb2);
        simb1.UnirAFN(simb3);
        simb1.UnirAFN(simb4);
        simb1.UnirAFN(simb5);
        simb1.UnirAFN(simb6);
        simb1.UnirAFN(simb7);
        simb1.UnirAFN(simb8);
        simb1.UnirAFN(simb9);
        */
        HashSet<AFN> hs = new HashSet<>();
        AFN c = new AFN();
        hs.clear();
        hs.add(mas);
        hs.add(menos);
        hs.add(producto);
        hs.add(division);
        hs.add(par_izq);
        hs.add(par_der);
        hs.add(simb9);
        
        c = AFN.UnirLexico(hs);

        System.out.println("no. Edos" + c.Estados.size());
        
        System.out.println("Alfabeto: ");
        for(char car : c.Alfabeto)
            System.out.print(car + " ");
        
        for(Estado e : c.Estados){
            
            for(Transicion t : e.Transiciones){
                if(e.EdoAcep>-1){
                    System.out.println(e.IdEdo + " Estado de aceptacion");
                }
                else if(t.Maxsimb == c.EPSILON || t.Minsimb == c.EPSILON){
                    System.out.print("\nDe " + e.IdEdo + " con ");
                    System.out.println("Epsilon ->" + t.estado.IdEdo);
                }else{
                    System.out.print("\nDe " + e.IdEdo + " con ");
                    System.out.println(t.Minsimb + " - " + t.Maxsimb + "->" + t.estado.IdEdo);
                }
            }
        }
        for(Estado e : c.EdosAcept)
            System.out.println("Estado de aceptacion:" + e.IdEdo);
        /*System.out.println("Cerradura epsilon");
        for(Estado e : c.CerraduraEpsilon(0)){
            System.out.println(e.IdEdo);
        }
        System.out.println("Mover");
        for(Estado e : c.Mover(0, 'a')){
            System.out.println(e.IdEdo);
        }
        */
        System.out.println("****************************");
        System.out.println("Conversión AFD");
        AFD afd = new AFD();
        afd = c.ConvertirAFD();
        
        for(Estado e : afd.Estados){
            for(Transicion t : e.Transiciones){
                System.out.print("\nDe " + e.IdEdo + " con ");
                System.out.println(t.Minsimb + " - " + t.Maxsimb + "->" + t.estado.IdEdo);
            }
        }
        for(Estado e : afd.EdosAcept)
            System.out.println("Estado de aceptacion:" + e.IdEdo);
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("crearafnCal.afd"));
        oos.writeObject(afd);
        oos.flush();
        oos.close();
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("crearafnCal.afd"));
        AFD afdf = (AFD)ois.readObject();
        ois.close();
        /*Lexico lexic = new Lexico(afd, "a*\\*\\+");
        int i = 1;
        int token = -1;
        while((token=lexic.getToken())!=0){
            System.out.println("*****************Token "+ i +" = " + token);
            i++;
        }
        
        System.out.println("*****************Token "+ i +" = " + token);*/
       /* Sintactico s = new Sintactico(afdf, "(a|b|c|C)*");
        Estado.restartState();
        AFN l = new AFN();
        System.out.println(s.E(l));
        for(char car : l.Alfabeto)
            System.out.print(car + " ");
        System.out.println(" ");
        for(Estado e : l.Estados){
            
            if(e.EdoAcep>-1){
                System.out.println(e.IdEdo + " Estado de aceptacion");
            }
            
            for(Transicion t : e.Transiciones){
                
                if(t.Maxsimb == l.EPSILON || t.Minsimb == l.EPSILON){
                    System.out.print("\nDe " + e.IdEdo + " con ");
                    System.out.println("Epsilon ->" + t.estado.IdEdo);
                }else{
                    System.out.print("\nDe " + e.IdEdo + " con ");
                    System.out.println(t.Minsimb + " - " + t.Maxsimb + "->" + t.estado.IdEdo);
                }
                
            }
        }*/
        
        Calculadora calcu = new Calculadora(afd, "1+1*2");
        System.out.println("El resultado es:" + calcu.resultado + " Postfijo: " + calcu.postfijo);
    }
    
}
