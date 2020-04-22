package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/ksiegarnia";
        String user = "root";
        String password = "";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement mystmt = conn.createStatement();
            String sql = "select * from klienci";
            ResultSet rs = mystmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getString("imie"));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }}
