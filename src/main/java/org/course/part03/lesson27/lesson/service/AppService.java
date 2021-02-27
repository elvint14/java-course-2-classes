package org.course.part03.lesson27.lesson.service;

import org.course.part03.lesson27.lesson.db.Database;
import org.course.part03.lesson27.lesson.model.User;

public class AppService {
    private final Database database;

    public AppService(Database database) {
        this.database = database;
    }

    public boolean findByUsernameAndPassword(String username, String password) {
        return database.findByUsernameAndPassword(username, password);
    }

    public void register(User user) {
        database.save(user);
    }
}
