package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.po.User;
import com.service.UserService;
import org.apache.struts2.ServletActionContext;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpSession;
import java.util.Map;

public class LoginAction extends ActionSupport {
	private String checkCode;

	public String getCheckCode() {
		return checkCode;
	}

	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	private String username;
	private String password;
	private UserService userService;

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

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String execute() throws Exception {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		HttpSession session0 = ServletActionContext.getRequest().getSession();

		String checkCode2 = (String) session0.getAttribute("checkCode");

		if (!checkCode.equals(checkCode2)) {
			this.addActionMessage("ÑéÖ¤Âë´íÎó");
		}
		else {
			if (userService.isLogin(user)) {
				Map session = ActionContext.getContext().getSession();
				session.put("username", username);
				this.addActionMessage("¹§Ï²Äú£¬µÇÂ¼³É¹¦!");
				return SUCCESS;
			} else {
				this.addActionMessage("µÇÂ¼Ê§°Ü(ÓÃ»§Ãû»òÃÜÂë´íÎó)");
				return INPUT;
			}
		}
		return INPUT;
	}
}


