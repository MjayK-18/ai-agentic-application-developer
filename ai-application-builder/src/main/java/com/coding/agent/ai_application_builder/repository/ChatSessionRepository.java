package com.coding.agent.ai_application_builder.repository;


import com.coding.agent.ai_application_builder.entity.ChatSession;
import com.coding.agent.ai_application_builder.entity.ChatSessionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatSessionRepository extends JpaRepository<ChatSession, ChatSessionId> {
}
