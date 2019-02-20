package cn.dsj.lims.dao;

import cn.dsj.lims.pojo.DetectionItem;

import java.util.List;

public interface DetectionItemMapper {
    /**
     * 样品的所有检测项目
     * @param sampleId 样品编号
     * @return
     */
    List<DetectionItem> list(int sampleId);
}
