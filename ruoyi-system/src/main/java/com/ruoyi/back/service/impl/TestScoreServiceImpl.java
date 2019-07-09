package com.ruoyi.back.service.impl;

import com.ruoyi.back.domain.TestScore;
import com.ruoyi.back.mapper.TestScoreMapper;
import com.ruoyi.back.service.ITestScoreService;
import com.ruoyi.common.core.text.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 公告 服务层实现
 * 
 * @author ruoyi
 * @date 2018-06-25
 */
@Service
public class TestScoreServiceImpl implements ITestScoreService
{
    @Autowired
    private TestScoreMapper testScoreMapper;


    @Override
    public TestScore selectTestScoreById(Long scoreId) {
        return null;
    }

    @Override
    public List<TestScore> selectTestScoreList(TestScore testScore) {
        return testScoreMapper.selectTestScoreList(testScore);
    }

    @Override
    public int insertTestScore(TestScore testScore) {
        return testScoreMapper.insertTestScore(testScore);
    }

    @Override
    public int updateTestScore(TestScore testScore) {
        return testScoreMapper.updateTestScore(testScore);
    }

    @Override
    public int deleteTestScoreByIds(String studentIds) {
        return testScoreMapper.deleteTestScoreByIds(Convert.toStrArray(studentIds));
    }
}
