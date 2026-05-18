package com.coding.agent.ai_application_builder.mapper;

import com.coding.agent.ai_application_builder.dto.project.ProjectResponse;
import com.coding.agent.ai_application_builder.dto.project.ProjectSummaryResponse;
import com.coding.agent.ai_application_builder.entity.Project;
import com.coding.agent.ai_application_builder.enums.ProjectRole;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);

    ProjectSummaryResponse toProjectSummaryResponse(Project project, ProjectRole role);

    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projects);

}
