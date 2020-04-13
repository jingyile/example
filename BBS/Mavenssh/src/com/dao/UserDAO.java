package com.dao;

import com.po.User;

import java.util.List;

public interface UserDAO {
	public void saveUser(User user);//保存用户
	public User queryByUsername(String username);//根据用户名查找用户
	public List<User> queryAll(int popedom);//查找所有用户
	public void deleteUser(User user);//删除用户
}