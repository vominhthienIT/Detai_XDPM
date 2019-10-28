/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author MINH THIEN
 */
public class TitleManagement extends javax.swing.JFrame {

    /**
     * Creates new form TitleManagement
     */
    public TitleManagement() {
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

        panel_title = new javax.swing.JPanel();
        lb_title = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        panel_total = new javax.swing.JPanel();
        panel_cusmanagement = new javax.swing.JPanel();
        lb_cusid = new javax.swing.JLabel();
        lb_getcusid = new javax.swing.JLabel();
        lb_cusname = new javax.swing.JLabel();
        lb_cusaddress = new javax.swing.JLabel();
        lb_cusphone = new javax.swing.JLabel();
        tf_getcusname = new javax.swing.JTextField();
        tf_getcusaddress = new javax.swing.JTextField();
        tf_getcusphone = new javax.swing.JTextField();
        panel_inputidcus = new javax.swing.JPanel();
        tf_cusid = new javax.swing.JTextField();
        panel_cuslist = new javax.swing.JPanel();
        scroll_cuslist = new javax.swing.JScrollPane();
        tab_cuslist = new javax.swing.JTable();
        btn_addcus = new javax.swing.JButton();
        btn_updatecus = new javax.swing.JButton();
        btn_deletecus = new javax.swing.JButton();
        btn_addcus1 = new javax.swing.JButton();
        btn_addcus2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(865, 700));

