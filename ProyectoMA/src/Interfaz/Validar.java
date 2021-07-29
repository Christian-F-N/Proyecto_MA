/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Validar extends javax.swing.JFrame {

   

    /**
     * Creates new form Validar
     */
    public Validar() {
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

        jPSalir = new javax.swing.JPanel();
        jlMinimizar = new javax.swing.JLabel();
        jlSalir = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jBRegresar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPSalir.setBackground(new java.awt.Color(255, 255, 255));
        jPSalir.setForeground(new java.awt.Color(255, 255, 255));
        jPSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jlMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMinimizarMouseClicked(evt);
            }
        });
        jPSalir.add(jlMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jlSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Multiply_32px.png"))); // NOI18N
        jlSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlSalirMouseClicked(evt);
            }
        });
        jPSalir.add(jlSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, -1));

        getContentPane().add(jPSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 203, 467, 222));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel1.setText("PROCESO DE VALIDACION.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jBRegresar.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jBRegresar.setText("Regresar");
        jBRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jBRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        jTextField1.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 140, -1));

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel2.setText("Nombre del proceso : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jButton2.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jButton2.setText("Guardar");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 560, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinimizarMouseClicked
        this.setState(Principal.ICONIFIED);
    }//GEN-LAST:event_jlMinimizarMouseClicked

    private void jlSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea salir?", "SALIR", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jlSalirMouseClicked

    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed
         Menu v3= new Menu();
        v3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Validar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Validar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Validar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Validar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Validar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBRegresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlMinimizar;
    private javax.swing.JLabel jlSalir;
    // End of variables declaration//GEN-END:variables
}