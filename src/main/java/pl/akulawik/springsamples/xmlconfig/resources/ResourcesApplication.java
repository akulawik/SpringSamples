package pl.akulawik.springsamples.xmlconfig.resources;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourcesApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources-context.xml");
        applicationContext.getBean("", Object.class);
    }
}
