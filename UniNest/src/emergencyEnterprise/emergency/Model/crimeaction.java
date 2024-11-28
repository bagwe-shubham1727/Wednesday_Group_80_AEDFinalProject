/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emergencyEnterprise.emergency.Model;

/**
 *
 * @author suhas
 */
public class crimeaction {

    String name;
    int phone;
    String address;
    String cd;
    String officer;
    String action;

    public crimeaction(String name, int phone, String address, String cd, String officer, String action) {

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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
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

}
