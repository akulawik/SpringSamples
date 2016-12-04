package pl.akulawik.springsamples.javaconfig.scopedifferences;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
public class AppConfiguration {

    @Bean(initMethod = "init")
    public SingletonMasterWithPrototypeWorker singletonMasterWithPrototypeWorker(PrototypeWorker protorypeWorker) {
        SingletonMasterWithPrototypeWorker singletonMasterWithPrototypeWorker = new SingletonMasterWithPrototypeWorker(protorypeWorker);
        singletonMasterWithPrototypeWorker.setBeanNamePrinter(beanNamePrinter());
        return singletonMasterWithPrototypeWorker;
    }

    @Bean(initMethod = "init")
    public SingletonMasterWithScopedProxyWorker singletonMasterWithScopedProxyWorker(ScopedProxyWorker scopedProxyWorker) {
        SingletonMasterWithScopedProxyWorker singletonMasterWithScopedProxyWorker = new SingletonMasterWithScopedProxyWorker(scopedProxyWorker);
        singletonMasterWithScopedProxyWorker.setBeanNamePrinter(beanNamePrinter());
        return singletonMasterWithScopedProxyWorker;
    }

    @Bean(initMethod = "init")
    @Scope(scopeName = "prototype")
    public PrototypeWorker prototypeWorker() {
        PrototypeWorker prototypeWorker = new PrototypeWorker();
        return prototypeWorker;
    }

    @Bean(initMethod = "init")
    @Scope(scopeName = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public ScopedProxyWorker scopedProxyWorker() {
        ScopedProxyWorker scopedProxyWorker = new ScopedProxyWorker();
        return scopedProxyWorker;
    }

    @Bean
    public BeanNamePrinter beanNamePrinter() {
        return new BeanNamePrinter();
    }

    @Bean(initMethod = "init")
    @Scope("prototype")
    public LookupMethodWorker lookupMethodWorker() {
        return new LookupMethodWorker();
    }

    @Bean(initMethod = "init")
    public LookupMethodMaster lookupMethodMaster() {
        return new LookupMethodMaster() {
            @Override
            protected LookupMethodWorker createLookupMethodWorker() {
                return lookupMethodWorker();
            }
        };
    }
}
