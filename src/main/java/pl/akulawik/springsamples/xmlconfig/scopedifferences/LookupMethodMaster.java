package pl.akulawik.springsamples.xmlconfig.scopedifferences;

public abstract class LookupMethodMaster extends Master {

    protected abstract LookupMethodWorker createLookupMethodWorker();

    public void startWorkOnWithLookupMethodWorker(int iterations) {
        System.out.println("\nWork started");
        for (int i = 0; i < iterations; i++) {
            createLookupMethodWorker().work();
        }
        System.out.println("Work finished\n");
    }
}
