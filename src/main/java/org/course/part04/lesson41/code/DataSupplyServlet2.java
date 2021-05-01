package org.course.part04.lesson41.code;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class DataSupplyServlet2 extends HttpServlet {
    private static final ObjectMapper MAPPER =
//            new XmlMapper();
            new ObjectMapper();

    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        List<Student> students = new Database().findStudentById(Integer.parseInt(id));

        String result = MAPPER.writeValueAsString(students);

        try (PrintWriter pw = resp.getWriter()) {
            pw.write(result);
        }

    }
}