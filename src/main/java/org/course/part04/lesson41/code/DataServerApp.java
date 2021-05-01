package org.course.part04.lesson41.code;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class DataServerApp {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletContextHandler handler = new ServletContextHandler();

//        handler.addServlet(new ServletHolder(new DataSupplyServlet()), "/students");
        handler.addServlet(new ServletHolder(new DataSupplyServlet2()), "/students/*");

        server.setHandler(handler);
        server.start();
        server.join();
    }
}
