package test.zhanglw.springinaction.study.s1.c3;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zhanglw.springinaction.study.s1.c3.MagicConfig;

import static org.junit.Assert.assertTrue;

/**
 * Created by zhanglw on 2016/11/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MagicConfig.class)
public class MagicExistsTest {

    @BeforeClass
    public static  void before() {
        System.setProperty("magic", "Love is a magic!");
    }

    @Autowired
    private ApplicationContext context;

    @Test
    public void shouldNotNull() {
        assertTrue(context.containsBean("magicBean"));
    }
}
