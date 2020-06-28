package Ventanas;

import Grafo.Archivo;
import Grafo.Central;
import Grafo.Grafo;
import java.io.File;
import javax.swing.JOptionPane;

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

    public interfazDeRegistro(String lista) {
        initComponents();
        this.setLocationRelativeTo(null);
        clientesRegistrados.setText(lista);
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
        jButtonSalir = new javax.swing.JButton();
        jButtonMenu = new javax.swing.JButton();
        idVertice2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        distanciaEntreVertices = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        clientesRegistrados = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
        jLabel2.setText("REGISTRO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel3.setText("CALLE/AVENIDA :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel4.setText("NOMBRE :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel5.setText("URBANIZACIÓN :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        calleAveRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calleAveRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(calleAveRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 280, -1));

        nombreRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(nombreRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 280, -1));
        getContentPane().add(urbRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 280, -1));

        jButtonSalir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 0, 0));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 90, 40));

        jButtonMenu.setBackground(new java.awt.Color(255, 255, 255));
        jButtonMenu.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        jButtonMenu.setForeground(new java.awt.Color(0, 153, 102));
        jButtonMenu.setText("Menu");
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 90, 40));
        getContentPane().add(idVertice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 50, 40));

        jLabel7.setText("Distancia Entre los Vértices :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jButton1.setText("REGISTRAR DATOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 160, 40));

        jLabel8.setText("iD del Cliente al que desea conectar: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));
        getContentPane().add(distanciaEntreVertices, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 50, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 100));

        jButton2.setText("GUARDAR DATOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 140, 40));

        clientesRegistrados.setEditable(false);
        jScrollPane3.setViewportView(clientesRegistrados);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 350, 300));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel10.setText("Datos del Archivo Seleccionado:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        mensaje.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        mensaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mensaje.setInheritsPopupMenu(false);
        getContentPane().add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 220, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Light-Blue-Gradient-Background-Graphics-3943096-1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        // Apertura de la interfaz Menu y cierre de la interfaz de Registro
        interfazMenu a = new interfazMenu();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Grafo graph = Central.getGraph();
        /*Validación de existencia del vertice ingresado en el grafo actual y que 
        los datos registrados sean validos*/
        boolean valid2 = Validacion(idVertice2.getText())
                && graph.IndiceVerticeInt(Integer.parseInt(idVertice2.getText())) != -1;
        boolean valid3 = Validacion(distanciaEntreVertices.getText());
        if ("".equals(nombreRegistro.getText()) || "".equals(urbRegistro.getText()) || "".equals(calleAveRegistro.getText())
                || !valid2 || !valid3) {
            JOptionPane.showMessageDialog(this, "Por favor registre correctamente toda la información que se le pide");
        } else {
            // Registra el nuevo cliente
            graph.NuevoV(nombreRegistro.getText(), calleAveRegistro.getText(), urbRegistro.getText());
            int id = graph.getnVertices() - 1;
            graph.NuevoA(id, Integer.parseInt(idVertice2.getText()) - 1, Integer.parseInt(distanciaEntreVertices.getText()));
            Central.setGraph(graph);
            mensaje.setText("Registro Existoso");
            Archivo.EscribirGrafoEnTxt();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void calleAveRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calleAveRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calleAveRegistroActionPerformed

    private void nombreRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreRegistroActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        /*  
        Copiando la informacion del archivo por defecto que utiliza el sistema 
        y reescribiendo el archivo seleccionado por el usuario
         */
        String archivoActual = Central.Actual;
        File actual = new File(archivoActual);
        File porDefecto = new File("ArchivoPorDefecto.txt");
        Archivo.copiarTxt(porDefecto, actual);
        mensaje.setText("Archivo Guardado Exitosamente");

    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JTextPane clientesRegistrados;
    private javax.swing.JTextField distanciaEntreVertices;
    private javax.swing.JTextField idVertice2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel mensaje;
    private javax.swing.JTextField nombreRegistro;
    private javax.swing.JTextField urbRegistro;
    // End of variables declaration//GEN-END:variables
}
