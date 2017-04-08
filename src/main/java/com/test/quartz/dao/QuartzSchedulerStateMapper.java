package com.test.quartz.dao;

import com.test.quartz.model.QuartzSchedulerState;
import java.util.List;

public interface QuartzSchedulerStateMapper {
    long countBy(QuartzSchedulerState quartzSchedulerState);

    int deleteBy(QuartzSchedulerState quartzSchedulerState);

    int deleteByPrimary(QuartzSchedulerState key);

    int insert(QuartzSchedulerState record);

    int insertSelective(QuartzSchedulerState record);

    List<QuartzSchedulerState> selectBy(QuartzSchedulerState quartzSchedulerState);

    QuartzSchedulerState selectByPrimary(QuartzSchedulerState key);

    int updateBySelective(QuartzSchedulerState record);

    int updateBy(QuartzSchedulerState record);

    int updateByPrimarySelective(QuartzSchedulerState record);

    int updateByPrimary(QuartzSchedulerState record);
}