package org.course.part04.lesson38.code;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalcServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String a = req.getParameter("a");
        String b = req.getParameter("b");

        System.out.println(a);
        System.out.println(b);

        try(PrintWriter pw = resp.getWriter()) {
            pw.write(String.format("Parameter a is: %s", a));
            pw.write(String.format("Parameter b is: %s", b));
        }
    }
}