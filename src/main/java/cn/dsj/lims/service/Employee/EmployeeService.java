package cn.dsj.lims.service.Employee;

import cn.dsj.lims.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getEmployeeList();
    public Employee getOneByUserId(int userId);
}
