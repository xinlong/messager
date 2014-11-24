package com.xxl.messager.service.impl;

import com.xxl.messager.dto.Message;
import com.xxl.messager.repository.MessageRepository;
import com.xxl.messager.service.MessageService;
import com.xxl.messager.repository.MessageRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xuxinlong on 2014/11/21.
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Resource
    private MessageRepository messageRepository;

    @Override
    public List<Message> getMessageByType(String type) {
        return messageRepository.getMessageByType(type);
    }
}
