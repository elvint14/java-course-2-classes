package org.course.part03.lesson34.lesson.controller;

import org.course.part03.lesson34.lesson.exception.UserNotFoundException;
import org.course.part03.lesson34.lesson.entity.User;
import org.course.part03.lesson34.lesson.service.UserService;

public class UserController {
    private static final UserService userService = new UserService();

    public String login(String username, String password) {
        User user = userService.findUserByUsername(username);

        if (user == null) throw new UserNotFoundException(
                String.format("User with username: '%s' does not exits!", username)
        );

        return null;
    }
}
