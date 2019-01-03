package cn.dsj.lims.controller;

import cn.dsj.lims.pojo.User;
import cn.dsj.lims.service.User.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Description：
 * 部门管理
 *
 * @author Administrator
 * @create 2018/12/26
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/list")
    public Map<String,Object> list(int page,int rows,String searchName){
        System.out.println("select...");
        if(searchName==null)
            searchName="";
        return userService.select(searchName,page,rows);
    }

    @RequestMapping("/add")
    public String add(User user){
        System.out.println("insert...");
        if(userService.add(user))
            return "true";
        return "false";
    }

    @RequestMapping("/modify")
    public String modify(User user){
        System.out.println("update...");
        if(userService.modify(user))
            return "true";
        return "false";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam(value = "id",required = true) int id){
        System.out.println("delete...");
        if(userService.delete(id))
            return "true";
        return "false";
    }
}