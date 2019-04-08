//Crado por Brandon Eliu Cervantes y Co.
package Compilador.App.Logica;


import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class principalC extends javax.swing.JFrame {
    

    private String nuevoDir="";
    private String nuevoNom="";
    
    
    public principalC() {
        initComponents();

        setTitle("Compilador");
        this.setLocationRelativeTo(this);
        contadorLinea.setEnabled(true);
        areaTexto.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jSalida = new javax.swing.JTextPane();
        texto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        contadorLinea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        btnCompilar = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jSalida.setEditable(false);
        jScrollPane1.setViewportView(jSalida);

        texto.setText("SALIDA");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        contadorLinea.setEditable(false);
        contadorLinea.setBackground(new java.awt.Color(232, 232, 232));
        contadorLinea.setColumns(2);
        contadorLinea.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        contadorLinea.setRows(2);
        contadorLinea.setTabSize(2);
        contadorLinea.setText("1");
        contadorLinea.setToolTipText("");
        contadorLinea.setAutoscrolls(false);
        contadorLinea.setCaretColor(new java.awt.Color(51, 51, 255));
        contadorLinea.setFocusable(false);

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        areaTexto.setColumns(20);
        areaTexto.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        areaTexto.setRows(5);
        areaTexto.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        areaTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                areaTextoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                areaTextoKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(areaTexto);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contadorLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contadorLinea)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(texto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(16, 16, 16))
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
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
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

        jMenu2.setText("Acciones");

        jMenuItem10.setText("Mostrar analisis Léxico");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuBar1.add(jMenu2);

        btnCompilar.setText("Compilar");

        jMenuItem7.setText("Compilar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        btnCompilar.add(jMenuItem7);

        jMenuBar1.add(btnCompilar);

        jMenu6.setText("Ayuda");

        jMenuItem2.setText("Menú de caracteres");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
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
 abrirArchivos abrir=new abrirArchivos(this, true, this);
 abrir.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
      mostrarTokens vtk=new mostrarTokens(this, true, nuevoDir, this);
        vtk.show();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        JOptionPane.showMessageDialog(null, "Saliendo del programal");
        System.exit(0);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
///////////////// Botón Guardar //////////////////////
        if(Guardar())
            JOptionPane.showMessageDialog(this,"CompiladorEjemplo - Guardado con exito");
        else
            JOptionPane.showMessageDialog(this,"CompiladorEjemplo - No se puede guardar el archivo");
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

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
/////////////// Compilar /////////////////////

    try {
            Guardar();
            Process p = Runtime.getRuntime().exec("../compiladorEnC.exe " + nuevoDir);
            p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = reader.readLine();
            String el[]=line.split("-");
            while(el.length<2) {
                line = reader.readLine();
                el=line.split("-");
            }
            if(line!=null){
                
                if(el[0].equals("Operacion exitosa")){
                    jSalida.setText("Compilado con exito.\nNumero de filas compiladas: "+el[1]);
                }
                else{
                    jSalida.setText("Error en la linea: "+el[1]);
                }
            }

        } catch (Exception e1) {
            JOptionPane.showMessageDialog(this, e1.getMessage());
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        nuevoArchivo nuevo=new nuevoArchivo(this, true,this);
        nuevo.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
/////////////// Abrir menu de caracteres ////////////////
        JOptionPane.showMessageDialog(null, "Menú de caracteres aceptados.\n" +
"\".\" = Punto\n" +
"\"{\" = Abrir llave\n" +
"\"}\" = Cerrar llave\n" +
"\";\" = Punto y coma\n" +
"\",\" = Coma\n" +
"\")\" = Cerrar paréntesis\n" +
"\"(\" = Abrir paréntesis\n" +
"\"[\" = Abrir corchetes\n" +
"\"]” = Cerrar corchetes\n" +
"\"if\" = Condición IF (Si)\n" +
"\"elseif\"	= Condición ELSEIF (SINO)\n" +
"\"else\" = Condición ELSE (NO)\n" +
"\"for\" = Ciclo FOR (Para)\n" +
"\"while\"	= Función WHILE (Mientras)\n" +
"\"void\"	= Función VOID\n" +
"\"main\"	= Función MAIN\n" +
"\"int\" = Números enteros\n" +
"\"decimal\" = Números decimales\n" +
"\"boolean” = Numeros boleanos\n" +
"\"string\"	 = Valores String\n" +
"\"+\" = Suma\n" +
"\"-\" = Resta\n" +
"\"*\" = Multiplicación\n" +
"\"/\" = Division\n" +
"\"++\" = Aumentar\n" +
"\"--\" = Disminuir\n" +
"\"=\" = Asignar\n" +
"\">\" = Mayor");
    }//GEN-LAST:event_jMenuItem2ActionPerformed
        /////////// Guardar archivo ////////////////////////////
    public boolean Guardar(){
        FileOutputStream out;
        PrintStream p;
        try {
            out = new FileOutputStream(nuevoDir);
            p = new PrintStream(out);
            p.println(this.areaTexto.getText());
            p.close();
            this.setTitle(this.getTitle().replace("*", ""));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    /////////////////// Habilitar campos /////////////////
    
        public void habilitarCampo(String dirnovo, String nomnovo){
        this.setTitle("Compilador");
        this.nuevoNom=nomnovo;
        this.nuevoDir=dirnovo+nuevoNom+".jx";
        this.setTitle(this.getTitle()+" - "+nuevoDir);
        areaTexto.enable(true);
        contarFilas();
    }
             
/////////////////////// Habilitar campos //////////////////////

 public void habilitarCampo(String novoDir){
        this.setTitle("Compilador");
        this.nuevoDir=novoDir;
        try {
            FileInputStream fstream = new FileInputStream(nuevoDir);
            DataInputStream in = new DataInputStream(fstream);
            this.areaTexto.setText("");
            while (in.available() != 0) {
                this.areaTexto.setText(this.areaTexto.getText() + in.readLine() + "\n");
            }
            in.close();
            this.setTitle(this.getTitle()+" - "+nuevoDir);
            areaTexto.enable(true);
            contarFilas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"File input error");
        }
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new AluminiumLookAndFeel());
                } catch (Exception e) {
                }
                new principalC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JMenu btnCompilar;
    private javax.swing.JTextArea contadorLinea;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextPane jSalida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
