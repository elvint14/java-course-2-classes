package org.course.part04.lesson40.code;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.course.part04.lesson40.code.Directory.*;


public class HomePageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (OutputStream os = resp.getOutputStream()) {
            Path path = Paths.get(TEMPLATE_DIR.getPath(), "index.html");
            Files.copy(path, os);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}