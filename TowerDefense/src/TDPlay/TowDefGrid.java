/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDPlay;

import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author bqa5094
 */
public class TowDefGrid extends javax.swing.JFrame {

    /**
     * Creates new form TowDefGrid
     */
    public TowDefGrid() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TDPlay/HWtosser.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(570, 230, 50, 50);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TDPlay/eraser.jpg"))); // NOI18N
        jPanel1.add(jButton1);
        jButton1.setBounds(570, 390, 60, 40);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TDPlay/paperfootball.jpg"))); // NOI18N
        jPanel1.add(jButton3);
        jButton3.setBounds(570, 540, 40, 40);

        jLabel2.setFont(new java.awt.Font("Vani", 0, 12)); // NOI18N
        jLabel2.setText("Homework Tosser");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(620, 230, 100, 30);

        jLabel3.setFont(new java.awt.Font("Vani", 0, 12)); // NOI18N
        jLabel3.setText("Eraser Cannon");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(630, 390, 90, 21);

        jLabel4.setFont(new java.awt.Font("Vani", 0, 12)); // NOI18N
        jLabel4.setText("Paper Football");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(620, 540, 90, 21);

        jLabel5.setText("Name:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(570, 10, 31, 14);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(604, 10, 90, 20);

        jLabel7.setText("Difficulty:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(570, 80, 50, 14);

        jLabel8.setText("Stage:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(570, 100, 32, 14);

        jLabel9.setText("Money:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(570, 120, 36, 14);

        jLabel10.setText("Score:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(570, 140, 31, 14);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(620, 80, 70, 0);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(610, 100, 80, 0);
        jPanel1.add(jLabel13);
        jLabel13.setBounds(610, 120, 0, 0);
        jPanel1.add(jLabel14);
        jLabel14.setBounds(610, 140, 0, 0);

        jLabel1.setText("Medium Range");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(630, 260, 80, 14);

        jLabel16.setText("Medium Damage");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(630, 280, 78, 14);

        jLabel17.setText("jLabel17");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(640, 420, 40, 14);

        jLabel18.setText("jLabel18");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(640, 450, 40, 14);

        jLabel19.setText("jLabel19");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(620, 570, 40, 14);

        jLabel20.setText("jLabel20");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(620, 600, 40, 14);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TDPlay/GameGrid.jpg"))); // NOI18N
        jLabel15.setText("jLabel15");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(0, 0, 750, 700);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 750, 700);
        jPanel1.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TowDefGrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TowDefGrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TowDefGrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TowDefGrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TowDefGrid().setVisible(true);
            }
        });
    }
    
  
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
