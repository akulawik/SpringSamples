package pl.akulawik.springsamples.javaconfig.scopedifferences;

public class PrototypeWorker {

    public void init() {
        System.out.println("New PrototypeWorker created");
    }

    public void work() {
        System.out.println("PrototypeWorker is working now!");
    }
}
