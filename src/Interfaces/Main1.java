
package Interfaces;

import afn.AFD;
import afn.AFN;
import afn.Lexico;
import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Main1 extends javax.swing.JFrame {

    private JScrollPane scrollTabla;
    ArrayList<AFN> automatas = new ArrayList<>();
    ArrayList<AFD> automatasAFD = new ArrayList<>();
    
    
    public Main1() {
        
        initComponents();
        scrollTabla               =   null;
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu7 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jButtonMostrarTabla = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButtonMostrarTablaAFD = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Crear = new javax.swing.JMenu();
        ItemNuevo = new javax.swing.JMenuItem();
        Operaciones = new javax.swing.JMenu();
        ItemUnir = new javax.swing.JMenuItem();
        ItemConcatenar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        ItemConvertir = new javax.swing.JMenuItem();
        Cerraduras = new javax.swing.JMenu();
        ItemPositiva = new javax.swing.JMenuItem();
        Estrella = new javax.swing.JMenuItem();
        Lexico = new javax.swing.JMenu();
        ItemAnalizar = new javax.swing.JMenuItem();
        ItemUnirLexic = new javax.swing.JMenuItem();

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Draw AFN");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setAlignmentX(2.0F);
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));

        jButtonMostrarTabla.setText("MOSTRAR AFN SELECCIONADO");
        jButtonMostrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarTablaActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        jLabel1.setText("AFN DISPONIBLES:");

        jLabel2.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        jLabel2.setText("AFD DISPONIBLES:");

        jComboBox2.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButtonMostrarTablaAFD.setText("MOSTRAR AFN SELECCIONADO");
        jButtonMostrarTablaAFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarTablaAFDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonMostrarTabla)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonMostrarTablaAFD, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMostrarTabla)
                    .addComponent(jButtonMostrarTablaAFD))
                .addGap(30, 30, 30))
        );

        jMenuBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 1, true));
        jMenuBar1.setToolTipText("");
        jMenuBar1.setFont(new java.awt.Font("Leelawadee", 0, 36)); // NOI18N

        Crear.setText("CREAR");
        Crear.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N

        ItemNuevo.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        ItemNuevo.setText("NUEVO");
        ItemNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNuevoActionPerformed(evt);
            }
        });
        Crear.add(ItemNuevo);

        jMenuBar1.add(Crear);

        Operaciones.setText("OPERACIONES");
        Operaciones.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N

        ItemUnir.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        ItemUnir.setText("UNIR");
        ItemUnir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemUnirActionPerformed(evt);
            }
        });
        Operaciones.add(ItemUnir);

        ItemConcatenar.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        ItemConcatenar.setText("CONCATENAR");
        ItemConcatenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemConcatenarActionPerformed(evt);
            }
        });
        Operaciones.add(ItemConcatenar);

        jMenuItem1.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        jMenuItem1.setText("OPCIONAL");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Operaciones.add(jMenuItem1);

        ItemConvertir.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        ItemConvertir.setText("AFN A AFD");
        ItemConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemConvertirActionPerformed(evt);
            }
        });
        Operaciones.add(ItemConvertir);

        jMenuBar1.add(Operaciones);

        Cerraduras.setBackground(new java.awt.Color(0, 0, 255));
        Cerraduras.setText("CERRADURAS");
        Cerraduras.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N

        ItemPositiva.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        ItemPositiva.setText("POSITIVA");
        ItemPositiva.setToolTipText("");
        ItemPositiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemPositivaActionPerformed(evt);
            }
        });
        Cerraduras.add(ItemPositiva);

        Estrella.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        Estrella.setText("ESTRELLA");
        Estrella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstrellaActionPerformed(evt);
            }
        });
        Cerraduras.add(Estrella);

        jMenuBar1.add(Cerraduras);

        Lexico.setText("LEXICO");
        Lexico.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N

        ItemAnalizar.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        ItemAnalizar.setText("ANALIZAR CADENA");
        ItemAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAnalizarActionPerformed(evt);
            }
        });
        Lexico.add(ItemAnalizar);

        ItemUnirLexic.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        ItemUnirLexic.setText("UNIR LEXICO");
        ItemUnirLexic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemUnirLexicActionPerformed(evt);
            }
        });
        Lexico.add(ItemUnirLexic);

        jMenuBar1.add(Lexico);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void ItemUnirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemUnirActionPerformed
        AFN AutA = new AFN();
        AFN AutB = new AFN();
      
        String pos = JOptionPane.showInputDialog(null, "Escribe la posicion del aut");
        int position = Integer.parseInt(pos.charAt(0)+"");
        
        AutA = automatas.get(position);
        
        String pos2 = JOptionPane.showInputDialog(null, "Escribe la posicion del aut");
        int position2 = Integer.parseInt(pos2.charAt(0)+"");
        AutB = automatas.get(position2);
        
        AutA.UnirAFN(AutB);
        
        
        
    }//GEN-LAST:event_ItemUnirActionPerformed

    private void ItemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNuevoActionPerformed
    
        String cad = JOptionPane.showInputDialog(null, "Cadena");
        char ch = cad.charAt(0);
        String tok = JOptionPane.showInputDialog(null, "Token:");
        int tokint = Integer.parseInt(tok);
        AFN nuevoAut = new AFN(ch,tokint);
        automatas.add(nuevoAut);
        jComboBox1.addItem(cad);
        
    }//GEN-LAST:event_ItemNuevoActionPerformed

    private void ItemConcatenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConcatenarActionPerformed
        AFN AutA = new AFN();
        AFN AutB = new AFN();
        
        String pos = JOptionPane.showInputDialog(null, "Escribe la posicion del aut");
        int position = Integer.parseInt(pos.charAt(0)+"");
        
        AutA = automatas.get(position);
        
        String pos2 = JOptionPane.showInputDialog(null, "Escribe la posicion del aut");
        int position2 = Integer.parseInt(pos2.charAt(0)+"");
        AutB = automatas.get(position2);
        
        AutA.ConcatenarAFN(AutB);
    }//GEN-LAST:event_ItemConcatenarActionPerformed

    private void ItemPositivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemPositivaActionPerformed
        AFN AutA = new AFN();
              
        String pos = JOptionPane.showInputDialog(null, "Escribe la posicion del aut");
        int position = Integer.parseInt(pos.charAt(0)+"");
        
        AutA = automatas.get(position);
        
        AutA.CerraduraPositiva();
    }//GEN-LAST:event_ItemPositivaActionPerformed

    private void EstrellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstrellaActionPerformed
        AFN AutA = new AFN();
              
        String pos = JOptionPane.showInputDialog(null, "Escribe la posicion del aut");
        int position = Integer.parseInt(pos.charAt(0)+"");
        
        AutA = automatas.get(position);
        
        AutA.CerraduraEstrella();
    }//GEN-LAST:event_EstrellaActionPerformed

    private void jButtonMostrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarTablaActionPerformed
        
        int positionSelected = (int)jComboBox1.getSelectedIndex();
        System.out.println("El ANF Seleccionado fue: " + positionSelected);
        AFN afnSelected = automatas.get(positionSelected); 
        
        System.out.println("Estamos usando el AFN: "+ afnSelected.getIdAFN());
        
        Object[][]  datos           =   afnSelected.generarTablaAcomodada();
        
        int index                   =   1;
        HashSet<Character> Alfabeto =   afnSelected.getAlfabeto();
        String  []titulos           =   new String[Alfabeto.size()+3];
        titulos[0]                  =   "ESTADO";
        
        for(Character c : Alfabeto){
        
            titulos[index]      =   Character.toString(c);
            index               ++;
        }
        
        titulos[index]        =   "E";
        titulos[index+1]      =   "Aceptacion";
        
        if(this.scrollTabla   != null)
            this.jPanel1.remove(this.scrollTabla);
        
        JTable tabla          =   new JTable(datos,titulos);
        scrollTabla           = new JScrollPane(tabla);
        scrollTabla.setBounds(50,20,500,250);
        this.jPanel1.add(scrollTabla);
        this.jPanel1.repaint();
        
    }//GEN-LAST:event_jButtonMostrarTablaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AFN AutA = new AFN();
              
        String pos = JOptionPane.showInputDialog(null, "Escribe la posicion del aut");
        int position = Integer.parseInt(pos.charAt(0)+"");
        
        AutA = automatas.get(position);
        
        AutA.Opcional();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ItemConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConvertirActionPerformed
        AFN AutA = new AFN();
              
        String pos = JOptionPane.showInputDialog(null, "Escribe la posicion del aut");
        int position = Integer.parseInt(pos.charAt(0)+"");
        
        AutA = automatas.get(position);
        
        AFD afd = AutA.ConvertirAFD();
        int name = position + 1;
        String nameS = name+"";
        JOptionPane.showMessageDialog(null, "Se convirtió el AFD con nombre: "+ "AFD"+name);
        automatasAFD.add(afd);
        jComboBox2.addItem("AFD "+nameS);
       
        
    }//GEN-LAST:event_ItemConvertirActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButtonMostrarTablaAFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarTablaAFDActionPerformed
        int positionSelected = (int)jComboBox1.getSelectedIndex();
        System.out.println("El AFD Seleccionado es: " + positionSelected);
        AFD afdSelected = automatasAFD.get(positionSelected); 
        
        //System.out.println("Estamos usando el AFN: "+ afdSelected.);
        
        Object[][]  datos           =   afdSelected.generarTablaAcomodada();
        
        int index                   =   1;
        HashSet<Character> Alfabeto =   afdSelected.getAlfabeto();
        String  []titulos           =   new String[Alfabeto.size()+2];
        titulos[0]                  =   "ESTADO";
        
        for(Character c : Alfabeto){
        
            titulos[index]      =   Character.toString(c);
            index               ++;
        }
        
        //titulos[index]        =   "E";
        titulos[index]      =   "Aceptacion";
        
        if(this.scrollTabla   != null)
            this.jPanel1.remove(this.scrollTabla);
        
        JTable tabla          =   new JTable(datos,titulos);
        scrollTabla           = new JScrollPane(tabla);
        scrollTabla.setBounds(50,20,500,250);
        this.jPanel1.add(scrollTabla);
        this.jPanel1.repaint();
 
    }//GEN-LAST:event_jButtonMostrarTablaAFDActionPerformed

    private void ItemAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAnalizarActionPerformed
        String cadena = JOptionPane.showInputDialog(null, "Introduce la cadena a analizar");
        String pos = JOptionPane.showInputDialog(null, "Escribe la posicion del aut");
        System.out.println(pos);
        int position = Integer.parseInt(pos.charAt(0)+"");
       
        AFD AutA = automatasAFD.get(position);
        
        Lexico lexic = new Lexico(AutA, cadena);
        int i = 1;
        int token;
        while((token=lexic.getToken())!=0){
            System.out.println("*****************Token "+ i +" = " + token);
            System.out.println("Lexema: " + lexic.getLexema());
            i++;
            JOptionPane.showMessageDialog(null, "TOKEN"+ i +" = " + token+"\n"+"Lexema: " + lexic.getLexema() );
        }
        
    }//GEN-LAST:event_ItemAnalizarActionPerformed

    private void ItemUnirLexicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemUnirLexicActionPerformed
        String pos = JOptionPane.showInputDialog(null, "Escribe la posicion del aut");
        System.out.println(pos);
        int position = Integer.parseInt(pos.charAt(0)+"");
        AFN AutA = automatas.get(position);
        //AFN afnAux = AFN.UnirLexico(hs);
    }//GEN-LAST:event_ItemUnirLexicActionPerformed

    public static void main(String args[]) {
        Main1   GUI     =   new Main1();
        GUI.setVisible(true);
        GUI.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cerraduras;
    private javax.swing.JMenu Crear;
    private javax.swing.JMenuItem Estrella;
    private javax.swing.JMenuItem ItemAnalizar;
    private javax.swing.JMenuItem ItemConcatenar;
    private javax.swing.JMenuItem ItemConvertir;
    private javax.swing.JMenuItem ItemNuevo;
    private javax.swing.JMenuItem ItemPositiva;
    private javax.swing.JMenuItem ItemUnir;
    private javax.swing.JMenuItem ItemUnirLexic;
    private javax.swing.JMenu Lexico;
    private javax.swing.JMenu Operaciones;
    private javax.swing.JButton jButtonMostrarTabla;
    private javax.swing.JButton jButtonMostrarTablaAFD;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
