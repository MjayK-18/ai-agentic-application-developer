package com.coding.agent.ai_application_builder.dto.member;

import com.coding.agent.ai_application_builder.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
