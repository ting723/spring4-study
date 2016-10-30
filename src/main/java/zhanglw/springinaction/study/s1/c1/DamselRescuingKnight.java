package zhanglw.springinaction.study.s1.c1;

/**
 * Created by zhanglw on 2016/10/18.
 * 该代码耦合: quest 和 knight 耦合在一起
 */
public class DamselRescuingKnight implements Knight{

    private RescueDamseQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDamseQuest();
    }

    @Override
    public void embarkOnQuest(){
        quest.embark();
    }
}
