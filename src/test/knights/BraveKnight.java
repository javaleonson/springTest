package test.knights;

/**
 * 能灵活处理所有探险任务的勇敢骑士
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) { // quest被手动注入
        this.quest = quest;
    }

    public void embarkOnQuest(){
        quest.embark();
    }
    /**
     * 和营救骑士不同的是勇敢骑士没有自己创建任务，而是在构造对象的时候用任务做参数传入<br>
     * 这是依赖注入的方式之一，叫构造器注入 constructor injection 它没有与任何特定的quest耦合，带来最大的收益-松耦合
     */

}
