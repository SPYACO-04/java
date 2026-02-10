/*package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class account {
    public  account(int account_id, String account_holder, double balance, int emp_Id) {
        try {

            Connection con = dbconnection.getConnection();
            String sql = "INSERT INTO employee VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, account_id);
            ps.setString(2, account_holder);
            ps.setDouble(3, balance);
            ps.setInt(4, emp_Id
                    );
            ps.executeUpdate();
            System.out.println("Employee Added");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

*/
package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class account {
    public account(int account_id, String account_holder, double balance, int emp_id) {
        try {
            Connection con = dbconnection.getConnection();

            String sql = "INSERT INTO account VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, account_id);
            ps.setString(2, account_holder);
            ps.setDouble(3, balance);
            ps.setInt(4, emp_id);

            ps.executeUpdate();
            System.out.println("Account Added");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
