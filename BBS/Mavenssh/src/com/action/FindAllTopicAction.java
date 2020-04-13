package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Topic;
import com.service.SubItemService;
import com.service.TopicService;
import com.util.Page;
import com.util.Result;

import java.util.List;

public class FindAllTopicAction extends ActionSupport {
	private TopicService topicService;			//主题业务接口引用
	private SubItemService subItemService;		//子栏目业务接口引用
	private int subItemID;				//子栏目ID
	private List<Topic> allTopic;		//主题列表
	private String subItemName;		//子栏目名称
	private int currentPage;			//当前页
	private Page page;					//分页
	public int getSubItemID() {
		return subItemID;
	}
	public void setSubItemID(int subItemID) {
		this.subItemID = subItemID;
	}


	
	
	public List<Topic> getAllTopic() {
		return allTopic;
	}

	public void setAllTopic(List<Topic> allTopic) {
		this.allTopic = allTopic;
	}



	public String getSubItemName() {
		return subItemName;
	}

	public void setSubItemName(String subItemName) {
		this.subItemName = subItemName;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public void setTopicService(TopicService topicService) {
		this.topicService = topicService;
	}
	public void setSubItemService(SubItemService subItemService) {
		this.subItemService = subItemService;
	}
	
	public String execute() throws Exception {
		Page zPage = new Page();			//设置分页信息
		zPage.setCurrentPage(currentPage);	//设置当前页
		zPage.setEveryPage(10);				//设置每页显示
		subItemName = subItemService.findSubItemByID(subItemID).getSubItemName();	//获取子栏目名称
		Result result = topicService.findTopicBySubItemID(subItemID,zPage);	//获取查询结果
		page = result.getPage();		//获取分页信息
		allTopic = result.getList();	//获取主题列表
		return SUCCESS;
	}
}
