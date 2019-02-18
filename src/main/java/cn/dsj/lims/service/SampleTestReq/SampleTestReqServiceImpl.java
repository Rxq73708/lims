package cn.dsj.lims.service.SampleTestReq;

import cn.dsj.lims.dao.SampleTestReqMapper;
import cn.dsj.lims.pojo.SampleTestReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description：
 * 样品管理service实现类
 *
 * @author Administrator
 * @create 2019/2/15
 */
@Service
@Transactional
public class SampleTestReqServiceImpl implements SampleTestReqService {
    @Resource
    private SampleTestReqMapper sampleTestReqMapper;

    @Override
    public boolean processing(int[] ids) {
        if(sampleTestReqMapper.processing(ids)>0)
            return true;
        return false;
    }

    @Override
    public Map<String, Object> getSampleTestReq(int state, int pageNo, int pageSize) {
        Map<String, Object> map = new HashMap<>();
        int start = (pageNo - 1) * pageSize;
        int total = sampleTestReqMapper.count(state);
        map.put("rows", sampleTestReqMapper.getSampleTestReq(state,start,pageSize));
        map.put("total", total);
        return map;
    }
}