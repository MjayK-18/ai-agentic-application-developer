package com.coding.agent.ai_application_builder.service.impl;

import com.coding.agent.ai_application_builder.dto.subscription.PlanResponse;
import com.coding.agent.ai_application_builder.service.PlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
