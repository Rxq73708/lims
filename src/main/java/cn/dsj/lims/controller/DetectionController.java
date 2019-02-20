package cn.dsj.lims.controller;

import cn.dsj.lims.pojo.DetectionItem;
import cn.dsj.lims.service.detectionItem.DetectionItemService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description：
 * 检测项目controller
 *
 * @author Administrator
 * @create 2019/2/18
 */
@RestController
@RequestMapping("/detectionItem")
public class DetectionController {
    @Resource
    DetectionItemService detectionItemService;

    @RequestMapping("/sampleId/{value}")
    public List<DetectionItem> list(@PathVariable("value") int sampleId){
        return detectionItemService.list(sampleId);
    }
}