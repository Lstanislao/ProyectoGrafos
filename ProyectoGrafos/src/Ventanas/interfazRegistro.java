
package Ventanas;


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import Grafo.*;
import javax.swing.*;


/**
 *
 * @author sosag
 */
public class interfazRegistro extends javax.swing.JFrame {
    
    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    Integer id = 1;
    boolean cargarArchivo = false;
    boolean nuevoTxt=false;
    String nombreDelArchivoTxtSeleccionado;
    
    public interfazRegistro() {
        initComponents();
        this.setLocationRelativeTo(null);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        calleAveRegistro = new javax.swing.JTextField();
        nombreRegistro = new javax.swing.JTextField();
        urbRegistro = new javax.swing.JTextField();
        jButtonMenuRegistro = new javax.swing.JButton();
        registrarDatos = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("REGISTRO CLIENTE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("CALLE/AVENIDA :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setText("URBANZACION :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        getContentPane().add(calleAveRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 440, 40));

        nombreRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(nombreRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 440, 40));
        getContentPane().add(urbRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 440, 40));

        jButtonMenuRegistro.setBackground(new java.awt.Color(255, 0, 51));
        jButtonMenuRegistro.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        jButtonMenuRegistro.setForeground(new java.awt.Color(0, 153, 102));
        jButtonMenuRegistro.setText("Menu");
        jButtonMenuRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenuRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 90, 40));

        registrarDatos.setBackground(new java.awt.Color(0, 0, 0));
        registrarDatos.setForeground(new java.awt.Color(0, 153, 102));
        registrarDatos.setText("REGISTRAR");
        registrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarDatosActionPerformed(evt);
            }
        });
        getContentPane().add(registrarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        jButtonSalir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 0, 0));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 90, 40));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setText("NOMBRE :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jButton5.setText("CREAR UN NUEVO ARCHIVO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jButton4.setText("CARGAR ARCHIVO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuRegistroActionPerformed
        interfazMenu a = new interfazMenu();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMenuRegistroActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        Grafo mygraph  = Central.getGraph();
        System.exit(0);
      
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void registrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarDatosActionPerformed
        Grafo mygraph  = Central.getGraph();
        mygraph.imprimirTabla();
        String ultimoCargado = Central.Actual;
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        String cadena = "";

        //System.out.println(cargarArchivo+" "+nombreDelArchivoTxtSeleccionado+" "+ultimoCargado+"sirve por favor");
        if(nombreDelArchivoTxtSeleccionado==null && ultimoCargado==null)
        {
         JOptionPane.showMessageDialog(this, "Cargue o cree un Txt por favor ");
        }
        else
        {
            if ((!cargarArchivo)&&(nuevoTxt)){
            //System.out.println("Primero");
            
            archivo = new File(nombreDelArchivoTxtSeleccionado);
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
            nuevoTxt=false;  
        } /*else if((!cargarArchivo))
        {
            //System.out.println(ultimoCargado+"FLAG");
            //System.out.println("segundo");
            try {
                FileReader leer;
                BufferedReader almacenamiento;
                try {
                    
                    nombreDelArchivoTxtSeleccionado=ultimoCargado;
                    leer = new FileReader(nombreDelArchivoTxtSeleccionado);
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
                escribir = new FileWriter(nombreDelArchivoTxtSeleccionado, true);
                linea = new PrintWriter(escribir);    
                linea.println(cadena);
                linea.close();
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(interfazRegistro.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        else {
            try {
                FileReader leer;
                BufferedReader almacenamiento;
                try {
                    
                    nombreDelArchivoTxtSeleccionado=ultimoCargado;
                    leer = new FileReader(nombreDelArchivoTxtSeleccionado);
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
                escribir = new FileWriter(nombreDelArchivoTxtSeleccionado, true);
                linea = new PrintWriter(escribir);    
                linea.println(cadena);
                linea.close();
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(interfazRegistro.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        mygraph.NuevoV(nombreRegistro.getText());//Cuando lo necesite lo genero 
        interfazRegistroDistancia a = new interfazRegistroDistancia();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.setVisible(false);
        }

        
        
        
    }//GEN-LAST:event_registrarDatosActionPerformed

    private void nombreRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreRegistroActionPerformed
        
    }//GEN-LAST:event_nombreRegistroActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    
        cargarArchivo = true;
        if (seleccionado.showDialog(this,"CARGAR ARCHIVO")==JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    nombreDelArchivoTxtSeleccionado = archivo.getName();
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR. Por favor seleccione un archivo de texto (.txt)");
                }
            }
            Central.setActual(nombreDelArchivoTxtSeleccionado);
            Central.CargarGrafo();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    cargarArchivo = false;
    nuevoTxt=true;
    nombreDelArchivoTxtSeleccionado = "CLIENTES" + JOptionPane.showInputDialog("Introduzca el nombre de su nuevo archivo de texto") + ".txt";
    Central.setActual(nombreDelArchivoTxtSeleccionado);
    }//GEN-LAST:event_jButton5ActionPerformed

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
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonMenuRegistro;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nombreRegistro;
    private javax.swing.JButton registrarDatos;
    private javax.swing.JTextField urbRegistro;
    // End of variables declaration//GEN-END:variables
}
