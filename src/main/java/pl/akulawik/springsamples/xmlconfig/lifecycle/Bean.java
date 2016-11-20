package pl.akulawik.springsamples.xmlconfig.lifecycle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bean implements InitializingBean, DisposableBean, BeanNameAware {

    private String beanName;

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public void initXML() {
        System.out.println(beanName + " initXML");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(beanName + " afterPropertiesSet");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println(beanName + " postConstruct");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(beanName + " destroy");
    }

    public void destroyXML() {
        System.out.println(beanName + " destroyXML");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println(beanName + " preDestroy");
    }

}
