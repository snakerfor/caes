package com.ruoyi.web.controller.back;

import com.ruoyi.back.domain.TestScore;
import com.ruoyi.back.service.ITestScoreService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.SysNotice;
import com.ruoyi.system.service.ISysNoticeService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 公告 信息操作处理
 * 
 * @author ruoyi
 */
@Controller
@RequestMapping("/back/score")
public class TestScoreController extends BaseController
{
    private String prefix = "back/score";

    @Autowired
    private ITestScoreService service;

    @RequiresPermissions("back/score:view")
    @GetMapping()
    public String notice()
    {
        return prefix + "/score";
    }

    /**
     * 查询公告列表
     */
    @RequiresPermissions("back/score:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TestScore notice)
    {
        startPage();
        List<TestScore> list = service.selectTestScoreList(notice);
        return getDataTable(list);
    }

    /**
     * 新增公告
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存公告
     */
    @RequiresPermissions("back/score:add")
    @Log(title = "通知公告", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TestScore notice)
    {
        notice.setCreateBy(ShiroUtils.getLoginName());
        return toAjax(service.insertTestScore(notice));
    }

    /**
     * 修改公告
     */
    @GetMapping("/edit/{scoreId}")
    public String edit(@PathVariable("scoreId") Long scoreId, ModelMap mmap)
    {
        mmap.put("score", service.selectTestScoreById(scoreId));
        return prefix + "/edit";
    }

    /**
     * 修改保存公告
     */
    @RequiresPermissions("back/score:edit")
    @Log(title = "通知公告", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TestScore notice)
    {
        notice.setUpdateBy(ShiroUtils.getLoginName());
        return toAjax(service.updateTestScore(notice));
    }

    /**
     * 删除公告
     */
    @RequiresPermissions("back/score:remove")
    @Log(title = "通知公告", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(service.deleteTestScoreByIds(ids));
    }
}
