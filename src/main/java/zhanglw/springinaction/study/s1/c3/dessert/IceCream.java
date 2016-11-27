package zhanglw.springinaction.study.s1.c3.dessert;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by zhanglw on 2016/11/26.
 */
@Component
//@Primary
@Qualifier("cold")
@Creamy
public class IceCream implements Dessert {
    @Override
    public void eat() {
        System.out.println("IceCream");
    }
}
