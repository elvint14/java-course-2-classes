package org.course.part05.lesson46.controller;

import org.course.part05.lesson46.model.Student;
import org.course.part05.lesson46.service.StudentService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class StudentServlet extends HttpServlet {
    private final StudentService studentService;

    public StudentServlet(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        List<Student> students = studentService.findAllStudent();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
