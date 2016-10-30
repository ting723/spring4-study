package zhanglw.springinaction.study.s1.c1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

// static 静态导入

/**
 * Created by zhanglw on 2016/10/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void cdShouldNotBeNull() {

        assertNotNull(compactDisc);
        compactDisc.play();
    }
}
