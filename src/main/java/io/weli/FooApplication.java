package io.weli;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class FooApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        HashSet<Class<?>> set = new HashSet<Class<?>>();
        set.add(io.swagger.jaxrs.listing.ApiListingResource.class);
        set.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);
        return set;
    }

    @Override
    public Set<Object> getSingletons() {
        return super.getSingletons();
    }
}
