package pl.akulawik.springsamples.xmlconfig.resources;

import org.springframework.core.io.Resource;

public class Bean {
    private Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
        System.out.println(this.resource);
        System.out.println(this.resource.exists());
    }
}
