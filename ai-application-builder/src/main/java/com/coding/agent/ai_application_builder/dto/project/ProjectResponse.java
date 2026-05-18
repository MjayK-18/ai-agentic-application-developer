package com.coding.agent.ai_application_builder.dto.project;


import com.coding.agent.ai_application_builder.dto.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse owner
) {
}
