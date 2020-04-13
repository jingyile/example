package com.po;

import java.util.Date;
import java.util.Set;

public class Topic {//帖子
	private int topicID;			//主题ID
	private String title;			//主题标题
	private String content;		//主题内容
	private User user;				//主题发表者信息
	private Date date;				//主题发表时间
	private int hasread;			//主题查看数量
	private int subItemID;			//主题所属子栏目ID
	private Set<Replay> replays;	//主题下回复列表
	public int getTopicID() {
		return topicID;
	}
	public void setTopicID(int topicID) {
		this.topicID = topicID;
	}
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getHasread() {
		return hasread;
	}
	public void setHasread(int hasread) {
		this.hasread = hasread;
	}
	public int getSubItemID() {
		return subItemID;
	}
	public void setSubItemID(int subItemID) {
		this.subItemID = subItemID;
	}
	public Set<Replay> getReplays() {
		return replays;
	}
	public void setReplays(Set<Replay> replays) {
		this.replays = replays;
	}
}
