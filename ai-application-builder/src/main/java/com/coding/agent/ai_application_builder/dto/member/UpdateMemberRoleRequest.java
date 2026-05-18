package com.coding.agent.ai_application_builder.dto.member;

import com.coding.agent.ai_application_builder.enums.ProjectRole;
import jakarta.validation.constraints.NotNull;

public record UpdateMemberRoleRequest(
        @NotNull ProjectRole role) {
}
