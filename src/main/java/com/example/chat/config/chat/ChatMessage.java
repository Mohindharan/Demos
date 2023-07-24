package com.example.chat.config.chat;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    public String content;
    public String sender;
    public  MessageType type;
}
