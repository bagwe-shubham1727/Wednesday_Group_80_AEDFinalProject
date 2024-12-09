/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emergencyEnterprise.emergency.Model;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author suhas
 */
public class crimeaction {

    String name;
    long phone;
    String address;
    String cd;
    String officer;
    String action;

    public crimeaction(String name, long phone, String address, String cd, String officer, String action) {

        this.setName(name);
        this.setPhone(phone);
        this.setAddress(address);
        this.setCd(cd);
        this.setOfficer(officer);
        this.setAction(action);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getOfficer() {
        return officer;
    }

    public void setOfficer(String officer) {
        this.officer = officer;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void addaction() {
        boolean actionExists = checkaction();
        if (!actionExists) {
            try {
                java.sql.Connection connection = DriverManager
                        .getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");

                System.out.println("connection open");
                java.sql.Statement statement = connection.createStatement();
                System.out.println("connection open");

                String query = "INSERT INTO universitysystem.crimedetails (name,phone,address,crimeDetails,officer,action) values(?,?,?,?,?,?)";
                System.out.println("connection insert");

                // java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
                java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
                preparedStmt.setString(1, name);

                System.out.println("connection insert");

                preparedStmt.setLong(2, phone);
                preparedStmt.setString(3, address);
                preparedStmt.setString(4, cd);
                preparedStmt.setString(5, officer);
                preparedStmt.setString(6, action);

                System.out.println("connection insert");

                preparedStmt.execute();
                System.out.println("connection run");
                JOptionPane.showMessageDialog(null, "Details Added");

                // connection.close();
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "please add data in correct format!");
            }
        } else if (actionExists) {
            try {
                java.sql.Connection connection = DriverManager
                        .getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");

                System.out.println("connection open");
                java.sql.Statement statement = connection.createStatement();
                System.out.println("connection open");

                String updateQuery = "UPDATE universitysystem.crimedetails SET action = '" + action + "' WHERE name = '"
                        + name + "' AND crimeDetails = '" + cd + "'";
                statement.executeUpdate(updateQuery);
                JOptionPane.showMessageDialog(null, "Details exists already, updated the action");
                System.out.println("Update Successful");
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "please add data in correct format!");
            }
        }

    }

    public boolean checkaction() {
        boolean actionExists = false;
        try {
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem",
                    "root", "user@1234");

            System.out.println("connection open");
            java.sql.Statement statement = connection.createStatement();
            System.out.println("connection open");

            String query = "SELECT * FROM universitysystem.crimedetails WHERE name = '" + name
                    + "' AND crimeDetails = '" + cd + "'";
            System.out.println("connection insert");

            java.sql.ResultSet studentData = statement.executeQuery(query);

            while (studentData.next()) {
                String action = studentData.getString("action") != null ? studentData.getString("action") : "";

                if (!action.isBlank()) {
                    actionExists = true;
                }

                break;
            }

        } catch (Exception e) {
            System.err.println(e);
        }
        return actionExists;
    }

}
