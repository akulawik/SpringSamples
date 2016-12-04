package pl.akulawik.springsamples.javaconfig.scopedifferences;

public class ScopedProxyWorker {
    public void init() {
        System.out.println("New ScopedProxyWorker created");
    }

    public void work() {
        System.out.println("ScopedProxyWorker is working now!");
    }
}
