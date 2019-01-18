package cn.dsj.lims.pojo;

/**
 * Description：
 * 存储室实体类
 *
 * @author Administrator
 * @create 2019/1/15
 */
public class Store {
    private int id;
    private String place;

    public Store() {

    }

    public Store(int id, String place) {
        this.id = id;
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}