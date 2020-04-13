package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Replay;
import com.po.Topic;
import com.service.ReplayService;
import com.service.SubItemService;
import com.service.TopicService;
import com.util.Page;
import com.util.Result;

import java.util.List;

public class FindTopicAction extends ActionSupport {
	private int topicID;					//主题ID
	private Topic topic;					//主题
	private int subItemID;					//子栏目ID
	private String subItemName;			//子栏目名称
	private List<Replay> replays;			//回复列表
	private int currentPage;				//当前页
	private Page page;						//分页信息
	private TopicService topicService;		//主题业务接口引用
	private SubItemService subItemService;	//子栏目业务接口引用
	private ReplayService replayService;	//回复业务接口引用
	public int getTopicID() {
		return topicID;
	}
	public void setTopicID(int topicID) {
		this.topicID = topicID;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public int getSubItemID() {
		return subItemID;
	}
	public void setSubItemID(int subItemID) {
		this.subItemID = subItemID;
	}
	public String getSubItemName() {
		return subItemName;
	}
	public void setSubItemName(String subItemName) {
		this.subItemName = subItemName;
	}
	public List<Replay> getReplays() {
		return replays;
	}
	public void setReplays(List<Replay> replays) {
		this.replays = replays;
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
	public void setReplayService(ReplayService replayService) {
		this.replayService = replayService;
	}
	public String execute() throws Exception {
		topic = topicService.findTopicByID(topicID);	//调用查询主题业务方法
		topic.setHasread(topic.getHasread() + 1);		//更新帖子，为帖子访问数加1
		topicService.updateTopic(topic);				//更新主题
		subItemName = subItemService.findSubItemByID(subItemID).getSubItemName();	//获取子栏目名称
		Page zPage = new Page();			//设置分页信息
		zPage.setCurrentPage(currentPage);	//设置当前页
		zPage.setEveryPage(5);				//设置每页显示回复
		Result result = replayService.findReplayByTopicID(topicID, zPage);	//获取主题下所有回复
		page = result.getPage();		//获取分页信息
		replays = result.getList();		//获取回复列表
		return SUCCESS;
	}
}
