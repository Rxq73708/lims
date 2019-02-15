package cn.dsj.lims.service.Assess;

import cn.dsj.lims.pojo.Assess;

import java.util.Map;

public interface AssessService {
    /**
     * 查询
     * @return
     */
    public Map<String,Object> getAssessList(String empName, int pageNo, int pageSize);

    /**
     * 添加
     * @param assess
     * @return
     */
    public boolean assessAdd(Assess assess);

    /**
     * 修改
     * @param assess
     * @return
     */
    public boolean assessUpdate(Assess assess);

    /**
     * 删除
     * @param id
     * @return
     */
    public boolean assessDelete(int id);

}
