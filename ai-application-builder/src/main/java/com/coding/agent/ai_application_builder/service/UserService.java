package com.coding.agent.ai_application_builder.service;


import com.coding.agent.ai_application_builder.dto.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
