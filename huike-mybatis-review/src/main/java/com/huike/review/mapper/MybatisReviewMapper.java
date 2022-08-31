package com.huike.review.mapper;

import com.huike.review.pojo.Review;
import com.huike.review.vo.MybatisReviewVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Mybatis复习的Mapper层
 */
public interface MybatisReviewMapper {


    /**
     * ======================================================新增======================================================
     **/
    int saveData(Review review);


    /**
     * ======================================================修改======================================================
     **/

    int update(Review Review);

    /**
     * ======================================================删除======================================================
     **/


    int deleteById(Integer id);

    /**
     * ======================================================简单查询===================================================
     **/
    List<Review> selectAll();
}
