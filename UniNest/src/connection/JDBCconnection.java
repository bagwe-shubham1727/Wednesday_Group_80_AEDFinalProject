/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


/**
 *
 * @author sanjaytholani
 */
public class JDBCconnection {
    public static Connection Connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            Statement statement = (Statement) connection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select * from hospital.login");
                                                         
        while(resultSet.next()){
            System.out.println("Hi");
            System.out.print(resultSet.getString("login.role"));
            return connection;
        }
        }
        catch(ClassNotFoundException | SQLException e){
            return null;
        }
        return null;
    }
}