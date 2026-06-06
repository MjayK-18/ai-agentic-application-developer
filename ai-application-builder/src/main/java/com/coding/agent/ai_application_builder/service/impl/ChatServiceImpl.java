package com.coding.agent.ai_application_builder.service.impl;


import com.coding.agent.ai_application_builder.dto.chat.ChatResponse;
import com.coding.agent.ai_application_builder.entity.ChatMessage;
import com.coding.agent.ai_application_builder.entity.ChatSession;
import com.coding.agent.ai_application_builder.entity.ChatSessionId;
import com.coding.agent.ai_application_builder.mapper.ChatMapper;
import com.coding.agent.ai_application_builder.repository.ChatMessageRepository;
import com.coding.agent.ai_application_builder.repository.ChatSessionRepository;
import com.coding.agent.ai_application_builder.security.AuthUtil;
import com.coding.agent.ai_application_builder.service.ChatService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ChatServiceImpl implements ChatService {

    private final ChatMessageRepository chatMessageRepository;
    private final ChatSessionRepository chatSessionRepository;
    private final AuthUtil authUtil;
    private final ChatMapper chatMapper;

    @Override
    public List<ChatResponse> getProjectChatHistory(Long projectId) {
        Long userId = authUtil.getCurrentUserId();

        ChatSession chatSession = chatSessionRepository.getReferenceById(
                new ChatSessionId(projectId, userId)
        );

        List<ChatMessage> chatMessageList = chatMessageRepository.findByChatSession(chatSession);

        return chatMapper.fromListOfChatMessage(chatMessageList);
    }
}
