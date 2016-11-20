package pl.akulawik.springsamples.xmlconfig.factory;

public class MyBeanFactory {

    public void init() {
        System.out.println(this.getClass() + " created");
    }

    public static MyBeanFactory createMyBeanFactory () {
        return new MyBeanFactory();
    }

    public MyBean createMyBean() {
        return new MyBean();
    }
}
