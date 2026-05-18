package com.coding.agent.ai_application_builder.service.impl;


import com.coding.agent.ai_application_builder.dto.project.FileContentResponse;
import com.coding.agent.ai_application_builder.dto.project.FileNode;
import com.coding.agent.ai_application_builder.service.FileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public List<FileNode> getFileTree(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public FileContentResponse getFileContent(Long projectId, String path, Long userId) {
        return null;
    }
}
