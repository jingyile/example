package com.service;

import com.po.Topic;
import com.util.Page;
import com.util.Result;

public interface TopicService {
	public boolean addTopic(Topic topic);
	public Topic findTopicByID(int topicID);
	public Result findTopicBySubItemID(int subItemID, Page page);
	public void updateTopic(Topic topic);
}
