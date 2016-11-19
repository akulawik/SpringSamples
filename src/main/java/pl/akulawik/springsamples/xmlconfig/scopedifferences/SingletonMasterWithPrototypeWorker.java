package pl.akulawik.springsamples.xmlconfig.scopedifferences;

public class SingletonMasterWithPrototypeWorker extends Master {
    private PrototypeWorker prototypeWorker;

    public SingletonMasterWithPrototypeWorker(PrototypeWorker prototypeWorker) {
        this.prototypeWorker = prototypeWorker;
    }

    public void startWorkOnWithPrototypeWorker(int iterations) {
        System.out.println("\nWork started");
        for (int i = 0; i < iterations; i++) {
            prototypeWorker.work();
        }
        System.out.println("Work finished\n");
    }
}
