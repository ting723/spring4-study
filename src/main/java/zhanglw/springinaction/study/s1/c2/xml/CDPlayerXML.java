package zhanglw.springinaction.study.s1.c2.xml;

/**
 * Created by zhanglw on 2016/11/13.
 * 四种方式
 */
public class CDPlayerXML implements XML_MediaPlayer {

    private XML_CompactDisc cd;

//    public CDPlayerXML() {
//    }


    public CDPlayerXML(XML_CompactDisc cd) {
        this.cd = cd;
    }

//    public void setCd(XML_CompactDisc cd) {
//        this.cd = cd;
//    }
//
//    public void insertDisc(XML_CompactDisc cd) {
//        this.cd = cd;
//    }

    @Override
    public void play() {
        cd.play();
    }
}
