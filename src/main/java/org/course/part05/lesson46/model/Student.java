package org.course.part05.lesson46.model;

public class Student {
    private Integer id;

    public Student(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Student{id=%d}", id);
    }
}
