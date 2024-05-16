package com.paymentservice.payemntgateway.services;

import com.paymentservice.payemntgateway.models.PaymentStatus;
import org.springframework.stereotype.Component;

@Component
public interface PaymentGateway {

    String createPaymentLink(String orderId, String customerName,
                             String phone, int amount);

    PaymentStatus getStatus(String paymentId);
}
