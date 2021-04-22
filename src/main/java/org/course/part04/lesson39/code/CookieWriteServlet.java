package org.course.part04.lesson39.code;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CookieWriteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try (PrintWriter pw = resp.getWriter()) {
            resp.addCookie(new Cookie("username", "elvin"));
            resp.addCookie(new Cookie("locale", "az"));
            resp.addCookie(new Cookie("gender", "male"));
            pw.write("Hello!");
        }
    }
}
