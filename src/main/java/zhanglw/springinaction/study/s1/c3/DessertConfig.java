package zhanglw.springinaction.study.s1.c3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import zhanglw.springinaction.study.s1.c3.dessert.Dessert;

/**
 * Created by zhanglw on 2016/11/26.
 */
@Configuration
@ComponentScan(basePackageClasses = Dessert.class)
public class DessertConfig {

}
