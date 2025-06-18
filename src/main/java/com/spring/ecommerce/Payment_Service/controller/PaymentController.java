package com.spring.ecommerce.Payment_Service.controller;

import com.spring.ecommerce.Payment_Service.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/{orderId}")
    public boolean processPayment(@PathVariable Long orderId) {
        return paymentService.processPayment(orderId);
    }
}

