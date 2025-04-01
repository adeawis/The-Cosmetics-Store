/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author akshi
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class NewAcc extends javax.swing.JFrame {
     Connection con;
     Statement st;
     PreparedStatement pst;
     
    /**
     * Creates new form NewAcc
     */
    public NewAcc() {
        initComponents();
        try{
            String url = "jdbc:mysql://localhost/tcs";
            String user = "root";
            String pass = "";
            
            con = DriverManager.getConnection(url, user, pass);
            st = con.createStatement();
        }catch(Exception e){
            e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAddID = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnSearchAcc = new javax.swing.JButton();
        jcShowPassword1 = new javax.swing.JCheckBox();
        btnAddAcc = new javax.swing.JButton();
        btnDeleteAcc = new javax.swing.JButton();
        btnCancelAcc = new javax.swing.JButton();
        txtAddUsername1 = new javax.swing.JTextField();
        txtAddPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THE COSMETIC STORE");

        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-25.png"))); // NOI18N
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add a New Account");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-add-male-user-40.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ID");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Username");

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Password");

        txtAddID.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        btnSearchAcc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-search-20.png"))); // NOI18N
        btnSearchAcc.setText("Search");
        btnSearchAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAccActionPerformed(evt);
            }
        });

        jcShowPassword1.setText("Show Password");
        jcShowPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcShowPassword1ActionPerformed(evt);
            }
        });

        btnAddAcc.setBackground(new java.awt.Color(102, 204, 255));
        btnAddAcc.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btnAddAcc.setText("Add");
        btnAddAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAccActionPerformed(evt);
            }
        });

        btnDeleteAcc.setBackground(new java.awt.Color(255, 102, 102));
        btnDeleteAcc.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btnDeleteAcc.setText("Delete Account");
        btnDeleteAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAccActionPerformed(evt);
            }
        });

        btnCancelAcc.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelAcc.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btnCancelAcc.setText("Cancel");
        btnCancelAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelAccActionPerformed(evt);
            }
        });

        txtAddUsername1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack1)
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(btnAddAcc))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(btnDeleteAcc)
                                        .addGap(67, 67, 67)
                                        .addComponent(btnCancelAcc))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtAddID, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnSearchAcc))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtAddPassword)
                                                    .addComponent(txtAddUsername1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                                                .addGap(3, 3, 3)
                                                .addComponent(jcShowPassword1))))))
                            .addComponent(jLabel1)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAddID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchAcc))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAddUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcShowPassword1)
                    .addComponent(txtAddPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddAcc)
                    .addComponent(btnDeleteAcc)
                    .addComponent(btnCancelAcc))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void clear()
    {
        txtAddID.setText(null);
        txtEmail.setText(null);
        txtAddUsername1.setText(null);
        txtAddPassword.setText(null);
        txtAddID.requestFocus();
    }
    
    private void btnAddAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAccActionPerformed
        // TODO add your handling code here:
        try
        {
            int id = Integer.parseInt(txtAddID.getText());
            String email = txtEmail.getText();
            String username = txtAddUsername1.getText();
            String password = txtAddPassword.getText();
            
            String sql = "INSERT INTO tblnewuser VALUES ("+ id +", '"+ email +"', '"+ username +"', '"+ password +"')";
            
            if (st.executeUpdate(sql)> 0)
            {
                JOptionPane.showMessageDialog(null, "Account Created Successfully");
                clear();
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAddAccActionPerformed

    private void jcShowPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcShowPassword1ActionPerformed
        // TODO add your handling code here:
        if (jcShowPassword1.isSelected())
        {
            txtAddPassword.setEchoChar((char)0);
        }
        else
        {
            txtAddPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jcShowPassword1ActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        ManageProducts mp = new ManageProducts();
        mp.show();
        dispose();
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnCancelAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelAccActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnCancelAccActionPerformed

    private void btnDeleteAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAccActionPerformed
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(txtAddID.getText());
            String sql = "SELECT * FROM tblnewuser WHERE id = " + id;
            pst = con.prepareStatement(sql);
            
            if(pst.executeUpdate(sql)> 0)
            {
                JOptionPane.showMessageDialog(this, "Deleted Account Successfully!");
                clear();
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDeleteAccActionPerformed

    private void btnSearchAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAccActionPerformed
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(txtAddID.getText());
            String sql = "SELECT * FROM tblnewuser WHERE id = " + id;
            
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next())
            {
                txtEmail.setText(rs.getString(2));
                txtAddUsername1.setText(rs.getString(3));
                txtAddPassword.setText(rs.getString(4));
                       
            }
            else
            {
                JOptionPane.showMessageDialog(this, "No Record Found!");
                clear();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSearchAccActionPerformed
     
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
            java.util.logging.Logger.getLogger(NewAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewAcc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAcc;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnCancelAcc;
    private javax.swing.JButton btnDeleteAcc;
    private javax.swing.JButton btnSearchAcc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jcShowPassword1;
    private javax.swing.JTextField txtAddID;
    private javax.swing.JPasswordField txtAddPassword;
    private javax.swing.JTextField txtAddUsername1;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
