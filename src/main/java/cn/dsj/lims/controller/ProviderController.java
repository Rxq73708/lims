package cn.dsj.lims.controller;

import cn.dsj.lims.pojo.Provider;
import cn.dsj.lims.service.provider.ProviderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description：
 * 供应商控制器
 *
 * @author Administrator
 * @create 2019/1/15
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {
    @Resource
    private ProviderService providerService;

    @RequestMapping("/list")
    public List<Provider> list(){
        return providerService.getProviderList();
    }
}