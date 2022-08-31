package com.huike.business.service.impl;


import com.huike.business.domain.TbBusiness;
import com.huike.business.domain.TbBusinessTrackRecord;
import com.huike.business.domain.vo.BusinessTrackVo;
import com.huike.business.mapper.TbBusinessMapper;
import com.huike.business.mapper.TbBusinessTrackRecordMapper;
import com.huike.business.service.ITbBusinessTrackRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商机跟进记录Service业务层处理
 *
 * @author wgl
 * @date 2021-04-28
 */
@Service
public class TbBusinessTrackRecordServiceImpl implements ITbBusinessTrackRecordService {

    @Autowired
    private TbBusinessTrackRecordMapper tbBusinessTrackRecordMapper;

    @Autowired
    private TbBusinessMapper tbBusinessMapper;

    @Override
    public List<TbBusinessTrackRecord> selectRecordById(Long id) {
        return tbBusinessTrackRecordMapper.selectTbBusinessTrackRecordListByBusinessId(id);
    }

    @Override
    public int insertTbBusinessTrackRecord(TbBusiness business, TbBusinessTrackRecord trackRecord) {
        tbBusinessMapper.updateTbBusiness(business);
        return tbBusinessTrackRecordMapper.insertTbBusinessTrackRecord(trackRecord);
    }
}
