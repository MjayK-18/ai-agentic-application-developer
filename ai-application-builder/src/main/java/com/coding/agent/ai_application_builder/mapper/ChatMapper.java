package com.coding.agent.ai_application_builder.mapper;


import com.coding.agent.ai_application_builder.dto.chat.ChatResponse;
import com.coding.agent.ai_application_builder.entity.ChatMessage;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ChatMapper {

    List<ChatResponse> fromListOfChatMessage(List<ChatMessage> chatMessageList);
}
