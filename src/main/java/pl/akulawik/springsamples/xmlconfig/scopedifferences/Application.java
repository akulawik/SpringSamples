package pl.akulawik.springsamples.xmlconfig.scopedifferences;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("scopedifferences-context.xml");

        SingletonMasterWithPrototypeWorker singletonMasterWithPrototypeWorker
                = applicationContext.getBean("singletonMasterWithPrototypeWorker", SingletonMasterWithPrototypeWorker.class);
        singletonMasterWithPrototypeWorker.startWorkOnWithPrototypeWorker(2);

        SingletonMasterWithScopedProxyWorker singletonMasterWithScopedProxyWorker
                = applicationContext.getBean("singletonMasterWithScopedProxyWorker", SingletonMasterWithScopedProxyWorker.class);
        singletonMasterWithScopedProxyWorker.startWorkOnWithScopedProxyWorker(2);

        LookupMethodMaster lookupMethodMaster = applicationContext.getBean("lookupMethodMaster", LookupMethodMaster.class);
        lookupMethodMaster.startWorkOnWithLookupMethodWorker(2);
    }
}
