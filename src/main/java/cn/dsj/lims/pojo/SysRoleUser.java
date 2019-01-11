package cn.dsj.lims.pojo;

/**
 * Description：
 * 角色用户关系实体类
 *
 * @author Administrator
 * @create 2019/1/7
 */
public class SysRoleUser {
    private int id;
    private int userId;
    private int roleId;

    public SysRoleUser(){}

    public SysRoleUser(int id, int userId, int roleId) {
        this.id = id;
        this.userId = userId;
        this.roleId = roleId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}