package org.course.part04.lesson38.code;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * main url: http://127.0.0.1:8080
 */
public class ServerApp {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(new ServletHolder(new HelloWorldServlet()), "/");
        handler.addServlet(new ServletHolder(new HelloWorldServlet2()), "/hello");
        handler.addServlet(new ServletHolder(new CalcServlet()), "/calc/*");
        handler.addServlet(new ServletHolder(new LoginServlet()), "/login/*");
        handler.addServlet(new ServletHolder(new LoginServlet2()), "/login2/*");
        handler.addServlet(new ServletHolder(new InfoServlet()), "/info/*");

        // query param

        server.setHandler(handler);

        server.start();
        server.join();
    }
}