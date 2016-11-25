package pl.akulawik.springsamples.xmlconfig.aspects;

public class Aspect {

    public void init() {
        System.out.println("init");
    }
    public void beforePointcut() {
        System.out.println("beforePointcut");
    }
}
