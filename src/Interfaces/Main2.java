<<<<<<< HEAD

package Interfaces;

import static Interfaces.Operaciones.jComboBoxAut1;
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
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu7 = new javax.swing.JMenu();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonMostrarTabla = new javax.swing.JButton();
        jButtonMostrarTablaAFD = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButtonGuardarAFD = new javax.swing.JButton();
        jButtonCargarAFD1 = new javax.swing.JButton();
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
        Analizar = new javax.swing.JMenu();
        ItemAnalizarCadena = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Draw AFN");

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setAlignmentX(2.0F);
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(null);
        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 530, 410));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        jLabel1.setText("AFN DISPONIBLES:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        jLabel2.setText("AFD DISPONIBLES:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jButtonMostrarTabla.setBackground(new java.awt.Color(102, 102, 255));
        jButtonMostrarTabla.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 18)); // NOI18N
        jButtonMostrarTabla.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMostrarTabla.setText("MOSTRAR AFN");
        jButtonMostrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarTablaActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonMostrarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        jButtonMostrarTablaAFD.setBackground(new java.awt.Color(102, 102, 255));
        jButtonMostrarTablaAFD.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 18)); // NOI18N
        jButtonMostrarTablaAFD.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMostrarTablaAFD.setText("MOSTRAR AFD");
        jButtonMostrarTablaAFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarTablaAFDActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonMostrarTablaAFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, -1));

        jScrollPane1.setViewportView(jList1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 100));

        jScrollPane2.setViewportView(jList2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 330, 100));

        jButtonGuardarAFD.setBackground(new java.awt.Color(102, 102, 255));
        jButtonGuardarAFD.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 18)); // NOI18N
        jButtonGuardarAFD.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardarAFD.setText("Guardar AFD");
        jButtonGuardarAFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarAFDActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonGuardarAFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jButtonCargarAFD1.setBackground(new java.awt.Color(102, 102, 255));
        jButtonCargarAFD1.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 18)); // NOI18N
        jButtonCargarAFD1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCargarAFD1.setText("Cargar AFD");
        jButtonCargarAFD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarAFD1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCargarAFD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 370, 450));

        jMenuBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 1, true));
        jMenuBar1.setToolTipText("");
        jMenuBar1.setFont(new java.awt.Font("Leelawadee", 0, 36)); // NOI18N

        Crear.setText("CREAR");
        Crear.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N

        ItemNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
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

        Analizar.setText("ANALIZAR");
        Analizar.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N

        ItemAnalizarCadena.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        ItemAnalizarCadena.setText("CADENA");
        ItemAnalizarCadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAnalizarCadenaActionPerformed(evt);
            }
        });
        Analizar.add(ItemAnalizarCadena);

        jMenuItem2.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        jMenuItem2.setText("UNIR LEXICO");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Analizar.add(jMenuItem2);

        jMenuItem3.setText("OPERACIÓN CON CALCULADORA");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Analizar.add(jMenuItem3);

        jMenuBar1.add(Analizar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void ItemUnirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemUnirActionPerformed
        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        operacion = 1;      
    }//GEN-LAST:event_ItemUnirActionPerformed

    private void ItemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNuevoActionPerformed
        NewAFN crear = new NewAFN();
        crear.setVisible(true);
        crear.setLocationRelativeTo(null);        
    }//GEN-LAST:event_ItemNuevoActionPerformed

    private void ItemConcatenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConcatenarActionPerformed
        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        operacion = 2;
    }//GEN-LAST:event_ItemConcatenarActionPerformed

    private void ItemPositivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemPositivaActionPerformed
        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        op.jComboBoxAut2.setVisible(false);
        op.jLabel3.setVisible(false);
        operacion = 3;
    }//GEN-LAST:event_ItemPositivaActionPerformed

    private void EstrellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstrellaActionPerformed
        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        op.jComboBoxAut2.setVisible(false);
        op.jLabel3.setVisible(false);
        operacion = 4;
    }//GEN-LAST:event_EstrellaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        op.jComboBoxAut2.setVisible(false);
        op.jLabel3.setVisible(false);
        operacion = 5;
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ItemConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConvertirActionPerformed
        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        op.jComboBoxAut2.setVisible(false);
        op.jLabel3.setVisible(false);
        operacion = 6;           
    }//GEN-LAST:event_ItemConvertirActionPerformed

    private void ItemAnalizarCadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAnalizarCadenaActionPerformed

        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        op.jComboBoxAut2.setVisible(false);
        op.jLabel3.setVisible(false);
        op.jComboBoxAut1.removeAllItems();
        for(AFD afd : automatasAFD){
            op.jComboBoxAut1.addItem("AFD "+afd.getStringId());   
        }
        operacion = 7;
        
    }//GEN-LAST:event_ItemAnalizarCadenaActionPerformed

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

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
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
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        op.jComboBoxAut2.setVisible(false);
        op.jLabel3.setVisible(false);
        op.jComboBoxAut1.removeAllItems();
        for(AFD afd : automatasAFD){
            op.jComboBoxAut1.addItem("AFD "+afd.getStringId());   
        }
        operacion = 8;
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
    private javax.swing.JMenuItem Estrella;
    private javax.swing.JMenuItem ItemAnalizarCadena;
    private javax.swing.JMenuItem ItemConcatenar;
    private javax.swing.JMenuItem ItemConvertir;
    private javax.swing.JMenuItem ItemNuevo;
    private javax.swing.JMenuItem ItemPositiva;
    private javax.swing.JMenuItem ItemUnir;
    private javax.swing.JMenu Operaciones;
    private javax.swing.JButton jButtonCargarAFD1;
    private javax.swing.JButton jButtonGuardarAFD;
    private javax.swing.JButton jButtonMostrarTabla;
    private javax.swing.JButton jButtonMostrarTablaAFD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
