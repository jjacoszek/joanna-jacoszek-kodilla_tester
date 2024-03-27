package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
        public static void main(String[] args) {
            try {
                DbManager dbManager = DbManager.getInstance();
                Connection connection = dbManager.getConnection();
                System.out.println("Connected to the database.");
            } catch (SQLException e) {
                System.out.println("Failed to connect to the database.");
                e.printStackTrace();
            }
        }
    }

