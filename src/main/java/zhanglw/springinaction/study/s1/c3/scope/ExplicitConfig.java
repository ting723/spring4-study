package zhanglw.springinaction.study.s1.c3.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by zhanglw on 2016/11/27.
 */
@Configuration
public class ExplicitConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Notepad notepad(){
        return  new Notepad();
    }


    @Bean
    public  UniqueThing uniqueThing(){
        return  new UniqueThing();
    }

}
