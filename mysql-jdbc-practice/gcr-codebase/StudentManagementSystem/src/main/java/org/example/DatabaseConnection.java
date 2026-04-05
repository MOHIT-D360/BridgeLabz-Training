package org.example;
import java.sql.*;

public class DatabaseConnection {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/mydb";
    private static final String username = "root";
    private static final String password = "12345678";

    public static Connection getConnection() {
        try{

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,username,password);
        System.out.println("Connected...");
        return connection;
        }
        catch(Exception e){
            System.out.println("Connection failed");
            e.printStackTrace();
            return null;
        }

    }
}
