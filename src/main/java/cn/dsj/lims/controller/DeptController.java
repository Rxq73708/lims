package cn.dsj.lims.controller;

import cn.dsj.lims.pojo.Dept;
import cn.dsj.lims.service.Dept.DeptService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Resource
    private DeptService deptService;
    @RequestMapping("/list")
    public List<Dept> getDeptList() {
        return deptService.deptList();
    }


}
