
package Ventanas;


public class interfazInstrucciones extends javax.swing.JFrame {


    public interfazInstrucciones() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
        jLabel2.setText("INSTRUCCIONES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Bienvenidos a DELIVERY, un sistema diseñado por Oriana Gonzalez, Luis Stanislao y Guillermo\nSosa que permite a empleados encargados de realizar las entregas, optimizar sus recorridos a \npartir de las rutas entre los destinos de entrega.\n\nA través de la ventana de Menu podrá realizar distintas acciones.\n\nSi desea cargar un archivo de datos especifico, oprima la primera opción llamada \"Cargar \nArchivo de Datos\", se abrirá una ventana que le permitirá localizar su archivo .txt en su\nordenador. En caso de no cargar ningún archivo de datos, estará utilizando un archivo de \ndatos proporcionado por el sistema.\n\nSi desea registrar un nuevo cliente, podrá hacerlo oprimiendo la segunda opsión llamada\n\"Registrar Nuevo Cliente\", esto lo abrirá otra ventana donde deberá colocar datos personales \ndel cliente, iD del punto a donde se conctará y la distancia entre dichos puntos. A su derecha\ntendrá una pantalla con los iDs de los clientes ya registrados en el archivo de datos que se \nesté utilizando y en la parte inferior contará con dos botones, uno para registrar los datos y\notro para guardar dichos datos en su archivo de datos.\n\nSi desea crear una nueva ruta entre cualesquiera dos clientes ya existentes en el archivo de \ndatos que se esté utilizando podrá hacerlo oprimiendo la tercera opción llamada \"Crear \nNueva Ruta\", esto abrirá otra ventana donde deberá colocar los iDs de los dos clientes que\nva a conectar y la distancia entre dichos puntos. De igual manera que el la ventana de registro\ncontará con dos botones en la zona inferior para Registrar y Guardar los nuevos datos.\n\nPara realizar un encargo (\"Delivery\"), oprima la cuarta opción en el menu llamada \"Hacer un\nDelivery\", esto abrirá una nueva ventana donde tendrá dos ventanas. La ventana izquierda\ntendrá los datos registrados en el archivo de datos seleccionado y en la ventana derecha\npodrá observar el recorrido del grafo por DFS y BFS si oprime dichos botones que estan por\nencima de la pantalla. En la parte inferior tendrá la opcion de eonctrar el camino mas corto \nentre la empresa y cualquier cliente registrado. Para esto deberá colocar el iD del cliente al \nque desea hacer el encargo en el recuadro indicado y oprimir cualesquiera de los dos \nbotones FLOYD o DJISTRAK dependiendo del metodo que desee utilizar. Esto abrirá una ventana\ndonde podrá observar gráficamente el grafo y el recorrido solicitado.\n\nY por último, tiene la quita opción en el menu, llamado \"Graficar Grafo\" donde al oprimirse se\nabrirá una ventana que graficará el grafo del archivo eleccionado. \n\nEsperamos que esta información le ayude a tener la mejor experiencia posible al utilizar el\nsistema DELIVERY.\n");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 630, 280));

        jButtonMenu.setBackground(new java.awt.Color(255, 255, 255));
        jButtonMenu.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        jButtonMenu.setForeground(new java.awt.Color(0, 153, 102));
        jButtonMenu.setText("Menu");
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Light-Blue-Gradient-Background-Graphics-3943096-1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        //Apertura de la interfaz Menu y cierre de la interfaz de Registro
        
        interfazMenu a = new interfazMenu();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMenuActionPerformed

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
            java.util.logging.Logger.getLogger(interfazInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazInstrucciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
