package com.xxl.messager.service;

import com.xxl.messager.dto.Message;

import java.util.List;

/**
 * Created by xuxinlong on 2014/11/21.
 */
public interface MessageService {

    public List<Message> getMessageByType(String type);
}
