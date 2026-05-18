package com.coding.agent.ai_application_builder.service;

import com.coding.agent.ai_application_builder.dto.subscription.PlanLimitsResponse;
import com.coding.agent.ai_application_builder.dto.subscription.UsageTodayResponse;
import org.springframework.stereotype.Service;

@Service
public interface UsageService {
     UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
