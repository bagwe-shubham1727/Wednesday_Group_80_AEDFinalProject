


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


package Pharmacy;

/**
 *
 * @author Soham Chavan
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import connection.JDBCconnection;
import static java.lang.System.err;
import java.sql.ResultSet;
import main.signUp;

public class InventoryEnterpriseLogin extends javax.swing.JFrame {

    /**
     * Creates new form InventoryEnterpriseLogin
     */
    public InventoryEnterpriseLogin() {
        initComponents();
        setResizable(false);
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
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        pfPassword = new javax.swing.JPasswordField();
        labelRole = new javax.swing.JLabel();
        cfRole = new javax.swing.JComboBox<>();
        buttonLogin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INVENTORY ENTERPRISE LOGIN ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        labelUsername.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        labelUsername.setText("USERNAME: ");
        jPanel1.add(labelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        labelPassword.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        labelPassword.setText("PASSWORD: ");
        jPanel1.add(labelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 80, -1));
        jPanel1.add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 200, -1));

        pfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(pfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 200, -1));

        labelRole.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        labelRole.setText("ROLE:");
        jPanel1.add(labelRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 74, -1));

        cfRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Student", "Professor", "Police" }));
        jPanel1.add(cfRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 90, -1));

        buttonLogin.setBackground(new java.awt.Color(0, 153, 153));
        buttonLogin.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        buttonLogin.setText("LOGIN ");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(buttonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 30, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UHCS2-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 230, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UCSbg.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfPasswordActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed

        String username = tfUsername.getText();
        String password = pfPassword.getText();
        String role = cfRole.getSelectedItem().toString();
        
        if(username.isEmpty()||password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Enter Details!");
        }
        else if("Admin".equals(role) && username.equals("admin") && password.equals("admin")){
            this.hide();
            Medicines pa = new Medicines();
            pa.setVisible(true);
            JOptionPane.showMessageDialog(null, " Pharmacy Admin Login Successful!");
        }else if("Student".equals(role)){
            try{
                java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
                java.sql.Statement statement = connection.createStatement();
                ResultSet resultset = statement.executeQuery
                ("SELECT * FROM universitysystem.students where username ='"+username+"' and password = '"+password+"'");
                
                Employee ha = new Employee();
                setVisible(false);
                ha.setVisible(true);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
                setVisible(false);
            }
        }else if("Professor".equals(role)){
            try{
                java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
                java.sql.Statement statement = connection.createStatement();
                ResultSet resultset = statement.executeQuery
                ("SELECT * FROM universitysystem.professors where username ='"+username+"' and password = '"+password+"'");
                
                Employee ha = new Employee();
                setVisible(false);
                ha.setVisible(true);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
                setVisible(false);
            }
        }else if("Police".equals(role)){
            try{
                java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
                java.sql.Statement statement = connection.createStatement();
                ResultSet resultset = statement.executeQuery
                ("SELECT * FROM universitysystem.police where username ='"+username+"' and password = '"+password+"'");
                
                Employee ha = new Employee();
                setVisible(false);
                ha.setVisible(true);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
                setVisible(false);
            }
        }
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        signUp su = new signUp();
        setVisible(false);
        su.setVisible(true);
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
            java.util.logging.Logger.getLogger(InventoryEnterpriseLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryEnterpriseLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryEnterpriseLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryEnterpriseLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryEnterpriseLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogin;
    private javax.swing.JComboBox<String> cfRole;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelRole;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
