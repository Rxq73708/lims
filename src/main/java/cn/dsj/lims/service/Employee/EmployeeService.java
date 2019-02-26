package cn.dsj.lims.service.Employee;

import cn.dsj.lims.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getEmployeeList();
    public List<Employee> list();
    public Employee getOneByUserId(int userId);

    public boolean addEmployee(Employee employee);
    public boolean updateEmployee(Employee employee);
    public boolean deleteEmployee(int id);
    public Employee getOneByStaffId(int staffId);
}
