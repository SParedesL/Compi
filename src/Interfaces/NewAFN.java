
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import metodos.AFN;
import javax.swing.JOptionPane;

/**
 *
 * @author Ana Luisa
 */
public class NewAFN extends javax.swing.JFrame {

    /**
     * Creates new form NewAFN
     */
    public NewAFN() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ButtonCrear = new javax.swing.JButton();
        jTextFieldCadena = new javax.swing.JTextField();
        jTextFieldToken = new javax.swing.JTextField();
        jTextFieldCadena1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        jLabel2.setText("Ingresa los valores solicitados para crear tu autómata básic");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 11, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        jLabel3.setText("Valor de token");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        ButtonCrear.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        ButtonCrear.setText("CREAR");
        ButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCrearActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        jTextFieldCadena.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldCadena.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        jPanel1.add(jTextFieldCadena, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 108, 29));

        jTextFieldToken.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldToken.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        jPanel1.add(jTextFieldToken, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 140, 29));

        jTextFieldCadena1.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldCadena1.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        jPanel1.add(jTextFieldCadena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 98, 29));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        jLabel6.setText("Cadena de derivacion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel1.setText("la final en el derecho Sí solo necesitas una cadena en blanco el campo derecho");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 420, -1));

        jLabel7.setText("Si ocupas un rango ingresa la cadena inicial en el campo izquierdo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, -1));

        jLabel5.setText("Ingresa un valor entero diferente para cada token");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCrearActionPerformed
        if(jTextFieldCadena1.getText().isEmpty()){
            String cadena1 = jTextFieldCadena.getText();
            String token = jTextFieldToken.getText();
            int tok = Integer.parseInt(token);
            char ch = cadena1.charAt(0);
            AFN nuevoAut = new AFN(ch,tok);
            Main2.automatas.add(nuevoAut);
            Main2.modelo.addElement(cadena1);
            JOptionPane.showMessageDialog(null, "¡Automata creado exitosamente! con nombre:"+cadena1+"y número de token: "+token);
            dispose();
        }
        else{
           String cadena1 = jTextFieldCadena.getText();
           String cadena2 = jTextFieldCadena1.getText();
           char s1 = cadena1.charAt(0); //Solo primer caracter
           char s2 = cadena2.charAt(0); //Solo primer caracter
           String token = jTextFieldToken.getText();
           int tok = Integer.parseInt(token);
           char ch = cadena1.charAt(0);  
           AFN aux = new AFN();
           aux.AfnBasico(s1, s2, tok);
           Main2.automatas.add(aux);
            Main2.modelo.addElement(cadena1);
            JOptionPane.showMessageDialog(null, "¡Automata creado exitosamente! con rango de:"+s1+ "a" +s2+ "y un token de"+token);
            dispose();
        }
    }//GEN-LAST:event_ButtonCrearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCadena;
    private javax.swing.JTextField jTextFieldCadena1;
    private javax.swing.JTextField jTextFieldToken;
    // End of variables declaration//GEN-END:variables
}