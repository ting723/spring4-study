package zhanglw.springinaction.study.s1.c2.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhanglw on 2016/10/7.
 */
@Configuration
public class JC_CDPlayerConfig {

    @Bean
    public JC_CompactDisc sgtPeperts() {
        return new JC_SgtPeppers();
    }

//    @Bean
//    public XML_CompactDisc randomBeatlesCD() {
//        int choice = (int) Math.floor(Math.random() * 4);
//        if (choice == 0) {
//            return new XML_SgtPeppers();
//        } else if (choice == 1) {
//            return new XML_SgtPeppers();
//        }
//
//        return new XML_SgtPeppers();
//    }

    @Bean
    public CDPlayerJC cdPlayer() {
        return new CDPlayerJC(sgtPeperts());
    }

//    @Bean
//    public CDPlayerXML anotherCDPlayer() {
//        return new CDPlayerXML(sgtPeperts());
//    }

    @Bean
    public CDPlayerJC cdPlayer(JC_CompactDisc JCCompactDisc) {
//        CDPlayer cdPlayer = new CDPlayer();
//        cdPlayer.setCd(JCCompactDisc);
//        return cdPlayer;

//        CDPlayer cdPlayer = new CDPlayer();
//        cdPlayer.insertDisc(JCCompactDisc);
//        return  cdPlayer;
        return new CDPlayerJC(JCCompactDisc);
    }


}
