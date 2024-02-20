package com.temp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.addition(4,3));
        System.out.println(calculator.subtraction(4,5));
        System.out.println(calculator.multiplication(4,3));
        System.out.println(calculator.division(4,2));
    }
}
