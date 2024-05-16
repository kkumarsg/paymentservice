package com.paymentservice.payemntgateway.services;

import com.paymentservice.payemntgateway.models.PaymentStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentGateway paymentGateway;


    public String createLink(String orderId) {

        /*
          Make a call to order service and get the order details.
          OrderDetail order = restTemplate.getMapping(orderId)
          name = order.getCustomerName()
          amount = order.getAmount()
          phone = order.getCustomerPhone()
         */

        return paymentGateway.createPaymentLink(orderId, "Keerthi",
                "9999999999", 100);

        // To-do : You need to add an entry in the payment table.
        // Also, create the payment model for that.
    }

    public PaymentStatus getPaymentStatus(String paymentId) {

        // First hit razorpay and get the status of this payment


        PaymentStatus status = paymentGateway.getStatus(paymentId);

        // update your db accordingly.

        return status;
    }
}
