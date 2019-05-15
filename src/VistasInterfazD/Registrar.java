/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasInterfazD;

import ClasesdelProyecto.Persona;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static proyectofinaldaniel.ProyectoFinalDaniel.pathPersona;
import ClasesdelProyecto.html;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Registrar extends javax.swing.JFrame {
  //  ArrayList<Persona> lista = new ArrayList<Persona>();
   
    public static LinkedList contenedor = new LinkedList();
    public int buscar;
    File lista = new File("reporte.html");
    html kk = new html();
    public ArrayList<Persona> ls = new ArrayList<>();
    /**
     * Constructor del JFRAME Registrar
     * Creates new form Registrar
     */
    public Registrar() {
        initComponents();
         this.setLocationRelativeTo(null);
         setSize(1290, 1000);
        setTitle("FEROVA GAME");
    }
    /**
     * Método para crear Binario
     */
      public void createBin(){
        ObjectOutputStream binario = null;
        try {
            String nameFile = jTextFieldNombre.getText();
            File file = new File(nameFile);
            Persona persona = (Persona) contenedor.getLast();
           
            binario = new ObjectOutputStream(new FileOutputStream(pathPersona+persona.getNombre()+".person"));
            binario.writeObject(persona);
            
        } catch (Exception ex) {
            ex.printStackTrace();
           // Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                binario.close();
            } catch (IOException ex) {
                Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
      public void html(){
          
          try {
              FileWriter jj = new FileWriter(lista);
              BufferedWriter bw = new BufferedWriter(jj);
             
             kk.generarEncabezado("Vehiculos");
             kk.ventana("Nombre", "Vehiculo 1", "TipoV1", "Vehiculo 2", "TipoV2", "Vehiculo 3", "TipoV3" );
             bw.write(kk.salida);
             bw.newLine();
             for(int i =0; i<ls.size();i++){
                  kk.generarFilaHTML(ls.get(i).nombre, ls.get(i).v1, ls.get(i).tipo1, ls.get(i).v2, ls.get(i).tipo2, ls.get(i).v3, ls.get(i).tipo3);
                  bw.write(kk.filatxt);
                  bw.newLine();  
              }
             kk.generarCola();
             bw.write(kk.cola);
             bw.newLine();
             bw.close();
             jj.close();
          } catch (Exception e) {
          }
      }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxV1 = new javax.swing.JComboBox<>();
        jButtonIR = new javax.swing.JButton();
        jButtonRegresarTipos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Jmostrar1 = new javax.swing.JTextField();
        jComboBoxV2 = new javax.swing.JComboBox<>();
        Jmostrar2 = new javax.swing.JTextField();
        jTextFieldV3 = new javax.swing.JTextField();
        jComboBoxV3 = new javax.swing.JComboBox<>();
        Jmostrar3 = new javax.swing.JTextField();
        jTextFieldV2 = new javax.swing.JTextField();
        jTextFieldV1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxV1.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        jComboBoxV1.setForeground(new java.awt.Color(255, 0, 51));
        jComboBoxV1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija Vehículo", "Avión", "Tanque", " " }));
        jComboBoxV1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxV1ItemStateChanged(evt);
            }
        });
        jComboBoxV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxV1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 160, -1));

        jButtonIR.setBackground(new java.awt.Color(255, 255, 255));
        jButtonIR.setFont(new java.awt.Font("Dubai", 3, 48)); // NOI18N
        jButtonIR.setForeground(new java.awt.Color(255, 0, 0));
        jButtonIR.setText("Ir a Jugar");
        jButtonIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIRActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 620, 510, 110));

        jButtonRegresarTipos.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRegresarTipos.setFont(new java.awt.Font("Dubai", 3, 36)); // NOI18N
        jButtonRegresarTipos.setForeground(new java.awt.Color(255, 0, 0));
        jButtonRegresarTipos.setText("Regresar");
        jButtonRegresarTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarTiposActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresarTipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 180, 70));

        jLabel3.setFont(new java.awt.Font("Dubai", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Ingrese nombre del tercer vehículo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 560, 50));

        jLabel6.setFont(new java.awt.Font("Dubai", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Ingrese nombre del primer vehículo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 560, 50));

        jLabel7.setFont(new java.awt.Font("Dubai", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Ingrese nombre del segundo vehículo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 600, 50));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("*NOTA:  Para registrar su nombre  y el de los vehículos presione  en el botón REGISTRAR.");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 340, 120));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Vehículos");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 380, 50));

        Jmostrar1.setBackground(new java.awt.Color(255, 255, 255));
        Jmostrar1.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        Jmostrar1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Jmostrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 270, 230, -1));

        jComboBoxV2.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        jComboBoxV2.setForeground(new java.awt.Color(255, 0, 51));
        jComboBoxV2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elja Vehículo", "Avión", "Tanque", " " }));
        jComboBoxV2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxV2ItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBoxV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 160, -1));

        Jmostrar2.setBackground(new java.awt.Color(255, 255, 255));
        Jmostrar2.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        Jmostrar2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Jmostrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 390, 230, -1));

        jTextFieldV3.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldV3.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jTextFieldV3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextFieldV3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 310, -1));

        jComboBoxV3.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        jComboBoxV3.setForeground(new java.awt.Color(255, 0, 51));
        jComboBoxV3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elja Vehículo", "Avión", "Tanque", " " }));
        jComboBoxV3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxV3ItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBoxV3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 522, 170, 40));

        Jmostrar3.setBackground(new java.awt.Color(255, 255, 255));
        Jmostrar3.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        Jmostrar3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Jmostrar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 520, 230, -1));

        jTextFieldV2.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldV2.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jTextFieldV2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextFieldV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 310, -1));

        jTextFieldV1.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldV1.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jTextFieldV1.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldV1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 310, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Elija sus tres vehículos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 340, -1));

        jLabel4.setFont(new java.awt.Font("Dubai", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Ingrese su nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 310, -1));

        jTextFieldNombre.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombre.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 350, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesD/FinesseGrande.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, -1, 1310));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Método para regresar al JFRAME OpcionesJuego
 * @param evt 
 */
    private void jButtonRegresarTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarTiposActionPerformed

        this.setVisible(false);
        new OpcionesJuego().setVisible(true);
        setSize(825, 866);
        dispose();
       
    }//GEN-LAST:event_jButtonRegresarTiposActionPerformed
