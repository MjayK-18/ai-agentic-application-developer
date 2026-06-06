package com.coding.agent.ai_application_builder.mapper;

import com.coding.agent.ai_application_builder.dto.project.FileNode;
import com.coding.agent.ai_application_builder.entity.ProjectFile;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectFileMapper {

    List<FileNode> toListOfFileNode(List<ProjectFile> projectFileList);
}
