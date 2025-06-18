package com.spring.ecommerce.Payment_Service.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public boolean processPayment(Long orderId) {
        // Simulate payment processing
        System.out.println("Payment service - processPayment()");
        return Math.random() > 0.5;
    }
}

