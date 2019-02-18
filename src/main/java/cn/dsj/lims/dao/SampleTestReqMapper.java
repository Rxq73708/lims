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
}
