package org.course.part04.lesson37.code;

import org.eclipse.jetty.server.Server;

public class Server2App {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8081);

        server.start();
        server.join();
    }
}