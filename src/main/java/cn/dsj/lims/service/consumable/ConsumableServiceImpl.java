package cn.dsj.lims.service.consumable;

import cn.dsj.lims.dao.ConsumableMapper;
import cn.dsj.lims.pojo.Consumable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ConsumableServiceImpl implements ConsumableService{

    @Resource
    private ConsumableMapper consumableMapper;

    @Override
    public List<Consumable> getList() {
        return consumableMapper.getList();
    }

    @Override
    public int addList(Consumable consumable) {
        return consumableMapper.addList(consumable);
    }

    @Override
    public int updateList(Consumable consumable) {
        return consumableMapper.updateList(consumable);
    }

    @Override
    public boolean deleteList(int id) {
       int i = consumableMapper.deleteList(id);
       if(i>0){
           return true;
       }else{
           return false;
       }
    }
}
