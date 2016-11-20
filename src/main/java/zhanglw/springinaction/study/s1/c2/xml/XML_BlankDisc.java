package zhanglw.springinaction.study.s1.c2.xml;

import zhanglw.springinaction.study.s1.c2.autowired.CompactDisc;

/**
 * Created by zhanglw on 2016/11/20.
 */
public class XML_BlankDisc implements CompactDisc {

    private String title;

    private String artist;

    public XML_BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
