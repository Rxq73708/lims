package cn.dsj.lims.service.SysUser;

import cn.dsj.lims.pojo.SysUser;

public interface SysUserService {
    public SysUser findByUsername(String username);
}
