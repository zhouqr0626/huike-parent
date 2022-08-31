package com.huike.report.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.huike.report.domain.vo.LineChartVO;
import com.huike.report.domain.vo.PieChartVo;
import org.apache.ibatis.annotations.Param;

import com.huike.clues.domain.vo.IndexStatisticsVo;

/**
 * 首页统计分析的Mapper
 *
 * @author Administrator
 */
public interface ReportMapper {
    /**=========================================基本数据========================================*/
    /**
     * 获取线索数量
     *
     * @param beginCreateTime 开始时间
     * @param endCreateTime   结束时间
     * @param username        用户名
     * @return
     */
    Integer getCluesNum(@Param("startTime") String beginCreateTime,
                        @Param("endTime") String endCreateTime,
                        @Param("username") String username);

    /**
     * 获取商机数量
     *
     * @param beginCreateTime 开始时间
     * @param endCreateTime   结束时间
     * @param username        用户名
     * @return
     */
    Integer getBusinessNum(@Param("startTime") String beginCreateTime,
                           @Param("endTime") String endCreateTime,
                           @Param("username") String username);

    /**
     * 获取合同数量
     *
     * @param beginCreateTime 开始时间
     * @param endCreateTime   结束时间
     * @param username        用户名
     * @return
     */
    Integer getContractNum(@Param("startTime") String beginCreateTime,
                           @Param("endTime") String endCreateTime,
                           @Param("username") String username);

    /**
     * 获取合同金额
     *
     * @param beginCreateTime 开始时间
     * @param endCreateTime   结束时间
     * @param username        用户名
     * @return
     */
    Double getSalesAmount(@Param("startTime") String beginCreateTime,
                          @Param("endTime") String endCreateTime,
                          @Param("username") String username);

    /**
     * =========================================今日简报========================================
     */

    public int getDayCluesNum(@Param("curTime") String curTime,
                              @Param("username") String username);

    public int getDayBusinessNum(@Param("curTime") String curTime,
                                 @Param("username") String username);

    public int getDayContractNum(@Param("curTime") String curTime,
                                 @Param("username") String username);

    public Double getDaySalesAmount(@Param("curTime") String curTime,
                                    @Param("username") String username);

    /**
     * 待分配商机
     *
     * @param beginCreateTime
     * @param endCreateTime
     * @param username
     * @return
     */
    Integer getToallocatedBusinessNum(@Param("startTime") String beginCreateTime,
                                      @Param("endTime") String endCreateTime,
                                      @Param("username") String username);

    /**
     * 待分配线索
     *
     * @param beginCreateTime
     * @param endCreateTime
     * @param username
     * @return
     */
    Integer getToallocatedCluesNum(@Param("startTime") String beginCreateTime,
                                   @Param("endTime") String endCreateTime,
                                   @Param("username") String username);

    /**
     * 待跟进商机
     *
     * @param beginCreateTime
     * @param endCreateTime
     * @param username
     * @return
     */
    Integer getTofollowedBusinessNum(@Param("startTime") String beginCreateTime,
                                     @Param("endTime") String endCreateTime,
                                     @Param("username") String username);

    /**
     * 待跟进线索
     *
     * @param beginCreateTime
     * @param endCreateTime
     * @param username
     * @return
     */
    Integer getTofollowedCluesNum(@Param("startTime") String beginCreateTime,
                                  @Param("endTime") String endCreateTime,
                                  @Param("username") String username);

    List<PieChartVo> getSubjectNum(@Param("startTime") String beginCreateTime,
                                   @Param("endTime") String endCreateTime);

    LineChartVO getCluesStatistics(@Param("startTime") String beginCreateTime,
                                   @Param("endTime") String endCreateTime);

    List<Map<String, Object>> cluesStatistics(@Param("startTime") String beginCreateTime,
                                              @Param("endTime") String endCreateTime);

    /**=========================================待办========================================*/

}
