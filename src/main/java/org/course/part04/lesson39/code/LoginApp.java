package org.course.part04.lesson39.code;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class LoginApp {
    public static void main(String[] args) throws Exception {
        Server server = new Server(9000);
        ServletContextHandler handler = new ServletContextHandler();

        handler.addServlet(new ServletHolder(new LoginServlet()),"/login");
        handler.addServlet(new ServletHolder(new CookieWriteServlet()), "/write-cookie");
        handler.addServlet(new ServletHolder(new CookieReadServlet()), "/read-cookie");

        handler.addServlet(new ServletHolder(new StaticServlet("css")),"/css/*");
        handler.addServlet(new ServletHolder(new StaticServlet("js")),"/js/*");
        handler.addServlet(new ServletHolder(new StaticServlet("images")),"/images/*");

        handler.addServlet(new ServletHolder(new RedirectServlet("login")), "/");

        server.setHandler(handler);
        server.start();
        server.join();
    }
}
