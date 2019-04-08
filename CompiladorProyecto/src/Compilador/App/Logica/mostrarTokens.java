package Compilador.App.Logica;


import static Compilador.App.Logica.tokens.yytname;
import static Compilador.App.Logica.tokens.yytoknum;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class mostrarTokens extends javax.swing.JDialog {

    
    public mostrarTokens(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Analisis sintactico - Mostrar Tokens");
    }

    public mostrarTokens(java.awt.Frame parent, boolean modal, String nuevoDir, principalC guardar) {
        super(parent, modal);
        initComponents();
        this.setTitle("Analisis sintactico - Mostrar Tokens");
        this.setLocationRelativeTo(null);
        try {
            guardar.Guardar();
            Process p = Runtime.getRuntime().exec(".../compiladorEnC.exe " + nuevoDir);
            p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = reader.readLine();
            String el[]=line.split("-");
            while(line!=null && el.length<2) {
                int id=Integer.parseInt(line);
                Object ob[]=new Object[2];
                ob[0]=yytname[id];
                ob[1]=yytoknum[id];
                ((DefaultTableModel)tokens.getModel()).addRow(ob);
                line = reader.readLine();
                el=line.split("-");
            }

        } catch (Exception e1) {
            JOptionPane.showMessageDialog(this, e1.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tokens = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tokens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Token", "Token"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tokens);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mostrarTokens dialog = new mostrarTokens(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tokens;
    // End of variables declaration//GEN-END:variables
}
