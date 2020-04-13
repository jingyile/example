package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.SubItem;
import com.po.User;
import com.service.SubItemService;

public class SubItemAddAction extends ActionSupport {
	private SubItemService subItemService;	//子栏目业务接口
	
	private String subItemName;		//子栏目名称
	private int itemID;				//所属栏目ID
	private String itemDescription;	//子栏目介绍
	private  String manager;			//子栏目版主
	public String getSubItemName() {
		return subItemName;
	}
	public void setSubItemName(String subItemName) {
		this.subItemName = subItemName;
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
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
	public SubItemService getSubItemService() {
		return subItemService;
	}
	public void setSubItemService(SubItemService subItemService) {
		this.subItemService = subItemService;
	}
	
	public String execute() throws Exception {
		SubItem subItem = new SubItem();		//创建子栏目对象
		subItem.setSubItemName(subItemName);	//设置子栏目名称
		subItem.setItemDescription(itemDescription);	//设置子栏目介绍
		subItem.setItemID(itemID);				//设置所属栏目ID	
		User user = new User();					//创建用户对象
		user.setUsername(manager);				//设置用户名
		subItem.setManager(user);				//设置子栏目版主
		if(subItemService.addSubItem(subItem)){	//保存成功
			this.addActionMessage("添加子栏目成功!");
		}else{
			this.addActionMessage("子栏目被占用，或者版主不存在！");
		}
		return SUCCESS;
	}
}
