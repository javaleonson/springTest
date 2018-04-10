package test.beanWirie;

public interface CD {
    void play();
    /**
     * CD本身定义了播放规范，将CD播放器的任意实现耦合降到最低
     */
}
