package pl.akulawik.springsamples.xmlconfig.postprocessing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostprocessingApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("postprocessing-context.xml");

        System.out.println("explicitly fetching lazily initialized bean2");
        applicationContext.getBean("bean2");
    }
}
