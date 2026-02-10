package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/getaccount",
                    "surajpanda",
                    "suraj#panda01"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}