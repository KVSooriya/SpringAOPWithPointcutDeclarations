package com.vismee.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect
{

    // Pointcut declaration - to declare pointcut expression once and can be reused at multiple advices/aspects

    @Pointcut("execution(* com.vismee.springaop.dao.*.*(..))")
    private void forDaoPackages() { }

    @Pointcut("execution(* com.vismee.springaop.dao.*.get*(..))")
    private void getter() { }

    @Pointcut("execution(* com.vismee.springaop.dao.*.set*(..))")
    private void setter() { }

    /* Combining pointcuts - helps us to apply advices based on certain conditions */
    @Pointcut("forDaoPackages() && !(getter() || setter())")
    private void forDaoPackagesNoGetterSetter() { }


    // Applying pointcut declaration to advices
    @Before("forDaoPackages()")
    public void logAccount()
    {
        System.out.println("Performing AOP logging");
    }

    /*
       apply advice for all methods under dao package excluding getter/setter methods .. We can
       accomplish this by combining pointcuts (refer above)
    */
    @Before("forDaoPackagesNoGetterSetter()")
    public void performAPIAnalytics()
    {
        System.out.println("Performing API analytics");
    }
}