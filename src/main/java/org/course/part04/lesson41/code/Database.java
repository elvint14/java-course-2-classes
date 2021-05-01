package org.course.part04.lesson41.code;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    public List<Student> findAllStudent() {
        final String SQL_SELECT = "SELECT * FROM student;";
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "password");
             PreparedStatement sql = conn.prepareStatement(SQL_SELECT)) {

            ResultSet resultSet = sql.executeQuery();
            List<Student> students = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                String group = resultSet.getString("group");
                Student student = new Student(id, name, surname, age, group);
                students.add(student);
            }
            return students;
        } catch (SQLException sqlException) {
            System.out.println("Error while interacting with db");
            sqlException.printStackTrace();
        }
        return new ArrayList<>();
    }

    public List<Student> findStudentById(Integer studentId) {
        final String SQL_SELECT = "SELECT * FROM student where id = ?;";
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "password");
             PreparedStatement sql = conn.prepareStatement(SQL_SELECT)) {

            sql.setInt(1, studentId);
            ResultSet resultSet = sql.executeQuery();
            List<Student> students = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                String group = resultSet.getString("group");
                Student student = new Student(id, name, surname, age, group);
                students.add(student);
            }
            return students;
        } catch (SQLException sqlException) {
            System.out.println("Error while interacting with db");
            sqlException.printStackTrace();
        }
        return new ArrayList<>();
    }

}
