package cn.dsj.lims.pojo;

import java.util.Date;

public class Scrap {
    private int id;//报废编号
    private int equipmentId;//设备编码
    private String equName;//设备名称
    private Date scrapDate;//报废日期
    private String scrapCause;//报废原因
    private String scrapName;//报废申请人
    private int scrapResult;//1、是/2、否

    public Scrap() {
        super();
    }

    public Scrap(int id, int equipmentId, String equName, Date scrapDate, String scrapCause, String scrapName, int scrapResult) {
        this.id = id;
        this.equipmentId = equipmentId;
        this.equName = equName;
        this.scrapDate = scrapDate;
        this.scrapCause = scrapCause;
        this.scrapName = scrapName;
        this.scrapResult = scrapResult;
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

    public Date getScrapDate() {
        return scrapDate;
    }

    public void setScrapDate(Date scrapDate) {
        this.scrapDate = scrapDate;
    }

    public String getScrapCause() {
        return scrapCause;
    }

    public void setScrapCause(String scrapCause) {
        this.scrapCause = scrapCause;
    }

    public String getScrapName() {
        return scrapName;
    }

    public void setScrapName(String scrapName) {
        this.scrapName = scrapName;
    }

    public int getScrapResult() {
        return scrapResult;
    }

    public void setScrapResult(int scrapResult) {
        this.scrapResult = scrapResult;
    }
}
