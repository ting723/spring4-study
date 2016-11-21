package zhanglw.springinaction.study.s1.c2.mix;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by zhanglw on 2016/11/21.
 */
@Configuration
@Import(MIX_CDPlayerConfig.class)
@ImportResource("classpath:mix-config.xml")
public class MIXConfig {
}
