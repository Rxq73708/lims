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

    private int id;
    private String sampleReqId;
    private String userReq;
    private Integer deptId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp reqDate;
    private String sampleId;
    private int count;
    private Integer providerId;
    private String itemId;
    private Integer speed;
    private String reqDesc;
    private Integer state;
    private Integer affirm;
    private Date takeDate;
    private Date detectionDate;
    private Integer plan;
    private Integer preserveCount;
    private Integer storageLife;
    private Integer clear;
    private String sampleName;

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