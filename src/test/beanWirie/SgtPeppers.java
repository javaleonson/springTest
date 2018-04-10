package test.beanWirie;

import org.springframework.stereotype.Component;

/**
 * 使用component注解表明该类会作为组件类，告知spring要为这个类创建bean
 */
@Component
public class SgtPeppers implements CD {

    /* 《Sgt. Pepper's Lonely Hearts Club Band》 是英国摇滚乐队The Beatles发行于1967年6月1日的第8张录音室专辑 */
    private String title = "Sgt Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

}
