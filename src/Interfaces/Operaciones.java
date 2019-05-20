
package Interfaces;

import metodos.AFD;
import metodos.AFN;
import metodos.Lexico;
import javax.swing.JOptionPane;
import metodos.Calculadora;

public class Operaciones extends javax.swing.JFrame {
    int [] indicesO;
    public Operaciones() {
        initComponents();
        indicesO = new int [2];

        for(AFN a : Main2.automatas){
            jComboBox1.addItem(a.getStringId());
            jComboBox2.addItem(a.getStringId());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Automata base");

        jLabel3.setText("Automata auxiliar");

        jLabel1.setText("SELECCIONA AUTOMATAS A OPERAR");

        jButton1.setText("OPERAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int operacion = Main2.operacion;
                
                indicesO[0] = jComboBox1.getSelectedIndex();
                indicesO[1] = jComboBox2.getSelectedIndex();
                
                AFN AutA = null;
                AFN AutB = null;
                
                if(operacion ==1 || operacion ==2 || operacion ==3 || operacion ==4 || operacion ==5 ||
                        operacion ==6){
                AutA = Main2.automatas.get(indicesO[0]);
                AutB = Main2.automatas.get(indicesO[1]);
                }

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
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public static javax.swing.JComboBox<String> jComboBox1;
    public static javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
