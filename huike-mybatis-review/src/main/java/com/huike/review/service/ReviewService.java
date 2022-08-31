package com.huike.review.service;

import com.huike.review.pojo.Review;
import com.huike.review.vo.MybatisReviewVO;

import java.util.List;

/**
 * mybatis复习接口层
 */
public interface ReviewService {


    //保存信息
    String saveData(String name, Integer age, String sex);

    List<Review> getDataByPage();


    String deleteById(Integer id);

    String update(MybatisReviewVO mybatisReviewVO);
}
