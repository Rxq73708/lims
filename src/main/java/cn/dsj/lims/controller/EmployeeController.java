package cn.dsj.lims.controller;

import cn.dsj.lims.pojo.Employee;
import cn.dsj.lims.service.Employee.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description：
 * Employee控制器
 *
 * @author Administrator
 * @create 2019/1/18
 */
@RestController

public class EmployeeController {
    @Resource
    private EmployeeService employeeService;

    @RequestMapping("/employee")
    public List<Employee> getEmployeeList(Employee employee) {
        return employeeService.getEmployeeList();
    }
}