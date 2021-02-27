package org.course.part03.lesson27.lesson.db;

import org.course.part03.lesson27.lesson.model.User;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDb implements Database {
    private static final String RESOURCE = "src/main/java/org/course/part03/lesson27/lesson/resource";

    @Override
    public void save(User user) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(RESOURCE, "/users.txt")))) {
            bw.write(user.toFile());
        } catch (IOException e) {
            System.out.println("Problem while saving into file...");
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public boolean findByUsernameAndPassword(String username, String password) {
        return false;
    }
}
