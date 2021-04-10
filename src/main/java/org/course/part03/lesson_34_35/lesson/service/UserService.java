package org.course.part03.lesson_34_35.lesson.service;

import org.course.part03.lesson_34_35.lesson.dao.UserDao;
import org.course.part03.lesson_34_35.lesson.entity.User;

public class UserService {
    private final UserDao userDao = new UserDao();

    public User findUserByUsername(String username) {
        return userDao.findByUsername(username);
    }

    public void saveUser(User user) {
        userDao.save(user);
    }
}
