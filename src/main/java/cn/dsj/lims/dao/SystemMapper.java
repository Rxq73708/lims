package cn.dsj.lims.dao;

import cn.dsj.lims.pojo.System;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemMapper {
    /**
     * 查询
     * @return
     */
    public List<System> getSystemList(@Param("systemName") String systemName, @Param("start") int start, @Param("size") int size);

    /**
     * 增加
     * @param system
     * @return
     */
    public int systemAdd(System system);

    /**
     * 修改
     * @param system
     * @return
     */
    public int systemUpdate(System system);

    /**
     * 删除
     * @param id
     * @return
     */
    public int systemDelete(int id);
    /**
     * 查询总记录数
     * @return
     */
    public int count();
}
