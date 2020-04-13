package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Item;
import com.po.User;
import com.service.ItemService;

public class ItemAddAction extends ActionSupport {
	private ItemService itemService;	//栏目业务接口引用
	private String itemName;			//栏目名称
	private String itemDescription;	//栏目介绍
	private String manager;			//版主
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}
	public String execute() throws Exception {
		Item item = new Item();			//创建栏目对象
		item.setItemName(itemName);		//设置栏目名称
		item.setItemDescription(itemDescription);	//设置栏目介绍
		User user = new User();			//创建用户
		user.setUsername(manager);		//将版主设置到用户对象中
		item.setManager(user);			//设置版主用户
		if(itemService.addItem(item)){		//调用增加栏目业务方法
			this.addActionMessage("添加栏目成功!");
		}else{
			this.addActionMessage("栏目被占用，或者版主不存在！");
		}
		return SUCCESS;
	}
}
