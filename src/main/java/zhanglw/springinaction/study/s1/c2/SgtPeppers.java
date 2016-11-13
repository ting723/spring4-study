package zhanglw.springinaction.study.s1.c2;

import javax.inject.Named;

/**
 * Created by zhanglw on 2016/10/7.
 */
//@Component("lonelyHeartsClub")
@Named("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.print("Playing " + title + " by " + artist);
    }
}
