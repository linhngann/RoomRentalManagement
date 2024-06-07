/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author nm204
 */
public class JDBCUtils {
    public static Connection getConnection()
    {
        Connection c = null;
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String url = "jdbc:mySQL://localhost:3306/quanlynhatro";
            String username = "root";
            String password = "123456";
            
            c = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }
    public static void closeConnection(Connection c)
    {
        try {
            if(c != null)
            {
                c.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
