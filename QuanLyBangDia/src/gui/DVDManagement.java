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
import Controll.DisksDAO;
import Controll.SpeciessDAO;
import Controll.TitleDAO;
import entities.Disks;
import entities.Speciess;
import entities.Title;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class DVDManagement extends javax.swing.JFrame {

    /**
     * Creates new form DVDManagement
     */
    TitleDAO titleDao = new TitleDAO();
    DisksDAO diskDao = new DisksDAO();
    SpeciessDAO speciessDao = new SpeciessDAO();
    public DVDManagement() {
        initComponents();
        setLocationRelativeTo(null);
        loadTitle();
        loadSpeciess();
        loadTable();
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
        panel_dvdmanagement = new javax.swing.JPanel();
        lb_dvdid = new javax.swing.JLabel();
        lb_getdvdid = new javax.swing.JLabel();
        lb_dvdname = new javax.swing.JLabel();
        lb_titlename = new javax.swing.JLabel();
        tf_getdvdname = new javax.swing.JTextField();
        combobox_title = new javax.swing.JComboBox<>();
        lb_speciess = new javax.swing.JLabel();
        combobox_speciess = new javax.swing.JComboBox<>();
        lb_reload = new javax.swing.JLabel();
        panel_inputiddvd = new javax.swing.JPanel();
        tf_dvdid = new javax.swing.JTextField();
        panel_dvdlis = new javax.swing.JPanel();
        scroll_dvdlist = new javax.swing.JScrollPane();
        tab_dvdlist = new javax.swing.JTable();
        btn_adddvd = new javax.swing.JButton();
        btn_deletedvd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel_title.setBackground(new java.awt.Color(51, 102, 255));
        panel_title.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));

        lb_title.setFont(new java.awt.Font("Times New Roman", 1, 43)); // NOI18N
        lb_title.setForeground(new java.awt.Color(255, 255, 255));
        lb_title.setText("DVD/DISK MANAGEMENT");

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
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(lb_title, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_exit)
                .addContainerGap())
        );
        panel_titleLayout.setVerticalGroup(
            panel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_titleLayout.createSequentialGroup()
                .addGroup(panel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_titleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_titleLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lb_title, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(panel_title, java.awt.BorderLayout.PAGE_START);

        panel_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        panel_dvdmanagement.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "DVD/DISK Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 12))); // NOI18N

        lb_dvdid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_dvdid.setText("DVD/DISK ID:");

        lb_getdvdid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lb_dvdname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_dvdname.setText("DVD/DISK Name:");

        lb_titlename.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_titlename.setText("Title Name :");

        tf_getdvdname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        combobox_title.setSelectedItem(combobox_title);

        lb_speciess.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_speciess.setText("Speciess Name:");

        combobox_speciess.setSelectedItem(combobox_speciess);

        lb_reload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reload.png"))); // NOI18N
        lb_reload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_reloadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_dvdmanagementLayout = new javax.swing.GroupLayout(panel_dvdmanagement);
        panel_dvdmanagement.setLayout(panel_dvdmanagementLayout);
        panel_dvdmanagementLayout.setHorizontalGroup(
            panel_dvdmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dvdmanagementLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_dvdmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_titlename)
                    .addComponent(lb_dvdname)
                    .addComponent(lb_dvdid)
                    .addComponent(lb_speciess))
                .addGap(31, 31, 31)
                .addGroup(panel_dvdmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combobox_speciess, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_getdvdname)
                    .addComponent(combobox_title, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_dvdmanagementLayout.createSequentialGroup()
                        .addComponent(lb_getdvdid, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panel_dvdmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dvdmanagementLayout.createSequentialGroup()
                    .addContainerGap(325, Short.MAX_VALUE)
                    .addComponent(lb_reload)
                    .addContainerGap()))
        );
        panel_dvdmanagementLayout.setVerticalGroup(
            panel_dvdmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dvdmanagementLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(panel_dvdmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_dvdid)
                    .addComponent(lb_getdvdid, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panel_dvdmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_dvdname)
                    .addComponent(tf_getdvdname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(panel_dvdmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox_speciess, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_speciess))
                .addGap(33, 33, 33)
                .addGroup(panel_dvdmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox_title, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_titlename))
                .addContainerGap())
            .addGroup(panel_dvdmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_dvdmanagementLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lb_reload, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(211, Short.MAX_VALUE)))
        );

        panel_inputiddvd.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Input DVD/DISK ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 12))); // NOI18N

        tf_dvdid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_dvdidKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_inputiddvdLayout = new javax.swing.GroupLayout(panel_inputiddvd);
        panel_inputiddvd.setLayout(panel_inputiddvdLayout);
        panel_inputiddvdLayout.setHorizontalGroup(
            panel_inputiddvdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inputiddvdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_dvdid, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_inputiddvdLayout.setVerticalGroup(
            panel_inputiddvdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_inputiddvdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_dvdid, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_dvdlis.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "DVD/DISK List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 12))); // NOI18N

        tab_dvdlist.setModel(new javax.swing.table.DefaultTableModel(
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
        scroll_dvdlist.setViewportView(tab_dvdlist);

        javax.swing.GroupLayout panel_dvdlisLayout = new javax.swing.GroupLayout(panel_dvdlis);
        panel_dvdlis.setLayout(panel_dvdlisLayout);
        panel_dvdlisLayout.setHorizontalGroup(
            panel_dvdlisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dvdlisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_dvdlist)
                .addContainerGap())
        );
        panel_dvdlisLayout.setVerticalGroup(
            panel_dvdlisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dvdlisLayout.createSequentialGroup()
                .addComponent(scroll_dvdlist, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_adddvd.setBackground(new java.awt.Color(0, 153, 255));
        btn_adddvd.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_adddvd.setForeground(new java.awt.Color(255, 255, 255));
        btn_adddvd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        btn_adddvd.setText("THÊM");
        btn_adddvd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adddvdActionPerformed(evt);
            }
        });

        btn_deletedvd.setBackground(new java.awt.Color(0, 153, 255));
        btn_deletedvd.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_deletedvd.setForeground(new java.awt.Color(204, 0, 51));
        btn_deletedvd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus.png"))); // NOI18N
        btn_deletedvd.setText("XÓA");
        btn_deletedvd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletedvdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_totalLayout = new javax.swing.GroupLayout(panel_total);
        panel_total.setLayout(panel_totalLayout);
        panel_totalLayout.setHorizontalGroup(
            panel_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_totalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_totalLayout.createSequentialGroup()
                        .addComponent(panel_dvdlis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panel_totalLayout.createSequentialGroup()
                        .addComponent(panel_dvdmanagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_totalLayout.createSequentialGroup()
                                .addComponent(btn_adddvd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_deletedvd, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panel_inputiddvd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))))
        );
        panel_totalLayout.setVerticalGroup(
            panel_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_totalLayout.createSequentialGroup()
                .addGroup(panel_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_totalLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(panel_inputiddvd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(panel_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_adddvd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_deletedvd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_totalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_dvdmanagement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_dvdlis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panel_total, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void lb_reloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_reloadMouseClicked
        //clear();
        String dvdid = makeNewID();
        lb_getdvdid.setText(dvdid);
    }//GEN-LAST:event_lb_reloadMouseClicked

    private void btn_adddvdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adddvdActionPerformed
        if(isEmpty()){
           Disks disk = new Disks();
           Speciess spec = speciessDao.findSpeciessByName(combobox_speciess.getSelectedItem().toString());
           Title title = titleDao.findTitleByName(combobox_title.getSelectedItem().toString());
         
           disk.setDiskID(lb_getdvdid.getText().toString());
           disk.setDiskName(tf_getdvdname.getText().toString());
           disk.setStatus("On Shelves");
           disk.setSpecies(spec);
           disk.setTitle(title);
           if (diskDao.save(disk)){
               JOptionPane.showMessageDialog(this, "Insert new disk is successfully");
              loadTable();
              clear();
           }
           else 
                JOptionPane.showMessageDialog(this, "Insert new title is successfully");
       }
 
    }//GEN-LAST:event_btn_adddvdActionPerformed

    private void btn_deletedvdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletedvdActionPerformed
        try {
            if (tab_dvdlist.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "You need select a disk");
            } else {
                int dialog = JOptionPane.showConfirmDialog(this, "Do you want to delete ??", "Yes", JOptionPane.YES_NO_OPTION);
                if (dialog == JOptionPane.YES_NO_OPTION) {
                    int index = this.tab_dvdlist.getSelectedRow();
                    String id = tab_dvdlist.getValueAt(index, 0).toString();
                    Disks disk = diskDao.findDiskByID(id);
                    diskDao.delete(disk);
                    loadTable();
                    clear();
                    JOptionPane.showMessageDialog(null, "Delete is successfully !");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Delete title is failed!");
        }
    }//GEN-LAST:event_btn_deletedvdActionPerformed

    private void tf_dvdidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_dvdidKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String id = tf_dvdid.getText().toString();
            try {
                DefaultTableModel model = new DefaultTableModel() {
                    public boolean isCellEditable(int rowIndex, int mColIndex) {
                        return false;
                    }
                };
                model.addColumn("DVD/DISK ID");
                model.addColumn("DVD/DISK Name");
                model.addColumn("Status");
                model.addColumn("Species");
                model.addColumn("Title Name");
                Disks disk = diskDao.findDiskByID(id);
                model.addRow(new Object[]{
                    disk.getDiskID(),
                    disk.getDiskName(),
                    disk.getStatus(),
                    disk.getSpecies().getSpeciessName(),
                    disk.getTitle().getTitleName()
                });
                clear();
                this.tab_dvdlist.setModel(model);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_tf_dvdidKeyPressed

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
            java.util.logging.Logger.getLogger(DVDManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DVDManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DVDManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DVDManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DVDManagement().setVisible(true);
            }
        });
    }
    public void loadTitle(){
        List<Title> listTitle = titleDao.getAll(Title.class);
        for (int i = 0; i < listTitle.size(); i++) {
            combobox_title.addItem(listTitle.get(i).getTitleName());
        }
     }
    public void loadSpeciess(){
        List<Speciess> listSpeciess = speciessDao.getAll(Speciess.class);
        for (int i = 0; i < listSpeciess.size(); i++) {
            combobox_speciess.addItem(listSpeciess.get(i).getSpeciessName());
        }
     }
    public String makeNewID(){
        int temp =0;
        List<Disks> listDisk = diskDao.getAll(Disks.class);
        for(int i =0;i<listDisk.size();i++){
            if (Integer.parseInt(listDisk.get(i).getDiskID())>temp){
                temp = Integer.parseInt(listDisk.get(i).getDiskID());
            }
        }
        temp ++;
        String newID = ""+temp;
        return newID;
    }
  
    public void clear(){
        lb_getdvdid.setText("");
        tf_getdvdname.setText("");
        tf_dvdid.setText("");
   }
    public boolean isEmpty(){
        if (tf_getdvdname.getText().equalsIgnoreCase("") || lb_getdvdid.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Please make sure the fields are not empty ");
            return false;
        }
        else
            return true;     
   }
    public void loadTable() {
        DefaultTableModel model = new DefaultTableModel(){
            public boolean isCellEditable(int rowIndex, int mColIndex) { 
            return false; 
    }
        };
        model.addColumn("DVD/DISK ID");
        model.addColumn("DVD/DISK Name");
        model.addColumn("Status");
        model.addColumn("Speciess Name");
        model.addColumn("Title Name");
        for (Disks disks : diskDao.getAll(Disks.class)) {
            model.addRow(new Object[]{
                disks.getDiskID(),
                disks.getDiskName(),
                disks.getStatus(),
                disks.getSpecies().getSpeciessName(),
                disks.getTitle().getTitleName()
            });
            this.tab_dvdlist.setModel(model);
        }
    }  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adddvd;
    private javax.swing.JButton btn_deletedvd;
    private javax.swing.JButton btn_exit;
    private javax.swing.JComboBox<String> combobox_speciess;
    private javax.swing.JComboBox<String> combobox_title;
    private javax.swing.JLabel lb_dvdid;
    private javax.swing.JLabel lb_dvdname;
    private javax.swing.JLabel lb_getdvdid;
    private javax.swing.JLabel lb_reload;
    private javax.swing.JLabel lb_speciess;
    private javax.swing.JLabel lb_title;
    private javax.swing.JLabel lb_titlename;
    private javax.swing.JPanel panel_dvdlis;
    private javax.swing.JPanel panel_dvdmanagement;
    private javax.swing.JPanel panel_inputiddvd;
    private javax.swing.JPanel panel_title;
    private javax.swing.JPanel panel_total;
    private javax.swing.JScrollPane scroll_dvdlist;
    private javax.swing.JTable tab_dvdlist;
    private javax.swing.JTextField tf_dvdid;
    private javax.swing.JTextField tf_getdvdname;
    // End of variables declaration//GEN-END:variables
}
