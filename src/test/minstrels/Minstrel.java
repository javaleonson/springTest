package test.minstrels;

import java.io.PrintStream;

/**
 * 用音乐记录传记的吟游诗人
 */
public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest(){ // 探险前调用
        stream.println("the knight is so brave!");
    }

    public void singAfterQuest(){ // 探险结束后调用
        stream.println("the brave knight did embark on a quest!");
    }

    /**
     * 我们不需要在骑士的embark方法中管理吟游诗人命令他用诗歌记录探险事迹，因为这是吟游诗人的职责，不需要人提醒；<br>
     * 而且在骑士中构造器注入还要检查null，使braveKnight的代码更复杂；我们使用AOP,声明吟游诗人必须主动歌颂骑士的探险事迹，而骑士本身不需要关心这些
     * */
}
