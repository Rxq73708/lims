package cn.dsj.lims.service.consumable;

import cn.dsj.lims.pojo.Consumable;

import java.util.List;
import java.util.Map;

public interface ConsumableService {
    /**
     * 获取全部信息
     */
    public List<Consumable> getListConsumable();

    public Map<String, Object> getList(String materialName, int pageNo, int pageSize);

    /**
     * 增加信息
     */
    public boolean addList(Consumable consumable);

    /**
     * 根据id修改信息
     */
    public boolean updateList(Consumable consumable);

    /**
     * 根据id删除信息
     */
    public boolean deleteList(int id);
}
