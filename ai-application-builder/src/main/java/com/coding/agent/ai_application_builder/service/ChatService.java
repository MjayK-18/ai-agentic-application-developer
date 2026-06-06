package com.coding.agent.ai_application_builder.service;

import com.coding.agent.ai_application_builder.dto.chat.ChatResponse;

import java.util.List;

public interface ChatService {

    List<ChatResponse> getProjectChatHistory(Long projectId);
}
