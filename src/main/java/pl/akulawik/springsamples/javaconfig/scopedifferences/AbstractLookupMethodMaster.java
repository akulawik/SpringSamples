package pl.akulawik.springsamples.javaconfig.scopedifferences;

import pl.akulawik.springsamples.xmlconfig.scopedifferences.Master;

public abstract class AbstractLookupMethodMaster extends Master {

    protected abstract LookupMethodWorker createLookupMethodWorker();

    public void startWorkOnWithLookupMethodWorker(int iterations) {
        System.out.println("\nWork started");
        for (int i = 0; i < iterations; i++) {
            createLookupMethodWorker().work();
        }
        System.out.println("Work finished\n");
    }
}