/**
 * Método para ir mi JFRAME JuegoTableros donde esta mis 3 tipos de tableros
 * @param evt 
 */
    private void jButtonIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIRActionPerformed
        // TODO add your handling code here:
       
                
        JuegoTableros entrada2 = new JuegoTableros();
        entrada2.show();
        entrada2.setSize(1290, 1000);
        dispose();
        
        
        String nombre = jTextFieldNombre.getText();
        String v1 = jTextFieldV1.getText();
        String v2 = jTextFieldV2.getText();
        String v3 = jTextFieldV3.getText();
        String tipo1 = Jmostrar1.getText();
        String tipo2 = Jmostrar2.getText();
        String tipo3 = Jmostrar3.getText();
        //NOMBRE DE LA PERSONA ATRUBUTOS
        
            //nombre de la clase tanque y vehiculos
     //   Vehiculos v = new Tanque();
       // contenedor.add(v);
        //nombre de la clase avion y vehiculos
        // Vehiculos ve = new Avion();
        //contenedor.add(ve);
        
        Persona  person = new Persona(nombre, v1, v2, v3, tipo1, tipo2, tipo3);
        contenedor.add(person);
        ls.add(person);
        //Limpia
        jTextFieldNombre.setText("");
        jTextFieldV1.setText("");
        jTextFieldV2.setText("");
        jTextFieldV3.setText("");      
        
            Persona p = (Persona)contenedor.getLast();
        createBin();
        html();
        
    }//GEN-LAST:event_jButtonIRActionPerformed

    /*private void comboItemStateChanged(java.awt.event.ItemEvent evt) {                                       
        this.jLabel3.setText("Actualmente seleccionado: "+combo.getSelectedItem().toString());
        
    } */            
    private void jComboBoxV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxV1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBoxV1ActionPerformed

    private void jTextFieldV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldV1ActionPerformed

    private void jComboBoxV1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxV1ItemStateChanged
        // TODO add your handling code here:
       this.Jmostrar1.setText("= "+jComboBoxV1.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBoxV1ItemStateChanged
/**
 * Combo Box
 * @param evt 
 */
    private void jComboBoxV2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxV2ItemStateChanged
        // TODO add your handling code here:
        this.Jmostrar2.setText("= "+jComboBoxV2.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBoxV2ItemStateChanged

    private void jComboBoxV3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxV3ItemStateChanged
        // TODO add your handling code here:
        this.Jmostrar3.setText("= "+jComboBoxV3.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBoxV3ItemStateChanged
 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Jmostrar1;
    public static javax.swing.JTextField Jmostrar2;
    public static javax.swing.JTextField Jmostrar3;
    private javax.swing.JButton jButtonIR;
    private javax.swing.JButton jButtonRegresarTipos;
    private javax.swing.JComboBox<String> jComboBoxV1;
    private javax.swing.JComboBox<String> jComboBoxV2;
    private javax.swing.JComboBox<String> jComboBoxV3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JTextField jTextFieldNombre;
    public static javax.swing.JTextField jTextFieldV1;
    public static javax.swing.JTextField jTextFieldV2;
    public static javax.swing.JTextField jTextFieldV3;
    // End of variables declaration//GEN-END:variables
}
