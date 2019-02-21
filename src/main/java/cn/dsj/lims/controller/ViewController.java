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
public class ViewController {

    @RequestMapping("/index")
    public String index() {
        System.out.println("index..");
        return "index";
    }

    @RequestMapping("/user")
    public String user() {
        System.out.println("user..");
        return "user";
    }

    @RequestMapping("/library")
    public String library() {
        System.out.println("library...");
        return "library_management";
    }

    @RequestMapping("/equipment")
    public String equipment() {
        System.out.println("equipment...");
        return "equipment";
    }

    @RequestMapping("/technicalDoc")
    public String technicalDoc() {
        System.out.println("technicalDoc...");
        return "technicalDoc";
    }

    @RequestMapping("/qualityDoc")
    public String qualityDoc() {
        System.out.println("qualityDoc...");
        return "qualityDoc";
    }

    @RequestMapping("/inspectionStandardsDoc")
    public String inspectionStandardsDoc() {
        System.out.println("inspectionStandardsDoc");
        return "inspectionStandardsDoc";
    }

    @RequestMapping("/sampleTestReq")
    public String sampleTestReq(){
        System.out.println("sampleTestReq...");
        return "sampleTestReq";
    }

    @RequestMapping("/processedReq")
    public String processedReq(){
        System.out.println("processedReq...");
        return "processedReq";
    }
    @RequestMapping("/assess")
    public String assess(){
        System.out.println("assess...");
        return "assess";
    }

    @RequestMapping("/assessCheckitem")
    public String assessCheckitem(){
        System.out.println("assessCheckitem...");
        return "assessCheckitem";
    }

}