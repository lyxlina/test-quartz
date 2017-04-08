package com.test.quartz.dao;

import com.test.quartz.model.QuartzTriggers;
import java.util.List;

public interface QuartzTriggersMapper {
    long countBy(QuartzTriggers quartzTriggers);

    int deleteBy(QuartzTriggers quartzTriggers);

    int deleteByPrimary(QuartzTriggers key);

    int insert(QuartzTriggers record);

    int insertSelective(QuartzTriggers record);

    List<QuartzTriggers> selectByWithBLOBs(QuartzTriggers quartzTriggers);

    List<QuartzTriggers> selectBy(QuartzTriggers quartzTriggers);

    QuartzTriggers selectByPrimary(QuartzTriggers key);

    int updateBySelective(QuartzTriggers record);

    int updateByWithBLOBs(QuartzTriggers record);

    int updateBy(QuartzTriggers record);

    int updateByPrimarySelective(QuartzTriggers record);

    int updateByPrimaryWithBLOBs(QuartzTriggers record);

    int updateByPrimary(QuartzTriggers record);
}