package cn.dsj.lims.dao;

import cn.dsj.lims.pojo.SampleTestReq;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SampleTestReqMapper {
    /**
     * 获取待处理检查申请
     * @return
     */
    List<SampleTestReq> getSampleTestReq(@Param("state")int state, @Param("start") int start,@Param("size") int size);

    /**
     * 获取待处理申请总数
     * @return
     */
    int count(int state);

    /**
     * 待处理申请 处理
     * @param ids 要处理的申请编号
     * @return
     */
    int processing(int[] ids);

    /**
     * 添加
     * @param sampleTestReq
     * @return
     */
    public int sampleTestReqAdd(SampleTestReq sampleTestReq);

    /**
     * 修改
     * @param sampleTestReq
     * @return
     */
    public int sampleTestReqUpdate(SampleTestReq sampleTestReq);

    /**
     * 删除
     * @param id
     * @return
     */
    public int sampleTestReqDelete(int id);

}
