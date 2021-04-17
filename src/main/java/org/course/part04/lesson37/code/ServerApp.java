package org.course.part04.lesson37.code;

import org.eclipse.jetty.server.Server;

public class ServerApp {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        server.start();
        server.join();
    }
}