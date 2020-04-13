package com.withstars.domain;
import java.text.SimpleDateFormat;
import java.util.Date;
//public class User{
//    private int userID;		//用户ID
//    private String username;	//用户名
//    private String password;	//密码
//    private String sex;		//性别
//    private int age;			//年龄
//    private Date birthDay;		//生日
//    private int popedom;		//权限
//    private int integral;		//积分
//    public int getUserID() {
//        return userID;
//    }
//    public void setUserID(int userID) {
//        this.userID = userID;
//    }
//    public String getUsername() {
//        return username;
//    }
//    public void setUsername(String username) {
//        this.username = username;
//    }
//    public String getPassword() {
//        return password;
//    }
//    public void setPassword(String password) {
//        this.password = password;
//    }
//    public String getSex() {
//        return sex;
//    }
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
//    public Date getBirthDay() {
//        return birthDay;
//    }
//    public void setBirthDay(Date birthDay) {
//        this.birthDay = birthDay;
//    }
//    public int getPopedom() {
//        return popedom;
//    }
//    public void setPopedom(int popedom) {
//        this.popedom = popedom;
//    }
//    public int getIntegral() {
//        return integral;
//    }
//    public void setIntegral(int integral) {
//        this.integral = integral;
//    }
//}

/**
 * 用户信息实体类
 */
public class User extends BaseDomain {

    private Integer id;

    private String username;

    private String password;

    private String email;

    private String phoneNum;

    private Date createTime;

    private Date updateTime;

    private Integer credit;

    private String avatar;

    private Byte type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getLocalCreateTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-M-dd HH:mm");//设置日期格式
        String date = df.format(this.createTime);
        return date;
    }

    public String getLocalUpdateTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-M-dd HH:mm");//设置日期格式
        String date = df.format(updateTime);
        return date;
    }
}