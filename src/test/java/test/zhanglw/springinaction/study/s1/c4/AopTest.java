package test.zhanglw.springinaction.study.s1.c4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zhanglw.springinaction.study.s1.c4.*;

/**
 * Created by zhanglw on 2016/11/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AopConfig.class)
public class AopTest {

    @Autowired
    private Audience audience;

    @Autowired
    private Performance performance;

    @Autowired
    private ACompactDisc aSgtPeppers;


    @Autowired
    private TrackCounter trackCounter;

    @Test
    public void testAop() {
        performance.perform();
        ((Encoreable) performance).performEncore();
    }

    @Test
    public void testAopHasArgs() {
        aSgtPeppers.playTrack(0);
        aSgtPeppers.playTrack(0);
        aSgtPeppers.playTrack(0);
        aSgtPeppers.playTrack(0);

        System.out.println(trackCounter.getPlayCount(0));
    }
}
