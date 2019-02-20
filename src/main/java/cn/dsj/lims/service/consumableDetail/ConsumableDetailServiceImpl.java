package cn.dsj.lims.service.consumableDetail;

import cn.dsj.lims.dao.ConsumableDetailMapper;
import cn.dsj.lims.pojo.ConsumableDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ConsumableDetailServiceImpl implements ConsumableDetailService{

    @Resource
    private ConsumableDetailMapper consumableDetailMapper;

    @Override
    public List<ConsumableDetail> getList() {
        return consumableDetailMapper.getList();
    }

    @Override
    public int addList(ConsumableDetail consumableDetail) {
        return consumableDetailMapper.addList(consumableDetail);
    }

    @Override
    public int updateList(ConsumableDetail consumableDetail) {
        return consumableDetailMapper.updateList(consumableDetail);
    }

    @Override
    public boolean deleteList(ConsumableDetail consumableDetail) {
        boolean flag=false;
        int i=consumableDetailMapper.deleteList(consumableDetail);
        if(i>0){
            flag=true;
        }
        return flag;
    }
}
