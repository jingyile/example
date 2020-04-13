package com.service;

import com.dao.ReplayDAO;
import com.dao.UserDAO;
import com.po.Replay;
import com.po.User;
import com.util.Page;
import com.util.PageUtil;
import com.util.Result;

import java.util.List;

public class ReplayServiceImpl implements ReplayService{
	private ReplayDAO replayDAO;		//回复DAO接口引用
	private UserDAO userDAO;			//用户DAO接口引用
	public void setReplayDAO(ReplayDAO replayDAO) {
		this.replayDAO = replayDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public boolean addReplay(Replay replay) {		//增加回复
		User user = userDAO.queryByUsername(replay.getUser().getUsername());//根据用户名查找该用户
		if(user != null){		//该用户已经存在
			user.setIntegral(user.getIntegral() + 1);	//用户积分加1
			replay.setUser(user);	//设置用户
			replayDAO.saveReplay(replay);	//保存回复
			return true;			//保存成功
		}
	return false;
	}

	public Result findReplayByTopicID(int topicID, Page page) {	//根据主题ID查询回复
		page = PageUtil.createPage(page, replayDAO.queryReplayCount(topicID));	//创建分页类
		List<Replay> peplays = replayDAO.queryReplayByTopicID(topicID, page);	//获取回复列表
		Result result = new Result();	//创建分页结果对象
		result.setPage(page);			//设置分页信息
		result.setList(peplays);		//设置回复列表
		return result;
	}

	public int findReplayCont(int topicID) {		//获取主题的回复数
		return replayDAO.queryReplayCount(topicID);
	}
}
