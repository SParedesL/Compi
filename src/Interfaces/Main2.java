
package Interfaces;
import metodos.AFD;
import metodos.AFN;
import metodos.Lexico;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/**
 *
 * @author anals
 */
public class Main2 extends javax.swing.JFrame {

    private JScrollPane scrollTabla;
    public static ArrayList<AFN> automatas = new ArrayList<>();
    public static ArrayList<AFD> automatasAFD = new ArrayList<>();
    public static int operacion;
    public static DefaultListModel modelo = new DefaultListModel();
    public static DefaultListModel modelo2 = new DefaultListModel();
    int [] indices;
    
    public Main2() {
        initComponents();
        scrollTabla               =   null;
        jList1.setModel(modelo);
        jList2.setModel(modelo2);
        indices = new int [2];
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButtonMostrarTabla = new javax.swing.JButton();
        jButtonMostrarTablaAFD = new javax.swing.JButton();
        jButtonGuardarAFD = new javax.swing.JButton();
        jButtonCargarAFD1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Crear = new javax.swing.JMenu();
        ItemNuevo = new javax.swing.JMenuItem();
        Operaciones = new javax.swing.JMenu();
        ItemUnir = new javax.swing.JMenuItem();
        ItemConcatenar = new javax.swing.JMenuItem();
        ItemOpcional = new javax.swing.JMenuItem();
        ItemConvertir = new javax.swing.JMenuItem();
        ItemUnirLexico = new javax.swing.JMenuItem();
        Cerraduras = new javax.swing.JMenu();
        ItemPositiva = new javax.swing.JMenuItem();
        ItemEstrella = new javax.swing.JMenuItem();
        Analizar = new javax.swing.JMenu();
        ItemAnalizarCadena = new javax.swing.JMenuItem();
        ItemAnalizarOp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, -1));

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setText("AFN DISPONIBLES");

        jLabel2.setText("AFD DISPONIBLES");

        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setViewportView(jList2);

        jButtonMostrarTabla.setText("MOSTRAR AFN");

        jButtonMostrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarTablaActionPerformed(evt);
            }
        });

        jButtonMostrarTablaAFD.setText("MOSTRAR AFD");
      
        jButtonMostrarTablaAFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarTablaAFDActionPerformed(evt);
            }
        });

        jButtonGuardarAFD.setText("GUARDAR");
        jButtonGuardarAFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarAFDActionPerformed(evt);
            }
        });

        jButtonCargarAFD1.setText("CARGAR");
        jButtonCargarAFD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarAFD1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonMostrarTabla)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                                .addComponent(jScrollPane2))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonCargarAFD1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonMostrarTablaAFD)
                                .addGap(19, 19, 19))
                            .addComponent(jButtonGuardarAFD))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonMostrarTabla)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGuardarAFD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonMostrarTablaAFD)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCargarAFD1)
                        .addContainerGap())))
        );


        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 380, 430));

        Crear.setText("CREAR");

        ItemNuevo.setText("Nuevo");
        ItemNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNuevoActionPerformed(evt);
            }
        });
        Crear.add(ItemNuevo);

        jMenuBar1.add(Crear);

        Operaciones.setText("OPERACIONES");

        ItemUnir.setText("UNIR");
        ItemUnir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemUnirActionPerformed(evt);
            }
        });
        Operaciones.add(ItemUnir);

        ItemConcatenar.setText("CONCATENAR");
        ItemConcatenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemConcatenarActionPerformed(evt);
            }
        });
        Operaciones.add(ItemConcatenar);

        ItemOpcional.setText("OPCIONAL");
        ItemOpcional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemOpcionalActionPerformed(evt);
            }
        });
        Operaciones.add(ItemOpcional);

        ItemConvertir.setText("CONVERTIR A AFD");
        ItemConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemConvertirActionPerformed(evt);
            }
        });
        Operaciones.add(ItemConvertir);

        ItemUnirLexico.setText("UNIR LEXICO");
        ItemUnirLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemUnirLexicoActionPerformed(evt);
            }
        });
        Operaciones.add(ItemUnirLexico);

        jMenuBar1.add(Operaciones);

        Cerraduras.setText("CERRADURAS");

        ItemPositiva.setText("Positiva");
        ItemPositiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemPositivaActionPerformed(evt);
            }
        });
        Cerraduras.add(ItemPositiva);

        ItemEstrella.setText("Estrella");
        ItemEstrella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemEstrellaActionPerformed(evt);
            }
        });
        Cerraduras.add(ItemEstrella);

        jMenuBar1.add(Cerraduras);

        Analizar.setText("ANALIZAR");

        ItemAnalizarCadena.setText("Cadena");
        ItemAnalizarCadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAnalizarCadenaActionPerformed(evt);
            }
        });
        Analizar.add(ItemAnalizarCadena);

        ItemAnalizarOp.setText("Operacion");
        ItemAnalizarOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAnalizarOpActionPerformed(evt);
            }
        });
        Analizar.add(ItemAnalizarOp);

        jMenuBar1.add(Analizar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemConcatenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConcatenarActionPerformed
        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        operacion = 2;
    }//GEN-LAST:event_ItemConcatenarActionPerformed

    private void jButtonMostrarTablaAFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarTablaAFDActionPerformed
        int positionSelected = (int)jList2.getSelectedIndex();
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
        scrollTabla.setBounds(50,20,450,150);
        this.jPanel1.add(scrollTabla);
        this.jPanel1.repaint();
    }//GEN-LAST:event_jButtonMostrarTablaAFDActionPerformed

    private void ItemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNuevoActionPerformed
        NewAFN crear = new NewAFN();
        crear.setVisible(true);
        crear.setLocationRelativeTo(null);   
    }//GEN-LAST:event_ItemNuevoActionPerformed

    private void ItemUnirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemUnirActionPerformed
        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        operacion = 1; 
    }//GEN-LAST:event_ItemUnirActionPerformed

    private void ItemPositivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemPositivaActionPerformed
        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        op.jComboBox2.setVisible(false);
        op.jLabel3.setVisible(false);
        operacion = 3;
    }//GEN-LAST:event_ItemPositivaActionPerformed

    private void ItemEstrellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemEstrellaActionPerformed
        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        op.jComboBox2.setVisible(false);
        op.jLabel3.setVisible(false);
        operacion = 4;
    }//GEN-LAST:event_ItemEstrellaActionPerformed

    private void ItemOpcionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemOpcionalActionPerformed
        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        op.jComboBox2.setVisible(false);
        op.jLabel3.setVisible(false);
        operacion = 5;
    }//GEN-LAST:event_ItemOpcionalActionPerformed

    private void ItemConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConvertirActionPerformed
        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        op.jComboBox2.setVisible(false);
        op.jLabel3.setVisible(false);
        operacion = 6; 
    }//GEN-LAST:event_ItemConvertirActionPerformed

    private void ItemAnalizarCadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAnalizarCadenaActionPerformed
        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        op.jComboBox2.setVisible(false);
        op.jLabel3.setVisible(false);
        op.jComboBox1.removeAllItems();
        for(AFD afd : automatasAFD){
            op.jComboBox1.addItem("AFD "+afd.getStringId());   
        }
        operacion = 7;
    }//GEN-LAST:event_ItemAnalizarCadenaActionPerformed

    private void jButtonMostrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarTablaActionPerformed
        int positionSelected = (int)jList1.getSelectedIndex();
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

        if(this.scrollTabla   != null){
            this.jPanel1.remove(this.scrollTabla);
        }

        JTable tabla          =   new JTable(datos,titulos);
        scrollTabla           = new JScrollPane(tabla);
        scrollTabla.setBounds(50,20,450,150);
        this.jPanel1.add(scrollTabla);
        
        this.jPanel1.repaint();
    }//GEN-LAST:event_jButtonMostrarTablaActionPerformed

    private void ItemUnirLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemUnirLexicoActionPerformed
       String name = automatas.size()+"";
        HashSet<AFN> hs = new HashSet<>();
        int [] items = jList1.getSelectedIndices();
        if(items.length != 0){
            for(int i:items){
                System.out.println(i);
                hs.add(automatas.get(i));
            }    
            AFN c = AFN.UnirLexico(hs);
            automatas.add(c);
            modelo.addElement(name);
            System.out.println("SU getStringId es: ->>> ");
            c.setIdAFN(name);
            System.out.println(c.getStringId());
            JOptionPane.showMessageDialog(this, "¡Automata creado exitosamente! con nombre:"+name);
        }else{
            JOptionPane.showMessageDialog(this, "Selecciona en la lista de << AFN disponibles >> los AFNs para unir. \n "
                    + " NOTA: Con control+click puedes seleccionar diversos automatas. ");
        }
    }//GEN-LAST:event_ItemUnirLexicoActionPerformed

    private void jButtonGuardarAFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarAFDActionPerformed
        int positionSelected = jList2.getSelectedIndex();
        if(positionSelected>=0){
            AFD afd = automatasAFD.get(positionSelected);
            try { 
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("AutGuardado.afd"));
                oos.writeObject(afd);
                oos.flush();
                oos.close();
                JOptionPane.showMessageDialog(this, "Autómada guardado correctamente");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "El automáta no se pudo guardar de forma correcta");
                Logger.getLogger(Main2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Selecciona en la lista de << AFD disponibles >> el AFN a guardar. ");
        }
    }//GEN-LAST:event_jButtonGuardarAFDActionPerformed

    private void ItemAnalizarOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAnalizarOpActionPerformed
        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        op.jComboBox2.setVisible(false);
        op.jLabel3.setVisible(false);
        op.jComboBox1.removeAllItems();
        for(AFD afd : automatasAFD){
            op.jComboBox1.addItem("AFD "+afd.getStringId());   
        }
        operacion = 8;
    }//GEN-LAST:event_ItemAnalizarOpActionPerformed

    private void jButtonCargarAFD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarAFD1ActionPerformed
        Operaciones op = new Operaciones();
        operacion = 9;
        String nomArchivo = JOptionPane.showInputDialog(this, "Ingresa el nombre del archivo");
        ObjectInputStream ois = null;
        AFD afdf = new AFD();
        try {
            ois = new ObjectInputStream(new FileInputStream(nomArchivo));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            afdf = (AFD)ois.readObject();
        } catch (IOException ex) {
            Logger.getLogger(Main2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ois.close();
        } catch (IOException ex) {
            Logger.getLogger(Main2.class.getName()).log(Level.SEVERE, null, ex);
        }
        int name = automatas.size()+1;
        String nameS = String.valueOf(name);
        automatasAFD.add(afdf);
        modelo2.addElement("AFD "+nameS);
        afdf.setStringId(String.valueOf(nameS));
    }//GEN-LAST:event_jButtonCargarAFD1ActionPerformed

    public static void main(String args[]) {
        Main2   GUI     =   new Main2();
        GUI.setVisible(true);
        GUI.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Analizar;
    private javax.swing.JMenu Cerraduras;
    private javax.swing.JMenu Crear;
    private javax.swing.JMenuItem ItemAnalizarCadena;
    private javax.swing.JMenuItem ItemAnalizarOp;
    private javax.swing.JMenuItem ItemConcatenar;
    private javax.swing.JMenuItem ItemConvertir;
    private javax.swing.JMenuItem ItemEstrella;
    private javax.swing.JMenuItem ItemNuevo;
    private javax.swing.JMenuItem ItemOpcional;
    private javax.swing.JMenuItem ItemPositiva;
    private javax.swing.JMenuItem ItemUnir;
    private javax.swing.JMenuItem ItemUnirLexico;
    private javax.swing.JMenu Operaciones;
    private javax.swing.JButton jButtonCargarAFD1;
    private javax.swing.JButton jButtonGuardarAFD;
    private javax.swing.JButton jButtonMostrarTabla;
    private javax.swing.JButton jButtonMostrarTablaAFD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
