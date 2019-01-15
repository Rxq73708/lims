package cn.dsj.lims.pojo;

/**
 * Description：
 * 权限实体表
 *
 * @author Administrator
 * @create 2019/1/7
 */
public class SysPermission {
    private int id;
    private String name;
    private String description;
    private String url;
    private int pid;

    public SysPermission(){}

    public SysPermission(int id, String name, String description, String url, int pid) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.url = url;
        this.pid = pid;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}