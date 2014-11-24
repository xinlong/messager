package com.xxl.messager.repository;

import com.xxl.messager.dto.Message;

import java.util.List;

/**
 * Created by xuxinlong on 2014/11/21.
 */
public interface MessageRepository {

    public List<Message> getMessageByType(String type);

}
