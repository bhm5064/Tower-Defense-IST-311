/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDPlay;



/**
 *
 * @author bqa5094
 */
public class TDGrid extends javax.swing.JFrame {

    /**
     * Creates new form TowDefGrid
     */
    public TDGrid() {
        initComponents();
         this.setSize(765,730);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        HWTosserbutton = new javax.swing.JButton();
        EraserCanButton = new javax.swing.JButton();
        PaperFootButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        difficultyLabel = new javax.swing.JLabel();
        stageLabel = new javax.swing.JLabel();
        moneyLabel = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        nxtRound = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Classroom Defense");
        getContentPane().setLayout(null);

        jPanel1.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        HWTosserbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TDPlay/HWtosser.jpg"))); // NOI18N
        HWTosserbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HWTosserbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(HWTosserbutton);
        HWTosserbutton.setBounds(570, 280, 50, 50);

        EraserCanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TDPlay/eraser.jpg"))); // NOI18N
        jPanel1.add(EraserCanButton);
        EraserCanButton.setBounds(570, 380, 50, 50);

        PaperFootButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TDPlay/paperfootball.jpg"))); // NOI18N
        jPanel1.add(PaperFootButton);
        PaperFootButton.setBounds(570, 460, 40, 40);

        jLabel2.setFont(new java.awt.Font("Vani", 0, 12)); // NOI18N
        jLabel2.setText("Homework Tosser");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(570, 250, 100, 30);

        jLabel3.setFont(new java.awt.Font("Vani", 0, 12)); // NOI18N
        jLabel3.setText("Eraser Cannon");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(570, 360, 90, 21);

        jLabel4.setFont(new java.awt.Font("Vani", 0, 12)); // NOI18N
        jLabel4.setText("Paper Football");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(570, 440, 90, 21);

        jLabel5.setText("Name:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(570, 10, 40, 14);
        jPanel1.add(nameLabel);
        nameLabel.setBounds(604, 10, 90, 20);

        jLabel7.setText("Difficulty:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(570, 80, 50, 14);

        jLabel8.setText("Stage:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(570, 120,40 , 14);

        jLabel9.setText("Money:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(570, 160, 40, 10);

        jLabel10.setText("Score:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(570, 200, 40, 14);
        jPanel1.add(difficultyLabel);
        difficultyLabel.setBounds(620, 80, 110, 20);
        jPanel1.add(stageLabel);
        stageLabel.setBounds(610, 120, 130, 20);
        jPanel1.add(moneyLabel);
        moneyLabel.setBounds(610, 160, 120, 20);
        jPanel1.add(scoreLabel);
        scoreLabel.setBounds(610, 200, 130, 20);

        jLabel1.setText("Medium Range");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(620, 280, 100, 14);

        jLabel16.setText("Medium Damage");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(620, 300, 100, 14);

        jLabel17.setText("Small Range");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(620, 380, 90, 14);

        jLabel18.setText("Large Damage");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(620, 400, 90, 14);

        jLabel19.setText("Long Range");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(610, 460, 90, 14);

        jLabel20.setText("Small Damage");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(610, 480, 90, 14);
        
        nxtRound.setText("NEXT ROUND!");
        jPanel1.add(nxtRound);
        nxtRound.setBounds(570, 510, 150, 160);    
       

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel6.setText("$15");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(700, 250, 50, 50);

        jLabel11.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel11.setText("$20");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(700, 350, 50, 40);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("$10");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(700, 430, 50, 40);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TDPlay/GameGrid.jpg"))); // NOI18N
        jLabel15.setText("jLabel15");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(0, 0, 750, 700);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 750, 700);
        jPanel1.setVisible(true);

        pack();
    }// </editor-fold>                        

    private void HWTosserbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

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
            java.util.logging.Logger.getLogger(TDGrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TDGrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TDGrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TDGrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TDGrid().setVisible(true);
            }
        });
    }
    
  
    
    
    
    
    
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton EraserCanButton;
    private javax.swing.JButton HWTosserbutton;
    private javax.swing.JButton PaperFootButton;
    private javax.swing.JButton nxtRound;
    private javax.swing.JLabel difficultyLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel moneyLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel stageLabel;
    // End of variables declaration                   
}
