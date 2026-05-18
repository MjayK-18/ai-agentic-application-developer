package com.coding.agent.ai_application_builder.dto.project;

public record FileNode(
        String path
) {

    @Override
    public String toString() {
        return path;
    }
}
