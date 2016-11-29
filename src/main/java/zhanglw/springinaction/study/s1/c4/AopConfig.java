package zhanglw.springinaction.study.s1.c4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by zhanglw on 2016/11/29.
 */
@Configuration
@EnableAspectJAutoProxy
@Component
public class AopConfig {

    @Bean
    public Audience audience(){
        return  new Audience();
    }

    @Bean
    public Performance performance(){
        return  new PerformanceImpl();
    }

    @Bean
    public ACompactDisc aSgtPeppers(){
        return  new ASgtPeppers();
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
