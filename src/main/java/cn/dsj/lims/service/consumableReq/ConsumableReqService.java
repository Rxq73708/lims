package cn.dsj.lims.service.consumableReq;

import cn.dsj.lims.pojo.ConsumableReq;

import java.util.List;

public interface ConsumableReqService {
    /**
     * 获取全部信息
     */
    public List<ConsumableReq> getList();

    /**
     * 添加数据
     */
    public int addList(ConsumableReq consumableReq);

    /**
     * 根据id修改数据
     */
    public int updateList(ConsumableReq consumableReq);

    /**
     * 根据id删除数据
     */
    public boolean deleteList(ConsumableReq consumableReq);
}
