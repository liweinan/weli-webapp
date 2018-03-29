package io.weli.container;

import io.weli.FooApplication;
import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;
import org.jboss.resteasy.util.PortProvider;

public class UndertowContainer {
    public static void main(String[] args) {
        System.out.println(PortProvider.getPort());
        UndertowJaxrsServer server = new UndertowJaxrsServer().start();
        server.deploy(FooApplication.class);
    }
}
