package cn.dsj.lims.controller;

import cn.dsj.lims.pojo.System;
import cn.dsj.lims.service.System.SystemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/system")
public class SystemController {
    @Resource
    private SystemService systemService;

    //查询
    @RequestMapping("/list")
    public Map<String, Object> systemList(String searchName, int page, int rows) {
        Map<String, Object> map = new HashMap<>();
        if (searchName == null)
            searchName = "";
        return systemService.getSystemList(searchName, page, rows);
    }

    //添加
    @RequestMapping("/add")
    public String systemAdd(System system) {
        if (systemService.systemAdd(system))
            return "true";
        return "false";
    }

    //修改
    @RequestMapping("/update")
    public String systemUpdate(System system) {
        if (systemService.systemUpdate(system))
            return "true";
        return "false";
    }

    //删除
    @RequestMapping("/delete")
    public String systemDelete(int id) {
        if (systemService.systemDelete(id))
            return "true";
        return "false";
    }


}
