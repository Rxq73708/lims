package cn.dsj.lims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description：
 * 部门管理
 *
 * @author Administrator
 * @create 2018/12/26
 */
@Controller
public class DeptController {

    @RequestMapping("/list")
    public String list(){
        return "dept";
    }

    @RequestMapping("/add")
    public String add(){
        return "";
    }

    @RequestMapping("/edit")
    public String edit(){
        return "";
    }

    @RequestMapping("/del")
    public String del(){
        return "";
    }
}