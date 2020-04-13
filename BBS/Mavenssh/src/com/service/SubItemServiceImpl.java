package com.service;

import com.dao.SubItemDAO;
import com.dao.UserDAO;
import com.po.SubItem;
import com.po.User;

import java.util.List;

public class SubItemServiceImpl implements SubItemService{
	private SubItemDAO subItemDAO;		//子栏目DAO接口引用
	private UserDAO userDAO;			//用户DAO接口引用
	public void setSubItemDAO(SubItemDAO subItemDAO) {
		this.subItemDAO = subItemDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public boolean addSubItem(SubItem subItem) {		//增加子栏目
		String subItemName = subItem.getSubItemName();	//获得子栏目名称
		if(subItemDAO.querySubItemByName(subItemName) == null) {	//子栏目名称是否被占用
			User user = userDAO.queryByUsername(subItem.getManager().getUsername());//根据用户名查找用户
			if(user != null){				//该用户已经存在
				subItem.setManager(user);	//设置用户
				subItemDAO.saveSubItem(subItem);	//保存子栏目
				return true;				//保存成功
			}
		}
		return false;		//保存失败
	}

	public boolean deleteItemBySubItemID(int subItemID) {		//删除指定ID子栏目
		SubItem subItem = subItemDAO.querySubItemByID(subItemID);	//根据ID查询子栏目
		if(subItem == null) {		//判断是否存在该子栏目
			return false;			//删除失败
		}else{
			subItemDAO.deleteSubItem(subItem);		//删除子栏目
			return true;			//删除成功
		}
	}

	public List<SubItem> findAllSubItem(int itemID) {	//查询指定栏目下子栏目
		return subItemDAO.queryAllSubItem(itemID);
	}
	public SubItem findSubItemByID(int subItemID) {	//根据子栏目ID查询
		return subItemDAO.querySubItemByID(subItemID);
	}

}
