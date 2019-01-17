package cn.dsj.lims.pojo;

import java.sql.Date;


public class Assess {
    private int id;//考核表主键id
    private Integer assessId;//姓名对应员工详情表staffId
    private String empName;//受考核员工姓名
    private Date assessDate;//考核日期
    private String signature;//领导签字
    private String details;//Excel表的考核详情

    public Assess() {
        super();
    }

    public Assess(int id, Integer assessId, String empName, Date assessDate, String signature, String details) {
        this.id = id;
        this.assessId = assessId;
        this.empName = empName;
        this.assessDate = assessDate;
        this.signature = signature;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getAssessId() {
        return assessId;
    }

    public void setAssessId(Integer assessId) {
        this.assessId = assessId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getAssessDate() {
        return assessDate;
    }

    public void setAssessDate(Date assessDate) {
        this.assessDate = assessDate;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
