package org.course.part05.lesson46;

import org.course.part05.lesson46.controller.StudentServlet;
import org.course.part05.lesson46.dao.StudentDao;
import org.course.part05.lesson46.service.StudentService;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class DependencyInjectionApp {
    public static void main(String[] args) throws Exception {
        final Server server = new Server(9000);
        final ServletContextHandler handler = new ServletContextHandler();

        final StudentDao studentDao = new StudentDao();
        final StudentService studentService = new StudentService(studentDao);
        final StudentServlet studentServlet = new StudentServlet(studentService);

        handler.addServlet(new ServletHolder(studentServlet), "/students");

        server.setHandler(handler);
        server.start();
        server.join();
    }
}