package org.course.part04.lesson41.code;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class DataSupplyServlet extends HttpServlet {
    private static final ObjectMapper MAPPER =
//            new XmlMapper();
            new ObjectMapper();

    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        Student student = new Student(1, "ABC", "ABCDEF", 100, null);
        List<Student> students = new Database().findAllStudent();

        String result = MAPPER.writeValueAsString(students);

        try (PrintWriter pw = resp.getWriter()) {
            pw.write(result);
        }

    }
}