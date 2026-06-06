package com.coding.agent.ai_application_builder.service;


import com.coding.agent.ai_application_builder.dto.chat.StreamResponse;
import reactor.core.publisher.Flux;

public interface AiGenerationService {
    Flux<StreamResponse> streamResponse(String message, Long projectId);
}
