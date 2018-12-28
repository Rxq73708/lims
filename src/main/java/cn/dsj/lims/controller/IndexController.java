package cn.dsj.lims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description：
 * 主页控制器
 *
 * @author Administrator
 * @create 2018/12/25
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        System.out.println("index..");
        return "index";
    }
}