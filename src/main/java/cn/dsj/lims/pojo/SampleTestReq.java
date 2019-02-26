package cn.dsj.lims.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Description：
 *
 * @author Administrator
 * @create 2019/2/15
 */
public class SampleTestReq {

    private int id;//申请测试编号
    private String sampleReqId;//检测申请表编号
    private String userReq;//申请人
    private Integer deptId;//部门id
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp reqDate;//申请时间
    private String sampleId;//样品编号=sample表
    private int count;//样品数量
    private Integer providerId;//供应商id
    private String itemId;//检测项目编号
    private Integer speed;//1：正常/2：加急
    private String reqDesc;//备注
    private Integer state;//1.待处理/2.已处理
    private Integer affirm;//1.确认收样/2.未收样
    private Date takeDate;//收样时间
    private Date detectionDate;//检测时间
    private Integer plan;//1.检测进行中/2.完成检测
    private Integer preserveCount;//留样数量
    private Integer storageLife;//保存期限
    private Integer clear;//1.清理/2.待清理
    private String sampleName;//样品名称

    public String getSampleName() {
        return sampleName;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSampleReqId() {
        return sampleReqId;
    }

    public void setSampleReqId(String sampleReqId) {
        this.sampleReqId = sampleReqId;
    }

    public String getUserReq() {
        return userReq;
    }

    public void setUserReq(String userReq) {
        this.userReq = userReq;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Timestamp getReqDate() {
        return reqDate;
    }

    public void setReqDate(Timestamp reqDate) {
        this.reqDate = reqDate;
    }

    public String getSampleId() {
        return sampleId;
    }

    public void setSampleId(String sampleId) {
        this.sampleId = sampleId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public String getReqDesc() {
        return reqDesc;
    }

    public void setReqDesc(String reqDesc) {
        this.reqDesc = reqDesc;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getAffirm() {
        return affirm;
    }

    public void setAffirm(Integer affirm) {
        this.affirm = affirm;
    }

    public Date getTakeDate() {
        return takeDate;
    }

    public void setTakeDate(Date takeDate) {
        this.takeDate = takeDate;
    }

    public Date getDetectionDate() {
        return detectionDate;
    }

    public void setDetectionDate(Date detectionDate) {
        this.detectionDate = detectionDate;
    }

    public Integer getPlan() {
        return plan;
    }

    public void setPlan(Integer plan) {
        this.plan = plan;
    }

    public Integer getPreserveCount() {
        return preserveCount;
    }

    public void setPreserveCount(Integer preserveCount) {
        this.preserveCount = preserveCount;
    }

    public Integer getStorageLife() {
        return storageLife;
    }

    public void setStorageLife(Integer storageLife) {
        this.storageLife = storageLife;
    }

    public Integer getClear() {
        return clear;
    }

    public void setClear(Integer clear) {
        this.clear = clear;
    }

}