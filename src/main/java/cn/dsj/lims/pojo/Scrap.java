package cn.dsj.lims.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Scrap {
    private int id;//报废编号
    private int code;//设备编码
    private String type;//设备型号
    private int equipmentId;//设备
    private String equName;//设备名称
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date scrapDate;//报废日期
    private String scrapCause;//报废原因
    private String scrapName;//报废申请人
    private String scrapResult;//报废申请结果

    public Scrap() {
        super();
    }

    public Scrap(int id, int code, String type, int equipmentId, String equName, Date scrapDate, String scrapCause, String scrapName, String scrapResult) {
        this.id = id;
        this.code = code;
        this.type = type;
        this.equipmentId = equipmentId;
        this.equName = equName;
        this.scrapDate = scrapDate;
        this.scrapCause = scrapCause;
        this.scrapName = scrapName;
        this.scrapResult = scrapResult;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getScrapResult() {
        return scrapResult;
    }

    public void setScrapResult(String scrapResult) {
        this.scrapResult = scrapResult;
    }
}
