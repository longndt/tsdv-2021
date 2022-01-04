package example.springmvccrud.dao;

import example.springmvccrud.bean.Employee;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

public class EmployeeDAO {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
    public int add(Employee e) {
        String sql = "INSERT INTO Employee(name, salary) VALUES (?, ?)";
        return template.update(sql, e.getName(), e.getSalary());
    }
    public int edit(Employee e) {
        String sql = "UPDATE Employee SET name = ?, salary = ? WHERE id = ?";
        return template.update(sql, e.getName(), e.getSalary(), e.getId());
    }
    public int delete(int id) {
        String sql = "DELETE FROM Employee WHERE id = ?";
        return template.update(sql, id);
    }
    public Employee getEmployeeById (int id) {
        String sql = "SELECT * FROM Employee WHERE id = ?";
        return template.queryForObject(sql,
                new BeanPropertyRowMapper<>(Employee.class),
                new Object[]{id});
    }
    public List<Employee> getEmployeeList(){
      String sql = "SELECT * FROM Employee";
      return template.query(sql,
              new BeanPropertyRowMapper<>(Employee.class));
    }
}
