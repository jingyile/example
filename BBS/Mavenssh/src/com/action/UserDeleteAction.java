package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

public class UserDeleteAction extends ActionSupport {
	private String username;			//用户名
	private UserService userService;	//用户业务接口

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String execute() throws Exception {
		if(userService.deleteUser(username)) {		//调用删除用户业务方法
			this.addActionMessage("删除用户成功!");
		}else {
			this.addActionMessage("删除用户失败!");
		}
		return SUCCESS;
	}
}
