package zhanglw.springinaction.study.s1.c2.javaconfig;

/**
 * Created by zhanglw on 2016/11/13.
 * 四种方式
 */
public class CDPlayerJC implements JC_MediaPlayer {

    private JC_CompactDisc cd;

    public CDPlayerJC() {
    }


    public CDPlayerJC(JC_CompactDisc cd) {
        this.cd = cd;
    }

    public void setCd(JC_CompactDisc cd) {
        this.cd = cd;
    }

    public void insertDisc(JC_CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
