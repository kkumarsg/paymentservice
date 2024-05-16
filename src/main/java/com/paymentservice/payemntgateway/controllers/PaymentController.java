package com.paymentservice.payemntgateway.controllers;

import com.paymentservice.payemntgateway.models.PaymentStatus;
import com.paymentservice.payemntgateway.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;


    @PostMapping("/payment/createlink")
    public String createPaymentLink(@RequestParam String orderId){
        return paymentService.createLink(orderId);
    }

    @GetMapping("payment/paymentStatus")
    public PaymentStatus getPaymentStatus(@RequestParam String paymentId){
        return paymentService.getPaymentStatus(paymentId);
    }
}
