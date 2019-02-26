package cn.dsj.lims.service.consumable;

import cn.dsj.lims.dao.ConsumableMapper;
import cn.dsj.lims.pojo.Consumable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ConsumableServiceImpl implements ConsumableService{

    @Resource
    private ConsumableMapper consumableMapper;

    @Override
    public List<Consumable> getListConsumable() {
        return consumableMapper.getListConsumable();
    }

    @Override
    public Map<String, Object> getList(String materialName, int pageNo, int pageSize) {
        Map<String,Object> map=new HashMap<>();
        int start=(pageNo-1)*pageSize;
        map.put("total",consumableMapper.count());
        map.put("rows",consumableMapper.getList( materialName,  start, pageSize));
        return map;
    }

    @Override
    public boolean addList(Consumable consumable) {
        if(consumableMapper.addList(consumable)>0)
            return true;
        return false;
    }

    @Override
    public boolean updateList(Consumable consumable) {
        if(consumableMapper.updateList(consumable)>0)
            return true;
        return false;
    }

    @Override
    public boolean deleteList(int id) {
        if (consumableMapper.deleteList(id) > 0)
            return true;
        return false;
    }
}
