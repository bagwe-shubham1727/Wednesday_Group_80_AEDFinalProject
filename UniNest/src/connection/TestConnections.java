/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;
import java.sql.Connection;
/**
 *
 * @author aditi
 */
public class TestConnections {
     public static void main(String[] args) {
        // Attempt to establish a connection to the database
        Connection connection = JDBCconnection.Connect();
        if (connection != null) {
            System.out.println("Database connection successful!");
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
}
