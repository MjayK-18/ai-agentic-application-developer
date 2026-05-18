package com.coding.agent.ai_application_builder.service;


import com.coding.agent.ai_application_builder.dto.project.ProjectRequest;
import com.coding.agent.ai_application_builder.dto.project.ProjectResponse;
import com.coding.agent.ai_application_builder.dto.project.ProjectSummaryResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects(Long userId);

    ProjectResponse getUserProjectById(Long id, Long userId);

    ProjectResponse createProject(ProjectRequest request, Long userId);

    ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);
}
