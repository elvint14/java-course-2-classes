package org.course.part03.lesson27.lesson.db;

import org.course.part03.lesson27.lesson.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InMemoryDb implements Database {
    private static List<User> users = new ArrayList<>(
            Arrays.asList(
                    new User("elvin", "123"),
                    new User("eli", "456"),
                    new User("rovshen", "789")
            )
    );

    @Override
    public void save(User user) {
        users.add(user);
        System.out.println(users);
    }

    @Override
    public void delete() {

    }

    @Override
    public boolean findByUsernameAndPassword(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password))
                return true;
        }
        return false;
    }
}
