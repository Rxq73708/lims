package cn.dsj.lims.service.consumableDetail;

import cn.dsj.lims.pojo.ConsumableDetail;

import java.util.List;

public interface ConsumableDetailService {
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
    public boolean deleteList(ConsumableDetail consumableDetail);
}
