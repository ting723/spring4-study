package zhanglw.springinaction.study.s1.c1;

/**
 * Created by zhanglw on 2016/10/18.
 * 构造器注入 constructor injection
 */
public class BraveKnight implements Knight{

    private Quest quest;

    // 通过构造器注入, 减少耦合
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }

    public  void  testAop(){
        System.out.println("AAAAAAAOP TEST");
    }



    public  String  testAop(String a,String b){
        System.out.println("AOP Parma:a="+a+",b="+b);
        return  "TestApp";
    }
}
