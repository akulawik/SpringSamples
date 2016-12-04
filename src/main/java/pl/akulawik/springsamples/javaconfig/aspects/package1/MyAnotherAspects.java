package pl.akulawik.springsamples.javaconfig.aspects.package1;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAnotherAspects {
    @Pointcut("within(pl.akulawik.springsamples.javaconfig.aspects.package1.*)")
    private void anyInPackage1() {}

    @After("anyInPackage1()")
    public void afterAnyInPackage1() {
        System.out.println("afterAnyInPackage1");
    }
}
