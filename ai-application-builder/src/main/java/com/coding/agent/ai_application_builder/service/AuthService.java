package com.coding.agent.ai_application_builder.service;

import com.coding.agent.ai_application_builder.dto.auth.AuthResponse;
import com.coding.agent.ai_application_builder.dto.auth.LoginRequest;
import com.coding.agent.ai_application_builder.dto.auth.SignupRequest;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
