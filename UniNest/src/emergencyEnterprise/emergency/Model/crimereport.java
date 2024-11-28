/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emergencyEnterprise.emergency.Model;

/**
 *
 * @author suhas
 */
public class crimereport {

    String name;
    int phone;
    String address;
    String cd;

    public crimereport(String name, int phone, String address, String cd) {
        this.setName(name);
        this.setPhone(phone);
        this.setAddress(address);
        this.setCd(cd);
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

}
