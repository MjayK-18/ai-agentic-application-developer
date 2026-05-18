package com.coding.agent.ai_application_builder.service;


import com.coding.agent.ai_application_builder.dto.auth.UserProfileResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
