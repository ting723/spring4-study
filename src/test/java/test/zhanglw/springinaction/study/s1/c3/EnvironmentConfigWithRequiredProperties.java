package test.zhanglw.springinaction.study.s1.c3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import zhanglw.springinaction.study.s1.c3.spel.BlankDisc;

/**
 * Created by zhanglw on 2016/11/27.
 */
@Configuration
public class EnvironmentConfigWithRequiredProperties {

    @Autowired
    private Environment env;

    @Bean
    public BlankDisc blankDisc() {
        return new BlankDisc(env.getRequiredProperty("disc.title"), env.getRequiredProperty("disc.artist"));
    }
}
