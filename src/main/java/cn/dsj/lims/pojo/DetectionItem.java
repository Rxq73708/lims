package cn.dsj.lims.pojo;




/**
 * Description：
 *
 * @author Administrator
 * @create 2019/2/18
 */
public class DetectionItem {

    private int id;
    private String itemName;
    private String sampleId;

    public DetectionItem(){}

    public DetectionItem(int id, String itemName, String sampleId) {
        this.id = id;
        this.itemName = itemName;
        this.sampleId = sampleId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSampleId() {
        return sampleId;
    }

    public void setSampleId(String sampleId) {
        this.sampleId = sampleId;
    }
}