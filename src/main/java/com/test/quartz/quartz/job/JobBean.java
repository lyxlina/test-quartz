package com.test.quartz.quartz.job;

import org.apache.commons.lang.StringUtils;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.lang.reflect.Method;

/**
 * Created by qiaowentao on 2017/3/22.
 */
@DisallowConcurrentExecution
public class JobBean extends QuartzJobBean implements ApplicationContextAware {

    public static final String BEAN_NAME = "beanName";
    public static final String METHOD_NAME = "methodName";
    private ApplicationContext applicationContext;
    private static final Logger LOGGER = LoggerFactory.getLogger(JobBean.class);

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        JobDataMap mergedJobDataMap = context.getMergedJobDataMap();
        String beanName = mergedJobDataMap.getString(BEAN_NAME);
        if(StringUtils.isBlank(beanName)){
            LOGGER.error("beanName must be not blank");
            return ;
        }
        String methodName = mergedJobDataMap.getString(METHOD_NAME);
        if(StringUtils.isBlank(methodName)){
            LOGGER.error("methodName must be not blank");
            return ;
        }
        if (!applicationContext.containsBean(beanName)) {
            LOGGER.error("can't find bean named :" + beanName);
            return;
        }
        Object bean = applicationContext.getBean(beanName);

        Class<? extends Object> class1 = bean.getClass();
        try {
            Method declaredMethod = class1.getDeclaredMethod(methodName);
            declaredMethod.invoke(bean);
        } catch (Exception e) {
            LOGGER.error("", e);
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
