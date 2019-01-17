package cn.dsj.lims.controller;

import cn.dsj.lims.pojo.Employee;
import cn.dsj.lims.service.Employee.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;

    @RequestMapping("/employeeList")
    public Map<String, Object> employeeList(String empName, int start, int size) {
        System.out.println("empName...");
        if (empName == null)
            empName = "";
        return employeeService.getEmployeeList(empName, start, size);
    }

    @RequestMapping("/employeeAdd")
    public String employeeAdd(Employee employee) {
        if (employeeService.employeeAdd(employee))
            return "true";
        return "false";
    }

    @RequestMapping("/employeeUpdate")
    public String employeeUpdate(Employee employee) {
        if (employeeService.employeeUpdate(employee))
            return "true";
        return "false";
    }
    @RequestMapping("/employeeDelete")
    public String employeeDelete(@RequestParam(value = "id",required = true) int id){
        if(employeeService.employeeDelete(id))
    return "true";
        return "false";
    }
}
