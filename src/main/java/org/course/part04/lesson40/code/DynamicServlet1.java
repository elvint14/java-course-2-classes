package org.course.part04.lesson40.code;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class DynamicServlet1 extends HttpServlet {
    private final TemplateEngine templateEngine;

    public DynamicServlet1(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        HashMap<String, Object> data = new HashMap<>();
        data.put("name", name);
        data.put("age", age);
        templateEngine.render("dyn1.ftl", data, resp);
    }
}
