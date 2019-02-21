package cn.dsj.lims.service.consumable;

import cn.dsj.lims.pojo.Consumable;

import java.util.List;

public interface ConsumableService {
    /**
     * 获取全部信息
     */
    public List<Consumable> getList();

    /**
     * 增加信息
     */
    public int addList(Consumable consumable);

    /**
     * 根据id修改信息
     */
    public int updateList(Consumable consumable);

    /**
     * 根据id删除信息
     */
    public boolean deleteList(int id);
}
