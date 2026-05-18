package com.coding.agent.ai_application_builder.mapper;
import com.coding.agent.ai_application_builder.dto.auth.SignupRequest;
import com.coding.agent.ai_application_builder.dto.auth.UserProfileResponse;
import com.coding.agent.ai_application_builder.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(SignupRequest signupRequest);

    UserProfileResponse toUserProfileResponse(User user);

}
