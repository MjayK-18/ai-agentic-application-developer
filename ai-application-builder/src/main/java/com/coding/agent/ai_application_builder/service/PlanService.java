package com.coding.agent.ai_application_builder.service;

import com.coding.agent.ai_application_builder.dto.subscription.PlanResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface PlanService {
     List<PlanResponse> getAllActivePlans();
}
