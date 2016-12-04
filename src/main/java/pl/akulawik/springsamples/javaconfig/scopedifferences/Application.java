package pl.akulawik.springsamples.javaconfig.scopedifferences;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.akulawik.springsamples.xmlconfig.scopedifferences.*;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);

        System.out.println("Direct injection of prototypes into singleton, which of course doesn't work");

        SingletonMasterWithPrototypeWorker singletonMasterWithPrototypeWorker
                = applicationContext.getBean("singletonMasterWithPrototypeWorker", SingletonMasterWithPrototypeWorker.class);
        singletonMasterWithPrototypeWorker.startWorkOnWithPrototypeWorker(2);

        System.out.println("Scoped proxy worker - not recommended for injecting prototypes into singleton");

        SingletonMasterWithScopedProxyWorker singletonMasterWithScopedProxyWorker
                = applicationContext.getBean("singletonMasterWithScopedProxyWorker", SingletonMasterWithScopedProxyWorker.class);
        singletonMasterWithScopedProxyWorker.startWorkOnWithScopedProxyWorker(2);


        System.out.println("Lookup method with abstract method");

        LookupMethodMaster lookupMethodMaster = applicationContext.getBean("lookupMethodMaster", LookupMethodMaster.class);
        lookupMethodMaster.startWorkOnWithLookupMethodWorker(2);
    }
}
