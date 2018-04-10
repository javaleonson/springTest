package test.beanWirie;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 组件扫描默认是不启用的，我们需要显式配置一下spring，命令它去扫描组件
 */
@Configuration
@ComponentScan
public class CDPlayerConfig {
    /*  你也可以在xml中使用<context:component-scan base-package="test"/>配置开启扫描位置 */
}
