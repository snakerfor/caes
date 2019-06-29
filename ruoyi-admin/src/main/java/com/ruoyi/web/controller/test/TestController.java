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
@RequestMapping("/test")
public class TestController
{
    private String prefix = "front";

    /**
     * 报考专业测评
     */
    @GetMapping("/profess/index")
    public String profess()
    {
        return prefix + "/profess_test";
    }
    /**
     * 创新能力测评
     */
    @GetMapping("/innovate/index")
    public String innovate()
    {
        return prefix + "/innovate_test";
    }
    /**
     * 创业能力测评
     */
    @GetMapping("/business/index")
    public String business()
    {
        return prefix + "/business_test";
    }
    /**
     * 职业兴趣测评
     */
    @GetMapping("/interest/index")
    public String interest()
    {
        return prefix + "/interest_test";
    }

    /**
     * 职业技能测评
     */
    @GetMapping("/skill/index")
    public String skill()
    {
        return prefix + "/skill_test";
    }
    /**
     * 价值观测评
     */
    @GetMapping("/value/index")
    public String value()
    {
        return prefix + "/value_test";
    }
    /**
     * 测评报告查询
     */
    @GetMapping("/test_report/index")
    public String testReport()
    {
        return prefix + "/test_report";
    }

    /**
     * 职业推荐查询
     */
    @GetMapping("/career_report/index")
    public String careerReport()
    {
        return prefix + "/career_report";
    }
    /**
     * 个人信息
     */
    @GetMapping("/person_info/index")
    public String persionInfo()
    {
        return prefix + "/person_info";
    }
    /**
     * 职业历程
     */
    @GetMapping("/career_course/index")
    public String careerCourse()
    {
        return prefix + "/career_course";
    }



}
