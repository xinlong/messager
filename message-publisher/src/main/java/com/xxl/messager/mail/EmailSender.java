package com.xxl.messager.mail;

import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

/**
 * Created by xuxinlong on 2014/11/24.
 */
public class EmailSender {


    public static void main(String[] args){
        sendEmail();
    }


    public static void sendEmail(){


        try {
            JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
            mailSender.setHost("smtp.qq.com");
            mailSender.setPort(465);
            Properties javaMailProperties = new Properties();
            javaMailProperties.put( "mail.smtp.auth" ,  "true" ) ;  //  将这个参数设为true，让服务器进行认证,认证用户名和密码是否正确
            javaMailProperties.put("mail.smtp.timeout", "2000") ;
            mailSender.setJavaMailProperties(javaMailProperties);
            mailSender.setUsername("644285209@qq.com");
            mailSender.setPassword("");

            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setFrom("644285209@qq.com");
            mailMessage.setSubject("Hello world!");

            SimpleMailMessage msg = new SimpleMailMessage(mailMessage);
            msg.setTo("644285209@qq.com");
            msg.setText("hello world...");

            mailSender.send(msg);
            System.out.print("send success...");
        } catch (MailException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
