package com.service;

import com.dao.TopicDAO;
import com.dao.UserDAO;
import com.po.Topic;
import com.po.User;
import com.util.Page;
import com.util.PageUtil;
import com.util.Result;

import java.util.List;

public class TopicServiceImpl implements TopicService {
	private TopicDAO topicDAO;		//主题DAO接口引用
	private UserDAO userDAO;		//用户DAO接口引用
	public void setTopicDAO(TopicDAO topicDAO) {
		this.topicDAO = topicDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	public boolean addTopic(Topic topic) {		//增加主题
		User user = userDAO.queryByUsername(topic.getUser().getUsername());//根据用户名查找该用户
			if(user != null){			//该用户已经存在
				user.setIntegral(user.getIntegral() + 5);	//用户积分加5
				topic.setUser(user);	//设置用户
				topicDAO.saveTopic(topic);	//保存主题
				return true;			//保存成功
			}
		return false;
	}

	public Topic findTopicByID(int topicID) {	//查询指定ID主题
		return topicDAO.queryTopicByID(topicID);
	}

	public Result findTopicBySubItemID(int subItemID,Page page) {	//查询子栏目下所有主题
		page = PageUtil.createPage(page, topicDAO.queryTopicCount(subItemID));	//创建分页对象
		List<Topic> topics = topicDAO.queryTopicBySubItemID(subItemID, page);	//执行查询
		Result result = new Result();	//创建结果对象
		result.setPage(page);			//设置分页信息
		result.setList(topics);			//设置主题列表信息
		return result;
	}
	public void updateTopic(Topic topic) {		//更新主题
		topicDAO.updateTopic(topic);
	}
}
