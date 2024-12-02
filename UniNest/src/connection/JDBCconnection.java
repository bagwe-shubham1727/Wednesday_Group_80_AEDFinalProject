/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCconnection {
    public static Connection Connect() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Create a connection to the database
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            
            // Return the connection
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            // Handle errors (e.g., driver not found or connection failed)
            e.printStackTrace();
            return null;
        }
    }
}