package pl.akulawik.springsamples.javaconfig.aspects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

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

}
