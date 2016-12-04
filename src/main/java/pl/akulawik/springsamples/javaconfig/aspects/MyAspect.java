package pl.akulawik.springsamples.javaconfig.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {

    @Before("execution (* pl.akulawik.springsamples.javaconfig.aspects.MyBean.method())")
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }

    @Pointcut("execution (* pl.akulawik.springsamples.javaconfig.aspects.MyBean.method())")
    public void pointcutMethod() {
        System.out.println("pointcutMethod");
    }

    @After("execution (* pl.akulawik.springsamples.javaconfig.aspects.MyBean.method())")
    public void afterMethod() {
        System.out.println("afterMethod");
    }

    @AfterReturning("execution (* pl.akulawik.springsamples.javaconfig.aspects.MyBean.method())")
    public void afterReturningMethod() {
        System.out.println("afterReturningMethod");
    }

    @AfterThrowing("execution (* pl.akulawik.springsamples.javaconfig.aspects.MyBean.method())")
    public void afterThrowingMethod() {
        System.out.println("afterReturningMethod");
    }

    @Around("execution (* pl.akulawik.springsamples.javaconfig.aspects.MyBean.method())")
    public void aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around - before");
        proceedingJoinPoint.proceed(new Object[]{});
        System.out.println("around - after");
    }

}
