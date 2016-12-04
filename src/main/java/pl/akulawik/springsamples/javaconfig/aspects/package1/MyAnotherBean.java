package pl.akulawik.springsamples.javaconfig.aspects.package1;

import javax.annotation.PostConstruct;

public class MyAnotherBean {
    public void anotherMethod() {
        System.out.println(this.getClass().getSimpleName() + " anotherMetod");
        yetAnotherMethod();
    }

    public void yetAnotherMethod() {
        System.out.println(this.getClass().getSimpleName() + " yetAnotherMetod");
    }
}
