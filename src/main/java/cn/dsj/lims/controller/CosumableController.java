package cn.dsj.lims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * consumable
 * 库存管理
 */

@Controller
@RequestMapping("/consumable")
public class CosumableController {

    @RequestMapping("/reagent")
    public String reagent(){
        return "reagent.html";
    }

    @RequestMapping("/picking")
    public String picking(){
        return "picking.html";
    }

}
