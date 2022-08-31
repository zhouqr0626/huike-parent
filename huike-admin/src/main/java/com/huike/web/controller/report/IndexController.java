package com.huike.web.controller.report;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import com.huike.common.core.domain.AjaxResult;
import com.huike.report.service.IReportService;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private IReportService reportService;


    /**
     * 首页--基础数据统计
     * @param beginCreateTime
     * @param endCreateTime
     * @return
     */
    @GetMapping("/getBaseInfo")
    public AjaxResult getBaseInfo(@RequestParam("beginCreateTime") String beginCreateTime,
                                  @RequestParam("endCreateTime") String endCreateTime){
        return AjaxResult.success(reportService.getBaseInfo(beginCreateTime,endCreateTime));
    }

    /**
     * 今日简报部分数据
     * @return
     */
    @GetMapping("/getTodayInfo")
    public AjaxResult gatTodayInfo(){
        return AjaxResult.success(reportService.getTodayInfo());
    }

    /**
     * 今日简报部分数据
     * @return
     */
    @GetMapping("/getTodoInfo")
    public AjaxResult getTodoInfo(@RequestParam("beginCreateTime") String beginCreateTime,
                                  @RequestParam("endCreateTime") String endCreateTime){
        return AjaxResult.success(reportService.getTodoInfo(beginCreateTime,endCreateTime));
    }
}
