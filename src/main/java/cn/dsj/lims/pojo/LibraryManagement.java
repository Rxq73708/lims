package cn.dsj.lims.pojo;
import java.util.Date;

public class LibraryManagement {

    private int id;//文库id
    private String fileName;//文件名称
    private int employeeId;//上传人编号
    private Date uploadingDate;//上传日期
    private int type;//类别
    private String filePath;//文件内容


    public LibraryManagement() {
        super();
    }
    public LibraryManagement(int id, String fileName, int employeeId, Date uploadingDate, int type, String filePath) {
        this.id = id;
        this.fileName = fileName;
        this.employeeId = employeeId;
        this.uploadingDate = uploadingDate;
        this.type = type;
        this.filePath = filePath;
    }
    public LibraryManagement(String fileName, int employeeId, Date uploadingDate, int type, String filePath) {
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getFileContent() {
        return filePath;
    }

    public void setFileContent(String filePath) {
        this.filePath = filePath;
    }
}
