package com.service;

import com.po.User;

import java.util.List;

public interface UserService {
	public boolean addUser(User user);//新增用户
	public List<User> findAllUser(int popedom);//查找所有用户
	public boolean deleteUser(String username);//删除用户
	public boolean isLogin(User user);//是否允许登录
}
