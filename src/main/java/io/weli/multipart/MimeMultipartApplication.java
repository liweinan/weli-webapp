package io.weli.multipart;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class MimeMultipartApplication extends Application {

    HashSet<Object> singletons = new HashSet<Object>();

    @Override
    public Set<Class<?>> getClasses() {
        HashSet<Class<?>> set = new HashSet<Class<?>>();
        set.add(MimeMultipartProviderResource.class);
        return set;
    }

    @Override
    public Set<Object> getSingletons() {
//        singletons.add(new io.swagger.jaxrs.listing.ApiListingResource());
//        singletons.add(new io.swagger.jaxrs.listing.SwaggerSerializers());
        return singletons;
    }
}
