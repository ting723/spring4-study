package zhanglw.springinaction.study.s1.c2.mix;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhanglw on 2016/10/7.
 */
@Configuration
public class MIX_CDConfig {


    @Bean
    public MIX_CompactDisc mix_compactDisc(){
        return new MiX_SgtPeppers();
    }
}
