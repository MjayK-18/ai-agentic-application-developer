package com.coding.agent.ai_application_builder.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {

}
