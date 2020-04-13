package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.SubItemService;

public class SubItemDeleteAction extends ActionSupport {
	private SubItemService subItemService;	//子栏目业务接口引用
	private int subItemID;					//子栏目ID
	public void setSubItemService(SubItemService subItemService) {
		this.subItemService = subItemService;
	}

	public int getSubItemID() {
		return subItemID;
	}

	public void setSubItemID(int subItemID) {
		this.subItemID = subItemID;
	}

	public String execute() throws Exception {
		subItemService.deleteItemBySubItemID(subItemID);	//调用删除业务方法
		return SUCCESS;
	}

}
