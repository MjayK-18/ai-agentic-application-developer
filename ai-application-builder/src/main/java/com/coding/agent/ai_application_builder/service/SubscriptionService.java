package com.coding.agent.ai_application_builder.service;

import com.coding.agent.ai_application_builder.dto.subscription.CheckoutRequest;
import com.coding.agent.ai_application_builder.dto.subscription.CheckoutResponse;
import com.coding.agent.ai_application_builder.dto.subscription.PortalResponse;
import com.coding.agent.ai_application_builder.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
