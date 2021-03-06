package com.toughguy.educationSystem.service.content.impl;

import org.springframework.stereotype.Service;

import com.toughguy.educationSystem.model.content.ScoreRank;
import com.toughguy.educationSystem.model.content.ScoreResult;
import com.toughguy.educationSystem.persist.content.prototype.IScoreResultDao;
import com.toughguy.educationSystem.service.content.prototype.IScoreResultService;
import com.toughguy.educationSystem.service.impl.GenericServiceImpl;


/**
 * 分值测试结果Service实现类
 * @author zmk
 *
 */
@Service
public class ScoreResultServiceImpl extends GenericServiceImpl<ScoreResult, Integer> implements IScoreResultService{

	@Override
	public ScoreResult findByTestId(int testId) {
		// TODO Auto-generated method stub
		return ((IScoreResultDao)dao).findByTestId(testId);
	}
	

}
