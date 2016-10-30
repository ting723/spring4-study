package zhanglw.springinaction.study.s1.c1;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

/**
 * Created by zhanglw on 2016/10/18.
 * mock 测试框架
 */
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        // mock 模拟Quest
        Quest mockQuest = mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(mockQuest);
        braveKnight.embarkOnQuest();
        // 验证embark被调用次数
        verify(mockQuest, times(1)).embark();
    }
}
