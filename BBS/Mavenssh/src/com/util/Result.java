package com.util;
import java.util.List;

public class Result {
	private Page page;			//分页信息
	private List list;			//列表操作
	public Page getPage() {		//获取分页信息
		return page;
	}
	public void setPage(Page page) {	//设置分页信息
		this.page = page;
	}
	public List getList() {		//获取列表信息
		return list;
	}
	public void setList(List list) {	//设置列表信息
		this.list = list;
	}
}
