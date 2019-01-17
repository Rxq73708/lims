package cn.dsj.lims.service.System;
import cn.dsj.lims.dao.SystemMapper;
import cn.dsj.lims.pojo.System;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
@Transactional
@Service
public class SystemServiceImpl implements SystemService{

    @Resource
    private SystemMapper systemMapper;

    @Override
    public Map<String, Object> getSystemList(String systemName, int pageNo, int pageSize) {
        Map<String,Object> map = new HashMap<>();
        int start=(pageNo-1)*pageSize;
        map.put("total",systemMapper.count());
        map.put("rows",systemMapper.getSystemList(systemName,start,pageSize));
        return map;
    }

    @Override
    public boolean systemAdd(System system) {
        if(systemMapper.systemAdd(system)>0)
        return true;
            return false;
    }

    @Override
    public boolean systemUpdate(System system) {
        if(systemMapper.systemUpdate(system)>0)
            return true;
        return false;
    }

    @Override
    public boolean systemDelete(int id) {
        if(systemMapper.systemDelete(id)>0)
            return true;
        return false;
    }
}
