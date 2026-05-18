package com.coding.agent.ai_application_builder.service;

import com.coding.agent.ai_application_builder.dto.subscription.PlanResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlanService {
     List<PlanResponse> getAllActivePlans();
}
