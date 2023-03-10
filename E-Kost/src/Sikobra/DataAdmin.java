/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sikobra;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hary Permana
 */
public class DataAdmin extends javax.swing.JFrame {

    DefaultTableModel model;
    public Connection conn;
    public Statement stm;

    /**
     * Creates new form DataAdmin
     */
    public DataAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Data Admin");
        String[] judul = {"ID Admin", "Nama", "Email", "Username", "Password", "Alamat", "No Telepon"};
        model = new DefaultTableModel(judul, 0);
        tabel.setModel(model);
        Show();

    }

    public void Show() {
        int row = tabel.getRowCount();
        for (int a = 0; a < row; a++) {
            model.removeRow(0);
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sikobra", "root", "");
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM data_admin");
            while (rs.next()) {
                String data[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)};
                model.addRow(data);
            }
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }

    public void Reset() {
        id_Admin.setText("");
        nama.setText("");
        email.setText("");
        username.setText("");
        password.setText("");
        alamat.setText("");
        no_Telp.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id_Admin = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        no_Telp = new javax.swing.JTextField();
        tableAdmin = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        background = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id_Admin.setBackground(new java.awt.Color(241, 241, 241));
        id_Admin.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        id_Admin.setForeground(new java.awt.Color(82, 113, 141));
        id_Admin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        id_Admin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_AdminKeyTyped(evt);
            }
        });
        getContentPane().add(id_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 183, 250, 30));

        nama.setBackground(new java.awt.Color(241, 241, 241));
        nama.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        nama.setForeground(new java.awt.Color(82, 113, 141));
        nama.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 250, 30));

        email.setBackground(new java.awt.Color(241, 241, 241));
        email.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(82, 113, 141));
        email.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 297, 250, 30));

        username.setBackground(new java.awt.Color(241, 241, 241));
        username.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        username.setForeground(new java.awt.Color(82, 113, 141));
        username.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 352, 250, 30));

        password.setBackground(new java.awt.Color(241, 241, 241));
        password.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(82, 113, 141));
        password.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 411, 250, 30));

        alamat.setBackground(new java.awt.Color(241, 241, 241));
        alamat.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        alamat.setForeground(new java.awt.Color(82, 113, 141));
        alamat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });
        getContentPane().add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 471, 250, 30));

        no_Telp.setBackground(new java.awt.Color(241, 241, 241));
        no_Telp.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        no_Telp.setForeground(new java.awt.Color(82, 113, 141));
        no_Telp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        no_Telp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                no_TelpKeyTyped(evt);
            }
        });
        getContentPane().add(no_Telp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 250, 30));

        tabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tabel.setForeground(new java.awt.Color(82, 113, 141));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        tableAdmin.setViewportView(tabel);

        getContentPane().add(tableAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 620, 460));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/data admin sikobra.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnTambah.setText("jButton1");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 170, 40));

        btnEdit.setText("jButton1");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 160, 40));

        btnHapus.setText("jButton1");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 170, 40));

        btnReset.setText("jButton1");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 160, 40));

        btnHome.setText("jButton1");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 40, 90, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sikobra", "root", "");

            String sql = "insert into data_admin VALUES (?,?,?,?,?,?,?)";
            PreparedStatement prprdStm = conn.prepareStatement(sql);
            prprdStm.setString(1, id_Admin.getText());
            prprdStm.setString(2, nama.getText());
            prprdStm.setString(3, email.getText());
            prprdStm.setString(4, username.getText());
            prprdStm.setString(5, password.getText());
            prprdStm.setString(6, alamat.getText());
            prprdStm.setString(7, no_Telp.getText());
            prprdStm.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");
            Show();
            Reset();
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            Logger.getLogger(DataTransaksi.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("SQLException: " + e.getMessage());
        }

    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sikobra", "root", "");
            conn.createStatement().executeUpdate("update data_admin set Nama = '" + nama.getText() + "',Email = '" + email.getText() + "',Username = '" + username.getText() + "',Password = '" + password.getText() + "',Alamat = '" + alamat.getText() + "',No_Telp = '" + no_Telp.getText() + "' where ID_Admin ='" + id_Admin.getText() + "' ");
            
            JOptionPane.showMessageDialog(null, "Data berhasil dirubah!");
            Show();
            Reset();
        } catch (SQLException e) {
            Logger.getLogger(DataTransaksi.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("SQLException: " + e.getMessage());
        }
        Show();
        Reset();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(null, "Apakah anda benar ingin menghapus data ini?", "Delete", JOptionPane.YES_NO_OPTION);
        if (i == 0) {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sikobra", "root", "");
                conn.createStatement().executeUpdate("delete from data_admin where ID_Admin ='" + id_Admin.getText() + "'");
                
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
                Show();
                Reset();
            } catch (SQLException e) {
                Logger.getLogger(DataTransaksi.class.getName()).log(Level.SEVERE, null, e);
                System.out.println("SQLException: " + e.getMessage());
            }
           
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        new MainMenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        int c = tabel.getSelectedRow();

        if (c > -1) {
            id_Admin.setText(model.getValueAt(c, 0).toString());
            nama.setText(model.getValueAt(c, 1).toString());
            email.setText(model.getValueAt(c, 2).toString());
            username.setText(model.getValueAt(c, 3).toString());
            password.setText(model.getValueAt(c, 4).toString());
            alamat.setText(model.getValueAt(c, 5).toString());
            no_Telp.setText(model.getValueAt(c, 6).toString());
        }
    }//GEN-LAST:event_tabelMouseClicked

    private void id_AdminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_AdminKeyTyped
        // TODO add your handling code here:
        if (Character.isAlphabetic(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Inputan hanya bisa diisi angka", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_id_AdminKeyTyped

    private void no_TelpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no_TelpKeyTyped
        // TODO add your handling code here:
        if (no_Telp.getText().length() == 13) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Inputan maksimal berupa 13 angka", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_no_TelpKeyTyped

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

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
            java.util.logging.Logger.getLogger(DataAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambah;
    private javax.swing.JTextField email;
    private javax.swing.JTextField id_Admin;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField no_Telp;
    private javax.swing.JTextField password;
    private javax.swing.JTable tabel;
    private javax.swing.JScrollPane tableAdmin;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
