/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author MINH THIEN
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form DangNhap
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_container = new javax.swing.JPanel();
        tf_username = new javax.swing.JTextField();
        lb_password = new javax.swing.JLabel();
        tf_password = new javax.swing.JPasswordField();
        lb_username = new javax.swing.JLabel();
        lb_title = new javax.swing.JLabel();
        btn_submit = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        lb_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        panel_container.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        panel_container.setOpaque(false);
        panel_container.setPreferredSize(new java.awt.Dimension(500, 300));
        panel_container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_username.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panel_container.add(tf_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 72, 270, 40));

        lb_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        panel_container.add(lb_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        tf_password.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        panel_container.add(tf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 142, 270, 40));

        lb_username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/khoa.png"))); // NOI18N
        panel_container.add(lb_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        lb_title.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lb_title.setForeground(new java.awt.Color(255, 255, 255));
        lb_title.setText("LOG IN");
        panel_container.add(lb_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        btn_submit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        panel_container.add(btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, 40));

        btn_cancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.setPreferredSize(new java.awt.Dimension(77, 25));
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        panel_container.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, 40));

        lb_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background_login.jpg"))); // NOI18N
        panel_container.add(lb_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 500, 300));

        getContentPane().add(panel_container);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        
    }//GEN-LAST:event_btn_submitActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_submit;
    private javax.swing.JLabel lb_background;
    private javax.swing.JLabel lb_password;
    private javax.swing.JLabel lb_title;
    private javax.swing.JLabel lb_username;
    private javax.swing.JPanel panel_container;
    private javax.swing.JPasswordField tf_password;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}
