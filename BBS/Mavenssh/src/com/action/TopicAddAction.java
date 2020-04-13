package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Topic;
import com.po.User;
import com.service.TopicService;

import java.util.Date;

public class TopicAddAction extends ActionSupport {
	private TopicService topicService;		//主题业务接口引用
	private String title;		//主题标题
	private String content;	//主题内容
	private String username;	//发表者用户名
	private int subItemID;		//所属子栏目ID
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getSubItemID() {
		return subItemID;
	}
	public void setSubItemID(int subItemID) {
		this.subItemID = subItemID;
	}
	public void setTopicService(TopicService topicService) {
		this.topicService = topicService;
	}
	public String execute() throws Exception {
		Topic topic = new Topic();		//创建主题对象
		topic.setTitle(title);			//设置主题标题
		topic.setContent(content);		//设置主题内容
		User user = new User();			//创建用户对象
		user.setUsername(username);		//设置用户名
		topic.setUser(user);			//设置发表者
		topic.setDate(new Date());		//设置发表时间
		topic.setSubItemID(subItemID);	//设置所属子栏目ID
		topic.setHasread(0);			//设置被查看数量
		if(topicService.addTopic(topic)){	//增加主题业务方法
			this.addActionMessage("发表帖子成功!");
		}else{
			this.addActionMessage("发表帖子失败!");
		}
		return SUCCESS;
	}
}
