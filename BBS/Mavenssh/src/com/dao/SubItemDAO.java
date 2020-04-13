package com.dao;

import com.po.SubItem;

import java.util.List;

public interface SubItemDAO {
	public void saveSubItem(SubItem subItem);			//保存子栏目
	public SubItem querySubItemByName(String subItemName);//根据子栏目名称查找子栏目
	public SubItem querySubItemByID(int subItemID);//根据子栏目ID查找子栏目
	public List<SubItem> queryAllSubItem(int itemID);			//查询所有子栏目
	public void deleteSubItem(SubItem subItem);			//删除子栏目
}
