package cn.dsj.lims.service.consumableGet;

import cn.dsj.lims.pojo.ConsumableGet;

import java.util.List;

public interface ConsumableGetService {
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
    public boolean deleteList(ConsumableGet consumableGet);
}
