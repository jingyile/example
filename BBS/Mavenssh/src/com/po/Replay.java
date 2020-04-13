package com.po;

import java.util.Date;

public class Replay {
	private int Id;			//回复ID
	private int topicID;		//所属主题ID
	private String content;	//回复内容
	private User user;			//回复发表者信息
	private Date date;			//回复发表时间
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getTopicID() {
		return topicID;
	}
	public void setTopicID(int topicID) {
		this.topicID = topicID;
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
}
