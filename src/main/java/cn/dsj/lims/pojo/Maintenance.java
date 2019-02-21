package cn.dsj.lims.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Maintenance {
    private int id;//保养序号
    private int code;//设备编码
    private String type;//设备型号
    private int equipmentId;//设备id
    private String equName;//设备名称
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date maintenanceDate;//保养日期
    private String maintenanceName;//保养人
    private String maintenanceContent;//保养内容

    public Maintenance() {
        super();
    }

    public Maintenance(int id, int code, String type, int equipmentId, String equName, Date maintenanceDate, String maintenanceName, String maintenanceContent) {
        this.id = id;
        this.code = code;
        this.type = type;
        this.equipmentId = equipmentId;
        this.equName = equName;
        this.maintenanceDate = maintenanceDate;
        this.maintenanceName = maintenanceName;
        this.maintenanceContent = maintenanceContent;
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

    public Date getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(Date maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    public String getMaintenanceName() {
        return maintenanceName;
    }

    public void setMaintenanceName(String maintenanceName) {
        this.maintenanceName = maintenanceName;
    }

    public String getMaintenanceContent() {
        return maintenanceContent;
    }

    public void setMaintenanceContent(String maintenanceContent) {
        this.maintenanceContent = maintenanceContent;
    }
}
