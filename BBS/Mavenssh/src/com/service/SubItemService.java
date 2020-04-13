package com.service;

import com.po.SubItem;

import java.util.List;

public interface SubItemService {
	public boolean addSubItem(SubItem subItem);	//添加子栏目
	public List<SubItem> findAllSubItem(int itemID);//查询所有子栏目
	public boolean deleteItemBySubItemID(int subItemID);//根据子栏目ID删除栏目
	public SubItem findSubItemByID(int subItemID);
}
