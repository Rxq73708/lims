package cn.dsj.lims.service.detectionItem;

import cn.dsj.lims.pojo.DetectionItem;

import java.util.List;

public interface DetectionItemService {
    List<DetectionItem> list(int sampleId);
}
