package test.zhanglw.springinaction.study.s1.c1;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zhanglw.springinaction.study.s1.c2.javaconfig.JC_CDPlayerConfig;
import zhanglw.springinaction.study.s1.c2.javaconfig.JC_CompactDisc;
import zhanglw.springinaction.study.s1.c2.javaconfig.JC_MediaPlayer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

// static 静态导入

/**
 * Created by zhanglw on 2016/10/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JC_CDPlayerConfig.class)
public class JC_CDPlayerTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private JC_CompactDisc CompactDisc;

    @Autowired
    private JC_MediaPlayer player;

    @Test
    public void cdShouldNotBeNull() {

        assertNotNull(CompactDisc);
        CompactDisc.play();
    }

    @Test
    public void play() {
        player.play();
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band" +
                " by The Beatles", log.getLog());
    }

}
