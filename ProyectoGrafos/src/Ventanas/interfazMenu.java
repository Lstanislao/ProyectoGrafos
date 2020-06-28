package Ventanas;

import java.io.File;
import Grafo.*;
import static Grafo.Archivo.VerificarFormatoArchivo;
import static Grafo.Central.graph;
import static Grafo.DibujarGrafo.Dibujar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class interfazMenu extends javax.swing.JFrame {

    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    String nombreDelArchivoTxtSeleccionado;

    /* 
    Selección del archivo de datos por defecto si es primera vez que se inicializa
    el sistema, esto se debe a que si el usuario no carga un archivo de datos, 
    entonces ya tenga uno que puede utlizar.
     */
    public interfazMenu() {
        boolean PrimeraVezInciado = Central.getIniciado();
        if (!PrimeraVezInciado) {
            String archivoActual = Central.getActual();
            File porDefecto = new File("ArchivoPorDefecto.txt");
            File actual = new File(archivoActual);
            Archivo.copiarTxt(actual, porDefecto);
            Central.CargarGrafo1();
            Central.setInciado(true);
        }

        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrar.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 40, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/upload.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 50, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delivery.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pin.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 40, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grafo icon.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 90, 50));

        jButtonSalir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 0, 0));
        jButtonSalir.setText("SALIR");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 90, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jButton3.setText("Instrucciones");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jButton6.setText("Cargar Archivo de Datos");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 250, 40));

        jButton5.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jButton5.setText("Crear Nueva Ruta");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 210, 40));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jButton4.setText("Registrar Nuevo Cliente");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 250, 40));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jButton8.setText("Hacer un Delivery");
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 210, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jButton1.setText("Graficar Grafo");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 210, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/deliveryLogo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/motico.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edificiosIcon.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Light-Blue-Gradient-Background-Graphics-3943096-1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*
        Botón Graficar Grafo: Abre una ventana con el dibujo del grafo del 
        archivo de datos que se este utilizando
         */

        Dibujar(graph);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Apertura de la interfaz Instrucciones y cierre de la interfaz de Menu

        interfazInstrucciones a = new interfazInstrucciones();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        /*  
        Apertura de la interfaz de Registro con un String llamado "texto" de
        parametro. Esto permite que ese String sea impreso automaticamente en el
        TextArea del lado derecho de la interfaz Registro al inicializarse. El
        texto contiene la lista de clientes registradas en el archivo de datos 
        que se esté utilizando.
         */

        String texto = Archivo.ClientesPantalla();
        interfazDeRegistro a = new interfazDeRegistro(texto);
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        /*  
        Boton Cargar Archivo de Datos: Permite seleccionar un archivo ".txt" del
        ordenador para su utilizacion en el sistema. Este archivo de datos es 
        leido por el sistema para asegurarse que cumpla con el formato adecuado.
        De lo contrario aparecerá un mensaje indicando cual debe ser el formato.
         */

        if (seleccionado.showDialog(this, "CARGAR ARCHIVO") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    nombreDelArchivoTxtSeleccionado = archivo.getName();
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR. Por favor seleccione un archivo de texto (.txt)");
                }
            }
        }

        if (VerificarFormatoArchivo(archivo)) {
            int cambiar = JOptionPane.showConfirmDialog(this, "Es importante que el archivo seleccionado se encuentre en la carpeta del proyecto. \nSe guardaran los datos actuales en memoria y se procedera a cargar el nuevo archivo. Desea seguir?");
            if (cambiar == 0) {
                String archivoActual = Central.Actual;
                File actual = new File(archivoActual);
                File porDefecto = new File("ArchivoPorDefecto.txt");
                File porCargarse = new File(nombreDelArchivoTxtSeleccionado);
                Archivo.copiarTxt(porDefecto, actual);
                Archivo.copiarTxt(porCargarse, porDefecto);
                Central.CargarGrafo1();
                Central.setActual(nombreDelArchivoTxtSeleccionado);
            }
        } else {
            String mensaje = "El formato del archivo seleccionado no es válido.\n"
                    + "El formato del archivo debe ser:\n\n"
                    + "clientes\nID,nombre,urbanización,calle/avenida\n"
                    + "...[más clientes]...\ncaminos\norigen,destino,distancia\n"
                    + "...[más caminos]...";
            JOptionPane.showMessageDialog(rootPane, mensaje);
        }


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        /*  
        Apertura de la interfaz de Nuevas Rutas con un String llamado "texto" de
        parametro. Esto permite que ese String sea impreso automaticamente en el
        TextArea del lado derecho de la interfaz Nuevas Rutas al inicializarse. 
        El texto contiene la lista de clientes registradas en el archivo de datos
        que se esté utilizando.
         */

        String texto = Archivo.ClientesPantalla();
        interfazNuevaRuta a = new interfazNuevaRuta(texto);
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.setVisible(false);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        /*  
        Apertura de la interfaz de Delivery con un String llamado "texto" de 
        parametro. Esto permite que ese String sea impreso automaticamente en el
        TextArea del lado derecho de la interfaz Delivery al inicializarse. El
        texto contiene la lista de clientes registradas en el archivo de datos 
        que se esté utilizando.
         */

        String texto = Archivo.ClientesPantalla();
        interfazDelivery a = new interfazDelivery(texto);
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.setVisible(false);


    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(interfazMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
