package com.huike.review.service.impl;

import com.huike.common.core.domain.AjaxResult;
import com.huike.common.exception.CustomException;
import com.huike.common.utils.bean.BeanUtils;
import com.huike.review.pojo.Review;
import com.huike.review.service.ReviewService;
import com.huike.review.mapper.MybatisReviewMapper;
import com.huike.review.vo.MybatisReviewVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * mybatis复习使用的业务层
 * 注意该业务层和我们系统的业务无关，主要是让同学们快速熟悉系统的
 */
@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private MybatisReviewMapper reviewMapper;

    /**=========================================================保存数据的方法=============================================*/
    @Override
    public String saveData(String name, Integer age, String sex) {
        //1. 封装数据
        Review review = new Review();
        review.setName(name);
        review.setAge(age);
        review.setSex(sex);
        int rows = reviewMapper.saveData(review);
        String info = "成功插入"+ rows+"条数据";
        return info;
    }


    /**=========================================================修改数据=============================================*/

    @Override
    public String update(MybatisReviewVO mybatisReviewVO) {
        Review review = new Review();
        BeanUtils.copyProperties(mybatisReviewVO,review);
        int rows = reviewMapper.update(review);
        String info = "成功修改"+ rows+"条数据";
        return info;
    }

    /**=========================================================删除数据=============================================*/

    @Override
    public String deleteById(Integer id) {
        int rows = reviewMapper.deleteById(id);
        String info = "成功刪除"+ rows+"条数据";
        return info;
    }


    /**=========================================================查询数据的方法=============================================*/
    @Override
    public List<Review> getDataByPage() {
        return reviewMapper.selectAll();
    }
}
