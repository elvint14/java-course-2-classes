package org.course.part03.lesson27.lesson.db;

import org.course.part03.lesson27.lesson.model.User;

public interface Database {
    void save(User user);

    void delete();

    boolean findByUsernameAndPassword(String username, String password);
}