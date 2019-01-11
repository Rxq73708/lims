package cn.dsj.lims.controller;

import cn.dsj.lims.pojo.LibraryManagement;
import cn.dsj.lims.service.LibraryManagement.LibraryManagementService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/Library")
public class LibraryManagementController {
    @Resource
    private LibraryManagementService libraryManagementService;
    @RequestMapping("/list")
    public Map<String,Object> list(int page,int rows,String searchName,int type){
        System.out.println("list");
        if(searchName==null)
            searchName="";
        return libraryManagementService.getLibraryManagementList(searchName,type,page,rows);
    }

    @RequestMapping("/add")
    public String add(LibraryManagement lib){
        System.out.println("insert...");
        if(libraryManagementService.add(lib))
            return "true";
        return "false";
    }

    @RequestMapping("/modify")
    public String modify(LibraryManagement lib){
        System.out.println("update...");
        if(libraryManagementService.update(lib))
            return "true";
        return "false";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam(value = "id",required = true) int id){
        System.out.println("delete...");
        if(libraryManagementService.delete(id))
            return "true";
        return "false";
    }



}
