package cn.dsj.lims.dao;

import cn.dsj.lims.pojo.Consumable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConsumableMapper {
    /**
     * 获取全部信息
     */
    public List<Consumable> getListConsumable();
    /**
     * 获取全部信息
     */
    public List<Consumable> getList(@Param("materialName")String materialName,@Param("start") int start, @Param("size") int size);

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
    public int deleteList(int id);
    /**
     * 查询总记录数
     * @return
     */
    public int count();
}
