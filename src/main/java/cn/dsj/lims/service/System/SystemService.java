package cn.dsj.lims.service.System;

import cn.dsj.lims.pojo.System;

import java.util.Map;

public interface SystemService {
    /**
     * 查询
     * @return
     */
    public Map<String,Object> getSystemList(String systemName,int pageNo,int pageSize);

    /**
     * 增加
     * @param system
     * @return
     */
    public boolean systemAdd(System system);

    /**
     * 修改
     * @param system
     * @return
     */
    public boolean systemUpdate(System system);

    /**
     * 删除
     * @param id
     * @return
     */
    public boolean systemDelete(int id);

}
