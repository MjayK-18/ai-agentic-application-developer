package com.coding.agent.ai_application_builder.service;

import com.coding.agent.ai_application_builder.dto.member.InviteMemberRequest;
import com.coding.agent.ai_application_builder.dto.member.MemberResponse;
import com.coding.agent.ai_application_builder.dto.member.UpdateMemberRoleRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}
