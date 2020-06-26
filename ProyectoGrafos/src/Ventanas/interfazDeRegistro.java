/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import static Grafo.Central.graph;
import javax.swing.JOptionPane;

/**
 *
 * @author sosag
 */
public class interfazDeRegistro extends javax.swing.JFrame {

    // Valida que el argumento sea un numero entero
    public boolean Validacion(String cadena) {
        int num;
        try {
            num = Integer.parseInt(cadena);
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public interfazDeRegistro() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        calleAveRegistro = new javax.swing.JTextField();
        nombreRegistro = new javax.swing.JTextField();
        urbRegistro = new javax.swing.JTextField();
        jButtonSalir = new javax.swing.JButton();
        jButtonMenu = new javax.swing.JButton();
        idVertice2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idVertice1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        mensaje = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        distanciaEntreVertices = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        jLabel2.setText("REGISTRO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel3.setText("CALLE/AVENIDA :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel4.setText("NOMBRE :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel5.setText("URBANIZACIÓN :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        calleAveRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calleAveRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(calleAveRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 280, -1));
        getContentPane().add(nombreRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 280, -1));
        getContentPane().add(urbRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 280, -1));

        jButtonSalir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 0, 0));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 90, 40));

        jButtonMenu.setBackground(new java.awt.Color(255, 255, 255));
        jButtonMenu.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        jButtonMenu.setForeground(new java.awt.Color(0, 153, 102));
        jButtonMenu.setText("Menu");
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 90, 40));
        getContentPane().add(idVertice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 50, 40));

        jLabel6.setText("iD del Nuevo Cliente :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel7.setText("Distancia Entre los Vértices :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        idVertice1.setEditable(false);
        idVertice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idVertice1ActionPerformed(evt);
            }
        });
        getContentPane().add(idVertice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 50, 40));

        jButton1.setText("REGISTRAR DATOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 140, 40));

        mensaje.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 430, 130, 20));

        jLabel8.setText("iD del Cliente al que desea conectar: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));
        getContentPane().add(distanciaEntreVertices, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pastel.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        interfazMenu a = new interfazMenu();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void idVertice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idVertice1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idVertice1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean valid1 = Validacion(idVertice1.getText());
        boolean valid2 = Validacion(idVertice2.getText())
                && graph.IndiceVerticeInt(Integer.parseInt(idVertice2.getText())) != -1;
        boolean valid3 = Validacion(distanciaEntreVertices.getText());

        if ("".equals(nombreRegistro.getText()) || "".equals(urbRegistro.getText()) || "".equals(calleAveRegistro.getText())
                || !valid1 || !valid2 || !valid3) {
            JOptionPane.showMessageDialog(this, "Por favor registre correctamente toda la información que se le pide");
        } else {
            //REGISTRAR LOS DATOS

            graph.NuevoV(nombreRegistro.getText(), urbRegistro.getText(), calleAveRegistro.getText());
            //graph.NuevoA(, idVertice2.getText(), distanciaEntreVertices.getText());
            // el primer valor deberia ya estar anclado
            mensaje.setText("Registro Existoso");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void calleAveRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calleAveRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calleAveRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(interfazDeRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazDeRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazDeRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazDeRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazDeRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField calleAveRegistro;
    private javax.swing.JTextField distanciaEntreVertices;
    private javax.swing.JTextField idVertice1;
    private javax.swing.JTextField idVertice2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel mensaje;
    private javax.swing.JTextField nombreRegistro;
    private javax.swing.JTextField urbRegistro;
    // End of variables declaration//GEN-END:variables
}
