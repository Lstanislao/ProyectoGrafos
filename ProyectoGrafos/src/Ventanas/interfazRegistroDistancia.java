/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Grafo.Central;
import Grafo.Grafo;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author sosag
 */
public class interfazRegistroDistancia extends javax.swing.JFrame {

    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    String nombreDelArchivoTxtSeleccionado;

    public boolean Validacion(String cadena) {
        int num;
        try {
            num = Integer.parseInt(cadena);
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public interfazRegistroDistancia() {
        initComponents();
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
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientesRegistrados = new javax.swing.JTextPane();
        jButtonSeleccionarLista = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        distanciaEntreVertices = new javax.swing.JTextField();
        verticeOrigen = new javax.swing.JTextField();
        verticeNuevo = new javax.swing.JTextField();
        jButtonSalir = new javax.swing.JButton();
        jButtonMenuRegDist = new javax.swing.JButton();
        registrarDatos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setText("REGISTRO DISTANCIA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setText("Distancia (Km) :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jScrollPane1.setViewportView(clientesRegistrados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 440, 230));

        jButtonSeleccionarLista.setText("SELECCIONAR LISTA");
        jButtonSeleccionarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarListaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSeleccionarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setText("iD Cliente Origen :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setText("iD Cliente Nuevo :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));
        getContentPane().add(distanciaEntreVertices, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 50, 40));

        verticeOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verticeOrigenActionPerformed(evt);
            }
        });
        getContentPane().add(verticeOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 50, 40));

        verticeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verticeNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(verticeNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 50, 40));

        jButtonSalir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 0, 0));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 90, 40));

        jButtonMenuRegDist.setBackground(new java.awt.Color(255, 0, 51));
        jButtonMenuRegDist.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        jButtonMenuRegDist.setForeground(new java.awt.Color(0, 153, 102));
        jButtonMenuRegDist.setText("Menu");
        jButtonMenuRegDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuRegDistActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenuRegDist, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 90, 40));

        registrarDatos.setBackground(new java.awt.Color(0, 0, 0));
        registrarDatos.setForeground(new java.awt.Color(0, 153, 102));
        registrarDatos.setText("REGISTRAR");
        registrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarDatosActionPerformed(evt);
            }
        });
        getContentPane().add(registrarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, 40));

        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("LIMPIAR CAMPOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pastel.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSeleccionarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarListaActionPerformed
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
        File miArchivo;
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena, texto = "";
        miArchivo = new File(nombreDelArchivoTxtSeleccionado);

        try {
            leer = new FileReader(miArchivo);
            almacenamiento = new BufferedReader(leer);

            try {
                while ((cadena = almacenamiento.readLine()) != null) {
                    texto += cadena + "\n";
                }
                clientesRegistrados.setText(texto);
            } catch (IOException ex) {
                Logger.getLogger(interfazDelivery.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(interfazDelivery.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonSeleccionarListaActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonMenuRegDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuRegDistActionPerformed
        interfazMenu a = new interfazMenu();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMenuRegDistActionPerformed

    private void registrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarDatosActionPerformed

        boolean valid1 = Validacion(verticeOrigen.getText());
        boolean valid2 = Validacion(verticeNuevo.getText());
        boolean valid3 = Validacion(distanciaEntreVertices.getText());

        if (valid1 != false && valid2 != false && valid3 != false) {

            Grafo mygraph = Central.getGraph();
            //UNA COSA SI SE LE VA PASAR UN ID AL GRAFO HAY QUE RESTARLE 1 PORQUE EN EL ARREGLO DONDE ESTAN EMPIEZA DESDE 0
            boolean valido = mygraph.NuevoA((Integer.parseInt(verticeOrigen.getText())) - 1, (Integer.parseInt(verticeNuevo.getText())) - 1, Integer.parseInt(distanciaEntreVertices.getText()));
            mygraph.ImprimirTabla();
            if (valido) {
                File archivo;
                FileWriter escribir;
                PrintWriter linea;
                String cadena = "";
                nombreDelArchivoTxtSeleccionado = Central.getActual();
                archivo = new File(nombreDelArchivoTxtSeleccionado.replace("CLIENTES", "CAMINOS"));

                if (!archivo.exists()) {
                    try {
                        archivo.createNewFile();
                        cadena = verticeOrigen.getText() + ", " + verticeNuevo.getText() + ", " + distanciaEntreVertices.getText();
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
                                while (almacenamiento.readLine() != null) {
                                }
                            } catch (IOException ex) {
                                Logger.getLogger(interfazDelivery.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(interfazDelivery.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        cadena = verticeOrigen.getText() + ", " + verticeNuevo.getText() + ", " + distanciaEntreVertices.getText();
                        escribir = new FileWriter(archivo, true);
                        linea = new PrintWriter(escribir);
                        linea.println(cadena);
                        linea.close();
                        escribir.close();

                    } catch (IOException ex) {
                        Logger.getLogger(interfazRegistro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
            interfazRegistroDistancia a = new interfazRegistroDistancia();
            a.setVisible(true);
            a.setLocationRelativeTo(null);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "ERROR. Por favor ingrese valores numericos");
        }
    }//GEN-LAST:event_registrarDatosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        verticeOrigen.setText("");
        verticeNuevo.setText("");
        distanciaEntreVertices.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void verticeOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verticeOrigenActionPerformed

    }//GEN-LAST:event_verticeOrigenActionPerformed

    private void verticeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verticeNuevoActionPerformed

    }//GEN-LAST:event_verticeNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(interfazRegistroDistancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazRegistroDistancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazRegistroDistancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazRegistroDistancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazRegistroDistancia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane clientesRegistrados;
    private javax.swing.JTextField distanciaEntreVertices;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonMenuRegDist;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSeleccionarLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton registrarDatos;
    private javax.swing.JTextField verticeNuevo;
    private javax.swing.JTextField verticeOrigen;
    // End of variables declaration//GEN-END:variables
}
