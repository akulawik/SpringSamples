package pl.akulawik.springsamples.xmlconfig.lifecycle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.Lifecycle;

public class LifecycleImpl implements Lifecycle, BeanNameAware {

    boolean running = false;
    private String beanName;

    @Override
    public void start() {
        System.out.println(this.beanName + " start");
        running = true;
    }

    @Override
    public void stop() {
        System.out.println(this.beanName + " stop");
        running = false;
    }

    @Override
    public boolean isRunning() {
        System.out.println(this.beanName + " isRunning " + running);
        return running;
    }

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }
}
