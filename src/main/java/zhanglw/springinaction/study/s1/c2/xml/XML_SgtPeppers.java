package zhanglw.springinaction.study.s1.c2.xml;

/**
 * Created by zhanglw on 2016/10/7.
 */
public class XML_SgtPeppers implements XML_CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.print("Playing " + title + " by " + artist);
    }
}
