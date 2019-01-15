package cn.dsj.lims.pojo;

import java.util.Date;

public class Maintenance {
    private int id;//保养序号
    private int equipmentId;//设备编码
    private String equName;//设备名称
    private Date maintenanceDate;//保养日期
    private String maintenanceName;//保养人
    private String maintenanceContent;//保养内容

    public Maintenance() {
        super();
    }

    public Maintenance(int id, int equipmentId, String equName, Date maintenanceDate, String maintenanceName, String maintenanceContent) {
        this.id = id;
        this.equipmentId = equipmentId;
        this.equName = equName;
        this.maintenanceDate = maintenanceDate;
        this.maintenanceName = maintenanceName;
        this.maintenanceContent = maintenanceContent;
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
