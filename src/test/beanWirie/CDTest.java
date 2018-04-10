package test.beanWirie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * 测试组件自动装配是否成功
 */
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDTest {
    @Autowired
    private CD cd;

    public void cdShouldNotBeNull(){
        assert cd != null;
        System.out.println(cd);
    }

    public static void main(String[] args) {
        new CDTest().cdShouldNotBeNull();
    }
}
