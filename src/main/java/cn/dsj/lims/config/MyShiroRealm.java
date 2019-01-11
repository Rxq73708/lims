package cn.dsj.lims.config;

import cn.dsj.lims.pojo.SysPermission;
import cn.dsj.lims.pojo.SysRole;
import cn.dsj.lims.pojo.SysUser;
import cn.dsj.lims.service.SysUser.SysUserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Description：
 * 自定义Realm类
 *
 * @author Administrator
 * @create 2019/1/7
 */
public class MyShiroRealm extends AuthorizingRealm {
    @Resource
    private SysUserService sysUserService;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("权限配置--》MyShiroRealm.doGetAuthorizationInfo");
        SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();
        //获取用户名
        String username=principalCollection.getPrimaryPrincipal().toString();
        //获取用户角色集合
        Set<SysRole> roleSet=sysUserService.findByUsername(username).getRoleSet();
        //角色名集合
        Set<String> roles=new HashSet<>();
        //权限名集合
        Set<String> permissions=new HashSet<>();

        Iterator<SysRole> it=roleSet.iterator();
        while (it.hasNext()){
            SysRole sysRole=it.next();
            roles.add(sysRole.getName());
            for(SysPermission permission:sysRole.getPermissionSet()){
                permissions.add(permission.getName());
            }
        }
        simpleAuthorizationInfo.addRoles(roles);
        simpleAuthorizationInfo.addStringPermissions(permissions);
        return simpleAuthorizationInfo;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取用户名
        String username=authenticationToken.getPrincipal().toString();
        //通过username从数据库中查找User对象
        SysUser sysUser= sysUserService.findByUsername(username);
        if(sysUser==null)
            return null;
        SimpleAuthenticationInfo simpleAuthenticationInfo=new SimpleAuthenticationInfo(
                sysUser.getUsername(),
                sysUser.getPassword(),
                getName());
        return simpleAuthenticationInfo;
    }
}