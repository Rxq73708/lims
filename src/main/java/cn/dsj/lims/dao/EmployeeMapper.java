package cn.dsj.lims.dao;

import cn.dsj.lims.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
    public List<Employee> getEmployeeList();

    public List<Employee> list();

    public Employee getOneByUserId(int userId);

    public int addEmployee(Employee employee);

    public int updateEmployee(Employee employee);

    public int deleteEmployee(int staffId);

    public Employee getOneByStaffId(int staffId);
}