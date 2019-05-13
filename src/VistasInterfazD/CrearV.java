/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasInterfazD;


import ClasesdelProyecto.EstadisticasV;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static proyectofinaldaniel.ProyectoFinalDaniel.pathVehiculosD;
import static VistasInterfazD.CrearV.contenedor1;
import static VistasInterfazD.CrearV.jTextFieldNombreV1;

/**
 *
 * @author danie
 */
public class CrearV extends javax.swing.JFrame {
  public static LinkedList contenedor1 = new LinkedList();
    public int buscar;
    /**
     * Constructor de clase crearv
     * Creates new form CrearAviones
     */
    public CrearV() {
        initComponents();
         this.setLocationRelativeTo(null);
           setSize(1290, 1000);
           setTitle("FEROVA GAME");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRegresarTipos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButtonVehiculoscargar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldTipoV = new javax.swing.JTextField();
        jComboBoxV1 = new javax.swing.JComboBox<>();
        jTextFieldVelocidadV = new javax.swing.JTextField();
        jTextFieldNombreV1 = new javax.swing.JTextField();
        jTextFieldPunteriaV = new javax.swing.JTextField();
        jTextFieldDefensaV = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldAtaqueV = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCostoV = new javax.swing.JTextField();
        jButtonGuardarV = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRegresarTipos.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRegresarTipos.setFont(new java.awt.Font("Dubai", 3, 36)); // NOI18N
        jButtonRegresarTipos.setForeground(new java.awt.Color(0, 255, 0));
        jButtonRegresarTipos.setText("Regresar");
        jButtonRegresarTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarTiposActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresarTipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 680, 260, 100));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setText("Crear Vehículos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 470, 40));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ingrese Velocidad:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 420, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesD/aviones.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 620, 150));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ingrese nombre del Vehículo:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 510, -1));

        jButtonVehiculoscargar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonVehiculoscargar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonVehiculoscargar.setForeground(new java.awt.Color(51, 255, 0));
        jButtonVehiculoscargar.setText("Vehículos");
        jButtonVehiculoscargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVehiculoscargarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVehiculoscargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 540, 170, 90));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ingrese Defensa:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 420, -1));

        jTextFieldTipoV.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTipoV.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jTextFieldTipoV.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldTipoV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTipoVActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTipoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 310, -1));

        jComboBoxV1.setFont(new java.awt.Font("Dubai", 3, 36)); // NOI18N
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
        getContentPane().add(jComboBoxV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 270, 60));

        jTextFieldVelocidadV.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldVelocidadV.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jTextFieldVelocidadV.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldVelocidadV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVelocidadVActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldVelocidadV, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 310, -1));

        jTextFieldNombreV1.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombreV1.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jTextFieldNombreV1.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNombreV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreV1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombreV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 310, -1));

        jTextFieldPunteriaV.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPunteriaV.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jTextFieldPunteriaV.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPunteriaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPunteriaVActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPunteriaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 310, -1));

        jTextFieldDefensaV.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDefensaV.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jTextFieldDefensaV.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDefensaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDefensaVActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDefensaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 310, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingrese Puntería:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 420, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingrese Ataque:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 420, -1));

        jTextFieldAtaqueV.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAtaqueV.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jTextFieldAtaqueV.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAtaqueV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAtaqueVActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAtaqueV, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 310, -1));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("COSTO DEL VEHÍCULO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 420, -1));

        jTextFieldCostoV.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCostoV.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jTextFieldCostoV.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCostoV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCostoVActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCostoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 310, -1));

        jButtonGuardarV.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGuardarV.setFont(new java.awt.Font("Dubai", 3, 48)); // NOI18N
        jButtonGuardarV.setForeground(new java.awt.Color(0, 255, 0));
        jButtonGuardarV.setText("Guardar Vehículo");
        jButtonGuardarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarVActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardarV, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 670, 510, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesD/FinesseGrande.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ingrese Ataque:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 420, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método Crear Binario
     */ 
    public void createBinario(){
        ObjectOutputStream binario = null;
        try {
            String nameFile = jTextFieldNombreV1.getText();
            File file = new File(nameFile);
            EstadisticasV gun = (EstadisticasV) contenedor1.getLast();
           
            binario = new ObjectOutputStream(new FileOutputStream(pathVehiculosD+gun.getNombreV()+".ar"));
            binario.writeObject(gun);
            
        } catch (Exception ex) {
            ex.printStackTrace();
           // Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                binario.close();
            } catch (IOException ex) {
                Logger.getLogger(CrearV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    private void jTextFieldNombreV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreV1ActionPerformed

    private void jTextFieldPunteriaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPunteriaVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPunteriaVActionPerformed

    private void jTextFieldAtaqueVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAtaqueVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAtaqueVActionPerformed

    private void jTextFieldCostoVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCostoVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCostoVActionPerformed
/**
 * Boton que guarda mis vehículos
 * @param evt 
 */
    private void jButtonGuardarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarVActionPerformed
        // TODO add your handling code here:
      
        String tipoV = jTextFieldTipoV.getText();
        String nombreV = jTextFieldNombreV1.getText();
        String PunteriaV = jTextFieldPunteriaV.getText();
        String AtaqueV = jTextFieldAtaqueV.getText();
        String DefensaV = jTextFieldDefensaV.getText();
        String VelocidadV = jTextFieldVelocidadV.getText();
        String costoV = jTextFieldCostoV.getText();
        //NOMBRE DE LA PERSONA ATRUBUTOS
        
            //nombre de la clase tanque y vehiculos
     //   Vehiculos v = new Tanque();
       // contenedor.add(v);
        //nombre de la clase avion y vehiculos
        // Vehiculos ve = new Avion();
        //contenedor.add(ve);
        
        EstadisticasV  p = new EstadisticasV (tipoV, nombreV, PunteriaV, AtaqueV, DefensaV, VelocidadV, costoV);
        contenedor1.add(p);
        //Limpia
        jTextFieldTipoV.setText("");
        jTextFieldNombreV1.setText("");
        jTextFieldPunteriaV.setText("");
        jTextFieldAtaqueV.setText("");
         jTextFieldDefensaV.setText("");
          jTextFieldVelocidadV.setText("");
           jTextFieldCostoV.setText("");
           
           
               EstadisticasV arma = (EstadisticasV)contenedor1.getLast();
        createBinario();
    }//GEN-LAST:event_jButtonGuardarVActionPerformed

    private void jTextFieldDefensaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDefensaVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDefensaVActionPerformed

    private void jTextFieldVelocidadVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVelocidadVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVelocidadVActionPerformed
/**
 * Retorna a tienda
 * @param evt 
 */
    private void jButtonRegresarTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarTiposActionPerformed
        // TODO add your handling code here:
        //Persona persona = new Persona(jTextFieldNombre.getText() );
        //lista.add(persona);
        this.setVisible(false);

        new Tienda ().setVisible(true);

        setSize(1290, 1000);
        dispose();
     
    }//GEN-LAST:event_jButtonRegresarTiposActionPerformed
/**
 * Es de donde la info del comboBox la uso en un textfield
 * @param evt 
 */
    private void jComboBoxV1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxV1ItemStateChanged
        // TODO add your handling code here:
        this.jTextFieldTipoV.setText("= "+jComboBoxV1.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBoxV1ItemStateChanged

    private void jComboBoxV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxV1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBoxV1ActionPerformed

    private void jTextFieldTipoVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTipoVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTipoVActionPerformed

    private void jButtonVehiculoscargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVehiculoscargarActionPerformed

        CrearV a = new CrearV();
        a.show();
        a.setVisible(false);

        this.setVisible(false);
        new VEstadisticas().setVisible(true);// TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVehiculoscargarActionPerformed

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
            java.util.logging.Logger.getLogger(CrearV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardarV;
    private javax.swing.JButton jButtonRegresarTipos;
    private javax.swing.JButton jButtonVehiculoscargar;
    private javax.swing.JComboBox<String> jComboBoxV1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JTextField jTextFieldAtaqueV;
    public static javax.swing.JTextField jTextFieldCostoV;
    public static javax.swing.JTextField jTextFieldDefensaV;
    public static javax.swing.JTextField jTextFieldNombreV1;
    public static javax.swing.JTextField jTextFieldPunteriaV;
    public static javax.swing.JTextField jTextFieldTipoV;
    public static javax.swing.JTextField jTextFieldVelocidadV;
    // End of variables declaration//GEN-END:variables
}
