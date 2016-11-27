package zhanglw.springinaction.study.s1.c3.dessert;

import org.springframework.stereotype.Component;

/**
 * Created by zhanglw on 2016/11/26.
 */
@Component
public class Cake implements Dessert {
    @Override
    public void eat() {
        System.out.println("Cake");
    }
}
