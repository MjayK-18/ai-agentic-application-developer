package com.coding.agent.ai_application_builder.service;


import com.coding.agent.ai_application_builder.dto.project.ProjectRequest;
import com.coding.agent.ai_application_builder.dto.project.ProjectResponse;
import com.coding.agent.ai_application_builder.dto.project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects();

    ProjectSummaryResponse getUserProjectById(Long id);

    ProjectResponse createProject(ProjectRequest request);

    ProjectResponse updateProject(Long id, ProjectRequest request);

    void softDelete(Long id);
}
