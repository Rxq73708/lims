package cn.dsj.lims.pojo;

import java.util.Date;

public class ConsumableGet {
    private int id;//领料申请单id
    private int consumableId;//连接易耗品信息表id
    private int getCount;//领取数量
    private Date getDate;//领用时间
    private String empId;//领用人
    private String remark;//备注

    public void setId(int id) {
        this.id = id;
    }

    public void setConsumableId(int consumableId) {
        this.consumableId = consumableId;
    }

    public void setGetCount(int getCount) {
        this.getCount = getCount;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
