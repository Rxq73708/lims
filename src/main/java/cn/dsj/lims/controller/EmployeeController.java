package cn.dsj.lims.controller;

import cn.dsj.lims.service.Employee.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
}