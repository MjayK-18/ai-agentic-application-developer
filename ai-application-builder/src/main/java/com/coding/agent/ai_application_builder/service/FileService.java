package com.coding.agent.ai_application_builder.service;


import com.coding.agent.ai_application_builder.dto.project.FileContentResponse;
import com.coding.agent.ai_application_builder.dto.project.FileNode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FileService {
    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
