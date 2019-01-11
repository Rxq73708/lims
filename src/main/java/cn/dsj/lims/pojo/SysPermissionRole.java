package cn.dsj.lims.pojo;

/**
 * Description：
 * 权限角色关系实体类
 *
 * @author Administrator
 * @create 2019/1/7
 */
public class SysPermissionRole {
    private int id;
    private int roleId;
    private int permissionId;

    public SysPermissionRole(){}

    public SysPermissionRole(int id, int roleId, int permissionId) {
        this.id = id;
        this.roleId = roleId;
        this.permissionId = permissionId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }
}