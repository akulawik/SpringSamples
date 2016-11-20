package pl.akulawik.springsamples.xmlconfig.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleApplication {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifecycle-context.xml");
        ((ConfigurableApplicationContext)applicationContext).start();
        System.out.println("\nApplication context started\n");
        Thread.sleep(100);

        ((ConfigurableApplicationContext)applicationContext).close();
        System.out.println("\nApplication context stopped\n");
        Thread.sleep(100);
    }
}