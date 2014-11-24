package com.xxl.messager.dto;

/**
 * Created by xuxinlong on 2014/11/21.
 */
public class Message extends BaseDTO {
    private Long messageId;
    private String content;
    private String type;

    public Message() {

    }

    public Message(Long messageId, String content, String type) {
        this.messageId = messageId;
        this.content = content;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId=" + messageId +
                ", content='" + content + '\'' +
                '}';
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
