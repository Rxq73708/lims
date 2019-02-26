package cn.dsj.lims.controller;

import cn.dsj.lims.pojo.Employee;
import cn.dsj.lims.service.Employee.EmployeeService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/employee")
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;

    @RequestMapping("/list")
    public List<Employee> getEmployeeList(Employee employee) {
        return employeeService.getEmployeeList();
    }

    @RequestMapping("/userId/{userId}")
    public Employee getEmployee(@PathVariable("userId") int userId){
        return employeeService.getOneByUserId(userId);
    }
    @RequestMapping("/listDetails/{staffId}")
    public Employee list(@PathVariable int staffId) {
        return employeeService.getOneByStaffId(staffId);
    }

    @RequestMapping("/add")
    public String addEmployee(Employee employee){
        employee.setStaffId(Integer.parseInt(employee.getDeptName()));
    if (employeeService.addEmployee(employee))
        return "ture";
    return "false";
    }
    @RequestMapping("/update")
    public String updateEmployee(Employee employee){
        employee.setStaffId(Integer.parseInt(employee.getDeptName()));
        if (employeeService.updateEmployee(employee))
            return "true";
        return "false";
    }
    @RequestMapping("/delete")
    public String deleteEmployee(@RequestParam("id") int staffId) {
        System.out.println("delete...");
        if (employeeService.deleteEmployee(staffId))
            return "true";
        return "false";
    }
}