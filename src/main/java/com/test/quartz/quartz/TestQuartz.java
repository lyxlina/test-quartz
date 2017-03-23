package com.test.quartz.quartz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by qiaowentao on 2017/3/21.
 */
@Service
public class TestQuartz implements Serializable {

    private static Logger LOG  = LoggerFactory.getLogger(TestQuartz.class);

    public void work(){

        try{

            LOG.info("定时任务，一分钟执行一次");
        }catch (Exception e){
            LOG.error("定时任务出错");
        }

    }

    public void doSomeWork(){

        LOG.debug("三十秒钟执行一次");

    }

}
