package com.ruoyi.back.mapper;

import java.util.List;

import com.ruoyi.back.domain.TestScore;
import com.ruoyi.system.domain.SysNotice;

/**
 * 公告 数据层
 *
 * @author ruoyi
 */
public interface TestScoreMapper
{
    /**
     * 查询公告信息
     *
     * @param noticeId 公告ID
     * @return 公告信息
     */
    public TestScore selectTestScoreById(String studentId);

    /**
     * 查询公告列表
     *
     * @param notice 公告信息
     * @return 公告集合
     */
    public List<TestScore> selectTestScoreList(TestScore testScore);

    /**
     * 新增公告
     *
     * @param notice 公告信息
     * @return 结果
     */
    public int insertTestScore(TestScore testScore);

    /**
     * 修改公告
     *
     * @param notice 公告信息
     * @return 结果
     */
    public int updateTestScore(TestScore testScore);

    /**
     * 批量删除公告
     *
     * @param noticeIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteTestScoreByIds(String[] studentIds);
}