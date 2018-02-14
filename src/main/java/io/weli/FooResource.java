package io.weli;

import io.swagger.annotations.Api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/foo")
@Api(value = "/foo", description = "foo resource")
public class FooResource {

    @GET
    public String foo() {
        return "foo";
    }
}
