package com.dao;

import com.po.Topic;
import com.util.Page;

import java.util.List;

public interface TopicDAO {
	public void saveTopic(Topic topic);//保存帖子
	public Topic queryTopicByID(int topicID);//根据ID查找帖子
	public List<Topic> queryTopicBySubItemID(int subItemID, Page page);//根据子栏目ID分页查找帖子
	public int queryTopicCount(int subItemID);//查询子栏目下帖子数
	public void updateTopic(Topic topic);//更新帖子
}
