
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class reviewpage extends javax.swing.JFrame {

    /**
     * Creates new form reviewpage
     */
    public reviewpage() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Wide Latin", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  REVIEW");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 310, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("1.FOOD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 94, 33));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("2.SERVICE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 140, 27));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("3.AMBIENCE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 170, 31));

        jLabel5.setText("jLabel5");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 460, 67, 77));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Excellant");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 150, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Superb");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Good");
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, -1, -1));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Bad");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, -1, 40));

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("Excellant");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 140, -1));

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("Superb");
        getContentPane().add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        buttonGroup2.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setText("Good");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, -1, -1));

        buttonGroup2.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setText("Bad");
        getContentPane().add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, -1, -1));

        buttonGroup3.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jRadioButton9.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton9.setText("Excellant");
        getContentPane().add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 140, -1));

        buttonGroup3.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jRadioButton10.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton10.setText("Superb");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        buttonGroup3.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jRadioButton11.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton11.setText("Good");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, -1, -1));

        buttonGroup3.add(jRadioButton12);
        jRadioButton12.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jRadioButton12.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton12.setText("Bad");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 443, 80, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\proj\\WhatsApp Image 2023-02-27 at 11.16.47 AM.jpeg")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        setVisible(false);
            
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(this,"Thank You");
        this.toBack();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(reviewpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reviewpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reviewpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reviewpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reviewpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
}
