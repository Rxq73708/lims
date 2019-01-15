package cn.dsj.lims.pojo;

import java.util.Date;

public class Maintain {
    private int id;//维修序号
    private int equipmentId;//设备编码
    private String equName;//设备名称
    private String maintainName;//维修人
    private Date recDate;//维修日期
    private String recDesc;//维修详情
    private String maintainResult;//维修结果

    public Maintain() {
        super();
    }

    public Maintain(int id, int equipmentId, String equName, String maintainName, Date recDate, String recDesc, String maintainResult) {
        this.id = id;
        this.equipmentId = equipmentId;
        this.equName = equName;
        this.maintainName = maintainName;
        this.recDate = recDate;
        this.recDesc = recDesc;
        this.maintainResult = maintainResult;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEquName() {
        return equName;
    }

    public void setEquName(String equName) {
        this.equName = equName;
    }

    public String getMaintainName() {
        return maintainName;
    }

    public void setMaintainName(String maintainName) {
        this.maintainName = maintainName;
    }

    public Date getRecDate() {
        return recDate;
    }

    public void setRecDate(Date recDate) {
        this.recDate = recDate;
    }

    public String getRecDesc() {
        return recDesc;
    }

    public void setRecDesc(String recDesc) {
        this.recDesc = recDesc;
    }

    public String getMaintainResult() {
        return maintainResult;
    }

    public void setMaintainResult(String maintainResult) {
        this.maintainResult = maintainResult;
    }
}
