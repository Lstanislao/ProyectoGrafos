/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Grafo.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author sosag
 */
public class interfazDelivery extends javax.swing.JFrame {

    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    String nombreDelArchivoTxtSeleccionado;
    
    public boolean validarArchivoCargado()
    {
        String cargado = Central.getActual();
        if (cargado != null) 
        {
            return true;
        }else {
            JOptionPane.showMessageDialog(this, "No ha cargado ningun archivo");
            return false;
        }
    }

    public interfazDelivery() {
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
        jButtonSalir = new javax.swing.JButton();
        idDestino = new javax.swing.JTextField();
        outputCaminoMasCorto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonBFS = new javax.swing.JButton();
        jButtonDFS = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Salida = new javax.swing.JTextPane();
        jButtonMenuDelivery = new javax.swing.JButton();
        jButtonEnterRegistro = new javax.swing.JButton();
        jButtonActualizarLista = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        clientesRegistrados = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jButtonEnterRegistro1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setText("DELIVERY");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setText("Oprima uno de los sig. botones para ver la distantcia mas corta por el metodo Floyd o Dijkstra:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jButtonSalir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 0, 0));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 570, 90, 40));

        idDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(idDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 50, 30));

        outputCaminoMasCorto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputCaminoMasCortoActionPerformed(evt);
            }
        });
        getContentPane().add(outputCaminoMasCorto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 720, 30));

        jLabel5.setText("Impresión del Grafo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jButtonBFS.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButtonBFS.setText("BFS");
        jButtonBFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBFSActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 90, 40));

        jButtonDFS.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButtonDFS.setText("DFS");
        jButtonDFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDFSActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 90, 40));

        jScrollPane1.setViewportView(Salida);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 340, 230));

        jButtonMenuDelivery.setBackground(new java.awt.Color(255, 255, 255));
        jButtonMenuDelivery.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        jButtonMenuDelivery.setForeground(new java.awt.Color(0, 153, 102));
        jButtonMenuDelivery.setText("Menu");
        jButtonMenuDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuDeliveryActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenuDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 90, 40));

        jButtonEnterRegistro.setText("DIJKSTR");
        jButtonEnterRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEnterRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 80, 40));

        jButtonActualizarLista.setText("SELECCIONAR LISTA");
        jButtonActualizarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarListaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonActualizarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jScrollPane3.setViewportView(clientesRegistrados);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 320, 260));

        jLabel7.setText("A continuacion, indique el iD de su destino:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jButtonEnterRegistro1.setText("FLOYD");
        jButtonEnterRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterRegistro1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEnterRegistro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 80, 40));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 2, 18)); // NOI18N
        jLabel6.setText("OBTENCION DEL CAMINO MAS CORTO ENTRE LA EMPRESA Y UN DESTINO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/morado.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonMenuDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuDeliveryActionPerformed
        interfazMenu a = new interfazMenu();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMenuDeliveryActionPerformed

    private void jButtonEnterRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterRegistroActionPerformed
        Grafo mygraph = Central.getGraph();
        boolean cargado = validarArchivoCargado() ;
        int destino =Integer.parseInt(idDestino.getText());
        String output = "";
        destino=mygraph.IndiceVerticeInt(destino-1);
        if (cargado) {
            if(destino!=-1)
            {
                Dijkstra camino = new Dijkstra(mygraph,0,(destino));
                output=camino.CaminoFormato();
                outputCaminoMasCorto.setText(output);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Vertice Invalido , intentelo nuevamente");
                idDestino.setText("");
            }
        }
    }//GEN-LAST:event_jButtonEnterRegistroActionPerformed

    private void jButtonActualizarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarListaActionPerformed
        /*File miArchivo;
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena, texto="";
        miArchivo = new File("ArchivoDeTextoClientes.txt");
        
        try {
            leer = new FileReader(miArchivo);
            almacenamiento = new BufferedReader(leer);
            
            try {
                while((cadena = almacenamiento.readLine())!=null){
                    texto += cadena + "\n";
                }
                clientesRegistrados.setText(texto);
            } catch (IOException ex) {
                Logger.getLogger(interfazDelivery.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(interfazDelivery.class.getName()).log(Level.SEVERE, null, ex);
        }*/

        String ultimoCargado = Central.Actual;
        if (seleccionado.showDialog(this, "CARGAR ARCHIVO") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    nombreDelArchivoTxtSeleccionado = archivo.getName();
                    ultimoCargado = Central.Actual;
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
        Central.setActual(nombreDelArchivoTxtSeleccionado);
        Central.CargarGrafo();
    }//GEN-LAST:event_jButtonActualizarListaActionPerformed

    private void jButtonEnterRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterRegistro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEnterRegistro1ActionPerformed

    private void jButtonDFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDFSActionPerformed
        Grafo mygraph = Central.getGraph();
        boolean cargado = validarArchivoCargado() ;
        String output = "";
        if (cargado) {
            output = mygraph.OutputDFS();
            Salida.setText(output);
        }


    }//GEN-LAST:event_jButtonDFSActionPerformed

    private void jButtonBFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBFSActionPerformed
        Grafo mygraph = Central.getGraph();
        boolean cargado = validarArchivoCargado() ;
        String output = "";
        if (cargado ) {
            output = mygraph.BFS(0);
            Salida.setText(output);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBFSActionPerformed

    private void outputCaminoMasCortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputCaminoMasCortoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputCaminoMasCortoActionPerformed

    private void idDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idDestinoActionPerformed

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
            java.util.logging.Logger.getLogger(interfazDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazDelivery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane Salida;
    private javax.swing.JTextPane clientesRegistrados;
    private javax.swing.JTextField idDestino;
    private javax.swing.JButton jButtonActualizarLista;
    private javax.swing.JButton jButtonBFS;
    private javax.swing.JButton jButtonDFS;
    private javax.swing.JButton jButtonEnterRegistro;
    private javax.swing.JButton jButtonEnterRegistro1;
    private javax.swing.JButton jButtonMenuDelivery;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField outputCaminoMasCorto;
    // End of variables declaration//GEN-END:variables
}
