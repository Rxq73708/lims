package cn.dsj.lims.controller;

import cn.dsj.lims.pojo.Equipment;
import cn.dsj.lims.pojo.Maintain;
import cn.dsj.lims.pojo.Maintenance;
import cn.dsj.lims.pojo.Scrap;
import cn.dsj.lims.service.Equipment.EquipmentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController

public class EquipmentController {
    @Resource
    private EquipmentService equipmentService;
    @RequestMapping("/listEquipment")
    public List<Equipment> listEquipment(){
        return equipmentService.listEquipment();
    };
    @RequestMapping("/findEquipmentAll")
    public Map<String, Object> list(int page, int rows, String searchName) {
        System.out.println("list");
        if (searchName == null)
            searchName = "";
        return equipmentService.findEquipmentAll(searchName, page, rows);
    }

    @RequestMapping("/addEquipment")
    public String addEquipment(Equipment equipment) {
        equipment.setProId(equipment.getProName());
        equipment.setStoreId(Integer.parseInt(equipment.getPlace()));
        System.out.println("insert......");
        if (equipmentService.addEquipment(equipment))
            return "ture";
        return "false";
    }

    @RequestMapping("/updateEquipment")
    public String updateEquipment(Equipment equipment) {
        equipment.setProId(equipment.getProName());
        equipment.setStoreId(Integer.parseInt(equipment.getPlace()));
        System.out.println("update...");
        if (equipmentService.updateEquipment(equipment))
            return "true";
        return "false";
    }

    @RequestMapping("/deleteEquipment")
    public String deleteEquipment(@RequestParam(value = "id", required = true) int id) {
        System.out.println("delete...");
        if (equipmentService.deleteEquipmentById(id))
            return "true";
        return "false";
    }

    @RequestMapping("/findMaintain")
    public Map<String, Object> findMaintain(int page, int rows, String searchName) {
        System.out.println("list");
        if (searchName == null)
            searchName = "";
        return equipmentService.findMaintain(searchName, page, rows);
    }

    @RequestMapping("/addMaintain")
    public String addMaintain(Maintain maintain) {
        maintain.setEquipmentId(Integer.parseInt(maintain.getEquName()));
        System.out.println("insert......");
        if (equipmentService.addMaintain(maintain))
            return "turn";
        return "false";
    }

    @RequestMapping("/updateMaintain")
    public String updateMaintain(Maintain maintain) {
        System.out.println("update...");
        if (equipmentService.updateMaintain(maintain))
            return "true";
        return "false";
    }

    @RequestMapping("/deleteMaintain")
    public String deleteMaintain(@RequestParam(value = "id", required = true) int id) {
        System.out.println("delete...");
        if (equipmentService.deleteMaintainById(id))
            return "true";
        return "false";
    }

    @RequestMapping("/findMaintenance")
    public Map<String, Object> findMaintenance(int page, int rows, String searchName) {
        System.out.println("list");
        if (searchName == null)
            searchName = "";
        return equipmentService.findMaintenance(searchName, page, rows);
    }

    @RequestMapping("/addMaintenance")
    public String addMaintenance(Maintenance maintenance) {
        maintenance.setEquipmentId(Integer.parseInt(maintenance.getEquName()));
        System.out.println("insert......");
        if (equipmentService.addMaintenance(maintenance))
            return "turn";
        return "false";
    }

    @RequestMapping("/updateMaintenance")
    public String updateMaintenance(Maintenance maintenance) {
        System.out.println("update...");
        if (equipmentService.updateMaintenanceById(maintenance))
            return "true";
        return "false";
    }

    @RequestMapping("/deleteMaintenance")
    public String deleteMaintenance(@RequestParam(value = "id", required = true) int id) {
        System.out.println("delete...");
        if (equipmentService.deleteMaintenanceById(id))
            return "true";
        return "false";
    }

    @RequestMapping("/findScrap")
    public Map<String, Object> findScrap(int page, int rows, String searchName) {
        System.out.println("list");
        if (searchName == null)
            searchName = "";
        return equipmentService.findScrap(searchName, page, rows);
    }

    @RequestMapping("/addScrap")
    public String addScrap(Scrap scrap) {
        scrap.setEquipmentId(Integer.parseInt(scrap.getEquName()));
        System.out.println("insert......");
        if (equipmentService.addScrap(scrap))
            return "turn";
        return "false";
    }

    @RequestMapping("/updateScrap")
    public String updateScrap(Scrap scrap) {
        System.out.println("update...");
        if (equipmentService.updateScrap(scrap))
            return "true";
        return "false";
    }

    @RequestMapping("/deleteScrap")
    public String deleteScrap(@RequestParam(value = "id", required = true) int id) {
        System.out.println("delete...");
        if (equipmentService.deleteScrap(id))
            return "true";
        return "false";
    }


}
