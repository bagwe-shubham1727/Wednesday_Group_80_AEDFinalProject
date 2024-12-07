/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package emergencyEnterprise;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import main.signUp;
import university.student;

/**
 *
 * @author suhas
 */
public class emergencyLogin extends javax.swing.JFrame {

    /**
     * Creates new form emergencyLogin
     */
    public emergencyLogin() {
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
        selectEmerRole = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabelTitleEmergencyLogin = new javax.swing.JLabel();
        jLabelSymbolEmergencyLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JTextField();
        btnPoliceBack = new javax.swing.JButton();
        pfPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        selectEmerRole.setForeground(new java.awt.Color(255, 255, 255));
        selectEmerRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Police", "Police Admin" }));
        jPanel1.add(selectEmerRole);
        selectEmerRole.setBounds(430, 360, 111, 23);

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(390, 400, 72, 22);

        jLabelTitleEmergencyLogin.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabelTitleEmergencyLogin.setForeground(new java.awt.Color(255, 255, 204));
        jLabelTitleEmergencyLogin.setText("Emergency Login");
        jPanel1.add(jLabelTitleEmergencyLogin);
        jLabelTitleEmergencyLogin.setBounds(370, 220, 133, 21);

        jLabelSymbolEmergencyLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NUPD-login logo.png"))); // NOI18N
        jPanel1.add(jLabelSymbolEmergencyLogin);
        jLabelSymbolEmergencyLogin.setBounds(370, 30, 140, 190);

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Username:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(340, 280, 80, 17);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(340, 320, 80, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("Role:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(340, 360, 72, 17);
        jPanel1.add(lblUsername);
        lblUsername.setBounds(430, 280, 111, 23);

        btnPoliceBack.setBackground(new java.awt.Color(255, 255, 204));
        btnPoliceBack.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        btnPoliceBack.setText("Back");
        btnPoliceBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoliceBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnPoliceBack);
        btnPoliceBack.setBounds(30, 20, 72, 22);

        pfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(pfPassword);
        pfPassword.setBounds(430, 320, 110, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NUPDbg.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 900, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String username = lblUsername.getText();
        String password = new String(pfPassword.getPassword());
        String role = selectEmerRole.getSelectedItem().toString();

    if (role.equals("Police")) {
        try {
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();
            String policeQuery = "SELECT * FROM universitysystem.police WHERE username = '" + username + "'";
            java.sql.ResultSet policeData = statement.executeQuery(policeQuery);

            if (!policeData.next()) {
                JOptionPane.showMessageDialog(null, "Invalid Username");
            } else {
                String correctPassword = policeData.getString("password");
                if (!correctPassword.equals(password)) {
                    JOptionPane.showMessageDialog(null, "You entered the password wrong");
                } else {
                    // Successful login
                    String policeUName = policeData.getString("username");
                    crimeAction pol = new crimeAction();
                    pol.setName(policeUName);
                    setVisible(false);
                    pol.setVisible(true);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    } else if (role.equals("Police Admin")) {
        if (username.equals("POLADM")) {
            if (!password.equals("7890")) {
                JOptionPane.showMessageDialog(null, "You entered the password wrong");
            } else {
                policeAdmin policeAdminObj = new policeAdmin();
                setVisible(false);
                policeAdminObj.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Username");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Invalid Role Selected");
    }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPoliceBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoliceBackActionPerformed
        // TODO add your handling code here:
        signUp signUpObj = new signUp();
        setVisible(false);
        signUpObj.setVisible(true);
    }//GEN-LAST:event_btnPoliceBackActionPerformed

    private void pfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(emergencyLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emergencyLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emergencyLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emergencyLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emergencyLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPoliceBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelSymbolEmergencyLogin;
    private javax.swing.JLabel jLabelTitleEmergencyLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lblUsername;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JComboBox<String> selectEmerRole;
    // End of variables declaration//GEN-END:variables
}
