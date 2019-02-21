package cn.dsj.lims.dao;

import cn.dsj.lims.pojo.ConsumableGet;

import java.util.List;

public interface ConsumableGetMapper {
    /**
     * 获取全部信息
     */
    public List<ConsumableGet> getList();

    /**
     * 添加数据
     */
    public int addList(ConsumableGet consumableGet);

    /**
     * 根据id修改数据
     */
    public int updateList(ConsumableGet consumableGet);

    /**
     * 根据id删除数据
     */
    public int deleteList(ConsumableGet consumableGet);
}

