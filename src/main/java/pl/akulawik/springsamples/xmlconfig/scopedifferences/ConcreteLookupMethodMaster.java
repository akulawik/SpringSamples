package pl.akulawik.springsamples.xmlconfig.scopedifferences;

public class ConcreteLookupMethodMaster extends Master {
    protected  LookupMethodWorker createLookupMethodWorker() {
        return null;
    };

    public void startWorkOnWithLookupMethodWorker(int iterations) {
        System.out.println("\nWork started");
        for (int i = 0; i < iterations; i++) {
            createLookupMethodWorker().work();
        }
        System.out.println("Work finished\n");
    }
}
