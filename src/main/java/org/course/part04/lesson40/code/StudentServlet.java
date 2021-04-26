package org.course.part04.lesson40.code;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class StudentServlet extends HttpServlet {
    private final TemplateEngine templateEngine;

    public StudentServlet(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HashMap<String, Object> data = new HashMap<>();
        data.put("username", "Teacher - Elvin Taghizade");

//        List<Student> students = Arrays.asList(
//                new Student(1, "Elvin", "Taghizade", 21, "CS"),
//                new Student(2, "Rovshen", "Meherremov", 19, "CS"),
//                new Student(3, "Ali", "Muxtarli", 19, "CS")
//        );

        List<Student> students = new Database().findAllStudent();

        data.put("students", students);
        templateEngine.render("students.ftl", data, resp);
    }
}
