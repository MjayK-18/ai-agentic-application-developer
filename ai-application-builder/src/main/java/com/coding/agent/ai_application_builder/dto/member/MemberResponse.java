package com.coding.agent.ai_application_builder.dto.member;


import com.coding.agent.ai_application_builder.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long userId,
        String username,
        String name,
        ProjectRole role,
        Instant invitedAt
) {
}
