package io.weli.multipart;

import org.jboss.resteasy.client.jaxrs.ProxyBuilder;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class DemoClient {
    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        try {
            MimeMultipartProxyClient proxy = ProxyBuilder.builder(MimeMultipartProxyClient.class, client.target(("http://localhost:8081/api/mime"))).build();

            MimeMultipartProviderResource.Form form = new MimeMultipartProviderResource.Form(
                    new MimeMultipartProviderCustomer("bill"), new MimeMultipartProviderCustomer("monica"));

            proxy.putFormDataMap(form);
        } finally {
            client.close();
        }
    }
}
