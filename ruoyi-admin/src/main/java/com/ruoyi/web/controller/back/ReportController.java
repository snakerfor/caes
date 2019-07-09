package com.ruoyi.web.controller.back;

import com.ruoyi.back.domain.TestReport;
import com.ruoyi.back.service.ITestReportService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.shiro.service.SysPasswordService;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.SysNotice;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.system.service.ISysNoticeService;
import com.ruoyi.system.service.ISysPostService;
import com.ruoyi.system.service.ISysRoleService;
import com.ruoyi.system.service.ISysUserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 用户信息
 * 
 * @author ruoyi
 */
@Controller
@RequestMapping("/back/report")
public class ReportController extends BaseController
{
    private String prefix = "back/report";

    @Autowired
    private ITestReportService testReportService;

    @RequiresPermissions("back:report:view")
    @GetMapping()
    public String notice()
    {
        return prefix + "/report";
    }

    /**
     * 查询公告列表
     */
    @RequiresPermissions("back:report:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TestReport testReport)
    {
        startPage();
        List<TestReport> list = testReportService.selectReportList(testReport);
        return getDataTable(list);
    }

  /*  *//**
     * 新增公告
     *//*
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    *//**
     * 新增保存公告
     *//*
    @RequiresPermissions("system:notice:add")
    @Log(title = "通知公告", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysNotice notice)
    {
        notice.setCreateBy(ShiroUtils.getLoginName());
        return toAjax(noticeService.insertNotice(notice));
    }

    *//**
     * 修改公告
     *//*
    @GetMapping("/edit/{noticeId}")
    public String edit(@PathVariable("noticeId") Long noticeId, ModelMap mmap)
    {
        mmap.put("notice", noticeService.selectNoticeById(noticeId));
        return prefix + "/edit";
    }

    *//**
     * 修改保存公告
     *//*
    @RequiresPermissions("system:notice:edit")
    @Log(title = "通知公告", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysNotice notice)
    {
        notice.setUpdateBy(ShiroUtils.getLoginName());
        return toAjax(noticeService.updateNotice(notice));
    }

    *//**
     * 删除公告
     *//*
    @RequiresPermissions("system:notice:remove")
    @Log(title = "通知公告", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(noticeService.deleteNoticeByIds(ids));
    }*/
}