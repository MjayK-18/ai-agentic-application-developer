package com.coding.agent.ai_application_builder.service.impl;


import com.coding.agent.ai_application_builder.dto.auth.AuthResponse;
import com.coding.agent.ai_application_builder.dto.auth.LoginRequest;
import com.coding.agent.ai_application_builder.dto.auth.SignupRequest;
import com.coding.agent.ai_application_builder.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
