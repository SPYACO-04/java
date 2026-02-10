/*package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class employee {

    public employee(int i, String rahul, double v, int i1) {

    }

    public void addemployee(int emp_id, String emp_name, double salary, int bank_id) {
        try {
            Connection con = dbconnection.getConnection();

            String sql = "INSERT INTO employee(emp_id, emp_name, salary, bank_id) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, emp_id);
            ps.setString(2, emp_name);
            ps.setDouble(3, salary);
            ps.setInt(4, bank_id);

            ps.executeUpdate();
            System.out.println("Employee Added");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}*/


package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class employee {

    public employee(int emp_id, String emp_name, double salary, int bank_id) {
        try {
            Connection con = dbconnection.getConnection();

            String sql = "INSERT INTO employee VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, emp_id);
            ps.setString(2, emp_name);
            ps.setDouble(3, salary);
            ps.setInt(4, bank_id);

            ps.executeUpdate();
            System.out.println("Employee Added");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
