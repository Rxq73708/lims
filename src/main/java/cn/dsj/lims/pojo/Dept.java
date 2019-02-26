package cn.dsj.lims.pojo;

public class Dept {
    private int id;//序号
    private int deptId;//部门编号
    private String deptName;//部门名称
    private String deptPost;//部门职位

    public Dept() {
        super();
    }

    public Dept(int id, int deptId, String deptName, String deptPost) {
        this.id = id;
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptPost = deptPost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptPost() {
        return deptPost;
    }

    public void setDeptPost(String deptPost) {
        this.deptPost = deptPost;
    }
}
