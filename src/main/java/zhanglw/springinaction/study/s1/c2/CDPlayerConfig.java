package zhanglw.springinaction.study.s1.c2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhanglw on 2016/10/7.
 */

@Configuration
@ComponentScan(basePackageClasses = {CDPlayerConfig.class,CompactDisc.class})
public class CDPlayerConfig {
}
