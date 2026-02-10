package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class bank {
    public  bank(int bank_id, String bank_name, String city) {
        try {
            Connection con = dbconnection.getConnection();
            String sql = "INSERT INTO bank VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, bank_id);
            ps.setString(2, bank_name);
            ps.setString(3, city);
            ps.executeUpdate();
            System.out.println("Bank Added");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}