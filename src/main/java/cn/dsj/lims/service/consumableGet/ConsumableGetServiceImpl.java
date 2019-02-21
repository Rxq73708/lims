package cn.dsj.lims.service.consumableGet;

import cn.dsj.lims.dao.ConsumableGetMapper;
import cn.dsj.lims.pojo.ConsumableGet;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ConsumableGetServiceImpl implements ConsumableGetService{

    @Resource
    private ConsumableGetMapper consumableGetMapper;

    @Override
    public List<ConsumableGet> getList() {
        return consumableGetMapper.getList();
    }

    @Override
    public int addList(ConsumableGet consumableGet) {
        return consumableGetMapper.addList(consumableGet);
    }

    @Override
    public int updateList(ConsumableGet consumableGet) {
        return consumableGetMapper.updateList(consumableGet);
    }

    @Override
    public boolean deleteList(ConsumableGet consumableGet) {
       boolean flag=false;
       int i=consumableGetMapper.deleteList(consumableGet);
       if(i>0){
           flag=true;
       }
        return flag;
    }
}
