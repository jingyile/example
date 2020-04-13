package com.service;

import com.dao.UserDAO;
import com.po.User;

import java.util.List;

public class UserServiceImpl implements UserService {
	private UserDAO userDAO;	//用户DAO接口引用
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	public boolean addUser(User user) {		//增加用户
		String username = user.getUsername();	//获得用户名
		if(userDAO.queryByUsername(username) == null) {		//判断用户名是否被占用
			userDAO.saveUser(user);		//保存用户
			return true;				//保存成功
		}else{
			return false;				//保存失败
		}
	}

	public List<User> findAllUser(int popedom) {	//根据权限查询用户
		return userDAO.queryAll(popedom);		//查询方法
	}

	public boolean deleteUser(String username) {	//删除指定用户
		User user = userDAO.queryByUsername(username);	//根据用户名查询用户
		if(user == null) {		//不存在该用户
			return false;		//删除失败
		}else{
			userDAO.deleteUser(user);	
			return true;		//删除成功
		}
	}
	public boolean isLogin(User user) {
		//首先判断用户是否存在
		User query_user = userDAO.queryByUsername(user.getUsername());
		if(query_user == null) {
			return false;
		} else {
			//比较密码
			String query_password = query_user.getPassword();
			if(user.getPassword().equals(query_password)){
				return true;
			}
			return false;
		}
	}
}
