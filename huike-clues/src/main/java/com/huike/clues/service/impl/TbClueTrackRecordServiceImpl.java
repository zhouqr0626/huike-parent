package com.huike.clues.service.impl;


import com.huike.clues.domain.TbClueTrackRecord;
import com.huike.clues.domain.vo.ClueTrackRecordVo;
import com.huike.clues.mapper.TbClueTrackRecordMapper;
import com.huike.clues.service.ITbClueTrackRecordService;
import com.huike.common.utils.SecurityUtils;
import org.apache.poi.ss.usermodel.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 线索跟进记录Service业务层处理
 * @date 2022-04-22
 */
@Service
public class TbClueTrackRecordServiceImpl implements ITbClueTrackRecordService {

    @Autowired
    private TbClueTrackRecordMapper tbClueTrackRecordMapper;



    @Override
    public int add(ClueTrackRecordVo clueTrackRecord) {
        TbClueTrackRecord tbClueTrackRecord =new TbClueTrackRecord();
        String username = SecurityUtils.getUsername();
        //String time = LocalDateTime.now().toString();
        //Date date= DateUtil.parseDateTime(time,"yyyy-MM-dd HH:mm:ss");
        tbClueTrackRecord.setClueId(clueTrackRecord.getClueId());
        tbClueTrackRecord.setCreateBy(username);
        tbClueTrackRecord.setSubject(clueTrackRecord.getSubject());
        tbClueTrackRecord.setRecord(clueTrackRecord.getRecord());
        tbClueTrackRecord.setLevel(clueTrackRecord.getLevel());
        tbClueTrackRecord.setCreateTime(new Date());
        tbClueTrackRecord.setType(clueTrackRecord.getType());
        tbClueTrackRecord.setFalseReason(clueTrackRecord.getFalseReason());
        tbClueTrackRecord.setNextTime(clueTrackRecord.getNextTime());
        int num=tbClueTrackRecordMapper.addClueTrack(tbClueTrackRecord);
        return num;
    }
}
