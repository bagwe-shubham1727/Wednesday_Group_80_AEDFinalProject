/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy.model;

/**
 *
 * @author sohamchavan
 */
public class EmployeeModel {
    
    int id;
    String name; 
    String age;
    String password;
    String phone;
    String reason; 
    
    public EmployeeModel (int id, String name, String age, String password, String phone, String reason) {
        this.setId(id);
        this.setName(name);
        this.setAge(age);
        this.setPassword(password);
        this.setPhone(phone);
        this.setReason(reason);
    }
    
         public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    
}
