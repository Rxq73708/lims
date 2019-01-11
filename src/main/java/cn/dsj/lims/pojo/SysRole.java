package cn.dsj.lims.pojo;

import java.util.Set;

/**
 * Description：
 * 角色实体类
 *
 * @author Administrator
 * @create 2019/1/7
 */
public class SysRole {
    private int id;
    private String name;
    private Set<SysPermission> permissionSet;

    public SysRole(){}

    public SysRole(int id, String name, Set<SysPermission> permissionSet) {
        this.id = id;
        this.name = name;
        this.permissionSet=permissionSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<SysPermission> getPermissionSet() {
        return permissionSet;
    }

    public void setPermissionSet(Set<SysPermission> permissionSet) {
        this.permissionSet = permissionSet;
    }
}