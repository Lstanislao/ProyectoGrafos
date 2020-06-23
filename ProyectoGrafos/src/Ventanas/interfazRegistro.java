
package Ventanas;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sosag
 */
public class interfazRegistro extends javax.swing.JFrame {

    Integer id = 1;
    
    public interfazRegistro() {
        initComponents();
        this.setLocationRelativeTo(null);

    }


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
        jButtonMenuRegistro = new javax.swing.JButton();
        registrarDatos = new javax.swing.JButton();
        jButtonSalirMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("REGISTRO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("CALLE/AVENIDA :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("NOMBRE :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setText("URBANZACION :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        getContentPane().add(calleAveRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 440, 40));

        nombreRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(nombreRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 440, 40));
        getContentPane().add(urbRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 440, 40));

        jButtonMenuRegistro.setBackground(new java.awt.Color(255, 0, 51));
        jButtonMenuRegistro.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        jButtonMenuRegistro.setForeground(new java.awt.Color(0, 153, 102));
        jButtonMenuRegistro.setText("Menu");
        jButtonMenuRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenuRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 90, 40));

        registrarDatos.setBackground(new java.awt.Color(0, 0, 0));
        registrarDatos.setForeground(new java.awt.Color(0, 153, 102));
        registrarDatos.setText("REGISTRAR");
        registrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarDatosActionPerformed(evt);
            }
        });
        getContentPane().add(registrarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        jButtonSalirMenu.setBackground(new java.awt.Color(255, 0, 51));
        jButtonSalirMenu.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        jButtonSalirMenu.setForeground(new java.awt.Color(255, 0, 0));
        jButtonSalirMenu.setText("Salir");
        jButtonSalirMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalirMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 502));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuRegistroActionPerformed
        interfazMenu a = new interfazMenu();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMenuRegistroActionPerformed

    private void jButtonSalirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirMenuActionPerformed

    private void registrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarDatosActionPerformed
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        String cadena = "";
        archivo = new File("ArchivoDeTexto.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                cadena = id + ", " + nombreRegistro.getText() + ", " + urbRegistro.getText() + ", " + calleAveRegistro.getText();
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);     
                linea.println(cadena);
                linea.close();
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(interfazRegistro.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                FileReader leer;
                BufferedReader almacenamiento;
                try {
                    leer = new FileReader(archivo);
                    almacenamiento = new BufferedReader(leer);
                    try {
                        while(almacenamiento.readLine()!=null){
                            id += 1;
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(interfazDelivery.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(interfazDelivery.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                cadena = id + ", " + nombreRegistro.getText() + ", " + urbRegistro.getText() + ", " + calleAveRegistro.getText();
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);    
                linea.println(cadena);
                linea.close();
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(interfazRegistro.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_registrarDatosActionPerformed

    private void nombreRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreRegistroActionPerformed
        
    }//GEN-LAST:event_nombreRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(interfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField calleAveRegistro;
    private javax.swing.JButton jButtonMenuRegistro;
    private javax.swing.JButton jButtonSalirMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombreRegistro;
    private javax.swing.JButton registrarDatos;
    private javax.swing.JTextField urbRegistro;
    // End of variables declaration//GEN-END:variables
}
