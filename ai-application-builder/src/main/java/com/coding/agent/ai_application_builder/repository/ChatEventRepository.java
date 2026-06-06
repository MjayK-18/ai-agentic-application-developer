package com.coding.agent.ai_application_builder.repository;

import com.coding.agent.ai_application_builder.entity.ChatEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatEventRepository extends JpaRepository<ChatEvent, Long> {
}
