package test.proxy;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理生成器
 *
 * @return Object proxy 生成新的代理对象
 */
public class DynamicProxyHandler implements InvocationHandler {
    private Rents rent;

    public void setRent(Rents rent) {
        this.rent = rent;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(rent, args);
    }
}
