package com.service;

import com.po.Item;

import java.util.List;

public interface ItemService {
	public boolean addItem(Item item);	//添加栏目
	public List<Item> findAllItem();//查询所有栏目
	public boolean deleteItemByItemID(int itemID);//根据栏目ID删除栏目
}
