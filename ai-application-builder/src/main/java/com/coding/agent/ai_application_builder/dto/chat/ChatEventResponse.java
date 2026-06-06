package com.coding.agent.ai_application_builder.dto.chat;


import com.coding.agent.ai_application_builder.enums.ChatEventType;

public record ChatEventResponse(
        Long id,
        ChatEventType type,
        Integer sequenceOrder,
        String content,
        String filePath,
        String metadata
) {
}
