package com.example.projectfinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class ProjectFinalApplication {

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/projectfinal", "root", "Grzesiek070892");

            String sql = "SELECT * from hotels";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String city = resultSet.getString("city");
                String country = resultSet.getString("country");
                int stars = resultSet.getInt("stars");
                String description = resultSet.getString("description");

                System.out.println("ID: " + id);
                System.out.println("name: " + name);
                System.out.println("city: " + city);
                System.out.println("country: " + country);
                System.out.println("stars: " + stars);
                System.out.println("Description" + description);
            }
        } catch (SQLException e) {
            System.err.println("Exception");

        }

        SpringApplication.run(ProjectFinalApplication.class, args);
    }

}
