package com.test.quartz.dao;

import com.test.quartz.model.QuartzCronTriggers;
import java.util.List;

public interface QuartzCronTriggersMapper {
    long countBy(QuartzCronTriggers quartzCronTriggers);

    int deleteBy(QuartzCronTriggers quartzCronTriggers);

    int deleteByPrimary(QuartzCronTriggers quartzCronTriggers);

    int insert(QuartzCronTriggers record);

    int insertSelective(QuartzCronTriggers record);

    List<QuartzCronTriggers> selectBy(QuartzCronTriggers quartzCronTriggers);

    QuartzCronTriggers selectByPrimary(QuartzCronTriggers quartzCronTriggers);

    int updateBySelective(QuartzCronTriggers record);

    int updateBy(QuartzCronTriggers record);

    int updateByPrimarySelective(QuartzCronTriggers record);

    int updateByPrimary(QuartzCronTriggers record);
}