package cn.dsj.lims.pojo;

import java.sql.Date;


public class System {
    private int id;//管理制度主键id
    private String systemName;//制度名称
    private String filePath;//文件内容
    private Date systemDate;//文件上传时间

    public System() {
        super();
    }

    public System(int id, String systemName, String filePath, Date systemDate) {
        this.id = id;
        this.systemName = systemName;
        this.filePath = filePath;
        this.systemDate = systemDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Date getSystemDate() {
        return systemDate;
    }

    public void setSystemDate(Date systemDate) {
        this.systemDate = systemDate;
    }
}
