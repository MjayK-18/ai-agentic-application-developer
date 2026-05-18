package com.coding.agent.ai_application_builder.service.impl;

import com.coding.agent.ai_application_builder.dto.project.ProjectRequest;
import com.coding.agent.ai_application_builder.dto.project.ProjectResponse;
import com.coding.agent.ai_application_builder.dto.project.ProjectSummaryResponse;
import com.coding.agent.ai_application_builder.entity.Project;
import com.coding.agent.ai_application_builder.entity.User;
import com.coding.agent.ai_application_builder.mapper.ProjectMapper;
import com.coding.agent.ai_application_builder.repository.ProjectRepository;
import com.coding.agent.ai_application_builder.repository.UserRepository;
import com.coding.agent.ai_application_builder.service.ProjectService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Builder
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Transactional
public class ProjectServiceImpl implements ProjectService {

    ProjectRepository projectRepository;
    UserRepository userRepository;
    ProjectMapper projectMapper;

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {

        User owner = userRepository.findById(userId).orElseThrow();

        Project project = Project.builder()
                .name(request.name())
                .owner(owner)
                .isPublic(false)
                .build();

        project = projectRepository.save(project);
        return projectMapper.toProjectResponse(project);
    }

    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {

//        return projectRepository.findAllAccessibleByUser(userId)
//                .stream()
//                .map(projectMapper::toProjectSummaryResponse)
//                .collect(Collectors.toList());

        var projects = projectRepository.findAllAccessibleByUser(userId);
        return projectMapper.toListOfProjectSummaryResponse(projects);
    }

    @Override
    public ProjectResponse getUserProjectById(Long id, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}
