package pl.akulawik.springsamples.xmlconfig.scopedifferences;

import org.springframework.beans.factory.BeanNameAware;

public abstract class Master implements BeanNameAware {
    private BeanNamePrinter beanNamePrinter;
    private String beanName;

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public void setBeanNamePrinter(BeanNamePrinter beanNamePrinter) {
        this.beanNamePrinter = beanNamePrinter;
    }

    public void init() {
        beanNamePrinter.printName(beanName);
    }
}
