package com.test.quartz.dao;

import com.test.quartz.model.QuartzJobDetails;
import java.util.List;

public interface QuartzJobDetailsMapper {
    long countBy(QuartzJobDetails quartzJobDetails);

    int deleteBy(QuartzJobDetails quartzJobDetails);

    int deleteByPrimary(QuartzJobDetails quartzJobDetails);

    int insert(QuartzJobDetails record);

    int insertSelective(QuartzJobDetails record);

    List<QuartzJobDetails> selectByWithBLOBs(QuartzJobDetails quartzJobDetails);

    List<QuartzJobDetails> selectBy(QuartzJobDetails quartzJobDetails);

    QuartzJobDetails selectByPrimary(QuartzJobDetails quartzJobDetails);

    int updateBySelective(QuartzJobDetails record);

    int updateByWithBLOBs(QuartzJobDetails record);

    int updateBy(QuartzJobDetails record);

    int updateByPrimarySelective(QuartzJobDetails record);

    int updateByPrimaryWithBLOBs(QuartzJobDetails record);

    int updateByPrimary(QuartzJobDetails record);
}