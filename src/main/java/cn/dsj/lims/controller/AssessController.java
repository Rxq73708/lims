package cn.dsj.lims.controller;

import cn.dsj.lims.pojo.Assess;
import cn.dsj.lims.service.Assess.AssessService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/assess")
public class AssessController {
    @Resource
    private AssessService assessService;
//查询
    @RequestMapping("/list")
    public Map<String, Object> assessList(String searchName, int page, int rows) {
        if (searchName == null)
            searchName = "";
        return assessService.getAssessList(searchName, page, rows);

    }
//添加
    @RequestMapping("/add")
    public String assessAdd(Assess assess) {
        System.out.println("assessAdd..........");
        if (assessService.assessAdd(assess))
            return "true";
        return "false";
    }
//修改
    @RequestMapping("/update")
    public String assessUpdate(Assess assess) {
        System.out.println("assessUpdate");
        if (assessService.assessUpdate(assess))
            return "true";
        return "false";
    }
//删除
    @RequestMapping("/delete")
    public String assessDelete(int id) {
        System.out.println("assessDelete");
        if (assessService.assessDelete(id))
            return "true";
        return "false";
    }


}
