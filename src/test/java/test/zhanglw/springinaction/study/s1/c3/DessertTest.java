package test.zhanglw.springinaction.study.s1.c3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zhanglw.springinaction.study.s1.c3.DessertConfig;
import zhanglw.springinaction.study.s1.c3.dessert.Dessert;
import zhanglw.springinaction.study.s1.c3.dessert.Fruity;

/**
 * Created by zhanglw on 2016/11/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfig.class)
public class DessertTest {

    @Autowired
    @Qualifier("cold")
    @Fruity
    private Dessert dessert;

    @Test
    public  void test(){
        dessert.eat();
    }

}
