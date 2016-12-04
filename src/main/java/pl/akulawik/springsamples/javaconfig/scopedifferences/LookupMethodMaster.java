package pl.akulawik.springsamples.javaconfig.scopedifferences;

public abstract class LookupMethodMaster {

    public void init() {
        System.out.println("New LookupMethodMaster created");
    }

    protected abstract LookupMethodWorker createLookupMethodWorker();

    public void startWorkOnWithLookupMethodWorker(int iterations) {
        System.out.println("\nWork started");
        for (int i = 0; i < iterations; i++) {
            createLookupMethodWorker().work();
        }
        System.out.println("Work finished\n");
    }

}
