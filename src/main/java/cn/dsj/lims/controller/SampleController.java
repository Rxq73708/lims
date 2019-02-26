package cn.dsj.lims.controller;

import cn.dsj.lims.pojo.Sample;
import cn.dsj.lims.service.sample.SampleService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description：
 *
 * @author Administrator
 * @create 2019/2/25
 */
@RestController
@RequestMapping("/sample")
public class SampleController {
    @Resource
    private SampleService sampleService;

    @RequestMapping("/list/{level}/{parentId}")
    public List<Sample> list(@PathVariable int level,@PathVariable int parentId){
        return sampleService.getSampleList(level,parentId);
    }
}