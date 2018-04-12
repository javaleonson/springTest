package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import test.bean.Employee;
import test.proxy.DynamicProxyHandler;
import test.proxy.Host;
import test.proxy.Rents;
import test.proxy.StaticProxy;

import java.lang.reflect.Proxy;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public Object getSqlObjectById(long id) {
        String sql = "select id, firstname, lastname, salary from employee where id=?";
        RowMapper<Employee> mapper = new RowMapper<>() {
            @Override
            public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                Employee employee = new Employee();
                employee.setId(resultSet.getLong("id"));
                employee.setFirstName(resultSet.getString("firstname"));
                employee.setFirstName(resultSet.getString("lastname"));
                employee.setSalary(resultSet.getInt("salary"));
                return employee;
            }
        };
        return new JdbcTemplate().queryForObject(sql, mapper, id);
    }

    public static void main(String[] args) {
        // static proxy
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        StaticProxy staticProxy_1 = context.getBean(StaticProxy.class);
        staticProxy_1.rentP();

        // dynamic proxy
        System.out.println("______动态代理______");
        DynamicProxyHandler proxyHandler = context.getBean(DynamicProxyHandler.class);
        Rents rents = (Rents) Proxy.newProxyInstance(Rents.class.getClassLoader(), new Class[]{Rents.class}, proxyHandler);
        rents.rent();

        proxyHandler.setTarget(new ArrayList<>());
        List<String> list = (List) proxyHandler.getProxy();
        list.add("hello");
        System.out.println(list);
    }
}
