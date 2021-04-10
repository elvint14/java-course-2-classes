package org.course.part03.lesson34.lesson.exception;

public class PasswordAndConfirmPasswordNotEqualException extends RuntimeException {
    public PasswordAndConfirmPasswordNotEqualException(String message) {
        super(message);
    }
}
