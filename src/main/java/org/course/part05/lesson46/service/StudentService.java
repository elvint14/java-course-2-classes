package org.course.part05.lesson46.service;

import org.course.part05.lesson46.dao.StudentDao;
import org.course.part05.lesson46.model.Student;

import java.util.List;

public class StudentService {
    private final StudentDao studentDao;

    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public List<Student> findAllStudent() {
        return studentDao.findAllStudent();
    }
}
