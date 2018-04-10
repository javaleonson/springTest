package test;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import test.bean.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MainTest {
    public Object getSqlObjectById(long id){
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
        return new JdbcTemplate().queryForObject(sql,mapper,id);
    }
}
