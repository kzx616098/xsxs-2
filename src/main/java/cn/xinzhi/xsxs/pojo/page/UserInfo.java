package cn.xinzhi.xsxs.pojo.page;

import io.swagger.annotations.ApiModel;

import java.util.Date;

@ApiModel(value = "用户信息")
public class UserInfo extends Picture {
    private Integer uiid;
    private String uid;
    private String uname;
    private String upwd;
    private String phone;
    private String idnumber;
    private Date brithday;
    private Integer sex;
    private Integer cityid;
    private Integer age;

    public Integer getUiid() {
        return uiid;
    }

    public void setUiid(Integer uiid) {
        this.uiid = uiid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + uiid +
                ", uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", phone='" + phone + '\'' +
                ", idnumber='" + idnumber + '\'' +
                ", brithday=" + brithday +
                ", sex=" + sex +
                ", cityid=" + cityid +
                ", age=" + age +
                '}';
    }
}

