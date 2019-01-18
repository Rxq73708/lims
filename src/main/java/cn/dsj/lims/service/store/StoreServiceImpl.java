package cn.dsj.lims.service.store;

import cn.dsj.lims.dao.StoreMapper;
import cn.dsj.lims.pojo.Store;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description：
 * StoreService实现类
 *
 * @author Administrator
 * @create 2019/1/15
 */
@Service
public class StoreServiceImpl implements StoreService {
    @Resource
    private StoreMapper storeMapper;
    @Override
    public List<Store> getStoreList() {
        return storeMapper.getStoreList();
    }
}