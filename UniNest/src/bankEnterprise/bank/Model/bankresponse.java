/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankEnterprise.bank.Model;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ananya
 */
public class bankresponse {

    String name;
    String accountType;
    String operation;
    int amount;
    String employee;
    String action;
    String currRole;

    public bankresponse(String name, String accountType, String operation, int amount, String employee, String action,
            String currRole) {
        this.setName(name);
        this.setAccountType(accountType);
        this.setOperation(operation);
        this.setEmployee(employee);
        this.setAmount(amount);
        this.setAction(action);
        this.setCurrRole(currRole);
    }

    public String getCurrRole() {
        return currRole;
    }

    public void setCurrRole(String currRole) {
        this.currRole = currRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void addResponse() {
        try {
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem",
                    "root", "user@1234");

            System.out.println("connection open");
            java.sql.Statement statement = connection.createStatement();
            System.out.println("connection open");

            String query = "INSERT INTO universitysystem.bankresponse (Name,AccountType,Operation,Amount,Employee,ActionTaken) values(?,?,?,?,?,?)";
            System.out.println("connection insert");
            if ("student".equals(currRole)) {
                String studentQuery = "UPDATE universitysystem.students SET LoanAmount = LoanAmount + '" + amount
                        + "' WHERE username = '" + name + "'";
                statement.executeUpdate(studentQuery);

            }

            if (operation.equals("Deposit Amount") && action.equals("Approve")) {
                String policeQuery = "UPDATE universitysystem.police SET salary = salary + '" + amount
                        + "' WHERE username = '" + name + "'";
                statement.executeUpdate(policeQuery);
            } else if (operation.equals("Withdraw Amount") && action.equals("Approve")) {
                String policeQuery = "UPDATE universitysystem.police SET salary = salary - '" + amount
                        + "' WHERE username = '" + name + "'";
                statement.executeUpdate(policeQuery);
            }

            if (operation.equals("Repay Loan") && action.equals("Approve")) {
                String studentQuery = "UPDATE universitysystem.students SET LoanAmount = LoanAmount - '" + amount
                        + "' WHERE username = '" + name + "'";
                statement.executeUpdate(studentQuery);
            } else if (operation.equals("Request Loan") && action.equals("Approve")) {
                String studentQuery = "UPDATE universitysystem.students SET LoanAmount = LoanAmount + '" + amount
                        + "' WHERE username = '" + name + "'";
                statement.executeUpdate(studentQuery);
            }

            // java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
            java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, name);

            System.out.println("connection insert");

            preparedStmt.setString(2, accountType);
            preparedStmt.setString(3, operation);
            preparedStmt.setInt(4, amount);
            preparedStmt.setString(5, employee);
            preparedStmt.setString(6, action);

            System.out.println("connection insert");

            preparedStmt.execute();
            System.out.println("connection run");

            // String updateQuery = "UPDATE university.bankservices SET Employee = '" +
            // employee + "' AND SET ActionTaken = '" + action + "' WHERE username = '" +
            // name + "'";
            // statement.executeUpdate(updateQuery);

            String updateQuery = "UPDATE universitysystem.bankservices SET Employee = ?, ActionTaken = ? WHERE Name = ?";
            try (java.sql.PreparedStatement pstmt = connection.prepareStatement(updateQuery)) {
                pstmt.setString(1, employee);
                pstmt.setString(2, action);
                pstmt.setString(3, name);
                pstmt.executeUpdate();
            } catch (Exception e) {
                System.out.println(e);
            }

            JOptionPane.showMessageDialog(null, "Records Updated");

            // connection.close();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "please add data in correct format!");
        }
    }
}
