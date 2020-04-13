package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.User;
import com.service.UserService;

import java.util.List;

public class FindAllUserAction extends ActionSupport {
	private int popedom;				//权限
	private List<User> allUser;		//用户列表
	private UserService userService;	//用户业务接口引用
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public List<User> getAllUser() {
		return allUser;
	}
	public void setAllUser(List<User> allUser) {
		this.allUser = allUser;
	}
	public int getPopedom() {
		return popedom;
	}
	public void setPopedom(int popedom) {
		this.popedom = popedom;
	}
	public String execute() throws Exception {
		allUser = userService.findAllUser(popedom);	//调用查找所有用户业务方法
		return SUCCESS;
	}
}
