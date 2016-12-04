package pl.akulawik.springsamples.xmlconfig.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleApplication {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("\nCreating application context\n");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifecycle-context.xml");
        ((ConfigurableApplicationContext)applicationContext).registerShutdownHook();

        Thread.sleep(100);
        System.out.println("\nApplication context created\n");

        System.out.println("\nStarting application context\n");
        ((ConfigurableApplicationContext)applicationContext).start();
        Thread.sleep(100);
        System.out.println("\nApplication context started\n");

        System.out.println();

        System.out.println("\nStopping application context\n");
        ((ConfigurableApplicationContext)applicationContext).close();
        Thread.sleep(100);
        System.out.println("\nApplication context stopped\n");
    }
}