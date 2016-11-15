package zhanglw.springinaction.study.s1.c2.javaconfig;

/**
 * Created by zhanglw on 2016/10/7.
 */
public class JC_SgtPeppers implements JC_CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.print("Playing " + title + " by " + artist);
    }
}
