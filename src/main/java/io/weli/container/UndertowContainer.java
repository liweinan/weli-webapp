package io.weli.container;

import io.weli.FooApplication;
import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;

public class UndertowContainer {
    public static void main(String[] args) throws Exception {
        UndertowJaxrsServer server = new UndertowJaxrsServer().start();
        server.deploy(FooApplication.class);
    }
}
