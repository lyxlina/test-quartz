package com.test.quartz.dao;

import com.test.quartz.model.QuartzPausedTriggersGrps;
import java.util.List;


public interface QuartzPausedTriggersGrpsMapper {
    long countBy(QuartzPausedTriggersGrps quartzPausedTriggersGrps);

    int deleteBy(QuartzPausedTriggersGrps quartzPausedTriggersGrps);

    int deleteByPrimary(QuartzPausedTriggersGrps key);

    int insert(QuartzPausedTriggersGrps record);

    int insertSelective(QuartzPausedTriggersGrps record);

    List<QuartzPausedTriggersGrps> selectBy(QuartzPausedTriggersGrps quartzPausedTriggersGrps);

    int updateBySelective(QuartzPausedTriggersGrps record);

    int updateBy(QuartzPausedTriggersGrps record);
}