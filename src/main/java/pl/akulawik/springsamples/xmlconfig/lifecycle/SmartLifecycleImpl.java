package pl.akulawik.springsamples.xmlconfig.lifecycle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.SmartLifecycle;

public class SmartLifecycleImpl implements SmartLifecycle, BeanNameAware {

    private boolean running = false;
    private int phase;
    private String beanName;

    @Override
    public void start() {
        System.out.println(beanName +" start");
        running = true;
    }

    @Override
    public void stop() {
        System.out.println(beanName +" stop");
        running = false;
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public boolean isAutoStartup() {
        return true;
    }

    @Override
    public void stop(Runnable runnable) {
        stop();
        runnable.run();
    }

    @Override
    public int getPhase() {
        return phase;
    }

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }
}
