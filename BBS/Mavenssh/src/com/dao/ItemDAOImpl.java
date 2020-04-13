package com.dao;

import com.po.Item;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class ItemDAOImpl extends HibernateDaoSupport implements ItemDAO {
	public Item queryItemByName(String itemName) {	//根据栏目名称查询栏目
		List<Item> item = (List<Item>) getHibernateTemplate().find("from Item where itemName = ?",itemName);
		if(item.size() == 0) {		//判断是否查询到栏目
			return null;
		}else {
			return item.get(0);		//返回第一个栏目
		}
	}
	public void saveItem(Item item) {		//保存栏目方法
		getHibernateTemplate().save(item);
	}
	public List<Item> queryAllItem() {		//查询所有栏目
		List<Item> item = (List<Item>) getHibernateTemplate().find("from Item");
		return item;
	}
	public void deleteItem(Item item) {	//删除指定栏目
		getHibernateTemplate().delete(item);
	}
	public Item queryItemByID(int itemID) {	//根据栏目ID查询栏目
		List<Item> item = (List<Item>) getHibernateTemplate().find("from Item where itemID = ?",itemID);
		if(item.size() == 0) {		//判断是否查询到栏目
			return null;
		}else {
			return item.get(0);		//如果查询到，返回栏目
		}
	}
}
