package cn.dsj.lims.service.SampleTestReq;

import cn.dsj.lims.pojo.SampleTestReq;

import java.util.List;
import java.util.Map;

public interface SampleTestReqService {
    /**
     * 获取申请
     * @param state 申请状态
     * @param pageNo 分页号
     * @param pageSize 分页数量
     * @return
     */
    Map<String, Object> getSampleTestReq(int state, int pageNo, int pageSize);

    /**
     * 待处理申请 处理
     * @param ids 要处理的申请编号
     * @return
     */
    boolean processing(int[] ids);

    /**
     * 添加检测申请
     * @param sampleTestReq
     * @return
     */
    boolean addSampleTestReq(SampleTestReq sampleTestReq);
}
