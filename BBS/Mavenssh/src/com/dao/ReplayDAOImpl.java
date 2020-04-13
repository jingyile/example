package com.dao;

import com.po.Replay;
import com.po.Topic;
import com.util.Page;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class ReplayDAOImpl extends HibernateDaoSupport implements ReplayDAO {

	public List<Replay> queryReplayByTopicID(int topicID, Page page) {	//查询主题的所有回复
		Session session = getSession();
		Query query = session.createQuery("from Replay where topicID = :id");	//执行查询
		query.setInteger("id", topicID);			//设置主题ID
		query.setFirstResult(page.getBeginIndex());	//设置分页信息
		query.setMaxResults(page.getEveryPage());
		return query.list();		//返回查询结果
	}

	public int queryReplayCount(int topicID) {		//查询主题回复数
		List<Topic> topics = (List<Topic>) getHibernateTemplate().find("from Replay where topicID = ?",topicID);
		return topics.size();
	}

	public void saveReplay(Replay replay) {		//保存回复
		getHibernateTemplate().save(replay);
	}
}
