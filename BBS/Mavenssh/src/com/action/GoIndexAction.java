package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Item;
import com.po.SubItem;
import com.service.ItemService;
import com.service.SubItemService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoIndexAction extends ActionSupport {
	private SubItemService subItemService;	//子栏目业务接口引用
	private List<SubItem> subItems;		//子栏目列表
	private ItemService itemService;		//栏目业务接口引用
	private List<Item> items;				//栏目列表
	private Map<Item, List> map;			//栏目下的子栏目
	public void setSubItemService(SubItemService subItemService) {
		this.subItemService = subItemService;
	}
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}
	public List<SubItem> getSubItems() {
		return subItems;
	}
	public void setSubItems(List<SubItem> subItems) {
		this.subItems = subItems;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public Map<Item, List> getMap() {
		return map;
	}
	public void setMap(Map<Item, List> map) {
		this.map = map;
	}
	public String execute() throws Exception {
		items = itemService.findAllItem();		//查询所有栏目
		//创建一个Map用来存放相应的栏目和其下面的子栏目
		map = new HashMap<Item, List>();
		for(Item item:items){		//对栏目循环遍历
			subItems = subItemService.findAllSubItem(item.getItemID());	//获取栏目下子栏目
			map.put(item,subItems);	//设置到map中
		}
		return SUCCESS;
	}
}
