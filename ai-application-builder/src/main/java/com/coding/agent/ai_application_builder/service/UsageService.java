package com.coding.agent.ai_application_builder.service;

import com.coding.agent.ai_application_builder.dto.subscription.PlanLimitsResponse;
import com.coding.agent.ai_application_builder.dto.subscription.UsageTodayResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService {
    void recordTokenUsage(Long userId, int actualTokens);
    void checkDailyTokensUsage();
}
