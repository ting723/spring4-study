package zhanglw.springinaction.study.s1.c1;

import org.springframework.stereotype.Component;

/**
 * Created by zhanglw on 2016/10/7.
 */
@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
