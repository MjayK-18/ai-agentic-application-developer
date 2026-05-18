package com.coding.agent.ai_application_builder.mapper;

import com.coding.agent.ai_application_builder.dto.member.MemberResponse;
import com.coding.agent.ai_application_builder.entity.ProjectMember;
import com.coding.agent.ai_application_builder.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProjectMemberMapper {

    @Mapping(target = "userId", source = "id")
    @Mapping(target = "role", constant = "OWNER")
    MemberResponse toProjectMemberResponseFromOwner(User owner);

    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "username", source = "user.username")
    @Mapping(target = "name", source = "user.name")
    @Mapping(target = "role", source = "projectRole")
    MemberResponse toProjectMemberResponseFromMember(ProjectMember projectMember);
}
