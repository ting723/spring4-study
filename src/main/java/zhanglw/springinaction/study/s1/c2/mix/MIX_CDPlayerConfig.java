package zhanglw.springinaction.study.s1.c2.mix;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by zhanglw on 2016/11/21.
 */
@ContextConfiguration
@Import(MIX_CDConfig.class)
public class MIX_CDPlayerConfig {

    @Bean
    public MIX_CDPlayer cdPlayer(MIX_CompactDisc mix_compactDisc){
        return  new MIX_CDPlayer(mix_compactDisc);
    }
}
