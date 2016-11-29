package zhanglw.springinaction.study.s1.c4;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by zhanglw on 2016/11/29.
 */
@Aspect
public class Audience {

    @DeclareParents(value = "zhanglw.springinaction.study.s1.c4.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;

    @Pointcut("execution (** zhanglw.springinaction.study.s1.c4.Performance.perform(..))")
    public void performance() {
    }

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp) {
        System.out.println("Slience cell phones");
        System.out.println("Taking seats");
        try {
            jp.proceed();
        } catch (Throwable e) {
            System.out.println("Demanding a refund");
        }
        System.out.println("CLAP CLAP CLAP!!!");
    }

}
