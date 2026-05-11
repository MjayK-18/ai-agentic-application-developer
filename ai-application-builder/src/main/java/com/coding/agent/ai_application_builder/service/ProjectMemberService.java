package com.coding.agent.ai_application_builder.service;

import com.coding.agent.ai_application_builder.dto.member.InviteMemberRequest;
import com.coding.agent.ai_application_builder.dto.member.MemberResponse;
import com.coding.agent.ai_application_builder.entity.ProjectMember;

import java.util.List;

public interface ProjectMemberService {
    List<ProjectMember> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, InviteMemberRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}
