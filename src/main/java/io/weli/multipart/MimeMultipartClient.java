package io.weli.multipart;

import io.weli.PortProviderUtil;
import org.jboss.resteasy.client.jaxrs.ProxyBuilder;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class MimeMultipartClient {

    private static String generateURL(String path) {
        String url = PortProviderUtil.generateURL(path, MimeMultipartClient.class.getSimpleName());
        System.out.println(url);
        return url;
    }

    public static void testMultipartForm() throws Exception {
        Client client = ClientBuilder.newClient();
        MimeMultipartProxyClient proxy = ProxyBuilder.builder(MimeMultipartProxyClient.class, client.target("http://localhost:8081/mime")).build();
        MimeMultipartProviderResource.Form form = new MimeMultipartProviderResource.Form(
                new MimeMultipartProviderCustomer("bill"), new MimeMultipartProviderCustomer("monica"));
        proxy.putFormDataMap(form);
    }

    public static void main(String[] args) throws Exception {
//        generateURL("");
        testMultipartForm();
    }
}
