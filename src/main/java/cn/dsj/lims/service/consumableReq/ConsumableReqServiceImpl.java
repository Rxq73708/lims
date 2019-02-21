package cn.dsj.lims.service.consumableReq;

import cn.dsj.lims.dao.ConsumableReqMapper;
import cn.dsj.lims.pojo.ConsumableReq;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ConsumableReqServiceImpl implements ConsumableReqService{

    @Resource
    private ConsumableReqMapper consumableReqMapper;

    @Override
    public List<ConsumableReq> getList() {
        return consumableReqMapper.getList();
    }

    @Override
    public int addList(ConsumableReq consumableReq) {
        return consumableReqMapper.addList(consumableReq);
    }

    @Override
    public int updateList(ConsumableReq consumableReq) {
        return consumableReqMapper.updateList(consumableReq);
    }

    @Override
    public boolean deleteList(ConsumableReq consumableReq) {
        boolean flag=false;
        int i=consumableReqMapper.deleteList(consumableReq);
        if(i>0){
            flag=true;
        }
        return flag;
    }
}
