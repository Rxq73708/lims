package cn.dsj.lims.controller;

import cn.dsj.lims.pojo.Consumable;
import cn.dsj.lims.service.consumable.ConsumableService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * consumable
 * 库存管理
 */

@RestController
@RequestMapping("/consumable")
public class ConsumableController {
    @Resource
     private ConsumableService consumableService;

    @RequestMapping("/listConsumable")
    public List<Consumable> getListConsumable(){
        return consumableService.getListConsumable();
    }

    @RequestMapping("/list")
    public Map<String, Object> getList(int page, int rows, String searchName){
        System.out.println("list");
        if (searchName == null)
            searchName = "";
        return consumableService.getList(searchName, page, rows);
    }
    @RequestMapping("/addList")
    public String addList(Consumable consumable) {
        if (consumableService.addList(consumable))
            return "ture";
        return "false";
    }

    @RequestMapping("/updateList")
    public String updateList(Consumable consumable) {
        if (consumableService.updateList(consumable))
            return "ture";
        return "false";
    }

    @RequestMapping("/deleteList")
    public String deleteList(@RequestParam(value = "id", required = true) int id) {
        System.out.println("delete...");
        if (consumableService.deleteList(id))
            return "true";
        return "false";
    }


}
