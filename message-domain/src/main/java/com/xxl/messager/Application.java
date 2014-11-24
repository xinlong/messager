package com.xxl.messager;

import com.xxl.messager.dto.Message;
import com.xxl.messager.repository.MessageRepository;
import com.xxl.messager.service.MessageService;
import com.xxl.messager.repository.MessageRepository;
import com.xxl.messager.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 * Created by xuxinlong on 2014/11/21.
 */
@Configuration
@ComponentScan
public class Application {

    @Bean
    MessageRepository mokeMessageRepository(){
        return new MessageRepository() {
            @Override
            public List<Message> getMessageByType(String type) {
                return Arrays.asList(
                        new Message(new Long(1), "new phone message", "adv"),
                        new Message(new Long(2), "new tv message", "adv"));
            }
        };
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);
        MessageService messageService = applicationContext.getBean(MessageService.class);

        List<Message> messages = messageService.getMessageByType("adv");
        System.out.println(messages);
    }
}
