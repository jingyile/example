package com.dao;

import com.po.Topic;
import com.util.Page;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class TopicDAOImpl extends HibernateDaoSupport implements TopicDAO{
	public Topic queryTopicByID(int topicID) {	//根据ID查询主题
		Topic topic = (Topic) getHibernateTemplate().get(Topic.class, topicID);
		return topic;
	}

	public List<Topic> queryTopicBySubItemID(int subItemID, Page page) {	//查询子栏目下所有主题
		Session session = getSession();
		Query query = session.createQuery("from Topic where subItemID = :id");	//执行查询
		query.setInteger("id", subItemID);			//设置ID参数
		query.setFirstResult(page.getBeginIndex());	//设置分页信息
		query.setMaxResults(page.getEveryPage());
		return query.list();		//返回查询结果
	}

	public void saveTopic(Topic topic) {		//保存主题
		getHibernateTemplate().save(topic);
	}

	public int queryTopicCount(int subItemID) {	//查询子栏目下主题数量
		List<Topic> topics = (List<Topic>) getHibernateTemplate().find("from Topic where subItemID = ?",subItemID);
		return topics.size();
	}

	public void updateTopic(Topic topic) {			//更新主题
		getHibernateTemplate().update(topic);
	}
	
}
