package io.weli.multipart;

import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;

public class MimeMultipartServer {
    public static void main(String[] args) throws Exception {
        UndertowJaxrsServer server = new UndertowJaxrsServer().start();
        server.deploy(MimeMultipartApplication.class);
    }
}
