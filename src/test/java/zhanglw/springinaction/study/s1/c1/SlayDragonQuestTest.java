package zhanglw.springinaction.study.s1.c1;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhanglw on 2016/10/20.
 */
public class SlayDragonQuestTest {

    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:knights.xml");
            BraveKnight braveKnight = context.getBean(BraveKnight.class);
//            braveKnight.embarkOnQuest();
//            braveKnight.testAop();
            String ab = braveKnight.testAop("ParamAAAA", "ParamBBBBA");
            System.out.println(ab);

        } catch (BeansException e) {
            e.printStackTrace();
        }
    }
}
