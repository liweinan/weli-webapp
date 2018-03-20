package io.weli.multipart;

import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;
import org.jboss.resteasy.annotations.providers.multipart.PartType;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/mime")
public class MimeMultipartProviderResource {

    public static class Form {
        @FormParam("bill")
        @PartType("application/xml")
        private MimeMultipartProviderCustomer bill;

        @FormParam("monica")
        @PartType("application/xml")
        private MimeMultipartProviderCustomer monica;

        public Form() {
        }

        public Form(final MimeMultipartProviderCustomer bill, final MimeMultipartProviderCustomer monica) {
            this.bill = bill;
            this.monica = monica;
        }

        public MimeMultipartProviderCustomer getBill() {
            return bill;
        }

        public MimeMultipartProviderCustomer getMonica() {
            return monica;
        }
    }

    @PUT
    @Path("form/class")
    @Consumes("multipart/form-data")
    public void putMultipartForm(@MultipartForm Form form) {
        System.out.println(form);

//        Assert.assertNotNull(ERR_CUST_NULL, form.getBill());
//        Assert.assertEquals(ERR_VALUE, "bill", form.getBill().getName());
//
//        Assert.assertNotNull(ERR_CUST_NULL, form.getMonica());
//        Assert.assertEquals(ERR_VALUE, "monica", form.getMonica().getName());
    }
}

