package pl.akulawik.springsamples.javaconfig.aspects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.akulawik.springsamples.javaconfig.aspects.package1.MyAnotherBean;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        applicationContext.getBean("myBean", MyBean.class).method();
        System.out.println();

        applicationContext.getBean("myAnotherBean", MyAnotherBean.class).anotherMethod();
        applicationContext.getBean("myAnotherBean", MyAnotherBean.class).yetAnotherMethod();
    }
}
