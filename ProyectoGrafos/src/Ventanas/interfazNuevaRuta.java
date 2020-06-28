
package Ventanas;

import Grafo.Archivo;
import Grafo.Central;
import static Grafo.Central.graph;
import Grafo.Grafo;
import java.io.File;
import javax.swing.JOptionPane;


public class interfazNuevaRuta extends javax.swing.JFrame {

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

    public interfazNuevaRuta() {
        initComponents();
    }

    public interfazNuevaRuta(String lista) {
        initComponents();
        this.setLocationRelativeTo(null);
        clientesRegistrados.setText(lista);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonMenu = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientesRegistrados = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        idVertice1 = new javax.swing.JTextField();
        idVertice2 = new javax.swing.JTextField();
        distanciaEntreVertices = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonMenu.setBackground(new java.awt.Color(255, 255, 255));
        jButtonMenu.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        jButtonMenu.setForeground(new java.awt.Color(0, 153, 102));
        jButtonMenu.setText("Menu");
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 90, 40));

        jButtonSalir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 0, 0));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 90, 40));

        clientesRegistrados.setEditable(false);
        jScrollPane1.setViewportView(clientesRegistrados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 390, 280));

        jLabel2.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
        jLabel2.setText("NUEVA RUTA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jButton1.setText("REGISTRAR DATOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 140, 40));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setText("iD Primer Vertice :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        idVertice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idVertice1ActionPerformed(evt);
            }
        });
        getContentPane().add(idVertice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 50, 40));
        getContentPane().add(idVertice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 50, 40));
        getContentPane().add(distanciaEntreVertices, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 50, 40));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setText("Distancia Entre los Vertices (km)");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setText("iD Segundo Vertice : ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        mensaje.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 200, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pin_1.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton2.setText("GUARDAR DATOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Light-Blue-Gradient-Background-Graphics-3943096-1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        //Apertura de la interfaz Menu y cierre de la interfaz de Nuevas Rutas  
        
        interfazMenu a = new interfazMenu();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*  Validación de existencia de los vertices ingresados en el grafo actual y que esos datos ingresados sean numeros
                enteros     
        */

        Grafo graph = Central.getGraph();
        boolean valid1 = Validacion(idVertice1.getText())
                && graph.IndiceVerticeInt(Integer.parseInt(idVertice2.getText())) != -1;
        boolean valid2 = Validacion(idVertice2.getText())
                && graph.IndiceVerticeInt(Integer.parseInt(idVertice2.getText())) != -1;
        boolean valid3 = Validacion(distanciaEntreVertices.getText());

        if (!valid1 || !valid2 || !valid3) {
            JOptionPane.showMessageDialog(this, "Por favor registre unicamente valores numericos");
        } else {
            //REGISTRAR LOS DATOS
            int v1 = Integer.parseInt(idVertice1.getText()) - 1;
            int v2 = Integer.parseInt(idVertice2.getText()) - 1;
            int dist = Integer.parseInt(distanciaEntreVertices.getText());
            graph.NuevoA(v1, v2, dist);
            mensaje.setText("Registro Existoso");
            Central.setGraph(graph);
            Archivo.EscribirGrafoEnTxt();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void idVertice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idVertice1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idVertice1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*  Copiando la informacion del archivo por defecto que utiliza el sistema y reescribiendo el archivo seleccionado
                por el usuario
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
            java.util.logging.Logger.getLogger(interfazNuevaRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazNuevaRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazNuevaRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazNuevaRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazNuevaRuta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane clientesRegistrados;
    private javax.swing.JTextField distanciaEntreVertices;
    private javax.swing.JTextField idVertice1;
    private javax.swing.JTextField idVertice2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mensaje;
    // End of variables declaration//GEN-END:variables
}
