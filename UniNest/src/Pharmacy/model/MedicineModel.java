/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy.model;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author sohamchavan
 */
public class MedicineModel {

    int id;
    String medicine;
    String price;
    String quantity;
    String production;
    String expiry;
    String company;

    public MedicineModel(int id, String medicine, String price, String quantity, String company) {
        this.setId(id);
        this.setMedicine(medicine);
        this.setPrice(price);
        this.setQuantity(quantity);
        this.setCompany(company);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void insertMedicines() {
        boolean medExists = checkMed();
        
        if (!medExists) {
            try {
                java.sql.Statement statement = connection.JDBCconnection.Connect().createStatement();

                statement.executeUpdate("insert into universitysystem.medicine" + "(ID, MEDICINE_NAME, PRICE, QUANTITY, COMPANY)" + "values ('" + this.getId() + "','" + this.getMedicine() + "','" + this.getPrice() + "','" + this.getQuantity() + "', '" + this.getCompany() + "')");
                JOptionPane.showMessageDialog(null, "Medicine successfully added!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Something Went Wrong");
                System.err.println(e);
            }
        }
        else if (medExists){
            try {
                java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");

                System.out.println("connection open");
                java.sql.Statement statement = connection.createStatement();
                System.out.println("connection open");
                
                String updateQuery = "UPDATE universitysystem.medicine SET ID = '"+this.getId()+"', PRICE = '"+this.getPrice()+"',QUANTITY = '"+this.getQuantity()+"',COMPANY = '"+this.getCompany()+"'  WHERE MEDICINE_NAME = '"+this.getMedicine()+"'";
                statement.executeUpdate(updateQuery);
                JOptionPane.showMessageDialog(null, "Medicine exists already, updated the details");
                System.out.println("Update Successful");
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "please add data in correct format!");
            }
        }
        
    }
    
    public boolean checkMed() {
        boolean medExists = false;
        try {
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");

            System.out.println("connection open");
            java.sql.Statement statement = connection.createStatement();
            System.out.println("connection open");

            String query = "SELECT * FROM universitysystem.medicine WHERE MEDICINE_NAME = '"+this.getMedicine()+"'";
            System.out.println("connection insert");
            
            java.sql.ResultSet studentData = statement.executeQuery(query);

                while (studentData.next()) {
                    String medName = studentData.getString("MEDICINE_NAME") != null ? studentData.getString("MEDICINE_NAME") : "";
                    
                    if (medName.equals(this.medicine)){
                        medExists = true;
                    }
                    
                    break;
                }
                
            
        } catch (Exception e) {
            System.err.println(e);
        }
        return medExists;
    }

    public void updateMedicines() {
        try {
            java.sql.Statement statement = connection.JDBCconnection.Connect().createStatement();
            String sql = "UPDATE universitysystem.medicine SET id = '" + this.getId() + "',medicine_name = '" + this.getMedicine() + "',price = '" + this.getPrice() + "', quantity = '" + this.getQuantity() + "', company = '" + this.getCompany() + "' WHERE id ='" + this.getId() + "'";
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Medicine successfully updated!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
    }

    public void deleteMedicines() {
        try {
            java.sql.Statement statement = connection.JDBCconnection.Connect().createStatement();
            String sql = "DELETE FROM universitysystem.medicine WHERE id ='" + this.getId() + "'";
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Medicine successfully deleted!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());

        }
    }
}
