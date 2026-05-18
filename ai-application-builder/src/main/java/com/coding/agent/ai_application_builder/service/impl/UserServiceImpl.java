package com.coding.agent.ai_application_builder.service.impl;

import com.coding.agent.ai_application_builder.dto.auth.UserProfileResponse;
import com.coding.agent.ai_application_builder.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserProfileResponse getProfile(Long userId) {
        return null;
    }
}
