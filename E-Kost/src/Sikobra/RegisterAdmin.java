/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sikobra;

import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Hary Permana
 */
public class RegisterAdmin extends javax.swing.JFrame {

    public Connection conn;
    public Statement stm;

    /**
     * Creates new form RegisterAdmin
     */
    public RegisterAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Register");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sikobra", "root", "");
            stm = conn.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idAdmin = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        emailWarning = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        passWarning = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        no_Telp = new javax.swing.JTextField();
        background = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        linkLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idAdmin.setBackground(new java.awt.Color(241, 241, 241));
        idAdmin.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        idAdmin.setForeground(new java.awt.Color(82, 113, 141));
        idAdmin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        idAdmin.setMinimumSize(new java.awt.Dimension(1, 22));
        idAdmin.setPreferredSize(new java.awt.Dimension(1, 22));
        idAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idAdminActionPerformed(evt);
            }
        });
        idAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idAdminKeyTyped(evt);
            }
        });
        getContentPane().add(idAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 151, 410, 27));

        nama.setBackground(new java.awt.Color(241, 241, 241));
        nama.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        nama.setForeground(new java.awt.Color(82, 113, 141));
        nama.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                namaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                namaKeyTyped(evt);
            }
        });
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 206, 410, 27));

        emailWarning.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N
        emailWarning.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(emailWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 259, 125, 27));

        email.setBackground(new java.awt.Color(241, 241, 241));
        email.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(82, 113, 141));
        email.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 259, 410, 27));

        username.setBackground(new java.awt.Color(241, 241, 241));
        username.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        username.setForeground(new java.awt.Color(82, 113, 141));
        username.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 314, 410, 27));

        passWarning.setBackground(new java.awt.Color(241, 241, 241));
        passWarning.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N
        passWarning.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(passWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 371, 125, 27));

        password.setBackground(new java.awt.Color(241, 241, 241));
        password.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(82, 113, 141));
        password.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 372, 410, 27));

        alamat.setBackground(new java.awt.Color(241, 241, 241));
        alamat.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        alamat.setForeground(new java.awt.Color(82, 113, 141));
        alamat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 426, 410, 27));

        no_Telp.setBackground(new java.awt.Color(241, 241, 241));
        no_Telp.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        no_Telp.setForeground(new java.awt.Color(82, 113, 141));
        no_Telp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        no_Telp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_TelpActionPerformed(evt);
            }
        });
        no_Telp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                no_TelpKeyTyped(evt);
            }
        });
        getContentPane().add(no_Telp, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 478, 410, 27));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/regist (4).png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 650));

        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
        });
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 550, 150, 60));

        linkLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkLoginMouseClicked(evt);
            }
        });
        getContentPane().add(linkLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 565, 70, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idAdminActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void no_TelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_TelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no_TelpActionPerformed

    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
        // TODO add your handling code here:
        Connection conn = new KoneksiDB().getConnection();
    }//GEN-LAST:event_btnRegisterMouseClicked

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        try {

            String sql = "INSERT INTO data_admin VALUES (?,?,?,?,?,?,?)";
            PreparedStatement prprdStm = conn.prepareStatement(sql);
            prprdStm.setString(1, idAdmin.getText());
            prprdStm.setString(2, nama.getText());
            prprdStm.setString(3, email.getText());
            prprdStm.setString(4, username.getText());
            prprdStm.setString(5, password.getText());
            prprdStm.setString(6, alamat.getText());
            prprdStm.setString(7, no_Telp.getText());
            prprdStm.executeUpdate();

            JOptionPane.showMessageDialog(null, "Berhasil daftar, silahkan login");
            new LoginAdmin().setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Tidak dapat mendaftar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void linkLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkLoginMouseClicked
        // TODO add your handling code here:
        new LoginAdmin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_linkLoginMouseClicked

    private void idAdminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idAdminKeyTyped
        // TODO add your handling code here:
        if (Character.isAlphabetic(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Inputan hanya bisa diisi angka", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_idAdminKeyTyped

    private void no_TelpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no_TelpKeyTyped
        // TODO add your handling code here:
        if (no_Telp.getText().length() == 13) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Inputan maksimal berupa 13 angka", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_no_TelpKeyTyped

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void namaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaKeyTyped
        // TODO add your handling code here
        
    }//GEN-LAST:event_namaKeyTyped

    private void namaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaKeyReleased
       
    }//GEN-LAST:event_namaKeyReleased

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(email.getText());
        if(!match.matches()){
            emailWarning.setText("*Invalid e-mail");
        }
        else{
            emailWarning.setText(null);
        }
    }//GEN-LAST:event_emailKeyReleased

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        // TODO add your handling code here:
        String PATTERN= "^(?=.*[0-9])"+ "(?=.*[a-z])(?=.*[A-Z])"+ "(?=\\S+$).{8,20}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(password.getText());
        if(!match.matches()){
            passWarning.setText("*Invalid password");
        }
        else{
            passWarning.setText(null);
        }
    }//GEN-LAST:event_passwordKeyReleased

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnRegister;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailWarning;
    private javax.swing.JTextField idAdmin;
    private javax.swing.JLabel linkLogin;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField no_Telp;
    private javax.swing.JLabel passWarning;
    private javax.swing.JTextField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
