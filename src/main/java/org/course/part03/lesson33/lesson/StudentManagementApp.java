package org.course.part03.lesson33.lesson;

import java.sql.*;

public class StudentManagementApp {
    public static void main(String[] args) {
        String SQL_SELECT = "SELECT * FROM university.student;";
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/jdbc_example",
                        "postgres",
                        "postgres");
                PreparedStatement sql = conn.prepareStatement(SQL_SELECT)) {

            ResultSet resultSet = sql.executeQuery();
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");
                Date birthDate = resultSet.getDate("birth_date");
                String phoneNumber = resultSet.getString("phone_number");
                Student student = new Student(
                        id,
                        firstName,
                        lastName,
                        email,
                        birthDate.toLocalDate(),
                        phoneNumber);
                System.out.println(student);
            }
            System.out.println("Xeta bash verMEdi");
        } catch (SQLException sqlException) {
            System.out.println("Cannot connect to database.");
            sqlException.printStackTrace();
        }


    }
}
