package com.coding.agent.ai_application_builder.service;

import com.coding.agent.ai_application_builder.dto.subscription.CheckoutRequest;
import com.coding.agent.ai_application_builder.dto.subscription.CheckoutResponse;
import com.coding.agent.ai_application_builder.dto.subscription.PortalResponse;
import com.stripe.model.StripeObject;

import java.util.Map;

public interface PaymentProcessor {

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request);

    PortalResponse openCustomerPortal();

    void handleWebhookEvent(String type, StripeObject stripeObject, Map<String, String> metadata);
}
