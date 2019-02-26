package cn.dsj.lims.controller;

import cn.dsj.lims.pojo.SampleTestReq;
import cn.dsj.lims.service.SampleTestReq.SampleTestReqService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Description：
 * 样品管理控制器
 *
 * @author Administrator
 * @create 2019/2/15
 */
@RestController
@RequestMapping("/sampleTestReq")
public class SampleTestReqController {
    @Resource
    private SampleTestReqService sampleTestReqService;

    @RequestMapping("/state/{value}")
    Map<String,Object> pendingProcessingList(@PathVariable("value") int state, int page, int rows){
        return sampleTestReqService.getSampleTestReq(state,page,rows);
    }

    @RequestMapping("/processing")
    boolean processing(@RequestParam("ids[]") int[] ids){
        for(int id:ids)
            System.out.println("id:"+id);
        return sampleTestReqService.processing(ids);
    }

    @RequestMapping("/add")
    boolean addSampleTestReq(SampleTestReq sampleTestReq){
        return sampleTestReqService.addSampleTestReq(sampleTestReq);
    }
}