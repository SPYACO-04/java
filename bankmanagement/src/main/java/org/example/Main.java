package org.example;

import org.example.account;
import org.example.bank;
import org.example.employee;
import java.sql.PreparedStatement;
import org.example.bank;

public class Main {
    public static void main(String[] args) {

        bank b = new bank(25, "hdfc", "mumbai");


        employee e = new employee(205, "rohit", 45000, 25);


        account a = new account(5006, "rohit", 12000, 205);

    }
}