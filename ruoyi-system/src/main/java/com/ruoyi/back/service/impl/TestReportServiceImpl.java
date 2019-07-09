package com.ruoyi.back.service.impl;

import com.ruoyi.back.domain.TestReport;
import com.ruoyi.back.mapper.TestReportMapper;
import com.ruoyi.back.service.ITestReportService;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.system.domain.SysNotice;
import com.ruoyi.system.mapper.SysNoticeMapper;
import com.ruoyi.system.service.ISysNoticeService;
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
public class TestReportServiceImpl implements ITestReportService
{
    @Autowired
    private TestReportMapper testReportMapper;


    @Override
    public TestReport selectReportById(Long reportId) {
        return testReportMapper.selectReportById(reportId);
    }

    @Override
    public List<TestReport> selectReportList(TestReport testReport) {
        return testReportMapper.selectReportList(testReport);
    }
}
