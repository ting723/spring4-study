package zhanglw.springinaction.study.s1.c2.mix;

/**
 * Created by zhanglw on 2016/11/21.
 */
public class MIX_CDPlayer implements MIX_MediaPlayer{

    private MIX_CompactDisc mix_compactDisc;

    public MIX_CDPlayer(MIX_CompactDisc mix_compactDisc) {
        this.mix_compactDisc = mix_compactDisc;
    }

    @Override
    public void play() {
        mix_compactDisc.play();
    }
}
