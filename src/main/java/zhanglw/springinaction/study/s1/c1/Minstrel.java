package zhanglw.springinaction.study.s1.c1;

import org.aspectj.lang.ProceedingJoinPoint;

import java.io.PrintStream;
import java.util.Arrays;

/**
 * Created by zhanglw on 2016/10/29.
 * 切面
 */
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        stream.println("Fa la la, the knight is so brave!");
    }

    public void singAfterQuest() {
        stream.println("Tee hee hee, the brave knight " + "did embark on a quest!");
    }

    public Object permissionCheck(ProceedingJoinPoint point) throws Throwable {
        System.out.println("@Before：模拟权限检查...");
        System.out.println("@Before：目标方法为：" +
                point.getSignature().getDeclaringTypeName() + "." + point.getSignature().getName());
        System.out.println("@Before：参数为：" + Arrays.toString(point.getArgs()));
        System.out.println("@Before：被织入的目标对象为：" + point.getTarget());
        if(point.getArgs()[1].equals("ParamBBBB")){
            return point.proceed();
        }
        return  "FALSE";

    }
}
