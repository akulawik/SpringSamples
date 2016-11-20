package pl.akulawik.springsamples.xmlconfig.postprocessing;

import org.springframework.beans.factory.BeanNameAware;

public class Bean implements BeanNameAware {

    private String beanName;

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public void initXML() {
        System.out.println(beanName + " initXML");
    }

    public void destroyXML() {
        System.out.println(beanName + " destroyXML");
    }
}
