package zhanglw.springinaction.study.s1.c2.mix;

/**
 * Created by zhanglw on 2016/11/21.
 */
public class MiX_SgtPeppers implements MIX_CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.print("Playing " + title + " by " + artist);
    }
}
