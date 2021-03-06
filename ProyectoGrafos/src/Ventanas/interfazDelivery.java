package Ventanas;

import Grafo.*;
import static Grafo.DibujarGrafo.DibujarRutaMasCorta;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class interfazDelivery extends javax.swing.JFrame {

    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    String nombreDelArchivoTxtSeleccionado;

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

    public interfazDelivery() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    public interfazDelivery(String lista) {
        initComponents();
        this.setLocationRelativeTo(null);
        clientesRegistrados.setText(lista);

    }

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
        jScrollPane3 = new javax.swing.JScrollPane();
        clientesRegistrados = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jButtonFloyd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
        jLabel2.setText("DELIVERY");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jLabel3.setText("Oprima uno de los sig. botones para ver la distancia m??s corta por el m??todo Floyd o Dijkstra:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jButtonSalir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 0, 0));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 590, 90, 40));

        idDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(idDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 50, 30));

        outputCaminoMasCorto.setEditable(false);
        outputCaminoMasCorto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputCaminoMasCortoActionPerformed(evt);
            }
        });
        getContentPane().add(outputCaminoMasCorto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 720, 30));

        jLabel5.setText("Impresi??n del Grafo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        jButtonBFS.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButtonBFS.setText("BFS");
        jButtonBFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBFSActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 90, 40));

        jButtonDFS.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButtonDFS.setText("DFS");
        jButtonDFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDFSActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 90, 40));

        Salida.setEditable(false);
        jScrollPane1.setViewportView(Salida);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 380, 230));

        jButtonMenuDelivery.setBackground(new java.awt.Color(255, 255, 255));
        jButtonMenuDelivery.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        jButtonMenuDelivery.setForeground(new java.awt.Color(0, 153, 102));
        jButtonMenuDelivery.setText("Menu");
        jButtonMenuDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuDeliveryActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenuDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 90, 40));

        jButtonEnterRegistro.setText("DIJKSTRA");
        jButtonEnterRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEnterRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 110, 40));

        clientesRegistrados.setEditable(false);
        jScrollPane3.setViewportView(clientesRegistrados);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 360, 260));

        jLabel7.setText("A continuaci??n, indique el iD de su destino:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        jButtonFloyd.setText("FLOYD");
        jButtonFloyd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFloydActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFloyd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 80, 40));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 2, 18)); // NOI18N
        jLabel6.setText("OBTENCI??N DEL CAMINO M??S CORTO ENTRE LA EMPRESA Y UN DESTINO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delivery_1.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Light-Blue-Gradient-Background-Graphics-3943096-1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonMenuDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuDeliveryActionPerformed
        // Apertura de la interfaz Menu y cierre de la interfaz de Delivery

        interfazMenu a = new interfazMenu();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMenuDeliveryActionPerformed

    private void jButtonEnterRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterRegistroActionPerformed
        /* 
        Boton Dijkstra: Toma el valor ingresado en la casilla iD destino, que 
        esta validado como un numero entero, luego genera el camino mas corto a 
        recorrer utilizando el metodo de Dijkstra. Una vez impreso en la casilla
        output, se abre una ventana con el camino a recorrer graficado.
         */

        boolean validId = Validacion(idDestino.getText());
        if ("".equals(idDestino.getText()) || !validId) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un valor num??rico en la casilla del iD de su destino");
        } else {

            Grafo mygraph = Central.getGraph();
            int destino = Integer.parseInt(idDestino.getText());
            String output = "";
            destino = mygraph.IndiceVerticeInt(destino - 1);
            if (destino != -1) {
                Dijkstra camino = new Dijkstra(mygraph, 0, (destino));
                output = camino.CaminoFormato();
                outputCaminoMasCorto.setText(output);

                DibujarRutaMasCorta(mygraph, output);
            } else {
                JOptionPane.showMessageDialog(this, "Vertice Invalido, intentelo nuevamente");
                idDestino.setText("");
            }
        }
    }//GEN-LAST:event_jButtonEnterRegistroActionPerformed

    private void jButtonFloydActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFloydActionPerformed
        /* 
        Boton Floyd: Toma el valor ingresado en a casilla iD destino, que esta 
        validado como un numero entero, luego genera el camino mas corto a recorrer 
        utilizando el metodo de Floyd. Una vez impreso en la casilla output, se 
        abre una ventana con el camino a recorrer graficado.
         */

        boolean validId = Validacion(idDestino.getText());
        if ("".equals(idDestino.getText()) || !validId) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un valor num??rico en la casilla del iD de su destino");
        } else {
            Grafo mygraph = Central.getGraph();
            int destino = Integer.parseInt(idDestino.getText());
            String output = "";
            destino = mygraph.IndiceVerticeInt(destino - 1);
            if (destino != -1) {
                FloydWarshall camino = new FloydWarshall();
                output = camino.Floyd(0, destino, mygraph);
                outputCaminoMasCorto.setText(output);

                DibujarRutaMasCorta(mygraph, output);
            } else {
                JOptionPane.showMessageDialog(this, "Vertice Invalido , intentelo nuevamente");
                idDestino.setText("");
            }
        }
    }//GEN-LAST:event_jButtonFloydActionPerformed

    private void jButtonDFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDFSActionPerformed
        /*
        Boton DFS: Imprime el  grafo textualmente en el Text Area de la derecha 
        de la interfaz utilizando el recorrido en profundidad DFS.
         */

        Grafo mygraph = Central.getGraph();
        String output = "";
        output = mygraph.OutputDFS(0);
        Salida.setText(output);

    }//GEN-LAST:event_jButtonDFSActionPerformed

    private void jButtonBFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBFSActionPerformed
        /*
        Boton BFS: Imprime el grafo textualmente en el Text Area de la derecha 
        de la interfaz utilizando el recorrido en anchura BFS.
         */

        Grafo mygraph = Central.getGraph();
        String output = "";
        output = mygraph.BFS(0);
        Salida.setText(output);
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
    private javax.swing.JButton jButtonBFS;
    private javax.swing.JButton jButtonDFS;
    private javax.swing.JButton jButtonEnterRegistro;
    private javax.swing.JButton jButtonFloyd;
    private javax.swing.JButton jButtonMenuDelivery;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField outputCaminoMasCorto;
    // End of variables declaration//GEN-END:variables
}
