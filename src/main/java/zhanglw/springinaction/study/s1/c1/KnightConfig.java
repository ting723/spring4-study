package zhanglw.springinaction.study.s1.c1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhanglw on 2016/10/27.
 */
@Configuration
public class KnightConfig {

    @Bean
    public Knight knight(){
       return  new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return  new SlayDragonQuest(System.out);
    }

    public static void main(String[] args) {
        Knight knight = new KnightConfig().knight();
        knight.embarkOnQuest();
    }
}
