package cn.dsj.lims.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class LibraryManagement {

    private int id;//文库id
    private String fileName;//文件名称
    private int employeeId;//上传人编号
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date uploadingDate;//上传日期
    private String type;//类别
    private String filePath;//文件内容
    private String empName;//上传人姓名

    public LibraryManagement() {
        super();
    }

    public LibraryManagement(int id, String fileName, int employeeId, Date uploadingDate, String type, String filePath) {
        this.id = id;
        this.fileName = fileName;
        this.employeeId = employeeId;
        this.uploadingDate = uploadingDate;
        this.type = type;
        this.filePath = filePath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getUploadingDate() {
        return uploadingDate;
    }

    public void setUploadingDate(Date uploadingDate) {
        this.uploadingDate = uploadingDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
