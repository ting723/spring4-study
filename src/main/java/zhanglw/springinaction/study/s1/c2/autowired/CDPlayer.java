package zhanglw.springinaction.study.s1.c2.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhanglw on 2016/11/13.
 * 四种方式
 */
@Component
public class CDPlayer implements MediaPlayer {

    @Autowired
    private CompactDisc cd;

//    @Autowired
//    public CDPlayer(XML_CompactDisc cd) {
//        this.cd = cd;
//    }

//    @Autowired
//    public void setCd(XML_CompactDisc cd) {
//        this.cd = cd;
//    }

//    @Inject
//    public void insertDisc(XML_CompactDisc cd) {
//        this.cd = cd;
//    }

    @Override
    public void play() {
        cd.play();
    }
}
