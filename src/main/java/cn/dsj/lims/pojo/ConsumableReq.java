package cn.dsj.lims.pojo;

import java.util.Date;

public class ConsumableReq {
    private int id;//领料申请编号
    private String empId;//申请人编号
    private String materialId;//物料编号
    private int count;//申请数量
    private Date reqDate;//申请时间
    private String reqDesc;//备注

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getReqDate() {
        return reqDate;
    }

    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    public String getReqDesc() {
        return reqDesc;
    }

    public void setReqDesc(String reqDesc) {
        this.reqDesc = reqDesc;
    }
}