        panel_title.setBackground(new java.awt.Color(51, 102, 255));
        panel_title.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));

        lb_title.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lb_title.setForeground(new java.awt.Color(255, 255, 255));
        lb_title.setText("TITLE MANAGEMENT");

        btn_exit.setBackground(new java.awt.Color(255, 255, 255));
        btn_exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_exit.setText("X");
        btn_exit.setOpaque(false);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_titleLayout = new javax.swing.GroupLayout(panel_title);
        panel_title.setLayout(panel_titleLayout);
        panel_titleLayout.setHorizontalGroup(
            panel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_titleLayout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addComponent(lb_title)
                .addGap(101, 101, 101)
                .addComponent(btn_exit)
                .addContainerGap())
        );
        panel_titleLayout.setVerticalGroup(
            panel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_titleLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lb_title, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(panel_title, java.awt.BorderLayout.CENTER);

        panel_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        panel_cusmanagement.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Title Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 12))); // NOI18N

        lb_cusid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_cusid.setText("Title ID:");

        lb_getcusid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_getcusid.setText("00111");

        lb_cusname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_cusname.setText("Title Name:");

        lb_cusaddress.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_cusaddress.setText("Title Address:");

        lb_cusphone.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_cusphone.setText("Customer Phone:");

        tf_getcusname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_getcusphone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout panel_cusmanagementLayout = new javax.swing.GroupLayout(panel_cusmanagement);
        panel_cusmanagement.setLayout(panel_cusmanagementLayout);
        panel_cusmanagementLayout.setHorizontalGroup(
            panel_cusmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cusmanagementLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_cusmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_cusaddress)
                    .addComponent(lb_cusphone)
                    .addComponent(lb_cusname)
                    .addComponent(lb_cusid))
                .addGap(31, 31, 31)
                .addGroup(panel_cusmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_getcusid, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(tf_getcusname)
                    .addComponent(tf_getcusaddress)
                    .addComponent(tf_getcusphone))
                .addContainerGap())
        );
        panel_cusmanagementLayout.setVerticalGroup(
            panel_cusmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_cusmanagementLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(panel_cusmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cusid)
                    .addComponent(lb_getcusid, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panel_cusmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cusname)
                    .addComponent(tf_getcusname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_cusmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cusaddress)
                    .addComponent(tf_getcusaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_cusmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cusphone)
                    .addComponent(tf_getcusphone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        panel_inputidcus.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Input Title ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 12))); // NOI18N

        javax.swing.GroupLayout panel_inputidcusLayout = new javax.swing.GroupLayout(panel_inputidcus);
        panel_inputidcus.setLayout(panel_inputidcusLayout);
        panel_inputidcusLayout.setHorizontalGroup(
            panel_inputidcusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inputidcusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_cusid)
                .addContainerGap())
        );
        panel_inputidcusLayout.setVerticalGroup(
            panel_inputidcusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_inputidcusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_cusid, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_cuslist.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Title List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 12))); // NOI18N

        tab_cuslist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scroll_cuslist.setViewportView(tab_cuslist);

        javax.swing.GroupLayout panel_cuslistLayout = new javax.swing.GroupLayout(panel_cuslist);
        panel_cuslist.setLayout(panel_cuslistLayout);
        panel_cuslistLayout.setHorizontalGroup(
            panel_cuslistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_cuslistLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_cuslist)
                .addContainerGap())
        );
        panel_cuslistLayout.setVerticalGroup(
            panel_cuslistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cuslistLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_cuslist, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_addcus.setBackground(new java.awt.Color(0, 153, 255));
        btn_addcus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_addcus.setForeground(new java.awt.Color(255, 255, 255));
        btn_addcus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reserve2.png"))); // NOI18N
        btn_addcus.setText("RESERVATION");

        btn_updatecus.setBackground(new java.awt.Color(0, 153, 255));
        btn_updatecus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_updatecus.setForeground(new java.awt.Color(255, 255, 255));
        btn_updatecus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btn_updatecus.setText("UPDATE");

        btn_deletecus.setBackground(new java.awt.Color(0, 153, 255));
        btn_deletecus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_deletecus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus.png"))); // NOI18N
        btn_deletecus.setText("DELETE");

        btn_addcus1.setBackground(new java.awt.Color(0, 153, 255));
        btn_addcus1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_addcus1.setForeground(new java.awt.Color(255, 255, 255));
        btn_addcus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        btn_addcus1.setText("ADD");

        btn_addcus2.setBackground(new java.awt.Color(0, 153, 255));
        btn_addcus2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_addcus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel_cus.png"))); // NOI18N
        btn_addcus2.setText("CANCEL RESERVATION");

        javax.swing.GroupLayout panel_totalLayout = new javax.swing.GroupLayout(panel_total);
        panel_total.setLayout(panel_totalLayout);
        panel_totalLayout.setHorizontalGroup(
            panel_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_totalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_totalLayout.createSequentialGroup()
                        .addComponent(panel_cuslist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panel_totalLayout.createSequentialGroup()
                        .addComponent(panel_cusmanagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panel_totalLayout.createSequentialGroup()
                                    .addComponent(btn_addcus1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(btn_updatecus, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(btn_deletecus, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(panel_inputidcus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel_totalLayout.createSequentialGroup()
                                .addComponent(btn_addcus, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_addcus2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32))))
        );
        panel_totalLayout.setVerticalGroup(
            panel_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_totalLayout.createSequentialGroup()
                .addGroup(panel_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_totalLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(panel_inputidcus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_addcus1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_updatecus, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_deletecus, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_addcus, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_addcus2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_totalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_cusmanagement, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_cuslist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panel_total, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

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
            java.util.logging.Logger.getLogger(TitleManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TitleManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TitleManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TitleManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TitleManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addcus;
    private javax.swing.JButton btn_addcus1;
    private javax.swing.JButton btn_addcus2;
    private javax.swing.JButton btn_deletecus;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_updatecus;
    private javax.swing.JLabel lb_cusaddress;
    private javax.swing.JLabel lb_cusid;
    private javax.swing.JLabel lb_cusname;
    private javax.swing.JLabel lb_cusphone;
    private javax.swing.JLabel lb_getcusid;
    private javax.swing.JLabel lb_title;
    private javax.swing.JPanel panel_cuslist;
    private javax.swing.JPanel panel_cusmanagement;
    private javax.swing.JPanel panel_inputidcus;
    private javax.swing.JPanel panel_title;
    private javax.swing.JPanel panel_total;
    private javax.swing.JScrollPane scroll_cuslist;
    private javax.swing.JTable tab_cuslist;
    private javax.swing.JTextField tf_cusid;
    private javax.swing.JTextField tf_getcusaddress;
    private javax.swing.JTextField tf_getcusname;
    private javax.swing.JTextField tf_getcusphone;
    // End of variables declaration//GEN-END:variables
}
