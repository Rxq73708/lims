package cn.dsj.lims.controller;

import cn.dsj.lims.pojo.AssessCheckitem;
import cn.dsj.lims.pojo.AssessPartition;
import cn.dsj.lims.pojo.AssessSelfevaluation;
import cn.dsj.lims.pojo.AssessSupervisor;
import cn.dsj.lims.service.Checkitem.CheckitemService;
import org.hibernate.validator.constraints.URL;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CheckitemController {
    @Resource
    private CheckitemService checkitemService;

    //查询
    @RequestMapping("/checkitemList")
    public List<AssessCheckitem> checkitemList() {
        return checkitemService.checkitemList();
    }

    @RequestMapping("/partitionList")
    public List<AssessPartition> partitionList() {
        return checkitemService.partitionList();
    }

    @RequestMapping("/selfevaluationList")
    public List<AssessSelfevaluation> selfevaluationList() {
        return checkitemService.selfevaluationList();
    }

    @RequestMapping("/supervisorList")
    public List<AssessSupervisor> supervisorList() {
        return checkitemService.supervisorList();
    }

    //添加
    @RequestMapping("/addCheckitem")
    public String addCheckitem(AssessCheckitem assessCheckitem) {
        System.out.println("addCheckitem.............");
        if (checkitemService.addCheckitem(assessCheckitem))
            return "true";
        return "false";
    }

    @RequestMapping("/addPartition")
    public String addPartition(AssessPartition assessPartition) {
        System.out.println("addPartition.............");
        if (checkitemService.addPartition(assessPartition))
            return "true";
        return "false";
    }

    @RequestMapping("/addSelfevaluation")
    public String addSelfevaluation(AssessSelfevaluation assessSelfevaluation) {
        System.out.println("addSelfevaluation...........");
        if (checkitemService.addSelfevaluation(assessSelfevaluation))
            return "true";
        return "false";
    }

    @RequestMapping("/addSupervisor")
    public String addSupervisor(AssessSupervisor assessSupervisor) {
        System.out.println("addSupervisor...............");
        if (checkitemService.addSupervisor(assessSupervisor))
            return "true";
        return "false";
    }

    //修改
    @RequestMapping("/updateCheckitem")
    public String updateCheckitem(AssessCheckitem assessCheckitem) {
        System.out.println("updateCheckitem..............");
        if (checkitemService.updateCheckitem(assessCheckitem))
            return "true";
        return "false";
    }

    @RequestMapping("/updatePartition")
    public String updatePartition(AssessPartition assessPartition) {
        System.out.println("updatePartition..............");
        if (checkitemService.updatePartition(assessPartition))
            return "true";
        return "false";
    }

    @RequestMapping("/updateSelfevaluation")
    public String updateSelfevaluation(AssessSelfevaluation assessSelfevaluation) {
        System.out.println("updateSelfevaluation.............");
        if (checkitemService.updateSelfevaluation(assessSelfevaluation))
            return "true";
        return "false";
    }

    @RequestMapping("/updateSupervisor")
    public String updateSupervisor(AssessSupervisor assessSupervisor) {
        System.out.println("updateSupervisor..................");
        if (checkitemService.updateSupervisor(assessSupervisor))
            return "true";
        return "false";
    }

    //删除
    @RequestMapping("/deleteCheckitem")
    public String deleteCheckitem(int id) {
        System.out.println("deleteCheckitem......................");
        if (checkitemService.deleteCheckitem(id))
            return "true";
        return "false";
    }

    @RequestMapping("/deletePartition")
    public String deletePartition(int id) {
        System.out.println("deletePartition................");
        if (checkitemService.deletePartition(id))
            return "true";
        return "false";
    }

    @RequestMapping("/deleteSelfevaluation")
    public String deleteSelfevaluation(int id) {
        System.out.println("deleteSelfevaluation...........");
        if (checkitemService.deleteSelfevaluation(id))
            return "true";
        return "false";
    }

    @RequestMapping("deleteSupervisor")
    public String deleteSupervisor(int id) {
        System.out.println("deleteSupervisor...............");
        if (checkitemService.deleteSupervisor(id))
            return "true";
        return "false";
    }

}


