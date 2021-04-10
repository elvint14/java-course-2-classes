package org.course.part03.lesson_34_35.lesson.exception;

public class PasswordAndConfirmPasswordNotEqualException extends RuntimeException {
    public PasswordAndConfirmPasswordNotEqualException(String message) {
        super(message);
    }
}
