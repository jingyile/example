package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Replay;
import com.po.User;
import com.service.ReplayService;

import java.util.Date;

public class ReplayAddAction extends ActionSupport {
	private ReplayService replayService;	//回复业务接口引用
	private int topidID;			//所属主题ID
	private String content;		//回复内容
	private String username;		//发表回复用户

	public void setReplayService(ReplayService replayService) {
		this.replayService = replayService;
	}

	public int getTopidID() {
		return topidID;
	}

	public void setTopidID(int topidID) {
		this.topidID = topidID;
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

	public String execute() throws Exception {
		Replay replay = new Replay();		//创建回复对象
		replay.setTopicID(topidID);			//设置所属主题ID
		replay.setContent(content);			//设置回复内容
		replay.setDate(new Date());			//设置回复时间
		User user = new User();				//创建用户
		user.setUsername(username);			//设置用户名
		replay.setUser(user);				//设置发表者
		if(replayService.addReplay(replay)){	//增加回复
			this.addActionMessage("发表回复成功!");
		}else{
			this.addActionMessage("发表回复失败!");
		}
		return SUCCESS;
	}
}
