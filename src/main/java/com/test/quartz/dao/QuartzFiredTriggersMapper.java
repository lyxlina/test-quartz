package com.test.quartz.dao;

import com.test.quartz.model.QuartzFiredTriggers;
import java.util.List;

public interface QuartzFiredTriggersMapper {
    long countBy(QuartzFiredTriggers quartzFiredTriggers);

    int deleteBy(QuartzFiredTriggers quartzFiredTriggers);

    int deleteByPrimaryKey(QuartzFiredTriggers quartzFiredTriggers);

    int insert(QuartzFiredTriggers record);

    int insertSelective(QuartzFiredTriggers record);

    List<QuartzFiredTriggers> selectBy(QuartzFiredTriggers quartzFiredTriggers);

    QuartzFiredTriggers selectByPrimaryKey(QuartzFiredTriggers quartzFiredTriggers);

    int updateBySelective(QuartzFiredTriggers record);

    int updateBy(QuartzFiredTriggers record);

    int updateByPrimarySelectiveKey(QuartzFiredTriggers record);

    int updateByPrimaryKey(QuartzFiredTriggers record);
}