package cn.dsj.lims.pojo;

/**
 * Description：
 * Sample实体类
 *
 * @author Administrator
 * @create 2019/2/25
 */
public class Sample {
    private int id;
    private String sampleName;
    private int level;
    private String parent;

    public Sample(){}

    public Sample(int id, String sampleName, int level, String parent) {
        this.id = id;
        this.sampleName = sampleName;
        this.level = level;
        this.parent = parent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSampleName() {
        return sampleName;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
}