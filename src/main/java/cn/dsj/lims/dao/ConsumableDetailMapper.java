package cn.dsj.lims.dao;

import cn.dsj.lims.pojo.ConsumableDetail;

import java.util.List;

public interface ConsumableDetailMapper {
    /**
     * 获取全部信息
     */
    public List<ConsumableDetail> getList();

    /**
     * 添加数据
     */
    public int addList(ConsumableDetail consumableDetail);

    /**
     * 根据id修改数据
     */
    public int updateList(ConsumableDetail consumableDetail);

    /**
     * 根据id删除数据
     */
    public int deleteList(ConsumableDetail consumableDetail);
}
