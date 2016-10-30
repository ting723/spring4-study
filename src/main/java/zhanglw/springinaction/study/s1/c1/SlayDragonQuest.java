package zhanglw.springinaction.study.s1.c1;

import java.io.PrintStream;

/**
 * Created by zhanglw on 2016/10/19.
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;


    public  SlayDragonQuest(){
        System.out.println("Test");
        this.stream = System.out;
    }
    public SlayDragonQuest(PrintStream stream) {
        System.out.println("One param construct method");
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon");
    }
}
