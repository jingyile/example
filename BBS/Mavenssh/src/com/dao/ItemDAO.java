package com.dao;

import com.po.Item;

import java.util.List;

public interface ItemDAO {
	public void saveItem(Item item);			//保存栏目
	public Item queryItemByName(String itemName);//根据栏目名称查找栏目
	public Item queryItemByID(int itemID);//根据栏目ID查找栏目
	public List<Item> queryAllItem();			//查询所有栏目
	public void deleteItem(Item item);			//删除栏目
}
