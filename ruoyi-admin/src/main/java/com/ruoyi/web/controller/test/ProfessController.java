package com.ruoyi.web.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 模态窗口
 * 
 * @author ruoyi
 */
@Controller
@RequestMapping("/test/profess")
public class ProfessController
{
    private String prefix = "front";

    /**
     * 报考专业测评
     */
    @GetMapping("/index")
    public String index()
    {
        return prefix + "/profess_test";
    }

    /**
     * 弹层组件
     */
    @GetMapping("/layer")
    public String layer()
    {
        return prefix + "/layer";
    }

    /**
     * 表单
     */
    @GetMapping("/form")
    public String form()
    {
        return prefix + "/form";
    }

    /**
     * 表格
     */
    @GetMapping("/table")
    public String table()
    {
        return prefix + "/table";
    }

    /**
     * 表格check
     */
    @GetMapping("/check")
    public String check()
    {
        return prefix + "/table/check";
    }

    /**
     * 表格radio
     */
    @GetMapping("/radio")
    public String radio()
    {
        return prefix + "/table/radio";
    }

    /**
     * 表格回传父窗体
     */
    @GetMapping("/parent")
    public String parent()
    {
        return prefix + "/table/parent";
    }
}
