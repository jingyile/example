package com.dao;

import com.po.SubItem;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class SubItemDAOImpl extends HibernateDaoSupport implements SubItemDAO {
	public void deleteSubItem(SubItem subItem) {		//删除子栏目
		getHibernateTemplate().delete(subItem);
	}
	public List<SubItem> queryAllSubItem(int itemID) {	//查询指定栏目下的子栏目
		List<SubItem> items = (List<SubItem>) getHibernateTemplate().find("from SubItem where itemID = ?",itemID);
		return items;
	}
	public SubItem querySubItemByID(int subItemID) {	//查询指定子栏目
		List<SubItem> items = (List<SubItem>) getHibernateTemplate().find("from SubItem where subItemID = ?",subItemID);
		if(items.size() == 0) {		//判断是否查询到子栏目
			return null;
		}else {
			return items.get(0);	//返回子栏目
		}
	}

	public SubItem querySubItemByName(String subItemName) {		//根据名称查询
		List<SubItem> items = (List<SubItem>) getHibernateTemplate().find("from SubItem where subItemName = ?",subItemName);
		if(items.size() == 0) {		//判断是否查询到子栏目
			return null;
		}else {
			return items.get(0);
		}
	}

	public void saveSubItem(SubItem subItem) {		//保存子栏目
		getHibernateTemplate().save(subItem);
	}
}
