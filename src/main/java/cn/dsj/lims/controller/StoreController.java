package cn.dsj.lims.controller;

import cn.dsj.lims.pojo.Store;
import cn.dsj.lims.service.store.StoreService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description：
 * Store控制器
 *
 * @author Administrator
 * @create 2019/1/15
 */
@RestController
@RequestMapping("/store")
public class StoreController {
    @Resource
    private StoreService storeService;
    @RequestMapping("/list")
    public List<Store> list(){
        return storeService.getStoreList();
    }
}