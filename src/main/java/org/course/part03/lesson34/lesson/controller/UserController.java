package org.course.part03.lesson34.lesson.controller;

import org.course.part03.lesson34.lesson.exception.DuplicateUsernameException;
import org.course.part03.lesson34.lesson.exception.IncorrectPasswordException;
import org.course.part03.lesson34.lesson.exception.PasswordAndConfirmPasswordNotEqualException;
import org.course.part03.lesson34.lesson.exception.UserNotFoundException;
import org.course.part03.lesson34.lesson.entity.User;
import org.course.part03.lesson34.lesson.service.UserService;

public class UserController {
    private static final UserService userService = new UserService();

    public String login(String username, String password) {
        User user = userService.findUserByUsername(username);

        try {
            if (user == null)
                throw new UserNotFoundException(String.format("User with username: '%s' does not exits!", username));
            if (!password.equals(user.getPassword()))
                throw new IncorrectPasswordException(String.format("Entered password: '%s' is incorrect!", password));
        } catch (Exception e) {
            return e.getMessage();
        }

        return "Login is successful!";
    }

    public String register(String username, String password, String confirmPassword) {
        try {
            if (!password.equals(confirmPassword)) throw new PasswordAndConfirmPasswordNotEqualException(
                    String.format("Password: '%s' and confirm password: '%s' are not equal!", password, confirmPassword)
            );

            User user = userService.findUserByUsername(username);
            if (user != null) throw new DuplicateUsernameException(
                    String.format("Entered username: '%s' is already exists!", username)
            );

            userService.saveUser(new User(username, password));
            return "Registration is successful!";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
