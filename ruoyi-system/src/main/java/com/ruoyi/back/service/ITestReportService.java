package com.ruoyi.back.service;

import com.ruoyi.back.domain.TestReport;
import com.ruoyi.system.domain.SysNotice;

import java.util.List;

/**
 * 公告 服务层
 * 
 * @author ruoyi
 */
public interface ITestReportService
{
    /**
     * 查询公告信息
     * 
     * @param noticeId 公告ID
     * @return 公告信息
     */
    public TestReport selectReportById(Long reportId);

    /**
     * 查询公告列表
     * 
     * @param notice 公告信息
     * @return 公告集合
     */
    public List<TestReport> selectReportList(TestReport testReport);


}
