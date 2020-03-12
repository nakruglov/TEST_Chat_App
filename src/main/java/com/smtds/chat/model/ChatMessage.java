package com.smtds.chat.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ChatMessage {

    private MessageType type;
    private String content;
    private String sender;

    public enum MessageType {
        CHAT, JOIN, LEAVE
    }

}