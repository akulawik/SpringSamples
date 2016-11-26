package pl.akulawik.springsamples.javaconfig.aspects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        applicationContext.getBean("myBean", MyBean.class).method();
    }
}
