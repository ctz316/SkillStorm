//package SkillStorm.Project_2Revised.src.main.java;


import java.sql.*;

public class MySQLConnector {

    private static final String url = "jdbc:mysql://database-2.c3kr5ra50v1d.us-east-1.rds.amazonaws.com:3306/Project2";
    private static final String user = "BlueAdmin";
    private static final String password = "8A*N2WLb^i68csDc!$&mwbbuZ5vHnt";

//****************************************************************************************************************************
//***********************inserting code******************************************************************************
//****************************************************************************************************************************
//    String sql = "INSERT INTO resumes (username, name, email, phone_number, work_experience, education) VALUES (?, ?, ?, ?, ?, ?)";
//
//        try (Connection conn = DriverManager.getConnection(url, user, password);
//        PreparedStatement stmt = conn.prepareStatement(sql)) {
//
//        stmt.setString(1, "john_doe");
//        stmt.setString(2, "John Doe");
//        stmt.setString(3, "john.doe@email.com");
//        stmt.setString(4, "123-456-7890");
//        stmt.setString(5, "5 years of experience in software engineering");
//        stmt.setString(6, "Bachelor's degree in Computer Science");
//
//        int rowsInserted = stmt.executeUpdate();
//        if (rowsInserted > 0) {
//            System.out.println("A new row has been inserted successfully.");
//        }
//
//    } catch (SQLException e) {
//        System.out.println("An error occurred while inserting data into the database: " + e.getMessage());
//    }
//
//    public MySQLConnector() throws SQLException {
//        System.out.println("An error occurred while inserting data into the database: " + e.getMessage());
//    }
//}


    //****************************************************************************************************************************
//************************testing code*****************************************************
//****************************************************************************************************************************
//    static {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

//    public static void main(String[] args) {
//        ResultSet resultSet;
//        Statement statement;
//        Connection connection;
//
//
//        try {
//
//
//            // Establish a connection
//            connection = DriverManager.getConnection(url, user, password);
//
//            // Create a statement
//            statement = connection.createStatement();
//
//            // Execute a SELECT query
//            resultSet = statement.executeQuery("SELECT * FROM job_postings");
//
//            // Process the result set
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("company");
//                System.out.printf("ID: %d, Name: %s \n", id, name);
//            }
//
//            // Close the resources
//            resultSet.close();
//            statement.close();
//            connection.close();
//        }
//
//        catch(SQLException e) {
//            System.out.println("Could not connect to database");
//            e.printStackTrace();
//        }
//    }
}
