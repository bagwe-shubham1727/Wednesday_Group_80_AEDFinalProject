/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bankEnterprise;

import bankEnterprise.bank.Model.bankservices;
//import emergencyEnterprise.policeAdmin;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ashis
 */
public class bankServices extends javax.swing.JFrame {

    /**
     * Creates new form bankServices
     */
    public bankServices() {
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

        jPanel1 = new javax.swing.JPanel();
        submitBtn = new javax.swing.JButton();
        amountTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelBankServicesLogo = new javax.swing.JLabel();
        operationTxt = new javax.swing.JComboBox<>();
        accountTxt = new javax.swing.JComboBox<>();
        btnStudLogout = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitBtn.setBackground(new java.awt.Color(0, 0, 0));
        submitBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 425, -1, -1));
        jPanel1.add(amountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 384, 146, -1));
        jPanel1.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 261, 146, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Amount:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 387, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Operation:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 346, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Account Type:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 305, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Username:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 264, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Welcome Users");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 190, -1, -1));

        jLabelBankServicesLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/northeastern-university-student-financial-services-2-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabelBankServicesLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 94, -1, 84));

        operationTxt.setForeground(new java.awt.Color(255, 255, 255));
        operationTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Request Loan", " " }));
        jPanel1.add(operationTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 343, 146, -1));

        accountTxt.setForeground(new java.awt.Color(255, 255, 255));
        accountTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student Account" }));
        jPanel1.add(accountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 302, 146, -1));

        btnStudLogout.setBackground(new java.awt.Color(0, 0, 0));
        btnStudLogout.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        btnStudLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnStudLogout.setText("Logout");
        btnStudLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnStudLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/accounting-watts-scaled.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

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

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_submitBtnActionPerformed

    private void btnStudLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudLogoutActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnStudLogoutActionPerformed
    String currEmpName = "";
    String currRole = "";
    public void setUsername(String studentName, String role){
        nameTxt.setText(studentName);
        currRole = role;
//        lblUsername.setText("Welcome " + studentName);
        currEmpName = studentName;
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
            java.util.logging.Logger.getLogger(bankServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bankServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bankServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bankServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bankServices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accountTxt;
    private javax.swing.JTextField amountTxt;
    private javax.swing.JButton btnStudLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelBankServicesLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JComboBox<String> operationTxt;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
