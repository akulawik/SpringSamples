package pl.akulawik.springsamples.javaconfig.aspects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import pl.akulawik.springsamples.javaconfig.aspects.package1.MyAnotherAspects;
import pl.akulawik.springsamples.javaconfig.aspects.package1.MyAnotherBean;

@Configuration
@EnableAspectJAutoProxy
public class AppConfiguration {

    @Bean
    public MyBean myBean() {
        return new MyBean();
    }

    @Bean
    public MyAspect myAspect() {
        return new MyAspect();
    }

    @Bean
    public MyAnotherBean myAnotherBean() {
        return new MyAnotherBean();
    }

    @Bean
    public MyAnotherAspects myAnotherAspects() {
        return new MyAnotherAspects();
    }

}
