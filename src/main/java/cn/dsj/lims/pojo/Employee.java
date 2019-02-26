package cn.dsj.lims.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Description：
 * 员工表实体类
 *
 * @author Administrator
 * @create 2019/1/18
 */
public class Employee {
    private int id;//编号
    private int staffId;//员工编号
    private String empName;//员工姓名
    private char gender;//性别
    private String post;//职称
    private String workExperience;//工作经验
    private int deptId;//部门编号
    private int age;//年龄
    private String nation;//民族
    private String email;//邮箱
    private String phone;//电话
    private String address;//住址
    private String school;//毕业学校
    private String profession;//专业
    private String educationBackground;//学历
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date graduationDate;//毕业时间
    private String photo;//证件照
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;//生日
    private int marriage;//婚否
    private String award;//奖励情况
    private String punish;//处罚情况
    private int userId;//账户id
    private String deptName;//部门名称

    public Employee() {
        super();
    }

    public Employee(int id, int staffId, String empName, char gender, String post, String workExperience, int deptId, int age, String nation, String email, String phone, String address, String school, String profession, String educationBackgound, Date graduationDate, String photo, Date birthday, int marriage, String award, String punish, int userId, String deptName) {
        this.id = id;
        this.staffId = staffId;
        this.empName = empName;
        this.gender = gender;
        this.post = post;
        this.workExperience = workExperience;
        this.deptId = deptId;
        this.age = age;
        this.nation = nation;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.school = school;
        this.profession = profession;
        this.educationBackground = educationBackground;
        this.graduationDate = graduationDate;
        this.photo = photo;
        this.birthday = birthday;
        this.marriage = marriage;
        this.award = award;
        this.punish = punish;
        this.userId = userId;
        this.deptName = deptName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEducationBackground() {
        return educationBackground;
    }

    public void setEducationBackground(String educationBackground) {
        this.educationBackground = educationBackground;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getMarriage() {
        return marriage;
    }

    public void setMarriage(int marriage) {
        this.marriage = marriage;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public String getPunish() {
        return punish;
    }

    public void setPunish(String punish) {
        this.punish = punish;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}