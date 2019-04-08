//Crado por Brandon Eliu Cervantes y Co.
package Compilador.res;


import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class principal extends javax.swing.JFrame {
    
    JFileChooser seleccion = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    
    public principal() {
        initComponents();

        setTitle("Compilador");
        this.setLocationRelativeTo(this);
        contadorLinea.setEnabled(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        contadorLinea = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jSalida = new javax.swing.JTextPane();
        texto = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setToolTipText("");
        jScrollPane5.setOpaque(false);

        contadorLinea.setEditable(false);
        contadorLinea.setBackground(new java.awt.Color(232, 232, 232));
        contadorLinea.setColumns(2);
        contadorLinea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        contadorLinea.setRows(2);
        contadorLinea.setTabSize(2);
        contadorLinea.setText("1");
        contadorLinea.setToolTipText("");
        contadorLinea.setAutoscrolls(false);
        contadorLinea.setCaretColor(new java.awt.Color(51, 51, 255));
        contadorLinea.setFocusable(false);
        jScrollPane5.setViewportView(contadorLinea);

        areaTexto.setColumns(20);
        areaTexto.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        areaTexto.setRows(5);
        areaTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                areaTextoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                areaTextoKeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(areaTexto);

        jSalida.setEditable(false);
        jScrollPane1.setViewportView(jSalida);

        texto.setText("SALIDA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(texto)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        jMenuItem5.setText("Nuevo archivo");
        jMenu1.add(jMenuItem5);

        jMenuItem4.setText("Abrir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem6.setText("Guardar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mostrar");

        jMenuItem10.setText("Mostrar analisis Léxico");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem11.setText("Mostrar analisis Sintactico");
        jMenu2.add(jMenuItem11);

        jMenuItem12.setText("Mostrar analisis Semantico");
        jMenu2.add(jMenuItem12);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("Ayuda");

        jMenuItem3.setText("¿Como utilizar?");
        jMenu6.add(jMenuItem3);

        jMenuItem2.setText("Menú de caracteres");
        jMenu6.add(jMenuItem2);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Más...");

        jMenuItem1.setText("Acerca del programa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem1);

        jMenuItem9.setText("Cerrar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem9);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null, "PROYECYO DE COMPILADOR \n\n\n"
                + "UNIVERSIDAD NACIONAL AUTONOMA DE MEXICO \n"
                + "FACULTAD DE ESTUDIOS SUPERIORES ARAGON \n"
                + "CARRERA: INGENIERIA EN COMPUTACIÓN \n\n\n"
                + "MATERIA: COMPILADORES \n\n"
                + "PROFESOR: JORGE IVAN CAMPOS \n\n\n"
                + "EQUIPO CONFORMADO POR: \n"
                + "BRANDON ELIU CERVANTES JUAREZ \n"
                + "GABRIELA MABEL HERNANDEZ GUZMAN \n"
                + "ERICK HERNANDEZ AGUILERA \n"
                + "MIGUEL ALEXIS RODRIGUEZ PEÑA \n");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
//////////////// Botón de abrir  /////////////////////

if(seleccion.showDialog(null, "Abrir")== JFileChooser.APPROVE_OPTION){
    archivo=seleccion.getSelectedFile();
    if(archivo.canRead()){
        if(archivo.getName().endsWith("txt")){
            String documento = abrirArchivo(archivo);
            areaTexto.setText(documento);
        }else{
            JOptionPane.showConfirmDialog(null, "Archivo no compatible");
        }  
    }  
}

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        JOptionPane.showMessageDialog(null, "Saliendo del programal");
        System.exit(0);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
///////////////// Botón Guardar //////////////////////

if(seleccion.showDialog(null, "Guardar")== JFileChooser.APPROVE_OPTION){
    archivo=seleccion.getSelectedFile();
    
    if(archivo.getName().endsWith("txt")){
        String documento = areaTexto.getText();
        String mensaje =guardarArchivo(archivo, documento);
        if(mensaje !=null){
           JOptionPane.showMessageDialog(null, mensaje);
        }else{
            JOptionPane.showConfirmDialog(null, "Archivo no compatible");
        }  
               }else {
        JOptionPane.showConfirmDialog(null, "Guardar documento de texto");
    }
    
    }

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void areaTextoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaTextoKeyPressed
        if(!this.getTitle().contains("*")){
            this.setTitle(this.getTitle()+"*");
        }
        
    }//GEN-LAST:event_areaTextoKeyPressed

    private void areaTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaTextoKeyReleased

        if(evt.isControlDown() || evt.getKeyCode()==10 || evt.getKeyCode()==8 || evt.getKeyCode()==127){
            contarFilas();
        }
    }//GEN-LAST:event_areaTextoKeyReleased
/////////// Abrir archivo ////////////////////////////
    public String abrirArchivo(File archivo){
        String documento = "";
        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada.read())!=-1){
                char caracter = (char)ascci;
                documento += caracter;
            }
            
        }catch (Exception e) { 
        }
        return documento;   
    }
    
    /////////// Guardar archivo ////////////////////////////
    public String guardarArchivo(File archivo, String documento){
        String mensaje = "";
        try {
            salida = new FileOutputStream(archivo);
            byte[] bytxt = documento.getBytes();            
            salida.write(bytxt);
            mensaje = "Archivo guardado";
        }catch (Exception e) { 
        }
        return mensaje;   
    }
    
    /////////////////// Contador de filas //////////////////////////
    public void contarFilas() {
        int lineasTotales = areaTexto.getLineCount();
        contadorLinea.setText("1 \n");
        for (int i = 2; i <= lineasTotales; i++) {
            contadorLinea.setText(contadorLinea.getText() + i + "\n");
        }
    }
    
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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new AluminiumLookAndFeel());
                } catch (Exception e) {
                }
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JTextArea contadorLinea;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextPane jSalida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
