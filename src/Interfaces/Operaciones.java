/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import metodos.AFD;
import metodos.AFN;
import metodos.Lexico;
import javax.swing.JOptionPane;
import metodos.Calculadora;

/**
 *
 * @author Ana Luisa
 */
public class Operaciones extends javax.swing.JFrame {

    int [] indicesO;

    public  Operaciones() {
        initComponents();
        indicesO = new int [2];

        for(AFN a : Main2.automatas){
            jComboBoxAut1.addItem(a.getStringId());
            jComboBoxAut2.addItem(a.getStringId());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxAut1 = new javax.swing.JComboBox<>();
        jComboBoxAut2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        jLabel2.setText("Selecciona los automatas a operar");

        jComboBoxAut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAut1ActionPerformed(evt);
            }
        });

        jComboBoxAut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAut2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        jLabel3.setText("Automata para operar");

        jLabel4.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        jLabel4.setText("Automata base");

        jButton2.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        jButton2.setText("OPERAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxAut1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jComboBoxAut2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAut1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAut2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jComboBoxAut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAut1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAut1ActionPerformed

    private void jComboBoxAut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAut2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAut2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            int operacion = Main2.operacion;
                
                indicesO[0] = jComboBoxAut1.getSelectedIndex();
                indicesO[1] = jComboBoxAut2.getSelectedIndex();


                AFN AutA = Main2.automatas.get(indicesO[0]);
                AFN AutB = Main2.automatas.get(indicesO[1]);


                switch(operacion){      
                    case 1:
                        AutA.UnirAFN(AutB);
                        break;
                    case 2:
                        AutA.ConcatenarAFN(AutB);
                        break;
                    case 3:
                        AutA.CerraduraPositiva();
                        break;
                    case 4:
                        AutA.CerraduraEstrella();
                        break;
                    case 5:
                        AutA.Opcional();
                        break;
                    case 6:
                        int name = indicesO[0] + 1;
                        AFD afd = new AFD();
                        afd = AutA.ConvertirAFD();
                        Main2.automatasAFD.add(afd);
                        Main2.modelo2.addElement("AFD "+name);
                        afd.setStringId(String.valueOf(name));
                        break;
                    case 7:
                        AFD AutAFD = Main2.automatasAFD.get(indicesO[0]);
                        String cadena = JOptionPane.showInputDialog(null, "Introduce la cadena a analizar");
                        Lexico lexic = new Lexico(AutAFD, cadena);
                        int i = 1;
                        int token;
                        while((token=lexic.getToken())!=0){
                            System.out.println("*****************Token "+ i +" = " + token);
                            System.out.println("Lexema: " + lexic.getLexema());
                            i++;
                            JOptionPane.showMessageDialog(null, "TOKEN"+ i +" = " + token+"\n"+"Lexema: " + lexic.getLexema() );
                        }
                        break;
                    case 8:
                        AFD AFDAx = Main2.automatasAFD.get(indicesO[0]);
                        String op = JOptionPane.showInputDialog(null, "Introduce la operación a realizar");
                        System.out.println("La operación que leo es: "+op);
                        //Ejemplo operación 1+1*2
                        Calculadora calcu = new Calculadora(AFDAx,op);
                        System.out.println("El resultado es:" + calcu.resultado + " Postfijo: " + calcu.postfijo);
                        JOptionPane.showMessageDialog(null, "RESULTADO"+ calcu.resultado +"\n"+"POSFIJO: " + calcu.postfijo );
                        break;
                    default:
                        System.out.println("error");
                        break;   

                }
            dispose();  
            JOptionPane.showMessageDialog(null, "¡La operación se ha concluido con exito!");
        
    }//GEN-LAST:event_jButton2ActionPerformed
    
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    public static javax.swing.JComboBox<String> jComboBoxAut1;
    public static javax.swing.JComboBox<String> jComboBoxAut2;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
