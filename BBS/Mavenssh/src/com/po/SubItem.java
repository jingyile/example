package com.po;

import java.util.Set;

public class SubItem {
	private int subItemID;			//子栏目ID
	private String subItemName;	//子栏目名称
	private int itemID;			//所属栏目ID
	private String itemDescription;	//子栏目介绍
	private User manager;			//子栏目版主
	private Set<Topic> topics;		//子栏目下主题列表
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
	public User getManager() {
		return manager;
	}
	public void setManager(User manager) {
		this.manager = manager;
	}
	public Set<Topic> getTopics() {
		return topics;
	}
	public void setTopics(Set<Topic> topics) {
		this.topics = topics;
	}
}
