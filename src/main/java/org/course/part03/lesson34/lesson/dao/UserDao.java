package org.course.part03.lesson34.lesson.dao;

import org.course.part03.lesson34.lesson.entity.User;

import java.sql.*;

public class UserDao {
    public User findByUsername(String username) {
        String SQL_SELECT = "SELECT * FROM public.users u WHERE u.username = ?;";
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc_project",
                "postgres",
                "postgres");
             PreparedStatement sql = conn.prepareStatement(SQL_SELECT)) {

            sql.setString(1, username);
            ResultSet resultSet = sql.executeQuery();
            if (resultSet.next()) {
                long id = resultSet.getLong("id");
                String uName = resultSet.getString("username");
                String password = resultSet.getString("password");
                return new User(id, uName, password);
            }
        } catch (SQLException sqlException) {
            System.out.println("Error while interacting with db");
        }
        return null;
    }

    public void save(User user) {
        String SQL_INSERT = "INSERT INTO public.users (id, username, password) VALUES (DEFAULT, ?, ?);";
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc_project",
                "postgres",
                "postgres");
             PreparedStatement sql = conn.prepareStatement(SQL_INSERT)) {

            sql.setString(1, user.getUsername());
            sql.setString(2, user.getPassword());
            sql.executeUpdate();
        } catch (SQLException sqlException) {
            System.out.println("Error while interacting with db");
        }
    }
}
