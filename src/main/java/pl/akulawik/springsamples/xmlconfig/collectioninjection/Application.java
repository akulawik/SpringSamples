package pl.akulawik.springsamples.xmlconfig.collectioninjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("collectioninection-context.xml");

        DataSource dataSource = applicationContext.getBean("dataSource", DataSource.class);

        for (String name : dataSource.getNames()) {
            System.out.println(name);
        }

        for (Address address : dataSource.getAddresses()) {
            System.out.println(address.getAddress());
        }
    }
}
