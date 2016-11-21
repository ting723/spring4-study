package test.zhanglw.springinaction.study.s1.c2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zhanglw.springinaction.study.s1.c2.mix.MIXConfig;
import zhanglw.springinaction.study.s1.c2.mix.MIX_CDPlayer;

/**
 * Created by zhanglw on 2016/11/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath*:mix.xml")
@ContextConfiguration(classes = MIXConfig.class)
public class TestMixConfig {

    @Autowired
    private MIX_CDPlayer mix_cdPlayer;


    @Test
    public void test(){
        mix_cdPlayer.play();
    }
}
