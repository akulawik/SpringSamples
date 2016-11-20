package pl.akulawik.springsamples.xmlconfig.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factory-context.xml");

        MyBean myBean = applicationContext.getBean("myBean", MyBean.class);
    }
}
