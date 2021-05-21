package org.course.part05.lesson46.dao;

import org.course.part05.lesson46.model.Student;

import java.util.Arrays;
import java.util.List;

public class StudentDao {
    private static List<Student> students = Arrays.asList(
            new Student(1),
            new Student(2),
            new Student(3),
            new Student(4),
            new Student(5)
    );

    public List<Student> findAllStudent() {
        return students;
    }

}
