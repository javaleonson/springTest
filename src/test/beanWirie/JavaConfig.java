package test.beanWirie;

import org.springframework.context.annotation.Bean;

/**
 * java中使用显式配置装配bean
 */
public class JavaConfig {
    @Bean(name = "lonelyHeartClubBand")
    public CD sgtPeppers(){ // 默认情况下bean的命名和方法名一致,可以指定重命名
        return new SgtPeppers();
    }
}
