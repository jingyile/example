package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.User;
import com.service.UserService;

import java.util.Date;

public class UserAddAction extends ActionSupport {
	private UserService userService;	//用户业务接口引用
	private String username;		//用户名
	private String password;		//密码
	private String repassword;		//确认密码
	private String sex;			//性别
	private int age;				//年龄
	private Date birthDay;			//生日
	private int popedom;			//权限
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public int getPopedom() {
		return popedom;
	}
	public void setPopedom(int popedom) {
		this.popedom = popedom;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String execute() throws Exception {
		User user = new User();			//创建用户对象
		user.setUsername(username);		//设置用户名
		user.setPassword(password);		//设置密码
		user.setSex(sex);				//设置性别
		user.setAge(age);				//设置年龄
		user.setBirthDay(birthDay);		//设置生日
		user.setPopedom(popedom);		//设置权限
		user.setIntegral(0);			//新增用户积分初始化为0
		if(userService.addUser(user)){	//调用增加用户业务方法，判断是否增加成功
			this.addActionMessage("添加用户成功!");
		}else{
			this.addActionMessage("用户被占用，请重新输入用户名");
		}
		return SUCCESS;
	}
}
