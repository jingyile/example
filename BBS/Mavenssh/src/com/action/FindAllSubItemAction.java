package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Item;
import com.po.SubItem;
import com.service.ItemService;
import com.service.SubItemService;

import java.util.List;

public class FindAllSubItemAction extends ActionSupport {
	private int titemID;				//栏目ID
	private List<SubItem> subItems;	//子栏目列表
	private ItemService itemService;	//栏目业务接口引用
	private List<Item> items;			//栏目列表
	private SubItemService subItemService;		//子栏目业务接口引用
	public void setSubItemService(SubItemService subItemService) {
		this.subItemService = subItemService;
	}

	public List<SubItem> getSubItems() {
		return subItems;
	}

	public void setSubItems(List<SubItem> subItems) {
		this.subItems = subItems;
	}

	public ItemService getItemService() {
		return itemService;
	}

	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public int getTitemID() {
		return titemID;
	}

	public void setTitemID(int titemID) {
		this.titemID = titemID;
	}

	public String execute() throws Exception {
		subItems = subItemService.findAllSubItem(titemID);	//根据栏目ID查询子栏目
		items = itemService.findAllItem();	//查询所有栏目
		return SUCCESS;
	}
}
