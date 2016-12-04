package pl.akulawik.springsamples.javaconfig.scopedifferences;

public class SingletonMasterWithScopedProxyWorker extends Master {
    private ScopedProxyWorker scopedProxyWorker;

    public SingletonMasterWithScopedProxyWorker(ScopedProxyWorker scopedProxyWorker) {
        this.scopedProxyWorker = scopedProxyWorker;
    }

    public void startWorkOnWithScopedProxyWorker(int iterations) {
        System.out.println("\nWork started");
        for (int i = 0; i < iterations; i++) {
            scopedProxyWorker.work();
        }
        System.out.println("Work finished\n");
    }
}
