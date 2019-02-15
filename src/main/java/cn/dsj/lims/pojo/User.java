package cn.dsj.lims.pojo;

/**
 * Description：
 * 用户实体类
 *
 * @author Administrator
 * @create 2019/1/2
 */
public class User {
    private int id;
    private String name;
    private char sex;
    private int age;

    public User() {
    }

    ;

    public User(int id, String name, char sex, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}