package com.huike.web.controller.review;


import com.huike.clues.domain.TbClue;
import com.huike.common.core.controller.BaseController;
import com.huike.common.core.domain.AjaxResult;
import com.huike.common.core.page.TableDataInfo;
import com.huike.review.pojo.Review;
import com.huike.review.service.ReviewService;
import com.huike.review.vo.MybatisReviewVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 该Controller主要是为了复习三层架构以及Mybatis使用的，该部分接口已经放开权限，可以直接访问
 * 同学们在此处编写接口通过浏览器访问看是否能完成最简单的增删改查
 */
@RestController
@RequestMapping("/review")
public class MybatisReviewController extends BaseController {

    @Autowired
    private ReviewService reviewService;

    /**=========================================================新增数据============================================*/
    @GetMapping("/saveData/{name}/{age}/{sex}")
    public AjaxResult saveData(@PathVariable String name,@PathVariable Integer age,@PathVariable String sex){
        String info = reviewService.saveData(name,age,sex);
        return AjaxResult.success(info);
    }


    /**=========================================================删除数据=============================================*/
    @DeleteMapping("/remove/{id}")
    public AjaxResult deleteDate(@PathVariable Integer id){
        String info = reviewService.deleteById(id);
        return AjaxResult.success(info);
    }
    /**=========================================================修改数据=============================================*/

    @PostMapping("/update")
    public AjaxResult update(MybatisReviewVO mybatisReviewVO){

        String info = reviewService.update(mybatisReviewVO);
        return AjaxResult.success(info);
    }
    /**=========================================================查询数据=============================================*/
    @GetMapping("/getDataByPage")
    public TableDataInfo getDataByPage(Integer pageNum, Integer pageSize){
        startPage();
        List<Review> list = reviewService.getDataByPage();
        return getDataTable(list);
    }
}
