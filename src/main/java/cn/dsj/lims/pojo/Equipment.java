package cn.dsj.lims.pojo;

import java.util.Date;

/**
 * 仪器设备实体类
 */
public class Equipment {
    private int id;//序号
    private String code;//设备编码
    private String equName;//设备名称
    private String type;//设备型号
    private String equDesc;//设备描述
    private String instruction;//使用说明
    private Date buyDate;//购买日期
    private String proId;//供应商id
    private Date startDate;//启用日期
    private int useStatus;//1、正常/2、异常/3、关机/4、维修
    private String location;//安装位置

    public Equipment() {
        super();
    }

    public Equipment(int id, String code, String equName, String type, String equDesc, String instruction, Date buyDate, String proId, Date startDate, int useStatus, String location) {
        this.id = id;
        this.code = code;
        this.equName = equName;
        this.type = type;
        this.equDesc = equDesc;
        this.instruction = instruction;
        this.buyDate = buyDate;
        this.proId = proId;
        this.startDate = startDate;
        this.useStatus = useStatus;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEquName() {
        return equName;
    }

    public void setEquName(String equName) {
        this.equName = equName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEquDesc() {
        return equDesc;
    }

    public void setEquDesc(String equDesc) {
        this.equDesc = equDesc;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(int useStatus) {
        this.useStatus = useStatus;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
