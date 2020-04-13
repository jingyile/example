package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.ItemService;

public class ItemDeleteAction extends ActionSupport {
	private ItemService itemService;	//栏目业务接口引用
	private int itemID;		//栏目ID
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String execute() throws Exception {
		itemService.deleteItemByItemID(itemID);	//调用删除指定栏目业务方法
		return SUCCESS;
	}
}
