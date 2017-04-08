package com.test.quartz.dao;

import com.test.quartz.model.QuartzLocks;
import java.util.List;

public interface QuartzLocksMapper {
    long countBy(QuartzLocks quartzLocks);

    int deleteBy(QuartzLocks quartzLocks);

    int deleteByPrimary(QuartzLocks key);

    int insert(QuartzLocks record);

    int insertSelective(QuartzLocks record);

    List<QuartzLocks> selectBy(QuartzLocks quartzLocks);

    int updateBySelective(QuartzLocks record);

    int updateBy(QuartzLocks record);
}