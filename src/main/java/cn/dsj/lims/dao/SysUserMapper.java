package cn.dsj.lims.dao;

import cn.dsj.lims.pojo.SysUser;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    /**
     * 通过username查找用户
     */
    public SysUser getSysUserByUsername(@Param("username") String username);
}
