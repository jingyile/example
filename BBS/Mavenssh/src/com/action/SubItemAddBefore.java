package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Item;
import com.service.ItemService;

import java.util.List;

public class SubItemAddBefore extends ActionSupport {	//新增子栏目前获得所有的栏目信息
	private ItemService itemService;		//栏目业务接口引用
	private List<Item> items;				//栏目列表
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void validate() {
		items = itemService.findAllItem();
	}

	public String execute() throws Exception {
		items = itemService.findAllItem();	//调用查询所有栏目业务方法
		return SUCCESS;
	}
}
