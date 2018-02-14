package io.weli;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class FooApplication extends Application {

    HashSet<Object> singletons = new HashSet<Object>();

    @Override
    public Set<Class<?>> getClasses() {
        HashSet<Class<?>> set = new HashSet<Class<?>>();
        set.add(FooResource.class);
        set.add(io.swagger.jaxrs.listing.ApiListingResource.class);
        set.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);
        return set;
    }

    @Override
    public Set<Object> getSingletons() {
//        singletons.add(new io.swagger.jaxrs.listing.ApiListingResource());
//        singletons.add(new io.swagger.jaxrs.listing.SwaggerSerializers());
        return singletons;
    }
}
