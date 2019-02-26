package cn.dsj.lims.service.sample;

import cn.dsj.lims.pojo.Sample;

import java.util.List;

public interface SampleService {
    /**
     * 根据分类级别和父类编号获取样品分类
     * @param level 分类级别
     * @param parentId 父类编号
     * @return
     */
    List<Sample> getSampleList(int level,int parentId);

}
