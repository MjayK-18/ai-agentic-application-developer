package com.coding.agent.ai_application_builder.service.impl;

import com.coding.agent.ai_application_builder.dto.subscription.PlanLimitsResponse;
import com.coding.agent.ai_application_builder.dto.subscription.UsageTodayResponse;
import com.coding.agent.ai_application_builder.service.UsageService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {

    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
