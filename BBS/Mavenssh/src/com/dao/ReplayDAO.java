package com.dao;

import com.po.Replay;
import com.util.Page;

import java.util.List;

public interface ReplayDAO {
	public void saveReplay(Replay replay);//保存回复
	public List<Replay> queryReplayByTopicID(int topicID, Page page);//根据帖子ID分页查找回复
	public int queryReplayCount(int topicID);//查询帖子下回复数
}