=======

package Interfaces;

import metodos.AFD;
import metodos.AFN;
import java.io.IOException;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;


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
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu7 = new javax.swing.JMenu();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonMostrarTabla = new javax.swing.JButton();
        jButtonMostrarTablaAFD = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButtonGuardarAFD = new javax.swing.JButton();
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
        Analizar = new javax.swing.JMenu();
        ItemAnalizarCadena = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Draw AFN");

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setAlignmentX(2.0F);
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 570, 410));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        jLabel1.setText("AFN DISPONIBLES:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        jLabel2.setText("AFD DISPONIBLES:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jButtonMostrarTabla.setBackground(new java.awt.Color(102, 102, 255));
        jButtonMostrarTabla.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 18)); // NOI18N
        jButtonMostrarTabla.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMostrarTabla.setText("MOSTRAR AFN ");
        jButtonMostrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarTablaActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonMostrarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jButtonMostrarTablaAFD.setBackground(new java.awt.Color(102, 102, 255));
        jButtonMostrarTablaAFD.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 18)); // NOI18N
        jButtonMostrarTablaAFD.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMostrarTablaAFD.setText("MOSTRAR AFD");
        jButtonMostrarTablaAFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarTablaAFDActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonMostrarTablaAFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 200, -1));

        jScrollPane1.setViewportView(jList1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 330, 100));

        jScrollPane2.setViewportView(jList2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 330, 100));

        jButtonGuardarAFD.setBackground(new java.awt.Color(102, 102, 255));
        jButtonGuardarAFD.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 18)); // NOI18N
        jButtonGuardarAFD.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardarAFD.setText("Guardar AFD");
        jButtonGuardarAFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarAFDActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonGuardarAFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 410, 410));

        jMenuBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 1, true));
        jMenuBar1.setToolTipText("");
        jMenuBar1.setFont(new java.awt.Font("Leelawadee", 0, 36)); // NOI18N

        Crear.setText("CREAR");
        Crear.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N

        ItemNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
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

        Analizar.setText("ANALIZAR");
        Analizar.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N

        ItemAnalizarCadena.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        ItemAnalizarCadena.setText("CADENA");
        ItemAnalizarCadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAnalizarCadenaActionPerformed(evt);
            }
        });
        Analizar.add(ItemAnalizarCadena);

        jMenuItem2.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 20)); // NOI18N
        jMenuItem2.setText("UNIR LEXICO");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Analizar.add(jMenuItem2);

        jMenuBar1.add(Analizar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void ItemUnirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemUnirActionPerformed
        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        operacion = 1;      
    }//GEN-LAST:event_ItemUnirActionPerformed

    private void ItemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNuevoActionPerformed
        NewAFN crear = new NewAFN();
        crear.setVisible(true);
        crear.setLocationRelativeTo(null);        
    }//GEN-LAST:event_ItemNuevoActionPerformed

    private void ItemConcatenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConcatenarActionPerformed
        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        operacion = 2;
    }//GEN-LAST:event_ItemConcatenarActionPerformed

    private void ItemPositivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemPositivaActionPerformed
        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        op.jComboBoxAut2.setVisible(false);
        op.jLabel3.setVisible(false);
        operacion = 3;
    }//GEN-LAST:event_ItemPositivaActionPerformed

    private void EstrellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstrellaActionPerformed
        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        op.jComboBoxAut2.setVisible(false);
        op.jLabel3.setVisible(false);
        operacion = 4;
    }//GEN-LAST:event_EstrellaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        op.jComboBoxAut2.setVisible(false);
        op.jLabel3.setVisible(false);
        operacion = 5;
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ItemConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConvertirActionPerformed
        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        op.jComboBoxAut2.setVisible(false);
        op.jLabel3.setVisible(false);
        operacion = 6;           
    }//GEN-LAST:event_ItemConvertirActionPerformed

    private void ItemAnalizarCadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAnalizarCadenaActionPerformed

        Operaciones op = new Operaciones();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        op.jComboBoxAut2.setVisible(false);
        op.jLabel3.setVisible(false);
        op.jComboBoxAut1.removeAllItems();
        for(AFD afd : automatasAFD){
            op.jComboBoxAut1.addItem("AFD "+afd.getStringId());   
        }
        operacion = 7;
        
    }//GEN-LAST:event_ItemAnalizarCadenaActionPerformed

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
        scrollTabla.setBounds(50,20,500,250);
        this.jPanel1.add(scrollTabla);
        this.jPanel1.repaint();

    }//GEN-LAST:event_jButtonMostrarTablaAFDActionPerformed

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

        if(this.scrollTabla   != null)
        this.jPanel1.remove(this.scrollTabla);

        JTable tabla          =   new JTable(datos,titulos);
        scrollTabla           = new JScrollPane(tabla);
        scrollTabla.setBounds(50,20,500,250);
        this.jPanel1.add(scrollTabla);
        this.jPanel1.repaint();

    }//GEN-LAST:event_jButtonMostrarTablaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
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
            JOptionPane.showMessageDialog(this, "¡Automata creado exitosamente! con nombre:"+name);
        }else{
            JOptionPane.showMessageDialog(this, "Selecciona en la lista de << AFN disponibles >> los AFNs para unir. \n "
                    + " NOTA: Con control+click puedes seleccionar diversos automatas. ");
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButtonGuardarAFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarAFDActionPerformed
        int positionSelected = jList2.getSelectedIndex();
        if(positionSelected>=0){
            AFD afd = automatasAFD.get(positionSelected);
            try { 
                
                afd.guardarAFD("/");
            } catch (IOException ex) {
                Logger.getLogger(Main2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Selecciona en la lista de << AFD disponibles >> el AFN a guardar. ");
        }
    }//GEN-LAST:event_jButtonGuardarAFDActionPerformed

    public static void main(String args[]) {
        Main2   GUI     =   new Main2();
        GUI.setVisible(true);
        GUI.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Analizar;
    private javax.swing.JMenu Cerraduras;
    private javax.swing.JMenu Crear;
    private javax.swing.JMenuItem Estrella;
    private javax.swing.JMenuItem ItemAnalizarCadena;
    private javax.swing.JMenuItem ItemConcatenar;
    private javax.swing.JMenuItem ItemConvertir;
    private javax.swing.JMenuItem ItemNuevo;
    private javax.swing.JMenuItem ItemPositiva;
    private javax.swing.JMenuItem ItemUnir;
    private javax.swing.JMenu Operaciones;
    private javax.swing.JButton jButtonGuardarAFD;
    private javax.swing.JButton jButtonMostrarTabla;
    private javax.swing.JButton jButtonMostrarTablaAFD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
>>>>>>> d5bea50d03617a9b5fcd5f6873bf327f06664488
