package com.coding.agent.ai_application_builder.mapper;

import com.coding.agent.ai_application_builder.dto.subscription.PlanResponse;
import com.coding.agent.ai_application_builder.dto.subscription.SubscriptionResponse;
import com.coding.agent.ai_application_builder.entity.Plan;
import com.coding.agent.ai_application_builder.entity.Subscription;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubscriptionMapper {

    SubscriptionResponse toSubscriptionResponse(Subscription subscription);

    PlanResponse toPlanResponse(Plan plan);
}
