package com.test.quartz.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by qiaowentao on 2017/3/14.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DBContextHolder.getDataSource();
    }
}
