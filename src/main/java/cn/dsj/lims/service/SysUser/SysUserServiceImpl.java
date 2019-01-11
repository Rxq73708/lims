package cn.dsj.lims.service.SysUser;

import cn.dsj.lims.dao.SysUserMapper;
import cn.dsj.lims.pojo.SysUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Description：
 * SysUserService实现类
 *
 * @author Administrator
 * @create 2019/1/7
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findByUsername(String username) {
        return sysUserMapper.getSysUserByUsername(username);
    }
}