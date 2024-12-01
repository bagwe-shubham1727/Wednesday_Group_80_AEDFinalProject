/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package university;

//import emergencyEnterprise.crimeReport;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;


/**
 *
 * @author Anish
 */
public class professor extends javax.swing.JFrame {

    /**
     * Creates new form professor
     */
    public professor() {
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
        btnViewStudData = new javax.swing.JButton();
        jLabeltitleProfessor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        subjectTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        remarksTxt = new javax.swing.JTextField();
        subjectTxt = new javax.swing.JTextField();
        sNameTxt = new javax.swing.JTextField();
        gradeTxt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        GradeTxt = new javax.swing.JTextField();
        jLabelLogoprofessor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnProfLogout = new javax.swing.JButton();
        lblProfName = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnReportCrime1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViewStudData.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnViewStudData.setText("View");
        btnViewStudData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStudDataActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewStudData, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 369, 90, -1));

        jLabeltitleProfessor.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabeltitleProfessor.setForeground(new java.awt.Color(255, 255, 255));
        jLabeltitleProfessor.setText("Grading");
        jPanel1.add(jLabeltitleProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        subjectTable.setBackground(new java.awt.Color(153, 0, 0));
        subjectTable.setForeground(new java.awt.Color(255, 255, 255));
        subjectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Subject"
            }
        ));
        subjectTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subjectTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(subjectTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 177, 408, 160));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Subject:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 226, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Remarks:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 317, -1, -1));
        jPanel1.add(remarksTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 314, 215, -1));

        subjectTxt.setEnabled(false);
        subjectTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectTxtActionPerformed(evt);
            }
        });
        jPanel1.add(subjectTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 223, 215, -1));

        sNameTxt.setEnabled(false);
        sNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sNameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(sNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 177, 215, -1));

        gradeTxt.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        gradeTxt.setText("Grade");
        gradeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeTxtActionPerformed(evt);
            }
        });
        jPanel1.add(gradeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 369, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Grade:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 267, -1, -1));
        jPanel1.add(GradeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 264, 215, -1));

        jLabelLogoprofessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Northeastern_University_Logo-White.png"))); // NOI18N
        jPanel1.add(jLabelLogoprofessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 113));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 180, -1, -1));

        btnProfLogout.setBackground(new java.awt.Color(0, 0, 0));
        btnProfLogout.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnProfLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnProfLogout.setText("Log Out");
        btnProfLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnProfLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 21, -1, -1));
        jPanel1.add(lblProfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 116, 337, 43));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel10.setText("Report a crime to NUPD?");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 410, -1, -1));

        btnReportCrime1.setBackground(new java.awt.Color(0, 0, 0));
        btnReportCrime1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnReportCrime1.setForeground(new java.awt.Color(255, 255, 255));
        btnReportCrime1.setText("Report Crime");
        btnReportCrime1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportCrime1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnReportCrime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 439, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toppng.com-vignette-png-19201080-overlay-photo-1920x1080.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 829, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String currSubjectTeach = "";
    String currProfUsername = "";

    public void setProfData(String profName, String currentSubjectTeach){
        lblProfName.setText("Welcome Professor " + profName);
        currSubjectTeach = currentSubjectTeach;
        currProfUsername = profName;
        System.out.println(currProfUsername);
    }
    
    private void btnViewStudDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStudDataActionPerformed
       
    }//GEN-LAST:event_btnViewStudDataActionPerformed

    
public class CourseGrade{
        
        
        public static void CreateCourseGrade(String sName, String Subject, String Grade, String Remarks){
            
             try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            
            System.out.println("connection open");
            java.sql.Statement statement = connection.createStatement();
                        System.out.println("connection open");

            String query = "INSERT INTO universitysystem.coursegrade (studentName, subject, marks, remarks) values(?,?,?,?)";
                        System.out.println("connection insert");
            //statement.executeUpdate("insert into universitysystem.login" + "(role, username, password)" + "values ('BankEmployee','"+username+"', '"+password+"')");

           // java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
            java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1,sName);
            preparedStmt.setString(2,Subject);
            preparedStmt.setString(3,Grade);
            preparedStmt.setString(4,Remarks);

            
            System.out.println("connection insert");
            
           

            preparedStmt.execute();
             System.out.println("connection run");
             JOptionPane.showMessageDialog(null,"Details Added");

             connection.close();
        }
        catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"please add data in correct format!");
        }      
             
        }
    
    }      
    
    
    
    
    private void gradeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeTxtActionPerformed
      

    }//GEN-LAST:event_gradeTxtActionPerformed

    private void subjectTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectTxtActionPerformed

    private void subjectTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjectTableMouseClicked
        // TODO add your handling code here:
        
         DefaultTableModel profModel = (DefaultTableModel)subjectTable.getModel();
                 String studentNameTxt = subjectTable.getValueAt(subjectTable.getSelectedRow(), 0).toString();

        sNameTxt.setText(subjectTable.getValueAt(subjectTable.getSelectedRow(), 0).toString());  
        subjectTxt.setText(subjectTable.getValueAt(subjectTable.getSelectedRow(), 1).toString());
        
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();
            String profQuery = "SELECT * FROM universitysystem.courseregistration WHERE username = '"+studentNameTxt+"'";
            java.sql.ResultSet profData = statement.executeQuery(profQuery);
            while(profData.next()){
                studentNameTxt = profData.getString("username");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
         }
    }//GEN-LAST:event_subjectTableMouseClicked

    private void btnProfLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfLogoutActionPerformed
       
    }//GEN-LAST:event_btnProfLogoutActionPerformed

    private void btnReportCrime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportCrime1ActionPerformed
       
    }//GEN-LAST:event_btnReportCrime1ActionPerformed

    private void sNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sNameTxtActionPerformed

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
            java.util.logging.Logger.getLogger(professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new professor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GradeTxt;
    private javax.swing.JButton btnProfLogout;
    private javax.swing.JButton btnReportCrime1;
    private javax.swing.JButton btnViewStudData;
    private javax.swing.JButton gradeTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelLogoprofessor;
    private javax.swing.JLabel jLabeltitleProfessor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProfName;
    private javax.swing.JTextField remarksTxt;
    private javax.swing.JTextField sNameTxt;
    private javax.swing.JTable subjectTable;
    private javax.swing.JTextField subjectTxt;
    // End of variables declaration//GEN-END:variables
}