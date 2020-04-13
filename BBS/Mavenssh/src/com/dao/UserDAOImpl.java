package com.dao;

import com.po.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO{
	public void saveUser(User user) {		//保存用户方法
		this.getHibernateTemplate().save(user);
	}
	public User queryByUsername(String username) {	//根据用户名查找
		List<User> list = (List<User>) this.getHibernateTemplate().
				find("from User where username = ?",username);
		if(list.size() == 0){		//判断查询集合是否为空
			return null;
		}else {
			return list.get(0);		//返回第一个用户
		}
	}

	public List<User> queryAll(int popedom) {	//根据权限查询用户
		List<User> list = (List<User>) this.getHibernateTemplate().find("from User where popedom = ?",popedom);
		return list;
	}

	public void deleteUser(User user) {		//删除用户
		this.getHibernateTemplate().delete(user);
	}
}
