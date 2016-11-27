package zhanglw.springinaction.study.s1.c3.scope;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * Created by zhanglw on 2016/11/27.
 */
@Configuration
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = Configuration.class)})
public class ComponentScannedConfig {
}
