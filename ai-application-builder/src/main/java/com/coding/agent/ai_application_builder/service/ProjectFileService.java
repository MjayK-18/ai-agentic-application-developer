package com.coding.agent.ai_application_builder.service;



import com.coding.agent.ai_application_builder.dto.project.FileContentResponse;
import com.coding.agent.ai_application_builder.dto.project.FileTreeResponse;

import java.util.List;

public interface ProjectFileService {
    FileTreeResponse getFileTree(Long projectId);

    FileContentResponse getFileContent(Long projectId, String path);

    void saveFile(Long projectId, String filePath, String fileContent);
}
