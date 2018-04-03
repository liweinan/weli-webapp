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
        @FormParam("user")
        @PartType("application/json")
        private User user;

        public Form() {
        }

        public Form(final User user) {
            this.user = user;
        }

        public User getUser() {
            return user;
        }

    }

    @PUT
    @Path("form/class")
    @Consumes("multipart/form-data")
    public void putMultipartForm(@MultipartForm Form form) {
        System.out.println(form.getUser().getName());
    }

}
