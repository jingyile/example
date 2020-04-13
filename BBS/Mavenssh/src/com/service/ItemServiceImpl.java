package com.service;

import com.dao.ItemDAO;
import com.dao.SubItemDAO;
import com.dao.UserDAO;
import com.po.Item;
import com.po.SubItem;
import com.po.User;

import java.util.List;

public class ItemServiceImpl implements ItemService {
	private ItemDAO itemDAO;			//栏目DAO接口引用
	private UserDAO userDAO;			//用户DAO接口引用
	private SubItemDAO subItemDAO;		//子栏目DAO接口引用
	
	public ItemDAO getItemDAO() {
		return itemDAO;
	}
	public void setItemDAO(ItemDAO itemDAO) {
		this.itemDAO = itemDAO;
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public SubItemDAO getSubItemDAO() {
		return subItemDAO;
	}
	public void setSubItemDAO(SubItemDAO subItemDAO) {
		this.subItemDAO = subItemDAO;
	}
	public boolean addItem(Item item) {	//增加栏目业务方法
		String itemName = item.getItemName();	//获得栏目名称
		if(itemDAO.queryItemByName(itemName) == null) {		//判断名称是否被占用
			User user = userDAO.queryByUsername(item.getManager().getUsername());//根据用户名查找用户
			if(user != null){			//该用户已经存在
				item.setManager(user);	//设置用户
				itemDAO.saveItem(item);	//保存栏目
				return true;			//保存成功
			}
		}
		return false;		//保存失败
	}
	public List<Item> findAllItem() {	//查询所有栏目业务方法
		return itemDAO.queryAllItem();
	}
	public boolean deleteItemByItemID(int itemID) {	//删除指定ID栏目
		Item item = itemDAO.queryItemByID(itemID);	//根据ID查询栏目
		if(item == null) {		//如果不存在该栏目
			return false;		//删除失败
		}else{
			itemDAO.deleteItem(item);	//删除栏目
			List<SubItem> subItems =
				subItemDAO.queryAllSubItem(itemID);	//获得该栏目下的所有子栏目
			for(SubItem subItem : subItems){		//遍历得到所有子栏目
				subItemDAO.deleteSubItem(subItem);	//删除子栏目
			}
			return true;		//删除成功
		}
	}
}
