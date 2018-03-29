package io.weli.multipart;

import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

public interface MimeMultipartProxyClient {
    @Path("form/class")
    @PUT
    @Consumes("multipart/form-data")
    void putFormDataMap(@MultipartForm MimeMultipartProviderResource.Form form);

    @Path("form/class")
    @PUT
    @Consumes("multipart/form-data")
    void putFormDataMapInJsonFormat(@MultipartForm JsonResource.Form form);
}
