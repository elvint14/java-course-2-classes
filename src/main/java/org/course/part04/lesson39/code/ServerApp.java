package org.course.part04.lesson39.code;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class ServerApp {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8081);
        ServletContextHandler handler = new ServletContextHandler();

        handler.addServlet(new ServletHolder(new InfoServlet()),"/home");
//        handler.addServlet(new ServletHolder(new CssServlet()),"/css/*");
//        handler.addServlet(new ServletHolder(new JsServlet()),"/js/*");
//        handler.addServlet(new ServletHolder(new ImageServlet()),"/images/*");

        handler.addServlet(new ServletHolder(new StaticServlet("css")),"/css/*");
        handler.addServlet(new ServletHolder(new StaticServlet("js")),"/js/*");
        handler.addServlet(new ServletHolder(new StaticServlet("images")),"/images/*");

        server.setHandler(handler);
        server.start();
        server.join();
    }
}
