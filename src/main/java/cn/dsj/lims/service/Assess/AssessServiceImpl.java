package cn.dsj.lims.service.Assess;

import cn.dsj.lims.dao.AssessMapper;
import cn.dsj.lims.pojo.Assess;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Transactional
@Service
public class AssessServiceImpl implements AssessService{
@Resource
private AssessMapper assessMapper;
    @Override
    public Map<String, Object> getAssessList(String empName, int pageNo, int pageSize) {
        Map<String,Object> map=new HashMap<>();
        int start=(pageNo-1)*pageSize;
        map.put("total",assessMapper.count());
        map.put("rows",assessMapper.getAssessList(empName,start,pageSize));
        return map;
    }

    @Override
    public boolean assessAdd(Assess assess) {
        if(assessMapper.AssessAdd(assess)>0)
            return true;
        return false;
    }

    @Override
    public boolean assessUpdate(Assess assess) {
        if(assessMapper.AssessUpdate(assess)>0)
        return true;
            return false;
    }

    @Override
    public boolean assessDelete(int id) {
        if(assessMapper.AssessDelete(id)>0)
            return true;
        return false;
    }
}
