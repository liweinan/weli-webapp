package io.weli.multipart;

import org.jboss.resteasy.client.jaxrs.ProxyBuilder;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

// Start MimeMultipartServer firstly.
public class JsonDemoClient {
    public static final void main(String[] args) {

        try {
            Client client = ClientBuilder.newClient();

            MimeMultipartProxyClient proxy = ProxyBuilder.builder(MimeMultipartProxyClient.class, client.target(("http://localhost:8081/json"))).build();

            JsonResource.Form form = new JsonResource.Form(
                    new User("bill"));

            proxy.putFormDataMapInJsonFormat(form);
        } catch (Exception e) {

        }
    }
}
