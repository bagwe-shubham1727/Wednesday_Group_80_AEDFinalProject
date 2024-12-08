/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GymEnterprise.model;

import university.Model.Student;
import university.Model.Professor;

public class GymMembers{
    private String name;
    private String role; // Student or Professor
    private String username;

    // Constructor for Students
    public GymMembers(Student student) {
        this.name = student.getName();
        this.role = "Student";
        this.username = student.getUsername();
    }

    // Constructor for Professors
    public GymMembers(Professor professor) {
        this.name = professor.getprofName();
        this.role = "Professor";
        this.username = professor.getUsername();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "GymMember{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}


