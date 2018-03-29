package io.weli.multipart;

import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;
import org.jboss.resteasy.annotations.providers.multipart.PartType;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/json")
public class JsonResource {

    public static class Form {
        @FormParam("bill")
        @PartType("application/json")
        private JsonItem bill;

        public Form() {
        }

        public Form(final JsonItem bill) {
            this.bill = bill;
        }

        public JsonItem getBill() {
            return bill;
        }

    }

    @PUT
    @Path("form/class")
    @Consumes("multipart/form-data")
    public void putMultipartForm(@MultipartForm Form form) {
        System.out.println(form.getBill().getName());
    }

}
