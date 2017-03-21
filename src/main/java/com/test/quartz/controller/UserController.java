package com.test.quartz.controller;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by qiaowentao on 2017/3/17.
 */
@Controller
//@RequestMapping(value="/user")
public class UserController {

    private static org.slf4j.Logger LOG = LoggerFactory.getLogger("userController1");
    private static Logger logger = Logger.getLogger("userController2");

    @RequestMapping(value="/user", method={RequestMethod.GET,RequestMethod.POST})
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response,ModelAndView modelAndView){
        LOG.info("进入userController");
        logger.info("进入userController啦啦啦");
        modelAndView.setViewName("/index");
        return modelAndView;
    }

}
