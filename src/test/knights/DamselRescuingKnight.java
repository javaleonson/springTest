package test.knights;

/**
 * 拥有少女营救能力的骑士
 */
public class DamselRescuingKnight implements Knight {
    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    /**
     * 从事探险
     */
    public void embarkOnQuest() {
        quest.embark();
    }
    /**
     * 这个类在其成员变量中创建了探险对象，使DamselRescuingKnight和RescueDamselQuest紧密地耦合；<br>
     * 但他只能执行营救少女的任务，如果需要杀掉恶龙、寻找宝石等，他无法执行，编写单元测试也很困难。<br>
     * 耦合具有两面性，一方面没有丝毫耦合的代码无法交互，什么也做不了；另一方面，紧密耦合的代码难以测试，难以复用，难以理解，并且修复一个Bug容易出现更多Bug<br>
     *
     */
}
