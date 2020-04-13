package com.service;

import com.po.Replay;
import com.util.Page;
import com.util.Result;

public interface ReplayService {
	public boolean addReplay(Replay replay);
	public Result findReplayByTopicID(int topicID, Page page);
	public int findReplayCont(int topicID);
}
