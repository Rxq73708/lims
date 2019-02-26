package cn.dsj.lims.service.sample;

import cn.dsj.lims.dao.SampleMapper;
import cn.dsj.lims.pojo.Sample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description：
 * sampleService实现类
 *
 * @author Administrator
 * @create 2019/2/25
 */
@Transactional
@Service
public class SampleServiceImpl implements SampleService {
    @Resource
    private SampleMapper sampleMapper;

    @Override
    public List<Sample> getSampleList(int level,int parentId) {
        return sampleMapper.getSampleList(level,parentId);
    }
}