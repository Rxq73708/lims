package cn.dsj.lims.dao;

import cn.dsj.lims.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
    public List<Employee> getEmployeeList();

    public Employee getOneByUserId(int userId);
}