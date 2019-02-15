package cn.dsj.lims.pojo;

import java.util.Set;

/**
 * Description：
 * 用户实体类
 *
 * @author Administrator
 * @create 2019/1/7
 */
public class SysUser {
    private int id;
    private String username;
    private String password;
    private Set<SysRole> roleSet;

    private SysUser() {
    }

    public SysUser(int id, String username, String password, Set<SysRole> roleSet) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roleSet = roleSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<SysRole> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<SysRole> roleSet) {
        this.roleSet = roleSet;
    }
}