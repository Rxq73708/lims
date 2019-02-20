package cn.dsj.lims.service.detectionItem;

import cn.dsj.lims.dao.DetectionItemMapper;
import cn.dsj.lims.pojo.DetectionItem;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description：
 * 检测项目service实现类
 *
 * @author Administrator
 * @create 2019/2/18
 */
@Service
@Transactional
public class DetectionItemServiceImpl implements DetectionItemService {
    @Resource
    DetectionItemMapper detectionItemMapper;

    @Override
    public List<DetectionItem> list(int sampleId) {
        return detectionItemMapper.list(sampleId);
    }
}