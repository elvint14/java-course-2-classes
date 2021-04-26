package org.course.part04.lesson40.code;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class DynamicServerApp {
    public static void main(String[] args) throws Exception {
        final Server server = new Server(8081);
        final ServletContextHandler handler = new ServletContextHandler();

        TemplateEngine templateEngine = TemplateEngine.folder("templates");

        handler.addServlet(new ServletHolder(new HomePageServlet()), "/");
        handler.addServlet(new ServletHolder(new DynamicServlet1(templateEngine)), "/dyn1");
        handler.addServlet(new ServletHolder(new StudentServlet(templateEngine)), "/students");

        server.setHandler(handler);
        server.start();
        server.join();
    }
}
