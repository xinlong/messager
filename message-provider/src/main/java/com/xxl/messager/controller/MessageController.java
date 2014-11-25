package com.xxl.messager.controller;

import com.xxl.messager.domain.service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by xuxinlong on 2014/11/25.
 */
@Controller
@RequestMapping(value = "/message")
public class MessageController {
    private Logger logger = LoggerFactory.getLogger(MessageController.class);
    @Resource
    private MessageService messageService;

    @RequestMapping(value = "/create")
    public ModelAndView create(){
        ModelAndView modelView = new ModelAndView("create");
        logger.info("messageService"+messageService);
        return modelView;
    }
}
