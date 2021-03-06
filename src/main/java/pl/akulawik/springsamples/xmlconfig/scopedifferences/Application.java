package pl.akulawik.springsamples.xmlconfig.scopedifferences;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("scopedifferences-context.xml");

        System.out.println("Direct injection of prototypes into singleton, which of course doesn't work");

        SingletonMasterWithPrototypeWorker singletonMasterWithPrototypeWorker
                = applicationContext.getBean("singletonMasterWithPrototypeWorker", SingletonMasterWithPrototypeWorker.class);
        singletonMasterWithPrototypeWorker.startWorkOnWithPrototypeWorker(2);

        System.out.println("Scoped proxy worker - not recommended for injecting prototypes into singleton");

        SingletonMasterWithScopedProxyWorker singletonMasterWithScopedProxyWorker
                = applicationContext.getBean("singletonMasterWithScopedProxyWorker", SingletonMasterWithScopedProxyWorker.class);
        singletonMasterWithScopedProxyWorker.startWorkOnWithScopedProxyWorker(2);

        System.out.println("Lookup method with abstract method");

        AbstractLookupMethodMaster abstractLookupMethodMaster = applicationContext.getBean("abstractLookupMethodMaster", AbstractLookupMethodMaster.class);
        abstractLookupMethodMaster.startWorkOnWithLookupMethodWorker(2);

        System.out.println("Lookup method with concrete method");

        ConcreteLookupMethodMaster concreteLookupMethodMaster = applicationContext.getBean("concreteLookupMethodMaster", ConcreteLookupMethodMaster.class);
        concreteLookupMethodMaster.startWorkOnWithLookupMethodWorker(2);
    }
}
