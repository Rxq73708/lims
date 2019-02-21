package cn.dsj.lims.dao;

import cn.dsj.lims.pojo.Assess;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AssessMapper {
    /**
     * 查询
     * @return
     */
    public List<Assess> getAssessList(@Param("empName") String empName, @Param("start") int start, @Param("size") int size);

    /**
     * 添加
     * @param assess
     * @return
     */
    public int assessAdd(Assess assess);

    /**
     * 修改
     * @param assess
     * @return
     */
    public int assessUpdate(Assess assess);

    /**
     * 删除
     * @param id
     * @return
     */
    public int assessDelete(int id);
    /**
     * 查询总记录数
     * @return
     */
    public int count();
}
