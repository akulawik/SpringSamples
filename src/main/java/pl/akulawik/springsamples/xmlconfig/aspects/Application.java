package pl.akulawik.springsamples.xmlconfig.aspects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aspects-context.xml");

        Bean bean = applicationContext.getBean("bean", Bean.class);
        bean.method1();
    }
}
